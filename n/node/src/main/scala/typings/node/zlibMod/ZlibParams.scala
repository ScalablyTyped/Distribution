package typings.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZlibParams extends js.Object {
  def params(level: Double, strategy: Double, callback: js.Function0[Unit]): Unit = js.native
}

object ZlibParams {
  @scala.inline
  def apply(params: (Double, Double, js.Function0[Unit]) => Unit): ZlibParams = {
    val __obj = js.Dynamic.literal(params = js.Any.fromFunction3(params))
    __obj.asInstanceOf[ZlibParams]
  }
  @scala.inline
  implicit class ZlibParamsOps[Self <: ZlibParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParams(value: (Double, Double, js.Function0[Unit]) => Unit): Self = this.set("params", js.Any.fromFunction3(value))
  }
  
}

