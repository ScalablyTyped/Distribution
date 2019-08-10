package typings.mobxDashReact.mobxDashReactMod

import typings.mobxDashReactDashLite.distUseObserverMod.IUseObserverOptions
import typings.react.reactMod.Component
import typings.react.reactMod.Context
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MobXProviderContext: Context[js.Any] = js.native
  def disposeOnUnmount(target: Component[_, _, _], propertyKey: String): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[_, _, _], fn: TF): TF = js.native
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  def isUsingStaticRendering(): Boolean = js.native
  def observer[T /* <: IReactComponent[_] */](target: T): T = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
  def useStaticRendering(value: Boolean): Unit = js.native
}

