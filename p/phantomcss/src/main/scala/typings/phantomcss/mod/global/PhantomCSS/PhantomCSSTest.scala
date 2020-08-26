package typings.phantomcss.mod.global.PhantomCSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhantomCSSTest extends js.Object {
  var error: js.UndefOr[Boolean] = js.native
  var fail: js.UndefOr[Boolean] = js.native
  var failFile: js.UndefOr[String] = js.native
  var filename: js.UndefOr[String] = js.native
  var mismatch: js.UndefOr[js.Any] = js.native
  var success: js.UndefOr[Boolean] = js.native
}

object PhantomCSSTest {
  @scala.inline
  def apply(): PhantomCSSTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhantomCSSTest]
  }
  @scala.inline
  implicit class PhantomCSSTestOps[Self <: PhantomCSSTest] (val x: Self) extends AnyVal {
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
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFail(value: Boolean): Self = this.set("fail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setFailFile(value: String): Self = this.set("failFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailFile: Self = this.set("failFile", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setMismatch(value: js.Any): Self = this.set("mismatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMismatch: Self = this.set("mismatch", js.undefined)
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

