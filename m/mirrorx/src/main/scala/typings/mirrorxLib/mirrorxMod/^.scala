package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mirrorx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val actions: Actions = js.native
  val connect: reactDashReduxLib.reactDashReduxMod.Connect = js.native
  val render: Renderer = js.native
  def defaults(): js.Function1[/* options */ defaultOptions, scala.Unit] = js.native
  def hook(): js.Function1[/* subscriber */ js.Function0[_], _] = js.native
  def model(options: model): _model = js.native
  def withRouter[P /* <: RouteComponentProps[_] */](component: reactLib.reactMod.ComponentType[P]): reactLib.reactMod.ComponentClass[Omit[P, java.lang.String], reactLib.reactMod.ComponentState] = js.native
  def withRouter[TFunction /* <: reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] */](target: TFunction): TFunction = js.native
}

