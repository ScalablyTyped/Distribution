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
  
  @scala.inline
  def apply(
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
  implicit class FiveBoxesSetMutableBuilder[Self <: FiveBoxesSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFourFilledBoxes(value: Icon): Self = StObject.set(x, "fourFilledBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoFilledBoxes(value: Icon): Self = StObject.set(x, "noFilledBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneFilledBox(value: Icon): Self = StObject.set(x, "oneFilledBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreeFilledBoxes(value: Icon): Self = StObject.set(x, "threeFilledBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoFilledBoxes(value: Icon): Self = StObject.set(x, "twoFilledBoxes", value.asInstanceOf[js.Any])
  }
}
