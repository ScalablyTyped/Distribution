package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val compose: Compose = js.native
  val lit: LiteralBuilder = js.native
  val mixin: Mixin = js.native
  val raw: knexLib.knexMod.RawBuilder = js.native
  val ref: ReferenceBuilder = js.native
  val transaction: objectionLib.objectionMod.transaction[js.Any] = js.native
  def knexSnakeCaseMappers(): KnexMappers = js.native
  def snakeCaseMappers(): ColumnNameMappers = js.native
}

