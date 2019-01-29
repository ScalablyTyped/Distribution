package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appMod {
  type App[P, S] = reactLib.reactMod.Component[
    P with DefaultAppIProps with AppProps[nextDashServerLib.routerMod.DefaultQuery], 
    S, 
    js.Any
  ]
  type AppComponentContext = NextAppContext[nextDashServerLib.routerMod.DefaultQuery]
  type AppComponentProps = AppProps[nextDashServerLib.routerMod.DefaultQuery]
  type AppComponentType[P, IP, C] = nextLib.nextMod.nextNs.NextComponentType[P with AppProps[nextDashServerLib.routerMod.DefaultQuery], IP, C]
}
