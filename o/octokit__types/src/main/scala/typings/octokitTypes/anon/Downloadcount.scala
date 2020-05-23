package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Downloadcount extends js.Object {
  var content_type: String
  var description: String
  var download_count: Double
  var html_url: String
  var id: Double
  var name: String
  var size: Double
  var url: String
}

object Downloadcount {
  @scala.inline
  def apply(
    content_type: String,
    description: String,
    download_count: Double,
    html_url: String,
    id: Double,
    name: String,
    size: Double,
    url: String
  ): Downloadcount = {
    val __obj = js.Dynamic.literal(content_type = content_type.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], download_count = download_count.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Downloadcount]
  }
}

