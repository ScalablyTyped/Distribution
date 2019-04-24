package typings
package nextLib.errorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/error", JSImport.Default)
@js.native
class default[P] () extends Error[P]

/* static members */
@JSImport("next/error", JSImport.Default)
@js.native
object default extends js.Object {
  @JSName("getInitialProps")
  var getInitialProps_Original: nextLib.nextMod.GetInitialProps[
    nextLib.errorMod.DefaultErrorIProps, 
    nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery, js.Object]
  ] = js.native
  def getInitialProps(ctx: nextLib.nextMod.NextContext[nextDashServerLib.routerMod.DefaultQuery, js.Object]): js.Promise[nextLib.errorMod.DefaultErrorIProps] | nextLib.errorMod.DefaultErrorIProps = js.native
}

