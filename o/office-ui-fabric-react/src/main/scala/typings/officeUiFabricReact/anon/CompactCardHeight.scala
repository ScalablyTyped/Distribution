package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompactCardHeight extends StObject {
  
  var compactCardHeight: Double
  
  var directionalHintFixed: Boolean
  
  var expandedCardHeight: Double
}
object CompactCardHeight {
  
  inline def apply(compactCardHeight: Double, directionalHintFixed: Boolean, expandedCardHeight: Double): CompactCardHeight = {
    val __obj = js.Dynamic.literal(compactCardHeight = compactCardHeight.asInstanceOf[js.Any], directionalHintFixed = directionalHintFixed.asInstanceOf[js.Any], expandedCardHeight = expandedCardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactCardHeight]
  }
  
  extension [Self <: CompactCardHeight](x: Self) {
    
    inline def setCompactCardHeight(value: Double): Self = StObject.set(x, "compactCardHeight", value.asInstanceOf[js.Any])
    
    inline def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
    
    inline def setExpandedCardHeight(value: Double): Self = StObject.set(x, "expandedCardHeight", value.asInstanceOf[js.Any])
  }
}
