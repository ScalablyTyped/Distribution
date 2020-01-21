package typings.openapiSecurityHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SecurityHandler = js.Function3[
    /* req */ typings.openapiTypes.mod.OpenAPI.Request, 
    /* scopes */ js.Array[typings.openapiSecurityHandler.mod.SecurityScope], 
    /* definition */ typings.openapiTypes.mod.OpenAPIV2.SecuritySchemeObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type SecurityHandlers = org.scalablytyped.runtime.StringDictionary[typings.openapiSecurityHandler.mod.SecurityHandler]
  type SecurityScope = java.lang.String
}
