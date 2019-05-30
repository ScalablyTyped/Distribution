package typings
package mobxDashReactDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite", JSImport.Namespace)
@js.native
object mobxDashReactDashLiteMod extends js.Object {
  def isUsingStaticRendering(): scala.Boolean = js.native
  def observer[P /* <: js.Object */](baseComponent: reactLib.reactMod.FunctionComponent[P]): reactLib.reactMod.FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */](
    baseComponent: reactLib.reactMod.FunctionComponent[P],
    options: mobxDashReactDashLiteLib.distObserverMod.IObserverOptions
  ): reactLib.reactMod.FunctionComponent[P] = js.native
  def observer[P /* <: js.Object */, TRef](
    baseComponent: reactLib.reactMod.RefForwardingComponent[TRef, P],
    options: mobxDashReactDashLiteLib.distObserverMod.IObserverOptions with mobxDashReactDashLiteLib.Anon_ForwardRef
  ): reactLib.reactMod.MemoExoticComponent[
    reactLib.reactMod.ForwardRefExoticComponent[reactLib.reactMod.PropsWithoutRef[P] with reactLib.reactMod.RefAttributes[TRef]]
  ] = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useComputed[T](func: js.Function0[T]): T = js.native
  def useComputed[T](func: js.Function0[T], inputs: js.Array[_]): T = js.native
  def useDisposable[D /* <: mobxDashReactDashLiteLib.distUseDisposableMod.TDisposable */](disposerGenerator: js.Function0[D]): D = js.native
  def useDisposable[D /* <: mobxDashReactDashLiteLib.distUseDisposableMod.TDisposable */](disposerGenerator: js.Function0[D], inputs: js.Array[_]): D = js.native
  def useForceUpdate(): js.Function0[scala.Unit] = js.native
  def useLocalStore[TStore /* <: stdLib.Record[java.lang.String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore]): TStore = js.native
  def useLocalStore[TStore /* <: stdLib.Record[java.lang.String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObservable[T /* <: mobxDashReactDashLiteLib.distUseObservableMod.SupportedValues */](initialValue: T): T = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: java.lang.String): T = js.native
  def useObserver[T](
    fn: js.Function0[T],
    baseComponentName: java.lang.String,
    options: mobxDashReactDashLiteLib.distUseObserverMod.IUseObserverOptions
  ): T = js.native
  def useStaticRendering(enable: scala.Boolean): scala.Unit = js.native
}

