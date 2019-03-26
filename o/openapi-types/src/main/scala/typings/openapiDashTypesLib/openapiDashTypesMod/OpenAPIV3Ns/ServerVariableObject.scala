package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerVariableObject extends js.Object {
  var default: java.lang.String
  var description: js.UndefOr[java.lang.String] = js.undefined
  var enum: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ServerVariableObject {
  @scala.inline
  def apply(
    default: java.lang.String,
    description: java.lang.String = null,
    enum: js.Array[java.lang.String] = null
  ): ServerVariableObject = {
    val __obj = js.Dynamic.literal(default = default)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enum != null) __obj.updateDynamic("enum")(enum)
    __obj.asInstanceOf[ServerVariableObject]
  }
}

