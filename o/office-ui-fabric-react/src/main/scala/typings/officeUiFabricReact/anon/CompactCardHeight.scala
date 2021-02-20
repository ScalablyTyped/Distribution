package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactCardHeight extends StObject {
  
  var compactCardHeight: Double = js.native
  
  var directionalHintFixed: Boolean = js.native
  
  var expandedCardHeight: Double = js.native
}
object CompactCardHeight {
  
  @scala.inline
  def apply(compactCardHeight: Double, directionalHintFixed: Boolean, expandedCardHeight: Double): CompactCardHeight = {
    val __obj = js.Dynamic.literal(compactCardHeight = compactCardHeight.asInstanceOf[js.Any], directionalHintFixed = directionalHintFixed.asInstanceOf[js.Any], expandedCardHeight = expandedCardHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactCardHeight]
  }
  
  @scala.inline
  implicit class CompactCardHeightMutableBuilder[Self <: CompactCardHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactCardHeight(value: Double): Self = StObject.set(x, "compactCardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalHintFixed(value: Boolean): Self = StObject.set(x, "directionalHintFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedCardHeight(value: Double): Self = StObject.set(x, "expandedCardHeight", value.asInstanceOf[js.Any])
  }
}
