package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spdxid extends js.Object {
  var html_url: String
  var key: String
  var name: String
  var spdx_id: String
  var url: String
}

object Spdxid {
  @scala.inline
  def apply(html_url: String, key: String, name: String, spdx_id: String, url: String): Spdxid = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spdx_id = spdx_id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spdxid]
  }
}

