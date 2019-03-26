package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsesObject
  extends /* index */ org.scalablytyped.runtime.StringDictionary[Response | js.Any] {
  var default: Response
}

object ResponsesObject {
  @scala.inline
  def apply(
    default: Response,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[Response | js.Any] = null
  ): ResponsesObject = {
    val __obj = js.Dynamic.literal(default = default)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResponsesObject]
  }
}

