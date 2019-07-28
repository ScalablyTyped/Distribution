package typings.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibParams extends js.Object {
  def params(level: Double, strategy: Double, callback: js.Function0[Unit]): Unit
}

object ZlibParams {
  @scala.inline
  def apply(params: (Double, Double, js.Function0[Unit]) => Unit): ZlibParams = {
    val __obj = js.Dynamic.literal(params = js.Any.fromFunction3(params))
  
    __obj.asInstanceOf[ZlibParams]
  }
}

