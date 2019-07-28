package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
interface LocalFileSystem {
  requestFileSystem: Function;
  resolveLocalFileSystemURI: Function;
}*/
trait LocalFileSystem extends js.Object {
  var PERSISTENT: Double
  var TEMPORARY: Double
}

object LocalFileSystem {
  @scala.inline
  def apply(PERSISTENT: Double, TEMPORARY: Double): LocalFileSystem = {
    val __obj = js.Dynamic.literal(PERSISTENT = PERSISTENT, TEMPORARY = TEMPORARY)
  
    __obj.asInstanceOf[LocalFileSystem]
  }
}

