package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesResponse extends js.Object {
  var cname: String
  var custom_404: Boolean
  var html_url: String
  var source: ReposGetPagesResponseSource
  var status: String
  var url: String
}

object ReposGetPagesResponse {
  @scala.inline
  def apply(
    cname: String,
    custom_404: Boolean,
    html_url: String,
    source: ReposGetPagesResponseSource,
    status: String,
    url: String
  ): ReposGetPagesResponse = {
    val __obj = js.Dynamic.literal(cname = cname, custom_404 = custom_404, html_url = html_url, source = source, status = status, url = url)
  
    __obj.asInstanceOf[ReposGetPagesResponse]
  }
}

