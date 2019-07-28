package typings.mirrorx.mirrorxMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashRedux.reactDashReduxMod.Connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mirrorx", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val actions: Actions = js.native
  val connect: Connect = js.native
  val render: Renderer = js.native
  def defaults(): js.Function1[/* options */ defaultOptions, Unit] = js.native
  def hook(): js.Function1[/* subscriber */ js.Function0[_], _] = js.native
  def model(options: typings.mirrorx.mirrorxMod.model): _model = js.native
  def withRouter[P /* <: RouteComponentProps[_] */](component: ComponentType[P]): ComponentClass[Omit[P, String], ComponentState] = js.native
  def withRouter[TFunction /* <: ComponentClass[_, ComponentState] */](target: TFunction): TFunction = js.native
}

