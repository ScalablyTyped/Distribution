package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Torrent extends js.Object {
  var anidbid: Double
  var category: String
  var comments: js.Array[Comment]
  var completed: Double
  var date: String
  var description: String
  var dlsite: String
  var file_list: js.Array[String]
  var filesize: Double
  var hash: String
  var id: Double
  var languages: js.Array[String]
  var last_scrape: String
  var leechers: Double
  var magnet: String
  var name: String
  var seeders: Double
  var status: Double
  var sub_category: String
  var tags: Null
  var torrent: String
  var uploader_id: Double
  var uploader_name: String
  var uploader_old: String
  var vgmdbid: Double
  var videoquality: String
  var vndbid: Double
  var website_link: String
}

object Torrent {
  @scala.inline
  def apply(
    anidbid: Double,
    category: String,
    comments: js.Array[Comment],
    completed: Double,
    date: String,
    description: String,
    dlsite: String,
    file_list: js.Array[String],
    filesize: Double,
    hash: String,
    id: Double,
    languages: js.Array[String],
    last_scrape: String,
    leechers: Double,
    magnet: String,
    name: String,
    seeders: Double,
    status: Double,
    sub_category: String,
    tags: Null,
    torrent: String,
    uploader_id: Double,
    uploader_name: String,
    uploader_old: String,
    vgmdbid: Double,
    videoquality: String,
    vndbid: Double,
    website_link: String
  ): Torrent = {
    val __obj = js.Dynamic.literal(anidbid = anidbid.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], dlsite = dlsite.asInstanceOf[js.Any], file_list = file_list.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], last_scrape = last_scrape.asInstanceOf[js.Any], leechers = leechers.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seeders = seeders.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub_category = sub_category.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], uploader_id = uploader_id.asInstanceOf[js.Any], uploader_name = uploader_name.asInstanceOf[js.Any], uploader_old = uploader_old.asInstanceOf[js.Any], vgmdbid = vgmdbid.asInstanceOf[js.Any], videoquality = videoquality.asInstanceOf[js.Any], vndbid = vndbid.asInstanceOf[js.Any], website_link = website_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
}

