package typings.mobxReactLite

import typings.mobxReactLite.anon.IObserverOptionsforwardRe
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distObserverMod {
  
  @JSImport("mobx-react-lite/dist/observer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  inline def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[P]]
  inline def observer[C /* <: FunctionComponent[Any] | (ForwardRefRenderFunction[Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any]
  inline def observer[C /* <: FunctionComponent[Any] | (ForwardRefRenderFunction[Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any]
  inline def observer[P /* <: js.Object */, TRef](baseComponent: ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]]]
  inline def observer[P /* <: js.Object */, TRef](baseComponent: ForwardRefRenderFunction[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]]]
  
  trait IObserverOptions extends StObject {
    
    val forwardRef: js.UndefOr[Boolean] = js.undefined
  }
  object IObserverOptions {
    
    inline def apply(): IObserverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IObserverOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObserverOptions] (val x: Self) extends AnyVal {
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
    }
  }
}
