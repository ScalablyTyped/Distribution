package typings.mongooseDashPaginateDashV2.mongooseDashPaginateDashV2Mod.mongooseMod

import typings.mongoose.mongooseMod.Document
import typings.mongoose.mongooseMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateModel[T /* <: Document */]
  extends Model[T, js.Object] {
  def paginate(): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object, options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.Object,
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
}

