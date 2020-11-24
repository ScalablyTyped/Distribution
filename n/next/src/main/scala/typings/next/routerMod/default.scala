package typings.next.routerMod

import typings.next.anon.App
import typings.next.mittMod.MittEmitter
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next/dist/next-server/lib/router/router", JSImport.Default)
@js.native
class default protected () extends Router {
  def this(
    pathname: String,
    query: ParsedUrlQuery,
    as: String,
    hasInitialPropsPageLoaderAppWrapAppComponentErrSubscriptionIsFallbackLocaleLocalesDefaultLocale: App
  ) = this()
}
/* static members */
@JSImport("next/dist/next-server/lib/router/router", JSImport.Default)
@js.native
object default extends js.Object {
  
  var events: MittEmitter = js.native
}
