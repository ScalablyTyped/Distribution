package typings.mobxReactLite

import typings.mobxReactLite.anon.DisplayName
import typings.mobxReactLite.anon.IObserverOptionsforwardRe
import typings.mobxReactLite.observerMod.IObserverOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
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
  inline def observer[C /* <: FunctionComponent[js.Any] | (RefForwardingComponent[js.Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): (C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]])) = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any]).asInstanceOf[(C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]]))]
  inline def observer[C /* <: FunctionComponent[js.Any] | (RefForwardingComponent[js.Any, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]])) = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(C & DisplayName) | (C & (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[js.Any] & RefAttributes[js.Any]]]))]
  inline def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("observer")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[TRef]]]]
  
  inline def observerBatching(reactionScheduler: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observerBatching")(reactionScheduler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useAsObservableSource[TSource](current: TSource): TSource = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsObservableSource")(current.asInstanceOf[js.Any]).asInstanceOf[TSource]
  
  inline def useLocalObservable[TStore /* <: Record[String, js.Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalObservable[TStore /* <: Record[String, js.Any] */](
    initializer: js.Function0[TStore],
    annotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotationsMap<TStore, never> */ js.Any
  ): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalObservable")(initializer.asInstanceOf[js.Any], annotations.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useLocalStore[TStore /* <: Record[String, js.Any] */](initializer: js.Function0[TStore]): TStore = ^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any]).asInstanceOf[TStore]
  inline def useLocalStore[TStore /* <: Record[String, js.Any] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = (^.asInstanceOf[js.Dynamic].applyDynamic("useLocalStore")(initializer.asInstanceOf[js.Any], current.asInstanceOf[js.Any])).asInstanceOf[TStore]
  
  inline def useObserver[T](fn: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useObserver")(fn.asInstanceOf[js.Any], baseComponentName.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useStaticRendering(enable: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useStaticRendering")(enable.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
