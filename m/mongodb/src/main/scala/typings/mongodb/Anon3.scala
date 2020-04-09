package typings.mongodb

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon3[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id ? :any} */ js.Any */] extends js.Object {
  var _id: js.UndefOr[ExtractIdType[TSchema]] = js.undefined
}

object Anon3 {
  @scala.inline
  def apply[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id ? :any} */ js.Any */](_id: ExtractIdType[TSchema] = null): Anon3[TSchema] = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon3[TSchema]]
  }
}

