package typings.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FourRedToBlackSet
  extends StObject
     with /* index */ NumberDictionary[Icon] {
  
  var blackCircle: Icon
  
  var grayCircle: Icon
  
  var pinkCircle: Icon
  
  var redCircle: Icon
}
object FourRedToBlackSet {
  
  inline def apply(blackCircle: Icon, grayCircle: Icon, pinkCircle: Icon, redCircle: Icon): FourRedToBlackSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], grayCircle = grayCircle.asInstanceOf[js.Any], pinkCircle = pinkCircle.asInstanceOf[js.Any], redCircle = redCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourRedToBlackSet]
  }
  
  extension [Self <: FourRedToBlackSet](x: Self) {
    
    inline def setBlackCircle(value: Icon): Self = StObject.set(x, "blackCircle", value.asInstanceOf[js.Any])
    
    inline def setGrayCircle(value: Icon): Self = StObject.set(x, "grayCircle", value.asInstanceOf[js.Any])
    
    inline def setPinkCircle(value: Icon): Self = StObject.set(x, "pinkCircle", value.asInstanceOf[js.Any])
    
    inline def setRedCircle(value: Icon): Self = StObject.set(x, "redCircle", value.asInstanceOf[js.Any])
  }
}
