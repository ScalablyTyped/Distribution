package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FiveQuartersSet extends /* index */ NumberDictionary[Icon] {
  
  var blackCircle: Icon = js.native
  
  var circleWithOneWhiteQuarter: Icon = js.native
  
  var circleWithThreeWhiteQuarters: Icon = js.native
  
  var circleWithTwoWhiteQuarters: Icon = js.native
  
  var whiteCircleAllWhiteQuarters: Icon = js.native
}
object FiveQuartersSet {
  
  @scala.inline
  def apply(
    blackCircle: Icon,
    circleWithOneWhiteQuarter: Icon,
    circleWithThreeWhiteQuarters: Icon,
    circleWithTwoWhiteQuarters: Icon,
    whiteCircleAllWhiteQuarters: Icon
  ): FiveQuartersSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], circleWithOneWhiteQuarter = circleWithOneWhiteQuarter.asInstanceOf[js.Any], circleWithThreeWhiteQuarters = circleWithThreeWhiteQuarters.asInstanceOf[js.Any], circleWithTwoWhiteQuarters = circleWithTwoWhiteQuarters.asInstanceOf[js.Any], whiteCircleAllWhiteQuarters = whiteCircleAllWhiteQuarters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveQuartersSet]
  }
  
  @scala.inline
  implicit class FiveQuartersSetMutableBuilder[Self <: FiveQuartersSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackCircle(value: Icon): Self = StObject.set(x, "blackCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleWithOneWhiteQuarter(value: Icon): Self = StObject.set(x, "circleWithOneWhiteQuarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleWithThreeWhiteQuarters(value: Icon): Self = StObject.set(x, "circleWithThreeWhiteQuarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleWithTwoWhiteQuarters(value: Icon): Self = StObject.set(x, "circleWithTwoWhiteQuarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteCircleAllWhiteQuarters(value: Icon): Self = StObject.set(x, "whiteCircleAllWhiteQuarters", value.asInstanceOf[js.Any])
  }
}
