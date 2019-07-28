package typings.parseDashTorrentDashFile.parseDashTorrentDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedFile extends js.Object {
  var length: Double
  var name: String
  var offset: Double
  var path: String
}

object ParsedFile {
  @scala.inline
  def apply(length: Double, name: String, offset: Double, path: String): ParsedFile = {
    val __obj = js.Dynamic.literal(length = length, name = name, offset = offset, path = path)
  
    __obj.asInstanceOf[ParsedFile]
  }
}

