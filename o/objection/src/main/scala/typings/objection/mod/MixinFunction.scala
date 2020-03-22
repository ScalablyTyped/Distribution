package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MixinFunction extends js.Object {
  def apply[MC /* <: AnyModelConstructor */](modelClass: MC, plugins: Plugin*): MC = js.native
  def apply[MC /* <: AnyModelConstructor */](modelClass: MC, plugins: js.Array[Plugin]): MC = js.native
}

