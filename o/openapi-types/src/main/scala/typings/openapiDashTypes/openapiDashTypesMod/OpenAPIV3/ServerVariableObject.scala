package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerVariableObject extends js.Object {
  var default: String
  var description: js.UndefOr[String] = js.undefined
  var enum: js.UndefOr[js.Array[String]] = js.undefined
}

object ServerVariableObject {
  @scala.inline
  def apply(default: String, description: String = null, enum: js.Array[String] = null): ServerVariableObject = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerVariableObject]
  }
}

