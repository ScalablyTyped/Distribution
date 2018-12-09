package typings
package nextDashServerLib.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterProps[Q] extends js.Object {
  val asPath: js.UndefOr[java.lang.String] = js.native
  // property fields
  val components: ScalablyTyped.runtime.StringDictionary[nextDashServerLib.Anon_Component] = js.native
  // events API (6.1.1+)
  val events: nextDashServerLib.Anon_On = js.native
  // events (deprecated soonish)
  var onBeforeHistoryChange: js.UndefOr[js.Function1[/* as */ java.lang.String, scala.Unit]] = js.native
  var onHashChangeComplete: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.native
  var onHashChangeStart: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.native
  var onRouteChangeComplete: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.native
  var onRouteChangeError: js.UndefOr[
    js.Function2[/* error */ RouteChangeError, /* url */ java.lang.String, scala.Unit]
  ] = js.native
  var onRouteChangeStart: js.UndefOr[js.Function1[/* url */ java.lang.String, scala.Unit]] = js.native
  // url property fields
  val pathname: java.lang.String = js.native
  val query: js.UndefOr[Q] = js.native
  val route: java.lang.String = js.native
  // core method fields
  def back(): scala.Unit = js.native
  def beforePopState(cb: PopStateCallback): scala.Boolean = js.native
  def prefetch(url: java.lang.String): js.Promise[reactLib.reactMod.ReactNs.ComponentType[_]] = js.native
  def push(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def push(url: java.lang.String, as: java.lang.String): js.Promise[scala.Boolean] = js.native
  def push(url: java.lang.String, as: java.lang.String, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def push(url: java.lang.String, as: UrlLike): js.Promise[scala.Boolean] = js.native
  def push(url: java.lang.String, as: UrlLike, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def push(url: UrlLike): js.Promise[scala.Boolean] = js.native
  def push(url: UrlLike, as: java.lang.String): js.Promise[scala.Boolean] = js.native
  def push(url: UrlLike, as: java.lang.String, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def push(url: UrlLike, as: UrlLike): js.Promise[scala.Boolean] = js.native
  def push(url: UrlLike, as: UrlLike, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def reload(route: java.lang.String): js.Promise[scala.Unit] = js.native
  def replace(url: java.lang.String): js.Promise[scala.Boolean] = js.native
  def replace(url: java.lang.String, as: java.lang.String): js.Promise[scala.Boolean] = js.native
  def replace(url: java.lang.String, as: java.lang.String, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def replace(url: java.lang.String, as: UrlLike): js.Promise[scala.Boolean] = js.native
  def replace(url: java.lang.String, as: UrlLike, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def replace(url: UrlLike): js.Promise[scala.Boolean] = js.native
  def replace(url: UrlLike, as: java.lang.String): js.Promise[scala.Boolean] = js.native
  def replace(url: UrlLike, as: java.lang.String, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
  def replace(url: UrlLike, as: UrlLike): js.Promise[scala.Boolean] = js.native
  def replace(url: UrlLike, as: UrlLike, options: EventChangeOptions): js.Promise[scala.Boolean] = js.native
}

