package typings.mobxStateTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object actionMod {
  
  type IMiddlewareHandler = js.Function3[
    /* actionCall */ typings.mobxStateTree.actionMod.IMiddlewareEvent, 
    /* next */ js.Function2[
      /* actionCall */ typings.mobxStateTree.actionMod.IMiddlewareEvent, 
      /* callback */ js.UndefOr[js.Function1[/* value */ js.Any, js.Any]], 
      scala.Unit
    ], 
    /* abort */ js.Function1[/* value */ js.Any, scala.Unit], 
    js.Any
  ]
}
