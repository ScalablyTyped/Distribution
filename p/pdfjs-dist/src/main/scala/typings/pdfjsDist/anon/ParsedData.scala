package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedData extends StObject {
  
  var parsedData: Any
  
  var rawData: Any
}
object ParsedData {
  
  inline def apply(parsedData: Any, rawData: Any): ParsedData = {
    val __obj = js.Dynamic.literal(parsedData = parsedData.asInstanceOf[js.Any], rawData = rawData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedData]
  }
  
  extension [Self <: ParsedData](x: Self) {
    
    inline def setParsedData(value: Any): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: Any): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
  }
}
