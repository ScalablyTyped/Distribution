package typings.nodegit.mergeDashFileDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeFileInput extends js.Object {
  var mode: Double
  var path: String
  var ptr: String
  var size: Double
  var version: Double
}

object MergeFileInput {
  @scala.inline
  def apply(mode: Double, path: String, ptr: String, size: Double, version: Double): MergeFileInput = {
    val __obj = js.Dynamic.literal(mode = mode, path = path, ptr = ptr, size = size, version = version)
  
    __obj.asInstanceOf[MergeFileInput]
  }
}

