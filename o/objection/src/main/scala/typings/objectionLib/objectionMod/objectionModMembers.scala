package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", JSImport.Namespace)
@js.native
object objectionModMembers extends js.Object {
  val compose: objectionLib.objectionMod.ObjectionNs.Compose = js.native
  val lit: objectionLib.objectionMod.ObjectionNs.LiteralBuilder = js.native
  val mixin: objectionLib.objectionMod.ObjectionNs.Mixin = js.native
  val raw: knexLib.knexMod.KnexNs.RawBuilder = js.native
  val ref: objectionLib.objectionMod.ObjectionNs.ReferenceBuilder = js.native
  val transaction: objectionLib.objectionMod.ObjectionNs.transaction[js.Any] = js.native
  def knexSnakeCaseMappers(): objectionLib.objectionMod.ObjectionNs.KnexMappers = js.native
  def snakeCaseMappers(): objectionLib.objectionMod.ObjectionNs.ColumnNameMappers = js.native
}

