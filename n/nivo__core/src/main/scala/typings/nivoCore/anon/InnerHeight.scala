package typings.nivoCore.anon

import typings.nivoCore.mod.Margin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerHeight extends StObject {
  
  var innerHeight: Double
  
  var innerWidth: Double
  
  var margin: Margin
  
  var outerHeight: Double
  
  var outerWidth: Double
}
object InnerHeight {
  
  inline def apply(innerHeight: Double, innerWidth: Double, margin: Margin, outerHeight: Double, outerWidth: Double): InnerHeight = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerHeight]
  }
  
  extension [Self <: InnerHeight](x: Self) {
    
    inline def setInnerHeight(value: Double): Self = StObject.set(x, "innerHeight", value.asInstanceOf[js.Any])
    
    inline def setInnerWidth(value: Double): Self = StObject.set(x, "innerWidth", value.asInstanceOf[js.Any])
    
    inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setOuterHeight(value: Double): Self = StObject.set(x, "outerHeight", value.asInstanceOf[js.Any])
    
    inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
  }
}
