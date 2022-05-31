package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriterion[D] extends StObject {
  
  var attribute: /* keyof D */ String
  
  var direction: String
}
object SortCriterion {
  
  inline def apply[D](attribute: /* keyof D */ String, direction: String): SortCriterion[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriterion[D]]
  }
  
  extension [Self <: SortCriterion[?], D](x: Self & SortCriterion[D]) {
    
    inline def setAttribute(value: /* keyof D */ String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
  }
}
