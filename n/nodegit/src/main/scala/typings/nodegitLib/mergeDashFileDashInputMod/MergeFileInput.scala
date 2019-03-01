package typings
package nodegitLib.mergeDashFileDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeFileInput extends js.Object {
  var mode: scala.Double
  var path: java.lang.String
  var ptr: java.lang.String
  var size: scala.Double
  var version: scala.Double
}

object MergeFileInput {
  @scala.inline
  def apply(
    mode: scala.Double,
    path: java.lang.String,
    ptr: java.lang.String,
    size: scala.Double,
    version: scala.Double
  ): MergeFileInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("ptr")(ptr)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[MergeFileInput]
  }
}

