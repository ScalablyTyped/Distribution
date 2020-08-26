package typings.microgears.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var name: String = js.native
  def afterChain[T, M /* <: MetaInformation */](result: T, metaInfo: M): T = js.native
  def beforeChain[M /* <: MetaInformation */](args: js.Array[_], metaInfo: M): js.Array[_] = js.native
}

object Plugin {
  @scala.inline
  def apply(
    afterChain: (js.Any, js.Any) => js.Any,
    beforeChain: (js.Array[_], js.Any) => js.Array[_],
    name: String
  ): Plugin = {
    val __obj = js.Dynamic.literal(afterChain = js.Any.fromFunction2(afterChain), beforeChain = js.Any.fromFunction2(beforeChain), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setAfterChain(value: (js.Any, js.Any) => js.Any): Self = this.set("afterChain", js.Any.fromFunction2(value))
    @scala.inline
    def setBeforeChain(value: (js.Array[_], js.Any) => js.Array[_]): Self = this.set("beforeChain", js.Any.fromFunction2(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

