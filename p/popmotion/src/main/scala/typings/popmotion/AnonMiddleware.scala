package typings.popmotion

import typings.popmotion.observerTypesMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMiddleware extends js.Object {
  var middleware: js.UndefOr[js.Array[Middleware]] = js.undefined
  var onComplete: js.UndefOr[js.Function] = js.undefined
}

object AnonMiddleware {
  @scala.inline
  def apply(middleware: js.Array[Middleware] = null, onComplete: js.Function = null): AnonMiddleware = {
    val __obj = js.Dynamic.literal()
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMiddleware]
  }
}

