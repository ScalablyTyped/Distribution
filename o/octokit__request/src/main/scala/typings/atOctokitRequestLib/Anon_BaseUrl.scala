package typings
package atOctokitRequestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: java.lang.String
  var headers: atOctokitRequestLib.distDashTypesTypesMod.RequestHeaders with Anon_Accept
  var mediaType: Anon_FormatPreviews
  var method: atOctokitRequestLib.distDashTypesTypesMod.Method
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: java.lang.String,
    headers: atOctokitRequestLib.distDashTypesTypesMod.RequestHeaders with Anon_Accept,
    mediaType: Anon_FormatPreviews,
    method: atOctokitRequestLib.distDashTypesTypesMod.Method
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl, headers = headers, mediaType = mediaType, method = method)
  
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

