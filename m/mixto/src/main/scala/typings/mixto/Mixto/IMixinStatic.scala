package typings.mixto.Mixto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMixinStatic extends js.Object {
  def extend(`object`: js.Any): Unit = js.native
  def includeInto(constructor: js.Any): Unit = js.native
}

object IMixinStatic {
  @scala.inline
  def apply(extend: js.Any => Unit, includeInto: js.Any => Unit): IMixinStatic = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), includeInto = js.Any.fromFunction1(includeInto))
    __obj.asInstanceOf[IMixinStatic]
  }
  @scala.inline
  implicit class IMixinStaticOps[Self <: IMixinStatic] (val x: Self) extends AnyVal {
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
    def setExtend(value: js.Any => Unit): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setIncludeInto(value: js.Any => Unit): Self = this.set("includeInto", js.Any.fromFunction1(value))
  }
  
}

