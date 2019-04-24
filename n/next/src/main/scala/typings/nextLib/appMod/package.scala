package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appMod {
  type App[P, S] = reactLib.reactMod.Component[
    P with DefaultAppIProps with (AppProps[nextDashServerLib.routerMod.DefaultQuery, js.Object]), 
    S, 
    js.Any
  ]
  type AppComponentContext = NextAppContext[nextDashServerLib.routerMod.DefaultQuery, js.Object]
  type AppComponentProps = AppProps[nextDashServerLib.routerMod.DefaultQuery, js.Object]
  type AppComponentType[P, IP, C] = nextLib.nextMod.NextComponentType[P with (AppProps[nextDashServerLib.routerMod.DefaultQuery, js.Object]), IP, C]
}
