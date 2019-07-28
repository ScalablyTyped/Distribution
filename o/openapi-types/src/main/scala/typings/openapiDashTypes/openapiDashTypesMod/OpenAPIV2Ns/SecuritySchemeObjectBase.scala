package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2Ns

import typings.openapiDashTypes.openapiDashTypesStrings.apiKey
import typings.openapiDashTypes.openapiDashTypesStrings.basic
import typings.openapiDashTypes.openapiDashTypesStrings.oauth2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeObjectBase extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var `type`: basic | apiKey | oauth2
}

object SecuritySchemeObjectBase {
  @scala.inline
  def apply(`type`: basic | apiKey | oauth2, description: String = null): SecuritySchemeObjectBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeObjectBase]
  }
}

