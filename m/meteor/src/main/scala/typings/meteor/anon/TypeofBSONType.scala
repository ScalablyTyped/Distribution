package typings.meteor.anon

import typings.meteor.meteorInts.`-1`
import typings.meteor.meteorInts.`10`
import typings.meteor.meteorInts.`11`
import typings.meteor.meteorInts.`127`
import typings.meteor.meteorInts.`12`
import typings.meteor.meteorInts.`13`
import typings.meteor.meteorInts.`14`
import typings.meteor.meteorInts.`15`
import typings.meteor.meteorInts.`16`
import typings.meteor.meteorInts.`17`
import typings.meteor.meteorInts.`18`
import typings.meteor.meteorInts.`19`
import typings.meteor.meteorInts.`2`
import typings.meteor.meteorInts.`3`
import typings.meteor.meteorInts.`4`
import typings.meteor.meteorInts.`5`
import typings.meteor.meteorInts.`6`
import typings.meteor.meteorInts.`7`
import typings.meteor.meteorInts.`8`
import typings.meteor.meteorInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBSONType extends StObject {
  
  val array: `4`
  
  val binData: `5`
  
  val bool: `8`
  
  val date: `9`
  
  val dbPointer: `12`
  
  val decimal: `19`
  
  val double: typings.meteor.meteorInts.`1`
  
  val int: `16`
  
  val javascript: `13`
  
  val javascriptWithScope: `15`
  
  val long: `18`
  
  val maxKey: `127`
  
  val minKey: `-1`
  
  val `null`: `10`
  
  val `object`: `3`
  
  val objectId: `7`
  
  val regex: `11`
  
  val string: `2`
  
  val symbol: `14`
  
  val timestamp: `17`
  
  val undefined: `6`
}
object TypeofBSONType {
  
  inline def apply(): TypeofBSONType = {
    val __obj = js.Dynamic.literal(array = 4, binData = 5, bool = 8, date = 9, dbPointer = 12, decimal = 19, double = 1, int = 16, javascript = 13, javascriptWithScope = 15, long = 18, maxKey = 127, minKey = -1, objectId = 7, regex = 11, string = 2, symbol = 14, timestamp = 17, undefined = 6)
    __obj.updateDynamic("null")(10)
    __obj.updateDynamic("object")(3)
    __obj.asInstanceOf[TypeofBSONType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBSONType] (val x: Self) extends AnyVal {
    
    inline def setArray(value: `4`): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setBinData(value: `5`): Self = StObject.set(x, "binData", value.asInstanceOf[js.Any])
    
    inline def setBool(value: `8`): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setDate(value: `9`): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDbPointer(value: `12`): Self = StObject.set(x, "dbPointer", value.asInstanceOf[js.Any])
    
    inline def setDecimal(value: `19`): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setDouble(value: typings.meteor.meteorInts.`1`): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
    
    inline def setInt(value: `16`): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
    
    inline def setJavascript(value: `13`): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    inline def setJavascriptWithScope(value: `15`): Self = StObject.set(x, "javascriptWithScope", value.asInstanceOf[js.Any])
    
    inline def setLong(value: `18`): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setMaxKey(value: `127`): Self = StObject.set(x, "maxKey", value.asInstanceOf[js.Any])
    
    inline def setMinKey(value: `-1`): Self = StObject.set(x, "minKey", value.asInstanceOf[js.Any])
    
    inline def setNull(value: `10`): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setObject(value: `3`): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setObjectId(value: `7`): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: `11`): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setString(value: `2`): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: `14`): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: `17`): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: `6`): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
