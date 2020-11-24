package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object serverRouterMod {
  
  type DynamicRoutes = js.Array[typings.next.anon.Match]
  
  type PageChecker = js.Function1[/* pathname */ java.lang.String, js.Promise[scala.Boolean]]
  
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RouteMatch = js.Function1[
    /* pathname */ js.UndefOr[java.lang.String | scala.Null], 
    typings.next.nextBooleans.`false` | typings.next.serverRouterMod.Params
  ]
}
