package typings.phonegap

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("LocalFileSystem")
@js.native
object LocalFileSystem extends TopLevel[LocalFileSystem]

