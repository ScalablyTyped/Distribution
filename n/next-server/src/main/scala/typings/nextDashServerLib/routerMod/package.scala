package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routerMod {
  type DefaultQuery = stdLib.Record[java.lang.String, js.UndefOr[java.lang.String | js.Array[java.lang.String]]]
  type ErrorEventHandler = js.Function2[/* err */ RouteChangeError, /* url */ java.lang.String, js.Any]
  type EventHandler = js.Function1[/* url */ java.lang.String, js.Any]
  type EventName = nextDashServerLib.nextDashServerLibStrings.routeChangeStart | nextDashServerLib.nextDashServerLibStrings.routeChangeComplete | nextDashServerLib.nextDashServerLibStrings.routeChangeError | nextDashServerLib.nextDashServerLibStrings.beforeHistoryChange | nextDashServerLib.nextDashServerLibStrings.hashChangeStart | nextDashServerLib.nextDashServerLibStrings.hashChangeComplete
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type PopStateCallback = js.Function1[/* state */ js.Any, js.UndefOr[scala.Boolean]]
  type RouterCallback = js.Function0[scala.Unit]
  type UrlLike = nodeLib.urlMod.UrlObject | nodeLib.urlMod.Url
}
