package typings.next.appMod

import typings.nextDashServer.routerMod.DefaultQuery
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/app", JSImport.Default)
@js.native
class default[P, S] ()
  extends Component[P with DefaultAppIProps with (AppProps[DefaultQuery, js.Object]), S, js.Any]

/* static members */
@JSImport("next/app", JSImport.Default)
@js.native
object default extends js.Object {
  def getInitialProps(context: NextAppContext[DefaultQuery, js.Object]): js.Promise[DefaultAppIProps] = js.native
}

