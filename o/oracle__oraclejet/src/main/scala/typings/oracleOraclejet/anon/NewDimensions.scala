package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewDimensions
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var header: String | Double
  
  var newDimensions: HeightWidth
  
  var oldDimensions: HeightWidth
}
object NewDimensions {
  
  inline def apply(header: String | Double, newDimensions: HeightWidth, oldDimensions: HeightWidth): NewDimensions = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], newDimensions = newDimensions.asInstanceOf[js.Any], oldDimensions = oldDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewDimensions]
  }
  
  extension [Self <: NewDimensions](x: Self) {
    
    inline def setHeader(value: String | Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setNewDimensions(value: HeightWidth): Self = StObject.set(x, "newDimensions", value.asInstanceOf[js.Any])
    
    inline def setOldDimensions(value: HeightWidth): Self = StObject.set(x, "oldDimensions", value.asInstanceOf[js.Any])
  }
}
