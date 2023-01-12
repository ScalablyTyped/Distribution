package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiveQuartersSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var blackCircle: Icon
  
  var circleWithOneWhiteQuarter: Icon
  
  var circleWithThreeWhiteQuarters: Icon
  
  var circleWithTwoWhiteQuarters: Icon
  
  var whiteCircleAllWhiteQuarters: Icon
}
object FiveQuartersSet {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: FiveQuartersSet] (val x: Self) extends AnyVal {
    
    inline def setBlackCircle(value: Icon): Self = StObject.set(x, "blackCircle", value.asInstanceOf[js.Any])
    
    inline def setCircleWithOneWhiteQuarter(value: Icon): Self = StObject.set(x, "circleWithOneWhiteQuarter", value.asInstanceOf[js.Any])
    
    inline def setCircleWithThreeWhiteQuarters(value: Icon): Self = StObject.set(x, "circleWithThreeWhiteQuarters", value.asInstanceOf[js.Any])
    
    inline def setCircleWithTwoWhiteQuarters(value: Icon): Self = StObject.set(x, "circleWithTwoWhiteQuarters", value.asInstanceOf[js.Any])
    
    inline def setWhiteCircleAllWhiteQuarters(value: Icon): Self = StObject.set(x, "whiteCircleAllWhiteQuarters", value.asInstanceOf[js.Any])
  }
}
