package typings.nextServer.sideEffectMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideEffectProps extends js.Object {
  var handleStateChange: js.UndefOr[js.Function1[/* state */ State, Unit]] = js.undefined
  var inAmpMode: js.UndefOr[Boolean] = js.undefined
  def reduceComponentsToState[T](components: js.Array[ReactElement], props: T): State
}

object SideEffectProps {
  @scala.inline
  def apply(
    reduceComponentsToState: (js.Array[ReactElement], js.Any) => State,
    handleStateChange: /* state */ State => Unit = null,
    inAmpMode: js.UndefOr[Boolean] = js.undefined
  ): SideEffectProps = {
    val __obj = js.Dynamic.literal(reduceComponentsToState = js.Any.fromFunction2(reduceComponentsToState))
    if (handleStateChange != null) __obj.updateDynamic("handleStateChange")(js.Any.fromFunction1(handleStateChange))
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideEffectProps]
  }
}

