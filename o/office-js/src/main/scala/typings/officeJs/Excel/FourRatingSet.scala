package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FourRatingSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var fourBars: Icon
  
  var oneBar: Icon
  
  var threeBars: Icon
  
  var twoBars: Icon
}
object FourRatingSet {
  
  @scala.inline
  def apply(fourBars: Icon, oneBar: Icon, threeBars: Icon, twoBars: Icon): FourRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars.asInstanceOf[js.Any], oneBar = oneBar.asInstanceOf[js.Any], threeBars = threeBars.asInstanceOf[js.Any], twoBars = twoBars.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourRatingSet]
  }
  
  @scala.inline
  implicit class FourRatingSetMutableBuilder[Self <: FourRatingSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFourBars(value: Icon): Self = StObject.set(x, "fourBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneBar(value: Icon): Self = StObject.set(x, "oneBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeBars(value: Icon): Self = StObject.set(x, "threeBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoBars(value: Icon): Self = StObject.set(x, "twoBars", value.asInstanceOf[js.Any])
  }
}
