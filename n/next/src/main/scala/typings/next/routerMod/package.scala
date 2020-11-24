package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routerMod {
  
  type AppComponent = typings.react.mod.ComponentType[typings.next.routerMod.AppProps]
  
  type AppProps = typings.next.anon.PickCompletePrivateRouteI with typings.next.anon.Router with (typings.std.Record[java.lang.String, _])
  
  type BeforePopStateCallback = js.Function1[/* state */ typings.next.routerMod.NextHistoryState, scala.Boolean]
  
  type ComponentLoadCancel = js.Function0[scala.Unit] | scala.Null
  
  type Subscription = js.Function2[
    /* data */ typings.next.routerMod.PrivateRouteInfo, 
    /* App */ typings.next.routerMod.AppComponent, 
    js.Promise[scala.Unit]
  ]
  
  type Url = typings.node.urlMod.UrlObject | java.lang.String
}
