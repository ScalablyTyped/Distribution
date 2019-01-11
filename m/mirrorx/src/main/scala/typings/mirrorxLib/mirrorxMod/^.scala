package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mirrorx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val actions: mirrorxLib.mirrorxMod.Actions = js.native
  val connect: reactDashReduxLib.reactDashReduxMod.Connect = js.native
  val render: mirrorxLib.mirrorxMod.Renderer = js.native
  def defaults(): js.Function1[/* options */ mirrorxLib.mirrorxMod.defaultOptions, scala.Unit] = js.native
  def hook(): js.Function1[/* subscriber */ js.Function0[_], _] = js.native
  def model(options: mirrorxLib.mirrorxMod.model): mirrorxLib.mirrorxMod._model = js.native
  def withRouter[P /* <: mirrorxLib.mirrorxMod.RouteComponentProps[_] */](component: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentClass[
    mirrorxLib.mirrorxMod.Omit[P, java.lang.String], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
  def withRouter[TFunction /* <: reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState] */](target: TFunction): TFunction = js.native
}

