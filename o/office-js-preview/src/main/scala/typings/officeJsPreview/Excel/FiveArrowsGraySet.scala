package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiveArrowsGraySet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var grayDownArrow: Icon
  
  var grayDownInclineArrow: Icon
  
  var graySideArrow: Icon
  
  var grayUpArrow: Icon
  
  var grayUpInclineArrow: Icon
}
object FiveArrowsGraySet {
  
  @scala.inline
  def apply(
    grayDownArrow: Icon,
    grayDownInclineArrow: Icon,
    graySideArrow: Icon,
    grayUpArrow: Icon,
    grayUpInclineArrow: Icon
  ): FiveArrowsGraySet = {
    val __obj = js.Dynamic.literal(grayDownArrow = grayDownArrow.asInstanceOf[js.Any], grayDownInclineArrow = grayDownInclineArrow.asInstanceOf[js.Any], graySideArrow = graySideArrow.asInstanceOf[js.Any], grayUpArrow = grayUpArrow.asInstanceOf[js.Any], grayUpInclineArrow = grayUpInclineArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveArrowsGraySet]
  }
  
  @scala.inline
  implicit class FiveArrowsGraySetMutableBuilder[Self <: FiveArrowsGraySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrayDownArrow(value: Icon): Self = StObject.set(x, "grayDownArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayDownInclineArrow(value: Icon): Self = StObject.set(x, "grayDownInclineArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraySideArrow(value: Icon): Self = StObject.set(x, "graySideArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayUpArrow(value: Icon): Self = StObject.set(x, "grayUpArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayUpInclineArrow(value: Icon): Self = StObject.set(x, "grayUpInclineArrow", value.asInstanceOf[js.Any])
  }
}
