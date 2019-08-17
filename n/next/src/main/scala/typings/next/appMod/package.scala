package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appMod {
  import typings.next.nextMod.NextComponentType
  import typings.nextDashServer.routerMod.DefaultQuery
  import typings.react.reactMod.Component

  type App[P, S] = Component[P with DefaultAppIProps with (AppProps[DefaultQuery, js.Object]), S, js.Any]
  type AppComponentContext = NextAppContext[DefaultQuery, js.Object]
  type AppComponentProps = AppProps[DefaultQuery, js.Object]
  type AppComponentType[P, IP, C] = NextComponentType[P with (AppProps[DefaultQuery, js.Object]), IP, C]
}
