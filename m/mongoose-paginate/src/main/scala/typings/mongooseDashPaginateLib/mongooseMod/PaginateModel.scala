package typings
package mongooseDashPaginateLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @js.native
trait PaginateModel[T /* <: stdLib.Document */] extends js.Object {
  def paginate(): stdLib.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object): stdLib.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object, options: PaginateOptions): stdLib.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.Object,
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], scala.Unit]
  ): stdLib.Promise[PaginateResult[T]] = js.native
}

