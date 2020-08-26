package typings.navigo.anon

import typings.navigo.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait As extends js.Object {
  var as: String = js.native
  def uses(params: Params, query: String): Unit = js.native
}

object As {
  @scala.inline
  def apply(as: String, uses: (Params, String) => Unit): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], uses = js.Any.fromFunction2(uses))
    __obj.asInstanceOf[As]
  }
  @scala.inline
  implicit class AsOps[Self <: As] (val x: Self) extends AnyVal {
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
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def setUses(value: (Params, String) => Unit): Self = this.set("uses", js.Any.fromFunction2(value))
  }
  
}

