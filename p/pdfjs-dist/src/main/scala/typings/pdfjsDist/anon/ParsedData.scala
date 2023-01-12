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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsedData] (val x: Self) extends AnyVal {
    
    inline def setParsedData(value: Any): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    inline def setRawData(value: Any): Self = StObject.set(x, "rawData", value.asInstanceOf[js.Any])
  }
}
