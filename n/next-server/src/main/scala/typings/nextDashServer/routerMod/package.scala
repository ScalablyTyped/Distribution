package typings.nextDashServer

import typings.node.urlMod.Url
import typings.node.urlMod.UrlObject
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type DefaultQuery = Record[String, js.UndefOr[String | js.Array[String]]]
  type ErrorEventHandler = js.Function2[/* err */ RouteChangeError, /* url */ String, js.Any]
  type EventHandler = js.Function1[/* url */ String, js.Any]
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PopStateCallback = js.Function1[/* state */ js.Any, js.UndefOr[Boolean]]
  type RouterCallback = js.Function0[Unit]
  type UrlLike = UrlObject | Url
}
