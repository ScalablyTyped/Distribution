package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiveRatingSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var fourBars: Icon
  
  var noBars: Icon
  
  var oneBar: Icon
  
  var threeBars: Icon
  
  var twoBars: Icon
}
object FiveRatingSet {
  
  inline def apply(fourBars: Icon, noBars: Icon, oneBar: Icon, threeBars: Icon, twoBars: Icon): FiveRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars.asInstanceOf[js.Any], noBars = noBars.asInstanceOf[js.Any], oneBar = oneBar.asInstanceOf[js.Any], threeBars = threeBars.asInstanceOf[js.Any], twoBars = twoBars.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveRatingSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FiveRatingSet] (val x: Self) extends AnyVal {
    
    inline def setFourBars(value: Icon): Self = StObject.set(x, "fourBars", value.asInstanceOf[js.Any])
    
    inline def setNoBars(value: Icon): Self = StObject.set(x, "noBars", value.asInstanceOf[js.Any])
    
    inline def setOneBar(value: Icon): Self = StObject.set(x, "oneBar", value.asInstanceOf[js.Any])
    
    inline def setThreeBars(value: Icon): Self = StObject.set(x, "threeBars", value.asInstanceOf[js.Any])
    
    inline def setTwoBars(value: Icon): Self = StObject.set(x, "twoBars", value.asInstanceOf[js.Any])
  }
}
