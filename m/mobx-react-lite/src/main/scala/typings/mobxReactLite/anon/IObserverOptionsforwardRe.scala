package typings.mobxReactLite.anon

import typings.mobxReactLite.mobxReactLiteBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef  :true} */
trait IObserverOptionsforwardRe extends js.Object {
  val forwardRef: js.UndefOr[Boolean with `true`] = js.undefined
}

object IObserverOptionsforwardRe {
  @scala.inline
  def apply(forwardRef: js.UndefOr[Boolean with `true`] = js.undefined): IObserverOptionsforwardRe = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObserverOptionsforwardRe]
  }
}

