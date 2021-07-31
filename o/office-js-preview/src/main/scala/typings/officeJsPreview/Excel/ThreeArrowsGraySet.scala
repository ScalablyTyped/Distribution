package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeArrowsGraySet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var grayDownArrow: Icon
  
  var graySideArrow: Icon
  
  var grayUpArrow: Icon
}
object ThreeArrowsGraySet {
  
  @scala.inline
  def apply(grayDownArrow: Icon, graySideArrow: Icon, grayUpArrow: Icon): ThreeArrowsGraySet = {
    val __obj = js.Dynamic.literal(grayDownArrow = grayDownArrow.asInstanceOf[js.Any], graySideArrow = graySideArrow.asInstanceOf[js.Any], grayUpArrow = grayUpArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeArrowsGraySet]
  }
  
  @scala.inline
  implicit class ThreeArrowsGraySetMutableBuilder[Self <: ThreeArrowsGraySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrayDownArrow(value: Icon): Self = StObject.set(x, "grayDownArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraySideArrow(value: Icon): Self = StObject.set(x, "graySideArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayUpArrow(value: Icon): Self = StObject.set(x, "grayUpArrow", value.asInstanceOf[js.Any])
  }
}
