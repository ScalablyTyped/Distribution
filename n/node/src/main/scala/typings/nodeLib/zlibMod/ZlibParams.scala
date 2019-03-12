package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibParams extends js.Object {
  def params(level: scala.Double, strategy: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit
}

object ZlibParams {
  @scala.inline
  def apply(params: (scala.Double, scala.Double, js.Function0[scala.Unit]) => scala.Unit): ZlibParams = {
    val __obj = js.Dynamic.literal(params = js.Any.fromFunction3(params))
  
    __obj.asInstanceOf[ZlibParams]
  }
}

