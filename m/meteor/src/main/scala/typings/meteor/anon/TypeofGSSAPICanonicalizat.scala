package typings.meteor.anon

import typings.meteor.meteorBooleans.`false`
import typings.meteor.meteorBooleans.`true`
import typings.meteor.meteorStrings.forward
import typings.meteor.meteorStrings.forwardAndReverse
import typings.meteor.meteorStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofGSSAPICanonicalizat extends StObject {
  
  val forward: typings.meteor.meteorStrings.forward
  
  val forwardAndReverse: typings.meteor.meteorStrings.forwardAndReverse
  
  val none: typings.meteor.meteorStrings.none
  
  val off: `false`
  
  val on: `true`
}
object TypeofGSSAPICanonicalizat {
  
  inline def apply(): TypeofGSSAPICanonicalizat = {
    val __obj = js.Dynamic.literal(forward = "forward", forwardAndReverse = "forwardAndReverse", none = "none", off = false, on = true)
    __obj.asInstanceOf[TypeofGSSAPICanonicalizat]
  }
  
  extension [Self <: TypeofGSSAPICanonicalizat](x: Self) {
    
    inline def setForward(value: forward): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardAndReverse(value: forwardAndReverse): Self = StObject.set(x, "forwardAndReverse", value.asInstanceOf[js.Any])
    
    inline def setNone(value: none): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOff(value: `false`): Self = StObject.set(x, "off", value.asInstanceOf[js.Any])
    
    inline def setOn(value: `true`): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
  }
}
