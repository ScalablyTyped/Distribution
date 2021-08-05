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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observerMod {
  
  @JSImport("mobx-react-lite/dist/observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  inline def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[P]]
  inline def observer[C /* <: FunctionComponent[js.Any] | (RefForwardingComponent[js.Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): (C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]])) = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[(C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]]))]
  inline def observer[C /* <: FunctionComponent[js.Any] | (RefForwardingComponent[js.Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]])) = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]]))]
  inline def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]]]
  
  trait IObserverOptions extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] = js.undefined
  }
  object IObserverOptions {
    
    inline def apply(): IObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObserverOptions]
    }
    
    extension [Self <: IObserverOptions](x: Self) {
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
}
