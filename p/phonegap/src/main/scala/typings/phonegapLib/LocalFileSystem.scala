package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
trait LocalFileSystem extends js.Object {
  var PERSISTENT: scala.Double
  var TEMPORARY: scala.Double
}

object LocalFileSystem {
  @scala.inline
  def apply(PERSISTENT: scala.Double, TEMPORARY: scala.Double): LocalFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PERSISTENT")(PERSISTENT)
    __obj.updateDynamic("TEMPORARY")(TEMPORARY)
    __obj.asInstanceOf[LocalFileSystem]
  }
}

