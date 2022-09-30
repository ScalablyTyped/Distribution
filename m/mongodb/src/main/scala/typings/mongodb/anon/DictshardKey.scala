package typings.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.bson.mod.Document
import typings.mongodb.mod.InferIdType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictshardKey[TSchema /* <: Document */]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var _id: InferIdType[TSchema]
}
object DictshardKey {
  
  inline def apply[TSchema /* <: Document */](_id: InferIdType[TSchema]): DictshardKey[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictshardKey[TSchema]]
  }
  
  extension [Self <: DictshardKey[?], TSchema /* <: Document */](x: Self & DictshardKey[TSchema]) {
    
    inline def set_id(value: InferIdType[TSchema]): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
