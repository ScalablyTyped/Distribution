package typings.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var category: String
  var completed: String
  var date: String
  var filesize: String
  var hash: String
  var id: String
  var leechers: String
  var magnet: String
  var name: String
  var seeders: String
  var sub_category: String
  var torrent: String
}

object Torrent {
  @scala.inline
  def apply(
    category: String,
    completed: String,
    date: String,
    filesize: String,
    hash: String,
    id: String,
    leechers: String,
    magnet: String,
    name: String,
    seeders: String,
    sub_category: String,
    torrent: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], sub_category = sub_category.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
}

