package typings.mongodb.anon

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdExtractIdType[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id ? :any} */ js.Any */] extends js.Object {
  var _id: js.UndefOr[ExtractIdType[TSchema]] = js.undefined
}

object IdExtractIdType {
  @scala.inline
  def apply[/* <: / * import warning: importer.ImportType#apply Failed type conversion: {  _id ? :any} * / js.Any */ TSchema](_id: ExtractIdType[TSchema] = null): IdExtractIdType[TSchema] = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdExtractIdType[TSchema]]
  }
}

