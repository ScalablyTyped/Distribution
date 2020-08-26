package typings.oracleOraclejet.ojcontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  def getBusyContext(): BusyContext = js.native
}

object Context {
  @scala.inline
  def apply(getBusyContext: () => BusyContext): Context = {
    val __obj = js.Dynamic.literal(getBusyContext = js.Any.fromFunction0(getBusyContext))
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setGetBusyContext(value: () => BusyContext): Self = this.set("getBusyContext", js.Any.fromFunction0(value))
  }
  
}

