package typings.nextDashServer.routerMod

import org.scalablytyped.runtime.StringDictionary
import typings.nextDashServer.Anon_Component
import typings.nextDashServer.Anon_EventName
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterProps[Q] extends js.Object {
  val asPath: js.UndefOr[String] = js.native
  // property fields
  val components: StringDictionary[Anon_Component] = js.native
  // events API (6.1.1+)
  val events: Anon_EventName = js.native
  // events (deprecated soonish)
  var onBeforeHistoryChange: js.UndefOr[js.Function1[/* as */ String, Unit]] = js.native
  var onHashChangeComplete: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  var onHashChangeStart: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  var onRouteChangeComplete: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  var onRouteChangeError: js.UndefOr[js.Function2[/* error */ RouteChangeError, /* url */ String, Unit]] = js.native
  var onRouteChangeStart: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  // url property fields
  val pathname: String = js.native
  val query: js.UndefOr[Q] = js.native
  val route: String = js.native
  // core method fields
  def back(): Unit = js.native
  def beforePopState(cb: PopStateCallback): Boolean = js.native
  def prefetch(url: String): js.Promise[ComponentType[_]] = js.native
  def push(url: String): js.Promise[Boolean] = js.native
  def push(url: String, as: String): js.Promise[Boolean] = js.native
  def push(url: String, as: String, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def push(url: String, as: UrlLike): js.Promise[Boolean] = js.native
  def push(url: String, as: UrlLike, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def push(url: UrlLike): js.Promise[Boolean] = js.native
  def push(url: UrlLike, as: String): js.Promise[Boolean] = js.native
  def push(url: UrlLike, as: String, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def push(url: UrlLike, as: UrlLike): js.Promise[Boolean] = js.native
  def push(url: UrlLike, as: UrlLike, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def reload(route: String): js.Promise[Unit] = js.native
  def replace(url: String): js.Promise[Boolean] = js.native
  def replace(url: String, as: String): js.Promise[Boolean] = js.native
  def replace(url: String, as: String, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def replace(url: String, as: UrlLike): js.Promise[Boolean] = js.native
  def replace(url: String, as: UrlLike, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def replace(url: UrlLike): js.Promise[Boolean] = js.native
  def replace(url: UrlLike, as: String): js.Promise[Boolean] = js.native
  def replace(url: UrlLike, as: String, options: EventChangeOptions): js.Promise[Boolean] = js.native
  def replace(url: UrlLike, as: UrlLike): js.Promise[Boolean] = js.native
  def replace(url: UrlLike, as: UrlLike, options: EventChangeOptions): js.Promise[Boolean] = js.native
}

