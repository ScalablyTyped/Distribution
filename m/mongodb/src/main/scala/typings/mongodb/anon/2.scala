package typings.mongodb.anon

import typings.mongodb.mod.ExtractIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */] extends StObject {
  
  var _id: js.UndefOr[ExtractIdType[TSchema]] = js.undefined
}
object `2` {
  
  inline def apply[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */](): `2`[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TSchema]]
  }
  
  extension [Self <: `2`[?], TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id :any | undefined} */ js.Any */](x: Self & `2`[TSchema]) {
    
    inline def set_id(value: ExtractIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
