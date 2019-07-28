package typings.atOctokitRequest

import typings.atOctokitRequest.distDashTypesTypesMod.Method
import typings.atOctokitRequest.distDashTypesTypesMod.RequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: String
  var headers: RequestHeaders with Anon_Accept
  var mediaType: Anon_FormatPreviews
  var method: Method
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: String,
    headers: RequestHeaders with Anon_Accept,
    mediaType: Anon_FormatPreviews,
    method: Method
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, headers = headers, mediaType = mediaType, method = method)
  
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

