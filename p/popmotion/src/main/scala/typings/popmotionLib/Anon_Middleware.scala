package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Middleware extends js.Object {
  var middleware: js.UndefOr[js.Array[popmotionLib.libObserverTypesMod.Middleware]] = js.undefined
  var onComplete: js.UndefOr[js.Function] = js.undefined
}

object Anon_Middleware {
  @scala.inline
  def apply(
    middleware: js.Array[popmotionLib.libObserverTypesMod.Middleware] = null,
    onComplete: js.Function = null
  ): Anon_Middleware = {
    val __obj = js.Dynamic.literal()
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete)
    __obj.asInstanceOf[Anon_Middleware]
  }
}

