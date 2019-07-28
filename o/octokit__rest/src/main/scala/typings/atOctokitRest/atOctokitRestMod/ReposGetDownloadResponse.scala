package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetDownloadResponse extends js.Object {
  var content_type: String
  var description: String
  var download_count: Double
  var html_url: String
  var id: Double
  var name: String
  var size: Double
  var url: String
}

object ReposGetDownloadResponse {
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
  ): ReposGetDownloadResponse = {
    val __obj = js.Dynamic.literal(content_type = content_type, description = description, download_count = download_count, html_url = html_url, id = id, name = name, size = size, url = url)
  
    __obj.asInstanceOf[ReposGetDownloadResponse]
  }
}

