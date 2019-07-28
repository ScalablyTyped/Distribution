package typings.mobxDashReactDashLite.distObserverMod

import typings.mobxDashReactDashLite.Anon_ForwardRef
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.FunctionComponent
import typings.react.reactMod.MemoExoticComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.RefAttributes
import typings.react.reactMod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/observer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptions with Anon_ForwardRef): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
}

