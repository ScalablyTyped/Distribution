package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOOLEAN extends StObject {
  
  var BOOLEAN: String
  
  var DATE: String
  
  var DATETIME: String
  
  var INT32: String
  
  var INT64: String
  
  var MEMO: String
  
  var NUMBER: String
  
  var STRING: String
}
object BOOLEAN {
  
  inline def apply(
    BOOLEAN: String,
    DATE: String,
    DATETIME: String,
    INT32: String,
    INT64: String,
    MEMO: String,
    NUMBER: String,
    STRING: String
  ): BOOLEAN = {
    val __obj = js.Dynamic.literal(BOOLEAN = BOOLEAN.asInstanceOf[js.Any], DATE = DATE.asInstanceOf[js.Any], DATETIME = DATETIME.asInstanceOf[js.Any], INT32 = INT32.asInstanceOf[js.Any], INT64 = INT64.asInstanceOf[js.Any], MEMO = MEMO.asInstanceOf[js.Any], NUMBER = NUMBER.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOOLEAN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BOOLEAN] (val x: Self) extends AnyVal {
    
    inline def setBOOLEAN(value: String): Self = StObject.set(x, "BOOLEAN", value.asInstanceOf[js.Any])
    
    inline def setDATE(value: String): Self = StObject.set(x, "DATE", value.asInstanceOf[js.Any])
    
    inline def setDATETIME(value: String): Self = StObject.set(x, "DATETIME", value.asInstanceOf[js.Any])
    
    inline def setINT32(value: String): Self = StObject.set(x, "INT32", value.asInstanceOf[js.Any])
    
    inline def setINT64(value: String): Self = StObject.set(x, "INT64", value.asInstanceOf[js.Any])
    
    inline def setMEMO(value: String): Self = StObject.set(x, "MEMO", value.asInstanceOf[js.Any])
    
    inline def setNUMBER(value: String): Self = StObject.set(x, "NUMBER", value.asInstanceOf[js.Any])
    
    inline def setSTRING(value: String): Self = StObject.set(x, "STRING", value.asInstanceOf[js.Any])
  }
}
