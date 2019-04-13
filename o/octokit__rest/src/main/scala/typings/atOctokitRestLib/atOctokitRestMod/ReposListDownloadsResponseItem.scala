package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListDownloadsResponseItem extends js.Object {
  var content_type: java.lang.String
  var description: java.lang.String
  var download_count: scala.Double
  var html_url: java.lang.String
  var id: scala.Double
  var name: java.lang.String
  var size: scala.Double
  var url: java.lang.String
}

object ReposListDownloadsResponseItem {
  @scala.inline
  def apply(
    content_type: java.lang.String,
    description: java.lang.String,
    download_count: scala.Double,
    html_url: java.lang.String,
    id: scala.Double,
    name: java.lang.String,
    size: scala.Double,
    url: java.lang.String
  ): ReposListDownloadsResponseItem = {
    val __obj = js.Dynamic.literal(content_type = content_type, description = description, download_count = download_count, html_url = html_url, id = id, name = name, size = size, url = url)
  
    __obj.asInstanceOf[ReposListDownloadsResponseItem]
  }
}

