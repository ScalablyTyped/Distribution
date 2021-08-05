package typings.mongodb.anon

import typings.mongodb.mod.ExtractIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdExtractIdType[TSchema] extends StObject {
  
  var _id: ExtractIdType[TSchema]
}
object IdExtractIdType {
  
  inline def apply[TSchema](_id: ExtractIdType[TSchema]): IdExtractIdType[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdExtractIdType[TSchema]]
  }
  
  extension [Self <: IdExtractIdType[?], TSchema](x: Self & IdExtractIdType[TSchema]) {
    
    inline def set_id(value: ExtractIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
