package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RenderTask is basically a promise but adds a cancel function to termiate it.
  **/
trait PDFRenderTask
  extends StObject
     with PDFLoadingTask[PDFPageProxy] {
  
  /**
    * Cancel the rendering task.  If the task is currently rendering it will not be cancelled until graphics pauses with a timeout.  The promise that this object extends will resolve when cancelled.
    **/
  def cancel(): Unit
}
object PDFRenderTask {
  
  @scala.inline
  def apply(cancel: () => Unit, promise: PDFPromise[PDFPageProxy]): PDFRenderTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRenderTask]
  }
  
  @scala.inline
  implicit class PDFRenderTaskMutableBuilder[Self <: PDFRenderTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
