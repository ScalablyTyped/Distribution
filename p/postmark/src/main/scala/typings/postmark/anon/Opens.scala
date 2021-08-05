package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opens extends StObject {
  
  var Date: String
  
  var Opens: Double
  
  var Unique: Double
}
object Opens {
  
  inline def apply(Date: String, Opens: Double, Unique: Double): Opens = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Opens = Opens.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opens]
  }
  
  extension [Self <: Opens](x: Self) {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setOpens(value: Double): Self = StObject.set(x, "Opens", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Double): Self = StObject.set(x, "Unique", value.asInstanceOf[js.Any])
  }
}
