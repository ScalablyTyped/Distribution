package typings.mongooseDashPaginateDashV2.mongooseDashPaginateDashV2Mod.mongooseMod

import typings.mongoose.mongooseMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  def apply(name: String): PaginateModel[_] = js.native
  def apply(name: String, schema: Schema[_]): PaginateModel[_] = js.native
  def apply(name: String, schema: Schema[_], collection: String): PaginateModel[_] = js.native
  def apply(name: String, schema: Schema[_], collection: String, skipInit: Boolean): PaginateModel[_] = js.native
}

