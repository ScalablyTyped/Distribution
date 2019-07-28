package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RenderTask is basically a promise but adds a cancel function to termiate it.
  **/
trait PDFRenderTask extends PDFLoadingTask[PDFPageProxy] {
  /**
    * Cancel the rendering task.  If the task is currently rendering it will not be cancelled until graphics pauses with a timeout.  The promise that this object extends will resolve when cancelled.
    **/
  def cancel(): Unit
}

object PDFRenderTask {
  @scala.inline
  def apply(cancel: () => Unit, promise: PDFPromise[PDFPageProxy]): PDFRenderTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), promise = promise)
  
    __obj.asInstanceOf[PDFRenderTask]
  }
}

