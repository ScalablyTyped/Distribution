package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindAndModifyWriteOpResultObject[TSchema] extends StObject {
  
  //The raw lastErrorObject returned from the command.
  var lastErrorObject: js.UndefOr[js.Any] = js.undefined
  
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[scala.Double] = js.undefined
  
  //Document returned from findAndModify command.
  var value: js.UndefOr[TSchema] = js.undefined
}
object FindAndModifyWriteOpResultObject {
  
  inline def apply[TSchema](): FindAndModifyWriteOpResultObject[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAndModifyWriteOpResultObject[TSchema]]
  }
  
  extension [Self <: FindAndModifyWriteOpResultObject[?], TSchema](x: Self & FindAndModifyWriteOpResultObject[TSchema]) {
    
    inline def setLastErrorObject(value: js.Any): Self = StObject.set(x, "lastErrorObject", value.asInstanceOf[js.Any])
    
    inline def setLastErrorObjectUndefined: Self = StObject.set(x, "lastErrorObject", js.undefined)
    
    inline def setOk(value: scala.Double): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    
    inline def setValue(value: TSchema): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
