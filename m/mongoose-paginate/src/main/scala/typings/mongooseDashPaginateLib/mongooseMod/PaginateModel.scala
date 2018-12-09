package typings
package mongooseDashPaginateLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait PaginateModel[T /* <: stdLib.Document */] extends js.Object {
  def paginate(): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object, options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.Object,
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], scala.Unit]
  ): js.Promise[PaginateResult[T]] = js.native
}

