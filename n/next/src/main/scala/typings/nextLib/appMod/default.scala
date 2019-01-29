package typings
package nextLib.appMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/app", JSImport.Default)
@js.native
class default[P, S] () extends App[P, S]

@JSImport("next/app", JSImport.Default)
@js.native
object default extends js.Object {
  def getInitialProps(context: nextLib.appMod.NextAppContext[nextDashServerLib.routerMod.DefaultQuery]): js.Promise[nextLib.appMod.DefaultAppIProps] = js.native
}

