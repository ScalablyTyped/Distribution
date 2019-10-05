package typings.neteaseDashCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NeteaseCaptcha {
  type InitFunction = js.Function3[
    /* config */ Config, 
    /* onLoad */ js.UndefOr[onLoad], 
    /* onError */ js.UndefOr[onError], 
    Unit
  ]
  type onError = js.Function1[/* error */ js.Any, Unit]
  type onLoad = js.Function1[/* instance */ Instance, Unit]
}
