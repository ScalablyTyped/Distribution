package typings.mongoosePaginateV2.mod.mongooseAugmentingMod

import typings.mongoose.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  
  def apply(
    name: String,
    schema: js.UndefOr[Schema[_]],
    collection: js.UndefOr[String],
    skipInit: js.UndefOr[Boolean]
  ): PaginateModel[_] = js.native
}
