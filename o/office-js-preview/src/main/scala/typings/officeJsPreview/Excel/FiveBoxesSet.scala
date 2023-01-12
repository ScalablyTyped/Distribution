package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FiveBoxesSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var fourFilledBoxes: Icon
  
  var noFilledBoxes: Icon
  
  var oneFilledBox: Icon
  
  var threeFilledBoxes: Icon
  
  var twoFilledBoxes: Icon
}
object FiveBoxesSet {
  
  inline def apply(
    fourFilledBoxes: Icon,
    noFilledBoxes: Icon,
    oneFilledBox: Icon,
    threeFilledBoxes: Icon,
    twoFilledBoxes: Icon
  ): FiveBoxesSet = {
    val __obj = js.Dynamic.literal(fourFilledBoxes = fourFilledBoxes.asInstanceOf[js.Any], noFilledBoxes = noFilledBoxes.asInstanceOf[js.Any], oneFilledBox = oneFilledBox.asInstanceOf[js.Any], threeFilledBoxes = threeFilledBoxes.asInstanceOf[js.Any], twoFilledBoxes = twoFilledBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveBoxesSet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FiveBoxesSet] (val x: Self) extends AnyVal {
    
    inline def setFourFilledBoxes(value: Icon): Self = StObject.set(x, "fourFilledBoxes", value.asInstanceOf[js.Any])
    
    inline def setNoFilledBoxes(value: Icon): Self = StObject.set(x, "noFilledBoxes", value.asInstanceOf[js.Any])
    
    inline def setOneFilledBox(value: Icon): Self = StObject.set(x, "oneFilledBox", value.asInstanceOf[js.Any])
    
    inline def setThreeFilledBoxes(value: Icon): Self = StObject.set(x, "threeFilledBoxes", value.asInstanceOf[js.Any])
    
    inline def setTwoFilledBoxes(value: Icon): Self = StObject.set(x, "twoFilledBoxes", value.asInstanceOf[js.Any])
  }
}
