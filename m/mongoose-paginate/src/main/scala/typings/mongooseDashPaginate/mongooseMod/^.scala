package typings.mongooseDashPaginate.mongooseMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def model[T /* <: Document */](name: String): PaginateModel[T] = js.native
  def model[T /* <: Document */](
    name: String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): PaginateModel[T] = js.native
  def model[T /* <: Document */](
    name: String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String
  ): PaginateModel[T] = js.native
  def model[T /* <: Document */](
    name: String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String,
    skipInit: Boolean
  ): PaginateModel[T] = js.native
  @JSName("model")
  def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](name: String): U = js.native
  @JSName("model")
  def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): U = js.native
  @JSName("model")
  def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String
  ): U = js.native
  @JSName("model")
  def model_T_DocumentU_PaginateModelT_U[T /* <: Document */, U /* <: PaginateModel[T] */](
    name: String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String,
    skipInit: Boolean
  ): U = js.native
}

