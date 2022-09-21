package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eligible extends StObject {
  
  var eligible: Boolean
  
  var valuable: Boolean
}
object Eligible {
  
  inline def apply(eligible: Boolean, valuable: Boolean): Eligible = {
    val __obj = js.Dynamic.literal(eligible = eligible.asInstanceOf[js.Any], valuable = valuable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eligible]
  }
  
  extension [Self <: Eligible](x: Self) {
    
    inline def setEligible(value: Boolean): Self = StObject.set(x, "eligible", value.asInstanceOf[js.Any])
    
    inline def setValuable(value: Boolean): Self = StObject.set(x, "valuable", value.asInstanceOf[js.Any])
  }
}
