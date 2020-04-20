package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateData extends UploadData {
  var id: Double
}

object UpdateData {
  @scala.inline
  def apply(
    c: Category,
    description: String,
    hidden: Boolean,
    id: Double,
    languages: js.Array[String],
    magnet: String,
    name: String,
    remake: Boolean,
    status: Double,
    torrent: String,
    username: String,
    website_link: String
  ): UpdateData = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], magnet = magnet.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remake = remake.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], website_link = website_link.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateData]
  }
}

