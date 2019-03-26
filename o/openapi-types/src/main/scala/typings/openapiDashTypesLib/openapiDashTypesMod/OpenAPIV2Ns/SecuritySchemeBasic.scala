package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeBasic
  extends SecuritySchemeObjectBase
     with SecuritySchemeObject {
  @JSName("type")
  var type_SecuritySchemeBasic: openapiDashTypesLib.openapiDashTypesLibStrings.basic
}

object SecuritySchemeBasic {
  @scala.inline
  def apply(`type`: openapiDashTypesLib.openapiDashTypesLibStrings.basic, description: java.lang.String = null): SecuritySchemeBasic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeBasic]
  }
}

