package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetPagesResponse extends js.Object {
  var cname: java.lang.String
  var custom_404: scala.Boolean
  var html_url: java.lang.String
  var source: ReposGetPagesResponseSource
  var status: java.lang.String
  var url: java.lang.String
}

object ReposGetPagesResponse {
  @scala.inline
  def apply(
    cname: java.lang.String,
    custom_404: scala.Boolean,
    html_url: java.lang.String,
    source: ReposGetPagesResponseSource,
    status: java.lang.String,
    url: java.lang.String
  ): ReposGetPagesResponse = {
    val __obj = js.Dynamic.literal(cname = cname, custom_404 = custom_404, html_url = html_url, source = source, status = status, url = url)
  
    __obj.asInstanceOf[ReposGetPagesResponse]
  }
}

