package typings.openui5.sapMLibraryMod

import typings.openui5.sapMLibraryMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @since 1.10
  *
  * URL (Uniform Resource Locator) Helper.
  *
  * This helper can be used to trigger a native application (e.g. email, sms, phone) from the browser. That
  * means we are restricted of browser or application implementation. e.g.
  * 	 - Some browsers do not let you pass more than 2022 characters in the URL
  * 	 - MAPI (Outlook) limit is 2083, max. path under Internet Explorer is 2048
  * 	 - Different Internet Explorer versions have a different URL length limits (IE9 approximately 1000 characters)
  *
  * 	 - MS mail app under Windows 8 cuts mail links after approximately 100 characters
  * 	 - Safari gets a confirmation from user before opening a native application and can block other triggers
  *     if the user cancels it
  * 	 - Some mail applications(Outlook) do not respect all encodings (e.g. Cyrillic texts are not encoded
  *     correctly)
  *
  * **Note:** all the given maximum lengths are for URL encoded text (e.g a space character will be encoded
  * as "%20").
  *
  * It has been reported by some users that the content send through the `URLHelper` is not correctly displayed
  * by the native applications (e.g. a native mail application).
  *
  * After sending the body to the application, `URLHelper` cannot affect its rendering and the application
  * takes responsibility to correctly display the content. Inconsistencies between different native applications
  * or operative systems (OS) can lead to different behaviors and differences in the displayed content.
  *
  * **Example:**
  *
  * What happens with a link added to the content of an email using the `URLHelper` ?
  *
  * Apart from the correct generation of URL, everything else is outside of the scope of `URLHelper` as responsibility
  * from then on is passed to the browser and the native applications handling the URL. For instance, clicking
  * on an email link should result in triggering an action in the default mail application for the user's
  * OS and it is this application's responsibility to correctly handle the URL, given it is generated correctly.
  * See:
  * 	{@link https://ui5.sap.com/#/topic/4f1c1075d88c41a5904389fa12b28f6b URL Helper}
  */
@js.native
trait URLHelper extends StObject {
  
  /**
    * Adds an event listener for the `redirect` event.
    *
    * @returns The URLHelper instance
    */
  def attachRedirect(/**
    * The function to call, when the event occurs.
    */
  fnFunction: js.Function): URLHelper = js.native
  def attachRedirect(
    /**
    * The function to call, when the event occurs.
    */
  fnFunction: js.Function,
    /**
    * The object that wants to be notified when the event occurs.
    */
  oListener: js.Object
  ): URLHelper = js.native
  
  /**
    * Detach an already registered listener of the `redirect` event.
    *
    * @returns The URLHelper instance
    */
  def detachRedirect(/**
    * The function to call, when the event occurs.
    */
  fnFunction: js.Function): URLHelper = js.native
  def detachRedirect(
    /**
    * The function to call, when the event occurs.
    */
  fnFunction: js.Function,
    /**
    * The object, that wants to be notified, when the event occurs.
    */
  oListener: js.Object
  ): URLHelper = js.native
  
  /**
    * Builds Email URI from given parameter. Trims spaces from email addresses.
    *
    * @returns Email URI using the `mailto:` scheme
    */
  def normalizeEmail(): String = js.native
  def normalizeEmail(/**
    * Destination email address
    */
  sEmail: String): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: String,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: String,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: String,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: String,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  def normalizeEmail(
    /**
    * Destination email address
    */
  sEmail: Unit,
    /**
    * Subject of the email address
    */
  sSubject: Unit,
    /**
    * Default message text
    */
  sBody: Unit,
    /**
    * Carbon Copy email address
    */
  sCC: Unit,
    /**
    * Blind carbon copy email address
    */
  sBCC: String
  ): String = js.native
  
  /**
    * Sanitizes the given telephone number and returns a URI using the `sms:` scheme.
    *
    * @returns SMS URI using the `sms:` scheme
    */
  def normalizeSms(): String = js.native
  def normalizeSms(/**
    * Telephone number
    */
  sTel: String): String = js.native
  
  /**
    * Sanitizes the given telephone number and returns a URI using the `tel:` scheme.
    *
    * @returns Telephone URI using the `tel:` scheme
    */
  def normalizeTel(): String = js.native
  def normalizeTel(/**
    * Telephone number
    */
  sTel: String): String = js.native
  
  /**
    * Redirects to the given URL.
    *
    * This method fires "redirect" event before opening the URL.
    */
  def redirect(/**
    * Uniform resource locator
    */
  sURL: String): Unit = js.native
  def redirect(
    /**
    * Uniform resource locator
    */
  sURL: String,
    /**
    * Opens URL in a new browser window or tab. Please note that, opening a new window/tab can be ignored by
    * browsers (e.g. on Windows Phone) or by popup blockers. NOTE: On Windows Phone the URL will be enforced
    * to open in the same window if opening in a new window/tab fails (because of a known system restriction
    * on cross-window communications). Use sap.m.Link instead (with blank target) if you necessarily need to
    * open URL in a new window.
    */
  bNewWindow: Boolean
  ): Unit = js.native
  
  /**
    * Trigger email application to send email. Trims spaces from email addresses.
    */
  def triggerEmail(
    /**
    * Destination email address
    */
  sEmail: js.UndefOr[String],
    /**
    * Subject of the email address
    */
  sSubject: js.UndefOr[String],
    /**
    * Default message text
    */
  sBody: js.UndefOr[String],
    /**
    * Carbon Copy email address
    */
  sCC: js.UndefOr[String],
    /**
    * Blind carbon copy email address
    */
  sBCC: js.UndefOr[String],
    /**
    * Opens email template in a new browser window or tab.
    */
  bNewWindow: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /**
    * Trigger SMS application to send SMS to given telephone number.
    */
  def triggerSms(): Unit = js.native
  def triggerSms(/**
    * Telephone number
    */
  sTel: String): Unit = js.native
  
  /**
    * Trigger telephone app to call the given telephone number.
    */
  def triggerTel(): Unit = js.native
  def triggerTel(/**
    * Telephone number
    */
  sTel: String): Unit = js.native
}
object URLHelper {
  
  inline def apply: URLHelper = ^.asInstanceOf[js.Dynamic].selectDynamic("URLHelper").asInstanceOf[URLHelper]
}
