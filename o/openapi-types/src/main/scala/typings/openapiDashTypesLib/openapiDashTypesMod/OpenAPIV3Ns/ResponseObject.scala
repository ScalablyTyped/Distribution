package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseObject extends js.Object {
  var content: js.UndefOr[org.scalablytyped.runtime.StringDictionary[MediaTypeObject]] = js.undefined
  var description: java.lang.String
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | HeaderObject]] = js.undefined
  var links: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReferenceObject | LinkObject]] = js.undefined
}

object ResponseObject {
  @scala.inline
  def apply(
    description: java.lang.String,
    content: org.scalablytyped.runtime.StringDictionary[MediaTypeObject] = null,
    headers: org.scalablytyped.runtime.StringDictionary[ReferenceObject | HeaderObject] = null,
    links: org.scalablytyped.runtime.StringDictionary[ReferenceObject | LinkObject] = null
  ): ResponseObject = {
    val __obj = js.Dynamic.literal(description = description)
    if (content != null) __obj.updateDynamic("content")(content)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (links != null) __obj.updateDynamic("links")(links)
    __obj.asInstanceOf[ResponseObject]
  }
}

