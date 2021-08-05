package typings.nodeRedRegistry.mod

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPIAuth extends StObject {
  
  /**
    * Returns an Express middleware function that ensures the user making a request has the necessary permission.
    */
  def needsPermission(permission: String): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ NextFunction, 
    Unit
  ]
}
object NodeAPIAuth {
  
  inline def apply(
    needsPermission: String => js.Function3[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response_[js.Any], 
      /* next */ NextFunction, 
      Unit
    ]
  ): NodeAPIAuth = {
    val __obj = js.Dynamic.literal(needsPermission = js.Any.fromFunction1(needsPermission))
    __obj.asInstanceOf[NodeAPIAuth]
  }
  
  extension [Self <: NodeAPIAuth](x: Self) {
    
    inline def setNeedsPermission(
      value: String => js.Function3[
          /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
          /* res */ Response_[js.Any], 
          /* next */ NextFunction, 
          Unit
        ]
    ): Self = StObject.set(x, "needsPermission", js.Any.fromFunction1(value))
  }
}
