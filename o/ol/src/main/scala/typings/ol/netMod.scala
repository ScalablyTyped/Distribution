package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/net", JSImport.Namespace)
@js.native
object netMod extends js.Object {
  def jsonp(url: String, callback: js.Function0[Unit]): Unit = js.native
  def jsonp(
    url: String,
    callback: js.Function0[Unit],
    opt_errback: js.UndefOr[scala.Nothing],
    opt_callbackParam: String
  ): Unit = js.native
  def jsonp(url: String, callback: js.Function0[Unit], opt_errback: js.Function0[Unit]): Unit = js.native
  def jsonp(
    url: String,
    callback: js.Function0[Unit],
    opt_errback: js.Function0[Unit],
    opt_callbackParam: String
  ): Unit = js.native
}

