package typings
package atOctokitEndpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: java.lang.String
  var headers: Anon_AcceptUseragent
  var mediaType: Anon_FormatPreviews
  var method: atOctokitEndpointLib.libTypesMod.Method
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    headers: Anon_AcceptUseragent,
    mediaType: Anon_FormatPreviews,
    method: atOctokitEndpointLib.libTypesMod.Method
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, headers = headers, mediaType = mediaType, method = method)
  
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

