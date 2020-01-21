package typings.openapiTypes.mod.OpenAPIV2

import typings.openapiTypes.openapiTypesStrings.apiKey
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
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecuritySchemeApiKey]
  }
}

