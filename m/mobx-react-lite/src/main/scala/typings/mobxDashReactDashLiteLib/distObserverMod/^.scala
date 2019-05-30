package typings
package mobxDashReactDashLiteLib.distObserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/observer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def observer[P /* <: js.Object */](baseComponent: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */](baseComponent: reactLib.reactMod.FunctionComponent[P], options: IObserverOptions): reactLib.reactMod.FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */, TRef](
    baseComponent: reactLib.reactMod.RefForwardingComponent[TRef, P],
    options: IObserverOptions with mobxDashReactDashLiteLib.Anon_ForwardRef
  ): reactLib.reactMod.MemoExoticComponent[
    reactLib.reactMod.ForwardRefExoticComponent[reactLib.reactMod.PropsWithoutRef[P] with reactLib.reactMod.RefAttributes[TRef]]
  ] = js.native
}

