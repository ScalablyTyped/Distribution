package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MobXProviderContext: reactLib.reactMod.Context[js.Any] = js.native
  def disposeOnUnmount(target: reactLib.reactMod.Component[_, _, _], propertyKey: java.lang.String): scala.Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: reactLib.reactMod.Component[_, _, _], fn: TF): TF = js.native
  def inject(stores: java.lang.String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  def isUsingStaticRendering(): scala.Boolean = js.native
  def observer[T /* <: IReactComponent[_] */](target: T): T = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useLocalStore[TStore /* <: stdLib.Record[java.lang.String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore]): TStore = js.native
  def useLocalStore[TStore /* <: stdLib.Record[java.lang.String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useStaticRendering(value: scala.Boolean): scala.Unit = js.native
}

