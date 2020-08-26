package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RenderTask is basically a promise but adds a cancel function to termiate it.
  **/
@js.native
trait PDFRenderTask extends PDFLoadingTask[PDFPageProxy] {
  /**
    * Cancel the rendering task.  If the task is currently rendering it will not be cancelled until graphics pauses with a timeout.  The promise that this object extends will resolve when cancelled.
    **/
  def cancel(): Unit = js.native
}

object PDFRenderTask {
  @scala.inline
  def apply(cancel: () => Unit, promise: PDFPromise[PDFPageProxy]): PDFRenderTask = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRenderTask]
  }
  @scala.inline
  implicit class PDFRenderTaskOps[Self <: PDFRenderTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
  }
  
}

