package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeApiKey
  extends SecuritySchemeObjectBase
     with SecuritySchemeObject {
  var in: java.lang.String
  var name: java.lang.String
  @JSName("type")
  var type_SecuritySchemeApiKey: openapiDashTypesLib.openapiDashTypesLibStrings.apiKey
}

object SecuritySchemeApiKey {
  @scala.inline
  def apply(
    in: java.lang.String,
    name: java.lang.String,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.apiKey,
    description: java.lang.String = null
  ): SecuritySchemeApiKey = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeApiKey]
  }
}

