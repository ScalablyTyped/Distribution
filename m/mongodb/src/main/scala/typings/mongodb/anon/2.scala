package typings.mongodb.anon

import typings.mongodb.mod.InferIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`[TSchema] extends StObject {
  
  var _id: js.UndefOr[InferIdType[TSchema]] = js.undefined
}
object `2` {
  
  inline def apply[TSchema](): `2`[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`[TSchema]]
  }
  
  extension [Self <: `2`[?], TSchema](x: Self & `2`[TSchema]) {
    
    inline def set_id(value: InferIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
