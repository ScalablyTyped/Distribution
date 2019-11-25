package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsesObject
  extends /* index */ StringDictionary[Response | js.Any] {
  var default: Response
}

object ResponsesObject {
  @scala.inline
  def apply(default: Response, StringDictionary: /* index */ StringDictionary[Response | js.Any] = null): ResponsesObject = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ResponsesObject]
  }
}

