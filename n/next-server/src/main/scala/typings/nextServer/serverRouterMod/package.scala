package typings.nextServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverRouterMod {
  type Params = org.scalablytyped.runtime.StringDictionary[js.Any]
  type RouteMatch = js.Function1[
    /* pathname */ js.UndefOr[java.lang.String], 
    typings.nextServer.nextServerBooleans.`false` | typings.nextServer.serverRouterMod.Params
  ]
}
