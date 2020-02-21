package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

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
    val __obj = js.Dynamic.literal(cname = cname.asInstanceOf[js.Any], custom_404 = custom_404.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetPagesResponse]
  }
}

