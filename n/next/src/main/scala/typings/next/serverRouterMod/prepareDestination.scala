package typings.next.serverRouterMod

import typings.next.anon.NewUrl
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/router", "prepareDestination")
@js.native
object prepareDestination extends js.Object {
  def apply(destination: String, params: Params, query: ParsedUrlQuery): NewUrl = js.native
  def apply(destination: String, params: Params, query: ParsedUrlQuery, appendParamsToQuery: Boolean): NewUrl = js.native
}

