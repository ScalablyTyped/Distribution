package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FourArrowsGraySet extends /* index */ NumberDictionary[Icon] {
  
  var grayDownArrow: Icon = js.native
  
  var grayDownInclineArrow: Icon = js.native
  
  var grayUpArrow: Icon = js.native
  
  var grayUpInclineArrow: Icon = js.native
}
object FourArrowsGraySet {
  
  @scala.inline
  def apply(grayDownArrow: Icon, grayDownInclineArrow: Icon, grayUpArrow: Icon, grayUpInclineArrow: Icon): FourArrowsGraySet = {
    val __obj = js.Dynamic.literal(grayDownArrow = grayDownArrow.asInstanceOf[js.Any], grayDownInclineArrow = grayDownInclineArrow.asInstanceOf[js.Any], grayUpArrow = grayUpArrow.asInstanceOf[js.Any], grayUpInclineArrow = grayUpInclineArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourArrowsGraySet]
  }
  
  @scala.inline
  implicit class FourArrowsGraySetMutableBuilder[Self <: FourArrowsGraySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrayDownArrow(value: Icon): Self = StObject.set(x, "grayDownArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayDownInclineArrow(value: Icon): Self = StObject.set(x, "grayDownInclineArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayUpArrow(value: Icon): Self = StObject.set(x, "grayUpArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayUpInclineArrow(value: Icon): Self = StObject.set(x, "grayUpInclineArrow", value.asInstanceOf[js.Any])
  }
}
