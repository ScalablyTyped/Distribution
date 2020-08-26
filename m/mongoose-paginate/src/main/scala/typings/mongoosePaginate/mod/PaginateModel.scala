package typings.mongoosePaginate.mod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Model<T> * / any */ @js.native
trait PaginateModel[T /* <: Document */] extends js.Object {
  def paginate(): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.UndefOr[scala.Nothing], options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.UndefOr[scala.Nothing],
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.Object,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
  def paginate(query: js.Object, options: PaginateOptions): js.Promise[PaginateResult[T]] = js.native
  def paginate(
    query: js.Object,
    options: PaginateOptions,
    callback: js.Function2[/* err */ js.Any, /* result */ PaginateResult[T], Unit]
  ): js.Promise[PaginateResult[T]] = js.native
}

