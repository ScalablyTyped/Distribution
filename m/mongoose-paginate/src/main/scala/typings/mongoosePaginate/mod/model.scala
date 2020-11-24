package typings.mongoosePaginate.mod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  
  def apply[T /* <: Document */](name: String): PaginateModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: js.UndefOr[scala.Nothing],
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): PaginateModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: js.UndefOr[scala.Nothing], collection: String): PaginateModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: js.UndefOr[scala.Nothing], collection: String, skipInit: Boolean): PaginateModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): PaginateModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): PaginateModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String
  ): PaginateModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: String,
    skipInit: Boolean
  ): PaginateModel[T] = js.native
}
