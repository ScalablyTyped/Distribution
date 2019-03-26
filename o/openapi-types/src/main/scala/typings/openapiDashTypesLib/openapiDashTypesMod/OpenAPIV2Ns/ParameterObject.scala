package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterObject
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var in: java.lang.String
  var name: java.lang.String
  var required: js.UndefOr[scala.Boolean] = js.undefined
}

object ParameterObject {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    description: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined
  ): ParameterObject = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[ParameterObject]
  }
}

