package typings
package mongooseDashPaginateDashV2Lib.mongooseDashPaginateDashV2Mod.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginateModel[T /* <: mongooseLib.mongooseMod.Document */]
  extends mongooseLib.mongooseMod.Model[T, js.Object] {
  def paginate(): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object, options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.Object,
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], scala.Unit]
  ): js.Promise[PaginateResult[T]] = js.native
}

