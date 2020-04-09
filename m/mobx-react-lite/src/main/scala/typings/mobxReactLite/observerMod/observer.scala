package typings.mobxReactLite.observerMod

import typings.mobxReactLite.IObserverOptionsforwardRe
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/observer", "observer")
@js.native
object observer extends js.Object {
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  def apply[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  def apply[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): (C with FunctionComponent[_]) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  def apply[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with FunctionComponent[_]) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  def apply[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
}

