package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.basic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeBasic
  extends SecuritySchemeObjectBase
     with SecuritySchemeObject {
  @JSName("type")
  var type_SecuritySchemeBasic: basic
}

object SecuritySchemeBasic {
  @scala.inline
  def apply(`type`: basic, description: String = null): SecuritySchemeBasic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeBasic]
  }
}

