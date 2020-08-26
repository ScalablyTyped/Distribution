package typings.nextServer.anon

import typings.nextServer.sideEffectMod.State
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> */
@js.native
trait ReadonlySideEffectProps extends js.Object {
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.native
  val inAmpMode: js.UndefOr[Boolean] = js.native
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ js.Any, State] = js.native
}

object ReadonlySideEffectProps {
  @scala.inline
  def apply(reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): ReadonlySideEffectProps = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    __obj.asInstanceOf[ReadonlySideEffectProps]
  }
  @scala.inline
  implicit class ReadonlySideEffectPropsOps[Self <: ReadonlySideEffectProps] (val x: Self) extends AnyVal {
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
    def setReduceComponentsToState(value: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State): Self = this.set("reduceComponentsToState", js.Any.fromFunction2(value))
    @scala.inline
    def setHandleStateChange(value: /* state */ State => Unit): Self = this.set("handleStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHandleStateChange: Self = this.set("handleStateChange", js.undefined)
    @scala.inline
    def setInAmpMode(value: Boolean): Self = this.set("inAmpMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInAmpMode: Self = this.set("inAmpMode", js.undefined)
  }
  
}

