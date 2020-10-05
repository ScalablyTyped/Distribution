package typings.mobxReactLite.anon

import typings.mobxReactLite.mobxReactLiteBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mobx-react-lite.mobx-react-lite/dist/observer.IObserverOptions & {  forwardRef :true} */
@js.native
trait IObserverOptionsforwardRe extends js.Object {
  val forwardRef: js.UndefOr[Boolean] with `true` = js.native
}

object IObserverOptionsforwardRe {
  @scala.inline
  def apply(forwardRef: js.UndefOr[Boolean] with `true`): IObserverOptionsforwardRe = {
    val __obj = js.Dynamic.literal(forwardRef = forwardRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObserverOptionsforwardRe]
  }
  @scala.inline
  implicit class IObserverOptionsforwardReOps[Self <: IObserverOptionsforwardRe] (val x: Self) extends AnyVal {
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
    def setForwardRef(value: js.UndefOr[Boolean] with `true`): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
  }
  
}

