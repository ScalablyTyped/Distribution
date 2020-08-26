package typings.mobxReactLite

import typings.mobxReactLite.anon.DisplayName
import typings.mobxReactLite.anon.IObserverOptionsforwardRe
import typings.mobxReactLite.observerBatchingMod.IBatchedUpdates
import typings.mobxReactLite.observerMod.IObserverOptions
import typings.mobxReactLite.useObserverMod.IUseObserverOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.MemoExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isObserverBatched(): js.Any = js.native
  def isUsingStaticRendering(): Boolean = js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P]): FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */](baseComponent: FunctionComponent[P], options: IObserverOptions): FunctionComponent[P] = js.native
  def observer[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C): (C with DisplayName) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  def observer[C /* <: FunctionComponent[_] | (RefForwardingComponent[_, js.Object]) */, Options /* <: IObserverOptions */](baseComponent: C, options: Options): (C with DisplayName) | (C with (MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[_] with RefAttributes[_]]])) = js.native
  def observer[P /* <: js.Object */, TRef](baseComponent: RefForwardingComponent[TRef, P], options: IObserverOptionsforwardRe): MemoExoticComponent[ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[TRef]]] = js.native
  def observerBatching(): Unit = js.native
  def observerBatching(reactionScheduler: IBatchedUpdates): Unit = js.native
  def observerBatchingOptOut(): Unit = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  def useLocalStore[TStore /* <: Record[String, _] */](initializer: js.Function0[TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: js.UndefOr[scala.Nothing], options: IUseObserverOptions): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
}

