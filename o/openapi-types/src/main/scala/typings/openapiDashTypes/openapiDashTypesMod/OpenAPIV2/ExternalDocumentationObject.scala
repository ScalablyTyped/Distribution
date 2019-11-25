package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalDocumentationObject
  extends /* index */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var url: String
}

object ExternalDocumentationObject {
  @scala.inline
  def apply(
    url: String,
    StringDictionary: /* index */ StringDictionary[js.Any] = null,
    description: String = null
  ): ExternalDocumentationObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalDocumentationObject]
  }
}

