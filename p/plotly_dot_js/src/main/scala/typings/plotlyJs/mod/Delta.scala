package typings.plotlyJs.mod

import typings.plotlyJs.anon.Symbol
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var decreasing: Symbol
  
  var increasing: Symbol
  
  var position: top | bottom | left | right
  
  var reference: Double
  
  var relative: Boolean
  
  var valueformat: String
}
object Delta {
  
  @scala.inline
  def apply(
    decreasing: Symbol,
    increasing: Symbol,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Delta = {
    val __obj = js.Dynamic.literal(decreasing = decreasing.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecreasing(value: Symbol): Self = StObject.set(x, "decreasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncreasing(value: Symbol): Self = StObject.set(x, "increasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReference(value: Double): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueformat(value: String): Self = StObject.set(x, "valueformat", value.asInstanceOf[js.Any])
  }
}
