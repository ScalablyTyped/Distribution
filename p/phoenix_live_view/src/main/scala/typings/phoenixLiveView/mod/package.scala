package typings.phoenixLiveView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BindCallback = js.Function7[
    /* e */ typings.std.Event, 
    /* event */ java.lang.String, 
    /* view */ typings.phoenixLiveView.mod.View, 
    /* el */ typings.std.HTMLElement, 
    /* targetCtx */ js.Object, 
    /* phxEvent */ java.lang.String, 
    /* windowOwner */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type ViewLogger = js.Function4[
    /* view */ typings.phoenixLiveView.mod.View, 
    /* kind */ java.lang.String, 
    /* msg */ js.Any, 
    /* obj */ js.Any, 
    scala.Unit
  ]
}
