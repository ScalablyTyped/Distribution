package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that contains authorization related APIs.
  * @beta
  */
@js.native
trait Auth extends js.Object {
  /**
    * Calls the Azure Active Directory V 2.0 endpoint to get an access token to your add-in's web application. Enables add-ins to identify users.
    * Server side code can use this token to access Microsoft Graph for the add-in's web application by using the
    * {@link https://docs.microsoft.com/azure/active-directory/develop/active-directory-v2-protocols-oauth-on-behalf-of | "on behalf of" OAuth flow}.
    * This API requires a single sign-on configuration that bridges the add-in to an Azure application. Office users sign-in with Organizational
    * Accounts and Microsoft Accounts. Microsoft Azure returns tokens intended for both user account types to access resources in the Microsoft Graph.
    *
    * Important: In Outlook, this API is not supported if the add-in is loaded in an Outlook.com or Gmail mailbox.
    *
    * @remarks
    *
    * **Hosts**: Excel, PowerPoint, Word
    *
    * @beta
    *
    * @param options - Optional. Accepts an AuthOptions object to define sign-on behaviors.
    * returns: Promise to the access token.
    */
  def getAccessToken(): js.Promise[String] = js.native
  def getAccessToken(options: AuthOptions): js.Promise[String] = js.native
}

