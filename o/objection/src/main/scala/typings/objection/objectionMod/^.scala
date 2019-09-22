package typings.objection.objectionMod

import typings.knex.knexMod.RawBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val compose: Compose = js.native
  val lit: LiteralBuilder = js.native
  val mixin: Mixin = js.native
  val raw: RawBuilder[js.Any, js.Array[js.Any]] = js.native
  val ref: ReferenceBuilder = js.native
  val transaction: typings.objection.objectionMod.transaction[js.Any] = js.native
  def knexSnakeCaseMappers(): KnexMappers = js.native
  def knexSnakeCaseMappers(opt: SnakeCaseMappersOptions): KnexMappers = js.native
  def snakeCaseMappers(): ColumnNameMappers = js.native
  def snakeCaseMappers(opt: SnakeCaseMappersOptions): ColumnNameMappers = js.native
}

