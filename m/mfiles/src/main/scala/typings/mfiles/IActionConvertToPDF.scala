package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IActionConvertToPDF extends js.Object {
  var FailOnUnsupportedSourceFiles: Boolean = js.native
  var OverwriteExistingFile: Boolean = js.native
  var PDFA1b: Boolean = js.native
  var StoreAsSeparateFile: Boolean = js.native
  def Clone(): IActionConvertToPDF = js.native
}

object IActionConvertToPDF {
  @scala.inline
  def apply(
    Clone: () => IActionConvertToPDF,
    FailOnUnsupportedSourceFiles: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    StoreAsSeparateFile: Boolean
  ): IActionConvertToPDF = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FailOnUnsupportedSourceFiles = FailOnUnsupportedSourceFiles.asInstanceOf[js.Any], OverwriteExistingFile = OverwriteExistingFile.asInstanceOf[js.Any], PDFA1b = PDFA1b.asInstanceOf[js.Any], StoreAsSeparateFile = StoreAsSeparateFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionConvertToPDF]
  }
  @scala.inline
  implicit class IActionConvertToPDFOps[Self <: IActionConvertToPDF] (val x: Self) extends AnyVal {
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
    def setClone(value: () => IActionConvertToPDF): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setFailOnUnsupportedSourceFiles(value: Boolean): Self = this.set("FailOnUnsupportedSourceFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverwriteExistingFile(value: Boolean): Self = this.set("OverwriteExistingFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setPDFA1b(value: Boolean): Self = this.set("PDFA1b", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreAsSeparateFile(value: Boolean): Self = this.set("StoreAsSeparateFile", value.asInstanceOf[js.Any])
  }
  
}

