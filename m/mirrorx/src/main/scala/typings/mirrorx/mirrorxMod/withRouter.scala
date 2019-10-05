package typings.mirrorx.mirrorxMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mirrorx", "withRouter")
@js.native
object withRouter extends js.Object {
  def apply[P /* <: RouteComponentProps[_] */](component: ComponentType[P]): ComponentClass[Omit[P, String], ComponentState] = js.native
  def apply[TFunction /* <: ComponentClass[_, ComponentState] */](target: TFunction): TFunction = js.native
}

