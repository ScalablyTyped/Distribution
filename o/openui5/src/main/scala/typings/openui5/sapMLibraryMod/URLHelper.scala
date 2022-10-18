package typings.openui5.sapMLibraryMod

import typings.openui5.sapMLibraryMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
