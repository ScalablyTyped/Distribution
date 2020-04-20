package typings.nyaapi.mod.si

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadData extends js.Object {
  var anonymous: Boolean
  var category: String
  var complete: Boolean
  var credentials: String
  var description: String
  var hidden: Boolean
  var information: String
  var name: String
  var remake: Boolean
  var torrent: String
  var trusted: Boolean
}

object UploadData {
  @scala.inline
  def apply(
    anonymous: Boolean,
    category: String,
    complete: Boolean,
    credentials: String,
    description: String,
    hidden: Boolean,
    information: String,
    name: String,
    remake: Boolean,
    torrent: String,
    trusted: Boolean
  ): UploadData = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], remake = remake.asInstanceOf[js.Any], torrent = torrent.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadData]
  }
}

