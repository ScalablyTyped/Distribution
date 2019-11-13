package typings.next.distClientRouterMod

import typings.next.Anon_App
import typings.next.distNextDashServerLibMittMod.MittEmitter
import typings.next.distNextDashServerLibRouterRouterMod.default
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/client/router", "Router")
@js.native
class Router protected () extends default {
  def this(
    pathname: String,
    query: ParsedUrlQuery,
    as: String,
    hasInitialPropsPageLoaderAppWrapAppComponentErrSubscription: Anon_App
  ) = this()
}

/* static members */
@JSImport("next/dist/client/router", "Router")
@js.native
object Router extends js.Object {
  var events: MittEmitter = js.native
  def _rewriteUrlForNextExport(url: String): String = js.native
}

