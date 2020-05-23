package typings.nextServer.anon

import typings.nextServer.sideEffectMod.State
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<next-server.next-server/dist/lib/side-effect.SideEffectProps> */
trait ReadonlySideEffectProps extends js.Object {
  val handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  val inAmpMode: js.UndefOr[Boolean] = js.undefined
  val reduceComponentsToState: js.Function2[/* components */ js.Array[ReactElement], /* props */ js.Any, State]
}

object ReadonlySideEffectProps {
  @scala.inline
  def apply(
    reduceComponentsToState: (/* components */ js.Array[ReactElement], /* props */ js.Any) => State,
    handleStateChange: /* state */ State => Unit = null,
    inAmpMode: js.UndefOr[Boolean] = js.undefined
  ): ReadonlySideEffectProps = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    if (handleStateChange != null) __obj.updateDynamic("handleStateChange")(js.Any.fromFunction1(handleStateChange))
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySideEffectProps]
  }
}

