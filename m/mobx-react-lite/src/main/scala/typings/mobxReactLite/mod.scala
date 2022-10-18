package typings.mobxReactLite

import typings.mobx.distApiAnnotationMod.AnnotationsMap
import typings.mobxReactLite.anon.IObserverOptionsforwardRe
import typings.mobxReactLite.distObserverMod.IObserverOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardRefRenderFunction
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-react-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enableStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isObserverBatched(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObserverBatched")().asInstanceOf[Boolean]
  
  inline def isUsingStaticRendering(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUsingStaticRendering")().asInstanceOf[Boolean]
  
  inline def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  inline def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[P]]
  inline def observer[C /* <: FunctionComponent[Any] | (ForwardRefRenderFunction[Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any]
  inline def observer[C /* <: FunctionComponent[Any] | (ForwardRefRenderFunction[Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): /* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: Options extends {  forwardRef :true} ? C extends react.react.ForwardRefRenderFunction<infer TRef, infer P> ? C & react.react.MemoExoticComponent<react.react.ForwardRefExoticComponent<react.react.PropsWithoutRef<P> & react.react.RefAttributes<TRef>>> : never : C & {  displayName :string} */ js.Any]
  inline def observer[P /* <: js.Object */, TRef](baseComponent: ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]]]
  inline def observer[P /* <: js.Object */, TRef](baseComponent: ForwardRefRenderFunction[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]]]
  
  inline def observerBatching(reactionScheduler: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observerBatching")(reactionScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useAsObservableSource[TSource /* <: js.Object */](current: TSource): TSource = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsObservableSource")(current.asInstanceOf[js.Any]).asInstanceOf[TSource]
  
  inline def useLocalObservable[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalObservable[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore], annotations: AnnotationsMap[TStore, scala.Nothing]): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useLocalStore[TStore /* <: Record[String, Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalStore[TStore /* <: Record[String, Any] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useObserver[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any], baseComponentName.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
