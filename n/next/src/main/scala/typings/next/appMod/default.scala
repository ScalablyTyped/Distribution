package typings.next.appMod

import typings.nextDashServer.routerMod.DefaultQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/app", JSImport.Default)
@js.native
class default[P, S] () extends App[P, S]

/* static members */
@JSImport("next/app", JSImport.Default)
@js.native
object default extends js.Object {
  def getInitialProps(context: NextAppContext[DefaultQuery, js.Object]): js.Promise[DefaultAppIProps] = js.native
}

