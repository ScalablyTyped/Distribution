package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedFile extends js.Object {
  var length: scala.Double
  var name: java.lang.String
  var offset: scala.Double
  var path: java.lang.String
}

object ParsedFile {
  @scala.inline
  def apply(length: scala.Double, name: java.lang.String, offset: scala.Double, path: java.lang.String): ParsedFile = {
    val __obj = js.Dynamic.literal(length = length, name = name, offset = offset, path = path)
  
    __obj.asInstanceOf[ParsedFile]
  }
}

