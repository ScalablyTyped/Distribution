package typings.openapiDashSecurityDashHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openapiDashSecurityDashHandlerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Request
  import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecuritySchemeObject

  type SecurityHandler = js.Function3[
    /* req */ Request, 
    /* scopes */ js.Array[SecurityScope], 
    /* definition */ SecuritySchemeObject, 
    js.Promise[Boolean] | Boolean
  ]
  type SecurityHandlers = StringDictionary[SecurityHandler]
  type SecurityScope = String
}
