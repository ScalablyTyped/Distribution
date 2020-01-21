package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestBodyObject extends js.Object {
  var content: StringDictionary[MediaTypeObject]
  var description: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
}

object RequestBodyObject {
  @scala.inline
  def apply(
    content: StringDictionary[MediaTypeObject],
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): RequestBodyObject = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyObject]
  }
}

