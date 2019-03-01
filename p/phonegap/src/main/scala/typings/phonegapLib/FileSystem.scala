package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  var name: java.lang.String
  var root: DirectoryEntry
}

object FileSystem {
  @scala.inline
  def apply(name: java.lang.String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[FileSystem]
  }
}

