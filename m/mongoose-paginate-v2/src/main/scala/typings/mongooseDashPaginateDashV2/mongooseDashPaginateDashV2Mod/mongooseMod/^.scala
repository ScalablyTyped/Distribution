package typings.mongooseDashPaginateDashV2.mongooseDashPaginateDashV2Mod.mongooseMod

import typings.mongoose.mongooseMod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose-paginate-v2", "mongoose")
@js.native
object ^ extends js.Object {
  def model(name: String): PaginateModel[_] = js.native
  def model(name: String, schema: Schema[_]): PaginateModel[_] = js.native
  def model(name: String, schema: Schema[_], collection: String): PaginateModel[_] = js.native
  def model(name: String, schema: Schema[_], collection: String, skipInit: Boolean): PaginateModel[_] = js.native
}

