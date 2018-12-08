package typings
package neteaseDashCaptchaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NeteaseCaptchaNs {
  type InitFunction = js.Function3[
    /* config */ Config, 
    /* onLoad */ js.UndefOr[onLoad], 
    /* onError */ js.UndefOr[onError], 
    scala.Unit
  ]
  type onError = js.Function1[/* error */ js.Any, scala.Unit]
  type onLoad = js.Function1[/* instance */ Instance, scala.Unit]
}
