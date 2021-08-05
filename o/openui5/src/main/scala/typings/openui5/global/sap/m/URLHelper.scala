package typings.openui5.global.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object URLHelper {
  
  @JSGlobal("sap.m.URLHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Adds an event registration for redirect.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener The object, that wants to be notified, when the event occurs.
    * @returns sap.m.URLHelper instance
    */
  inline def attachRedirect(fnFunction: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("attachRedirect")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def attachRedirect(fnFunction: js.Any, oListener: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("attachRedirect")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Detach already registered redirect event.
    * @param fnFunction The function to call, when the event occurs.
    * @param oListener The object, that wants to be notified, when the event occurs.
    * @returns sap.m.URLHelper instance
    */
  inline def detachRedirect(fnFunction: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("detachRedirect")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def detachRedirect(fnFunction: js.Any, oListener: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("detachRedirect")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Builds Email URI from given parameter.Trims spaces from email addresses.
    * @param sEmail Destination email address
    * @param sSubject Subject of the email address
    * @param sBody Default message text
    * @param sCC Carbon Copy email address
    * @param sBCC Blind carbon copy email address
    * @returns Email URI scheme
    */
  inline def normalizeEmail(sEmail: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: String, sCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: String, sCC: String, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: String, sCC: Unit, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: Unit, sCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: Unit, sCC: String, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: String, sBody: Unit, sCC: Unit, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: String, sCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: String, sCC: String, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: String, sCC: Unit, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: Unit, sCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: Unit, sCC: String, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalizeEmail(sEmail: String, sSubject: Unit, sBody: Unit, sCC: Unit, sBCC: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Sanitizes the given telephone number and returns SMS URI scheme.
    * @param sTel Telephone number
    * @returns SMS URI scheme
    */
  inline def normalizeSms(sTel: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSms")(sTel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Sanitizes the given telephone number and returns a telephone URI scheme.
    * @param sTel Telephone number
    * @returns Telephone URI scheme
    */
  inline def normalizeTel(sTel: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTel")(sTel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Redirects to the given URL.This method fires "redirect" event before opening the URL.
    * @param sURL Uniform resource locator
    * @param bNewWindow Opens URL in a new browser window or tab. Please note that, opening a new
    * window/tab can be ignored by browsers(e.g. on Windows Phone) or by popup blockers.NOTE: On Windows
    * Phone the URL will be enforced to open in the same window if opening in a new window/tab fails
    * (because of a known system restriction on cross-window communications). Use sap.m.Link instead (with
    * blank target) if you necessarily need to open URL in a new window.
    */
  inline def redirect(sURL: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(sURL.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def redirect(sURL: String, bNewWindow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(sURL.asInstanceOf[js.Any], bNewWindow.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Trigger email application to send email.Trims spaces from email addresses.
    * @param sEmail Destination email address
    * @param sSubject Subject of the email address
    * @param sBody Default message text
    * @param sCC Carbon Copy email address
    * @param sBCC Blind carbon copy email address
    */
  inline def triggerEmail(sEmail: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: String, sCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: String, sCC: String, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: String, sCC: Unit, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: Unit, sCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: Unit, sCC: String, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: String, sBody: Unit, sCC: Unit, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: String, sCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: String, sCC: String, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: String, sCC: Unit, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: Unit, sCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: Unit, sCC: String, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def triggerEmail(sEmail: String, sSubject: Unit, sBody: Unit, sCC: Unit, sBCC: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("triggerEmail")(sEmail.asInstanceOf[js.Any], sSubject.asInstanceOf[js.Any], sBody.asInstanceOf[js.Any], sCC.asInstanceOf[js.Any], sBCC.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Trigger SMS application to send SMS to given telephone number.
    * @param sTel Telephone number
    */
  inline def triggerSms(sTel: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerSms")(sTel.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Trigger telephone to call given telephone number.
    * @param sTel Telephone number
    */
  inline def triggerTel(sTel: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerTel")(sTel.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
