package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for setting the size of slices that the document will be divided into.
  */
@js.native
trait GetFileOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * The the size of the slices in bytes. The maximum (and the default) is 4194304 (4MB).
    */
  var sliceSize: js.UndefOr[Double] = js.native
}

object GetFileOptions {
  @scala.inline
  def apply(): GetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileOptions]
  }
  @scala.inline
  implicit class GetFileOptionsOps[Self <: GetFileOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setSliceSize(value: Double): Self = this.set("sliceSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliceSize: Self = this.set("sliceSize", js.undefined)
  }
  
}

