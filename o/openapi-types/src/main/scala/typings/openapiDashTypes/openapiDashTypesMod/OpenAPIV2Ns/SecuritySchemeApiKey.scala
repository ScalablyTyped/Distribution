package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2Ns

import typings.openapiDashTypes.openapiDashTypesStrings.apiKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeApiKey
  extends SecuritySchemeObjectBase
     with SecuritySchemeObject {
  var in: String
  var name: String
  @JSName("type")
  var type_SecuritySchemeApiKey: apiKey
}

object SecuritySchemeApiKey {
  @scala.inline
  def apply(in: String, name: String, `type`: apiKey, description: String = null): SecuritySchemeApiKey = {
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeApiKey]
  }
}

