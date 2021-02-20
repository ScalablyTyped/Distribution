package typings.mobxReactLite

import typings.mobxReactLite.anon.DisplayName
import typings.mobxReactLite.anon.IObserverOptionsforwardRe
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): (C with DisplayName) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with DisplayName) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite/dist/observer", "observer")
  @js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
  
  @js.native
  trait IObserverOptions extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] = js.native
  }
  object IObserverOptions {
    
    @scala.inline
    def apply(): IObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObserverOptions]
    }
    
    @scala.inline
    implicit class IObserverOptionsMutableBuilder[Self <: IObserverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
}
