package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a modal notification dialog that can appear when the user attempts to close a document. The document won't close until the user responds.
  * The notification dialog will allow the user to confirm the request to close the document or cancel the request to close the document.
  * This API is only supported in Excel.
  * 
  * @remarks
  * [Api set: SharedRuntime BETA (PREVIEW ONLY)]
  * @beta
  */
trait BeforeDocumentCloseNotification extends StObject {
  
  /**
    * Prevents the notification dialog from appearing when the user attempts to close a document.
    * The `BeforeDocumentCloseNotification` API is only supported in Excel.
    * 
    * @remarks
    * [Api set: SharedRuntime BETA (PREVIEW ONLY)]
    * @beta
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enable a modal notification dialog that appears when the user attempts to close a document. The document won't close until the user responds.
    * This notification dialog asks the user to confirm the request to close the document, or allows the user to cancel the request to close the document.
    * The `BeforeDocumentCloseNotification` API is only supported in Excel.
    * 
    * @remarks
    * [Api set: SharedRuntime BETA (PREVIEW ONLY)]
    * @beta
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Adds an event handler that detects when the `BeforeDocumentCloseNotification` close operation is cancelled. 
    * This event handler will be triggered if one of the following conditions is met:
    * 1. When the notification dialog is open, the end user clicks the **Don't close** button within the dialog, clicks the Close button in the upper right corner of the dialog, or presses the Esc key.
    * 2. When the add-in calls the `enable` method on the `BeforeDocumentCloseNotification` object.
    * The `BeforeDocumentCloseNotification` API is only supported in Excel.
    * @param handler The event handler that is called when the dialog is cancelled.
    * @returns A promise that resolves when the event handler is added.
    * 
    * @remarks
    * [Api set: SharedRuntime BETA (PREVIEW ONLY)]
    * @beta
    */
  def onCloseActionCancelled(handler: js.Function0[Unit]): js.Promise[js.Function0[js.Promise[Unit]]]
}
object BeforeDocumentCloseNotification {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    onCloseActionCancelled: js.Function0[Unit] => js.Promise[js.Function0[js.Promise[Unit]]]
  ): BeforeDocumentCloseNotification = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), onCloseActionCancelled = js.Any.fromFunction1(onCloseActionCancelled))
    __obj.asInstanceOf[BeforeDocumentCloseNotification]
  }
  
  extension [Self <: BeforeDocumentCloseNotification](x: Self) {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setOnCloseActionCancelled(value: js.Function0[Unit] => js.Promise[js.Function0[js.Promise[Unit]]]): Self = StObject.set(x, "onCloseActionCancelled", js.Any.fromFunction1(value))
  }
}
