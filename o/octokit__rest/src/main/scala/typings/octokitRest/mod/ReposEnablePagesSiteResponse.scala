package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposEnablePagesSiteResponse extends js.Object {
  var cname: String
  var custom_404: Boolean
  var html_url: String
  var source: ReposEnablePagesSiteResponseSource
  var status: String
  var url: String
}

object ReposEnablePagesSiteResponse {
  @scala.inline
  def apply(
    cname: String,
    custom_404: Boolean,
    html_url: String,
    source: ReposEnablePagesSiteResponseSource,
    status: String,
    url: String
  ): ReposEnablePagesSiteResponse = {
    val __obj = js.Dynamic.literal(cname = cname.asInstanceOf[js.Any], custom_404 = custom_404.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposEnablePagesSiteResponse]
  }
}

