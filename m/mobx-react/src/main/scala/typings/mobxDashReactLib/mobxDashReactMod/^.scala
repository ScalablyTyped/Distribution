package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val PropTypes: mobxDashReactLib.Anon_ArrayOrObservableArray = js.native
  val componentByNodeRegistery: js.Any = js.native
  val componentByNodeRegistry: js.Any = js.native
  val propTypes: mobxDashReactLib.Anon_ArrayOrObservableArray = js.native
  val renderReporter: mobxDashReactLib.mobxDashReactMod.RenderReporter = js.native
  def disposeOnUnmount(target: reactLib.reactMod.Component[_, _, _], propertyKey: java.lang.String): scala.Unit = js.native
  def disposeOnUnmount[TF /* <: mobxDashReactLib.Disposer | js.Array[mobxDashReactLib.Disposer] */](target: reactLib.reactMod.Component[_, _, _], fn: TF): TF = js.native
  def inject(stores: java.lang.String*): js.Function1[
    /* target */ mobxDashReactLib.mobxDashReactMod.IReactComponent[_], 
    mobxDashReactLib.mobxDashReactMod.IReactComponent[_] with mobxDashReactLib.mobxDashReactMod.IWrappedComponent[_]
  ] = js.native
  def inject[S, P, I, C](fn: mobxDashReactLib.mobxDashReactMod.IStoresToProps[S, P, I, C]): js.Function1[
    /* target */ mobxDashReactLib.mobxDashReactMod.IReactComponent[_], 
    mobxDashReactLib.mobxDashReactMod.IReactComponent[_] with mobxDashReactLib.mobxDashReactMod.IWrappedComponent[P]
  ] = js.native
  def observer(stores: js.Array[java.lang.String]): js.Function1[/* clazz */ mobxDashReactLib.mobxDashReactMod.IReactComponent[_], scala.Unit] = js.native
  def observer[T /* <: mobxDashReactLib.mobxDashReactMod.IReactComponent[_] */](stores: js.Array[java.lang.String], clazz: T): T = js.native
  def observer[T /* <: mobxDashReactLib.mobxDashReactMod.IReactComponent[_] */](target: T): T = js.native
  def onError(cb: js.Function1[/* error */ stdLib.Error, scala.Unit]): js.Function0[scala.Unit] = js.native
  def trackComponents(): scala.Unit = js.native
  def useStaticRendering(value: scala.Boolean): scala.Unit = js.native
}

