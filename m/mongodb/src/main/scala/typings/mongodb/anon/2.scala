package typings.mongodb.anon

import typings.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2`[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */] extends js.Object {
  
  var _id: js.UndefOr[ExtractIdType[TSchema]] = js.native
}
object `2` {
  
  @scala.inline
  def apply[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */](): `2`[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TSchema]]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`[_], TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */] (val x: Self with `2`[TSchema]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_id(value: ExtractIdType[TSchema]): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
  }
}
