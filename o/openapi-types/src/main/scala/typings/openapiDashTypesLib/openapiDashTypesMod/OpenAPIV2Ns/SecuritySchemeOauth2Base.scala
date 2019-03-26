package typings
package openapiDashTypesLib.openapiDashTypesMod.OpenAPIV2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecuritySchemeOauth2Base extends SecuritySchemeObjectBase {
  var flow: openapiDashTypesLib.openapiDashTypesLibStrings.`implicit` | openapiDashTypesLib.openapiDashTypesLibStrings.password | openapiDashTypesLib.openapiDashTypesLibStrings.application | openapiDashTypesLib.openapiDashTypesLibStrings.accessCode
  var scopes: ScopesObject
}

object SecuritySchemeOauth2Base {
  @scala.inline
  def apply(
    flow: openapiDashTypesLib.openapiDashTypesLibStrings.`implicit` | openapiDashTypesLib.openapiDashTypesLibStrings.password | openapiDashTypesLib.openapiDashTypesLibStrings.application | openapiDashTypesLib.openapiDashTypesLibStrings.accessCode,
    scopes: ScopesObject,
    `type`: openapiDashTypesLib.openapiDashTypesLibStrings.basic | openapiDashTypesLib.openapiDashTypesLibStrings.apiKey | openapiDashTypesLib.openapiDashTypesLibStrings.oauth2,
    description: java.lang.String = null
  ): SecuritySchemeOauth2Base = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any], scopes = scopes)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[SecuritySchemeOauth2Base]
  }
}

