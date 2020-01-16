package typings.nyaapi.nyaapiMod.si

import typings.nyaapi.Anon_Code
import typings.nyaapi.Anon_File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var category: Anon_Code
  var fileSize: String
  var leechers: String
  var links: Anon_File
  var name: String
  var nbDownload: String
  var seeders: String
  var timestamp: String
}

object Torrent {
  @scala.inline
  def apply(
    category: Anon_Code,
    fileSize: String,
    leechers: String,
    links: Anon_File,
    name: String,
    nbDownload: String,
    seeders: String,
    timestamp: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nbDownload = nbDownload.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Torrent]
  }
}

