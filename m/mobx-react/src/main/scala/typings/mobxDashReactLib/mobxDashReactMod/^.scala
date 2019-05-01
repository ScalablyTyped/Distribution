package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val componentByNodeRegistery: js.Any = js.native
  val componentByNodeRegistry: js.Any = js.native
  val renderReporter: RenderReporter = js.native
  def disposeOnUnmount(target: reactLib.reactMod.Component[_, _, _], propertyKey: java.lang.String): scala.Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: reactLib.reactMod.Component[_, _, _], fn: TF): TF = js.native
  def inject(stores: java.lang.String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  def observer(stores: js.Array[java.lang.String]): js.Function1[/* clazz */ IReactComponent[_], scala.Unit] = js.native
  def observer[T /* <: IReactComponent[_] */](stores: js.Array[java.lang.String], clazz: T): T = js.native
  def observer[T /* <: IReactComponent[_] */](target: T): T = js.native
  def onError(cb: js.Function1[/* error */ stdLib.Error, scala.Unit]): js.Function0[scala.Unit] = js.native
  def trackComponents(): scala.Unit = js.native
  def useStaticRendering(value: scala.Boolean): scala.Unit = js.native
}

