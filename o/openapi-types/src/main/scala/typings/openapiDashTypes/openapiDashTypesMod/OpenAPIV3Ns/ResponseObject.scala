package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  var content: js.UndefOr[StringDictionary[MediaTypeObject]] = js.undefined
  var description: String
  var headers: js.UndefOr[StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var links: js.UndefOr[StringDictionary[ReferenceObject | LinkObject]] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    description: String,
    content: StringDictionary[MediaTypeObject] = null,
    headers: StringDictionary[ReferenceObject | HeaderObject] = null,
    links: StringDictionary[ReferenceObject | LinkObject] = null
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description)
    if (content != null) __obj.updateDynamic("content")(content)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (links != null) __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[ResponseObject]
  }
}

