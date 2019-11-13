package typings.next.nextMod

import typings.next.distNextDashServerLibUtilsMod.NextPageContext
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextPage[P, IP] extends js.Object {
  var defaultProps: js.UndefOr[Partial[P]] = js.native
  var displayName: js.UndefOr[String] = js.native
  /**
    * Used for initial page load data population. Data returned from `getInitialProps` is serialized when server rendered.
    * Make sure to return plain `Object` without using `Date`, `Map`, `Set`.
    * @param ctx Context of `page`
    */
  var getInitialProps: js.UndefOr[js.Function1[/* ctx */ NextPageContext, js.Promise[IP]]] = js.native
  def apply(props: P): Element | Null = js.native
}

