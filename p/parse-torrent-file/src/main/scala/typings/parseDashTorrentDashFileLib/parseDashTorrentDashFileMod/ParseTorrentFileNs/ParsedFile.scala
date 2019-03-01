package typings
package parseDashTorrentDashFileLib.parseDashTorrentDashFileMod.ParseTorrentFileNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ParsedFile]
  }
}

