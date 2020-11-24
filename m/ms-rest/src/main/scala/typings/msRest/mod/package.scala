package typings.msRest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ServiceCallback[TResult] = js.Function4[
    /* err */ typings.std.Error | typings.msRest.mod.ServiceError, 
    /* result */ js.UndefOr[TResult], 
    /* request */ js.UndefOr[typings.msRest.mod.WebResource], 
    /* response */ js.UndefOr[typings.node.httpMod.IncomingMessage], 
    scala.Unit
  ]
}
