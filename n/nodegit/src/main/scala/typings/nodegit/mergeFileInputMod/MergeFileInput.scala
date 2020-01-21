package typings.nodegit.mergeFileInputMod

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
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MergeFileInput]
  }
}

