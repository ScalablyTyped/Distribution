package typings
package nodeDashDirLib.nodeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsResult extends js.Object {
  var dirs: js.Array[java.lang.String]
  var files: js.Array[java.lang.String]
}

object PathsResult {
  @scala.inline
  def apply(dirs: js.Array[java.lang.String], files: js.Array[java.lang.String]): PathsResult = {
    val __obj = js.Dynamic.literal(dirs = dirs, files = files)
  
    __obj.asInstanceOf[PathsResult]
  }
}

