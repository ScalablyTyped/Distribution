package typings.openapiTypes.mod.OpenAPIV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterObject
  extends /* index */ StringDictionary[js.Any] {
  var description: js.UndefOr[String] = js.undefined
  var in: String
  var name: String
  var required: js.UndefOr[Boolean] = js.undefined
}

object ParameterObject {
  @scala.inline
  def apply(
    in: String,
    name: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    description: String = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): ParameterObject = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterObject]
  }
}

