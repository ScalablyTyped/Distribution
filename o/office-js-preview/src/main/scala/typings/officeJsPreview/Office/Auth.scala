package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Office Auth namespace, `Office.context.auth`, provides a method that allows the Office client application to obtain an access token to the add-in's web application.
  * Indirectly, this also enables the add-in to access the signed-in user's Microsoft Graph data without requiring the user to sign in a second time.
  */
@js.native
trait Auth extends StObject {
  
  /**
    * Calls the Azure Active Directory V 2.0 endpoint to get an access token to your add-in's web application. Enables add-ins to identify users.
    * Server-side code can use this token to access Microsoft Graph for the add-in's web application by using the
    * {@link https://docs.microsoft.com/azure/active-directory/develop/active-directory-v2-protocols-oauth-on-behalf-of | "on behalf of" OAuth flow}. 
    * This API requires a single sign-on configuration that bridges the add-in to an Azure application. Office users sign in with Organizational
    * Accounts and Microsoft Accounts. Microsoft Azure returns tokens intended for both user account types to access resources in the Microsoft Graph.
    *
    * @remarks
    *
    * **Hosts**: Excel, OneNote, Outlook, PowerPoint, Word
    * 
    * **Important**: In Outlook, this API is not supported if the add-in is loaded in an Outlook.com or Gmail mailbox. 
    *
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/identity-api-requirement-sets | IdentityAPI}
    *
    * @param options - Optional. Accepts an `AuthOptions` object to define sign-on behaviors.
    * @returns Promise to the access token.
    */
  def getAccessToken(): js.Promise[String] = js.native
  def getAccessToken(options: AuthOptions): js.Promise[String] = js.native
  
  /**
    * Calls the Azure Active Directory V 2.0 endpoint to get an access token to your add-in's web application. Enables add-ins to identify users.
    * Server-side code can use this token to access Microsoft Graph for the add-in's web application by using the
    * {@link https://docs.microsoft.com/azure/active-directory/develop/active-directory-v2-protocols-oauth-on-behalf-of | "on behalf of" OAuth flow}.
    *
    * @deprecated Use Office.auth.getAccessToken instead.
    * 
    * **Important**: In Outlook, this API is not supported if the add-in is loaded in an Outlook.com or Gmail mailbox.
    * 
    * @remarks
    *
    * **Hosts**: Excel, OneNote, Outlook, PowerPoint, Word
    *
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/identity-api-requirement-sets | IdentityAPI}
    *
    * This API requires a single sign-on configuration that bridges the add-in to an Azure application. Office users sign in with Organizational
    * Accounts and Microsoft Accounts. Microsoft Azure returns tokens intended for both user account types to access resources in the Microsoft Graph.
    *
    * @param options - Optional. Accepts an `AuthOptions` object to define sign-on behaviors.
    * @param callback - Optional. Accepts a callback method that can parse the token for the user's ID or use the token in the "on behalf of" flow to get access to Microsoft Graph.
    *                   If `AsyncResult.status` is "succeeded", then `AsyncResult.value` is the raw AAD v. 2.0-formatted access token.
    */
  def getAccessTokenAsync(): Unit = js.native
  def getAccessTokenAsync(callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getAccessTokenAsync(options: Unit, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
  def getAccessTokenAsync(options: AuthOptions): Unit = js.native
  def getAccessTokenAsync(options: AuthOptions, callback: js.Function1[/* result */ AsyncResult[String], Unit]): Unit = js.native
}
