package typings.mongodb.anon

import typings.mongodb.mod.InferIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdInferIdType[TSchema] extends StObject {
  
  var _id: InferIdType[TSchema]
}
object IdInferIdType {
  
  inline def apply[TSchema](_id: InferIdType[TSchema]): IdInferIdType[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdInferIdType[TSchema]]
  }
  
  extension [Self <: IdInferIdType[?], TSchema](x: Self & IdInferIdType[TSchema]) {
    
    inline def set_id(value: InferIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
