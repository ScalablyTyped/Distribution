package typings.nodeDashDir.nodeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsResult extends js.Object {
  var dirs: js.Array[String]
  var files: js.Array[String]
}

object PathsResult {
  @scala.inline
  def apply(dirs: js.Array[String], files: js.Array[String]): PathsResult = {
    val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PathsResult]
  }
}

