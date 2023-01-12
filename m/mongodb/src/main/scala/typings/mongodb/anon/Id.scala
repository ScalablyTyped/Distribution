package typings.mongodb.anon

import typings.mongodb.mod.InferIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id[TSchema] extends StObject {
  
  var _id: js.UndefOr[InferIdType[TSchema]] = js.undefined
}
object Id {
  
  inline def apply[TSchema](): Id[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id[TSchema]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id[?], TSchema] (val x: Self & Id[TSchema]) extends AnyVal {
    
    inline def set_id(value: InferIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
