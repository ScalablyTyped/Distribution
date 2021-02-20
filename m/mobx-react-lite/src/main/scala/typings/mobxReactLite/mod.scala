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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobx-react-lite", "enableStaticRendering")
  @js.native
  def enableStaticRendering(enable: Boolean): Unit = js.native
  
  @JSImport("mobx-react-lite", "isObserverBatched")
  @js.native
  def isObserverBatched(): Boolean = js.native
  
  @JSImport("mobx-react-lite", "isUsingStaticRendering")
  @js.native
  def isUsingStaticRendering(): Boolean = js.native
  
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): (C with DisplayName) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with DisplayName) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  @JSImport("mobx-react-lite", "observer")
  @js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
  
  @JSImport("mobx-react-lite", "observerBatching")
  @js.native
  def observerBatching(reactionScheduler: js.Any): Unit = js.native
  
  @JSImport("mobx-react-lite", "useAsObservableSource")
  @js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  
  @JSImport("mobx-react-lite", "useLocalObservable")
  @js.native
  def useLocalObservable[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  @JSImport("mobx-react-lite", "useLocalObservable")
  @js.native
  def useLocalObservable[TStore /* <: Record[String, _] */](
    initializer: js.Function0[TStore],
    annotations: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnnotationsMap<TStore, never> */ js.Any
  ): TStore = js.native
  
  @JSImport("mobx-react-lite", "useLocalStore")
  @js.native
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  @JSImport("mobx-react-lite", "useLocalStore")
  @js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  
  @JSImport("mobx-react-lite", "useObserver")
  @js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  @JSImport("mobx-react-lite", "useObserver")
  @js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  
  @JSImport("mobx-react-lite", "useStaticRendering")
  @js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
}
