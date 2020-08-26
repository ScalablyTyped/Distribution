package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateData extends UploadData {
  var id: Double = js.native
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
  @scala.inline
  implicit class UpdateDataOps[Self <: UpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

