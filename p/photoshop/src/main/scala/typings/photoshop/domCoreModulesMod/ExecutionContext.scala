package typings.photoshop.domCoreModulesMod

import typings.photoshop.anon.RegisterAutoCloseDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContext extends StObject {
  
  /**
    * Use the methods in here to control Photoshop state.
    * @minVersion 23.0
    */
  var hostControl: RegisterAutoCloseDocument
  
  /**
    * True if user has cancelled the modal interaction.
    *
    * User can cancel by hitting the Escape key, or by pressing the "Cancel" button in the progress bar.
    * @minVersion 23.0
    */
  var isCancelled: Boolean
  
  /**
    * If assigned a method, it will be called when user cancels the modal interaction.
    * @minVersion 23.0
    */
  var onCancel: js.UndefOr[js.Function1[/* e */ js.UndefOr[OnCancelCbArgument], Unit]] = js.undefined
  
  /**
    * Call this to customize the progress bar.
    * @minVersion 23.0
    */
  def reportProgress(params: ReportProgressOptions): Unit
}
object ExecutionContext {
  
  inline def apply(
    hostControl: RegisterAutoCloseDocument,
    isCancelled: Boolean,
    reportProgress: ReportProgressOptions => Unit
  ): ExecutionContext = {
    val __obj = js.Dynamic.literal(hostControl = hostControl.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], reportProgress = js.Any.fromFunction1(reportProgress))
    __obj.asInstanceOf[ExecutionContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionContext] (val x: Self) extends AnyVal {
    
    inline def setHostControl(value: RegisterAutoCloseDocument): Self = StObject.set(x, "hostControl", value.asInstanceOf[js.Any])
    
    inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnCancel(value: /* e */ js.UndefOr[OnCancelCbArgument] => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setReportProgress(value: ReportProgressOptions => Unit): Self = StObject.set(x, "reportProgress", js.Any.fromFunction1(value))
  }
}
