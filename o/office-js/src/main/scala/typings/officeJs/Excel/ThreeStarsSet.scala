package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreeStarsSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var goldStar: Icon
  
  var halfGoldStar: Icon
  
  var silverStar: Icon
}
object ThreeStarsSet {
  
  inline def apply(goldStar: Icon, halfGoldStar: Icon, silverStar: Icon): ThreeStarsSet = {
    val __obj = js.Dynamic.literal(goldStar = goldStar.asInstanceOf[js.Any], halfGoldStar = halfGoldStar.asInstanceOf[js.Any], silverStar = silverStar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeStarsSet]
  }
  
  extension [Self <: ThreeStarsSet](x: Self) {
    
    inline def setGoldStar(value: Icon): Self = StObject.set(x, "goldStar", value.asInstanceOf[js.Any])
    
    inline def setHalfGoldStar(value: Icon): Self = StObject.set(x, "halfGoldStar", value.asInstanceOf[js.Any])
    
    inline def setSilverStar(value: Icon): Self = StObject.set(x, "silverStar", value.asInstanceOf[js.Any])
  }
}
