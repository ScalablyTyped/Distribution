package typings
package mongooseDashPaginateDashV2Lib.mongooseDashPaginateDashV2Mod.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose-paginate-v2", "mongoose")
@js.native
object ^ extends js.Object {
  def model(name: java.lang.String): PaginateModel[_] = js.native
  def model(name: java.lang.String, schema: mongooseLib.mongooseMod.Schema[_]): PaginateModel[_] = js.native
  def model(name: java.lang.String, schema: mongooseLib.mongooseMod.Schema[_], collection: java.lang.String): PaginateModel[_] = js.native
  def model(
    name: java.lang.String,
    schema: mongooseLib.mongooseMod.Schema[_],
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): PaginateModel[_] = js.native
}

