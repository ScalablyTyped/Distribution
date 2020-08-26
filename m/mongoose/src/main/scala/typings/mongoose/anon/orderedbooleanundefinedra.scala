package typings.mongoose.anon

import typings.mongoose.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  ordered :boolean | undefined,   rawResult :boolean | undefined} & mongoose.mongoose.ModelOptions */
@js.native
trait orderedbooleanundefinedra extends js.Object {
  var ordered: js.UndefOr[Boolean] = js.native
  var rawResult: js.UndefOr[Boolean] = js.native
  var session: js.UndefOr[ClientSession | Null] = js.native
}

object orderedbooleanundefinedra {
  @scala.inline
  def apply(): orderedbooleanundefinedra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[orderedbooleanundefinedra]
  }
  @scala.inline
  implicit class orderedbooleanundefinedraOps[Self <: orderedbooleanundefinedra] (val x: Self) extends AnyVal {
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
    def setOrdered(value: Boolean): Self = this.set("ordered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdered: Self = this.set("ordered", js.undefined)
    @scala.inline
    def setRawResult(value: Boolean): Self = this.set("rawResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawResult: Self = this.set("rawResult", js.undefined)
    @scala.inline
    def setSession(value: ClientSession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSessionNull: Self = this.set("session", null)
  }
  
}

