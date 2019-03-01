package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionConvertToPDF extends js.Object {
  var FailOnUnsupportedSourceFiles: scala.Boolean
  var OverwriteExistingFile: scala.Boolean
  var PDFA1b: scala.Boolean
  var StoreAsSeparateFile: scala.Boolean
  def Clone(): IActionConvertToPDF
}

object IActionConvertToPDF {
  @scala.inline
  def apply(
    Clone: js.Function0[IActionConvertToPDF],
    FailOnUnsupportedSourceFiles: scala.Boolean,
    OverwriteExistingFile: scala.Boolean,
    PDFA1b: scala.Boolean,
    StoreAsSeparateFile: scala.Boolean
  ): IActionConvertToPDF = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("FailOnUnsupportedSourceFiles")(FailOnUnsupportedSourceFiles)
    __obj.updateDynamic("OverwriteExistingFile")(OverwriteExistingFile)
    __obj.updateDynamic("PDFA1b")(PDFA1b)
    __obj.updateDynamic("StoreAsSeparateFile")(StoreAsSeparateFile)
    __obj.asInstanceOf[IActionConvertToPDF]
  }
}

