package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Marked extends StObject {
  
  var Marked: Boolean
  
  var Suspects: Boolean
  
  var UserProperties: Boolean
}
object Marked {
  
  inline def apply(Marked: Boolean, Suspects: Boolean, UserProperties: Boolean): Marked = {
    val __obj = js.Dynamic.literal(Marked = Marked.asInstanceOf[js.Any], Suspects = Suspects.asInstanceOf[js.Any], UserProperties = UserProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marked]
  }
  
  extension [Self <: Marked](x: Self) {
    
    inline def setMarked(value: Boolean): Self = StObject.set(x, "Marked", value.asInstanceOf[js.Any])
    
    inline def setSuspects(value: Boolean): Self = StObject.set(x, "Suspects", value.asInstanceOf[js.Any])
    
    inline def setUserProperties(value: Boolean): Self = StObject.set(x, "UserProperties", value.asInstanceOf[js.Any])
  }
}
