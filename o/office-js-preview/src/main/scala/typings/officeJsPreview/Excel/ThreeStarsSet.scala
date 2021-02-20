package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreeStarsSet extends /* index */ NumberDictionary[Icon] {
  
  var goldStar: Icon = js.native
  
  var halfGoldStar: Icon = js.native
  
  var silverStar: Icon = js.native
}
object ThreeStarsSet {
  
  @scala.inline
  def apply(goldStar: Icon, halfGoldStar: Icon, silverStar: Icon): ThreeStarsSet = {
    val __obj = js.Dynamic.literal(goldStar = goldStar.asInstanceOf[js.Any], halfGoldStar = halfGoldStar.asInstanceOf[js.Any], silverStar = silverStar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeStarsSet]
  }
  
  @scala.inline
  implicit class ThreeStarsSetMutableBuilder[Self <: ThreeStarsSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoldStar(value: Icon): Self = StObject.set(x, "goldStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHalfGoldStar(value: Icon): Self = StObject.set(x, "halfGoldStar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilverStar(value: Icon): Self = StObject.set(x, "silverStar", value.asInstanceOf[js.Any])
  }
}
