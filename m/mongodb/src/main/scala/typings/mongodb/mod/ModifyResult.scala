package typings.mongodb.mod

import typings.bson.mod.Document
import typings.mongodb.mongodbInts.`0`
import typings.mongodb.mongodbInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyResult[TSchema] extends StObject {
  
  var lastErrorObject: js.UndefOr[Document] = js.undefined
  
  var ok: `0` | `1`
  
  var value: WithId[TSchema] | Null
}
object ModifyResult {
  
  inline def apply[TSchema](ok: `0` | `1`): ModifyResult[TSchema] = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[ModifyResult[TSchema]]
  }
  
  extension [Self <: ModifyResult[?], TSchema](x: Self & ModifyResult[TSchema]) {
    
    inline def setLastErrorObject(value: Document): Self = StObject.set(x, "lastErrorObject", value.asInstanceOf[js.Any])
    
    inline def setLastErrorObjectUndefined: Self = StObject.set(x, "lastErrorObject", js.undefined)
    
    inline def setOk(value: `0` | `1`): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setValue(value: WithId[TSchema]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
