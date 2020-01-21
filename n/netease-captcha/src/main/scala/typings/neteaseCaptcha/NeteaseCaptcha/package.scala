package typings.neteaseCaptcha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NeteaseCaptcha {
  type InitFunction = js.Function3[
    /* config */ typings.neteaseCaptcha.NeteaseCaptcha.Config, 
    /* onLoad */ js.UndefOr[typings.neteaseCaptcha.NeteaseCaptcha.onLoad], 
    /* onError */ js.UndefOr[typings.neteaseCaptcha.NeteaseCaptcha.onError], 
    scala.Unit
  ]
  type onError = js.Function1[/* error */ js.Any, scala.Unit]
  type onLoad = js.Function1[/* instance */ typings.neteaseCaptcha.NeteaseCaptcha.Instance, scala.Unit]
}
