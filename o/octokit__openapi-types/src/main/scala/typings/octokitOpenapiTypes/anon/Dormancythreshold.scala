package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dormancythreshold extends StObject {
  
  var dormancy_threshold: js.UndefOr[String] = js.undefined
  
  var total_dormant_users: js.UndefOr[Double] = js.undefined
}
object Dormancythreshold {
  
  inline def apply(): Dormancythreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dormancythreshold]
  }
  
  extension [Self <: Dormancythreshold](x: Self) {
    
    inline def setDormancy_threshold(value: String): Self = StObject.set(x, "dormancy_threshold", value.asInstanceOf[js.Any])
    
    inline def setDormancy_thresholdUndefined: Self = StObject.set(x, "dormancy_threshold", js.undefined)
    
    inline def setTotal_dormant_users(value: Double): Self = StObject.set(x, "total_dormant_users", value.asInstanceOf[js.Any])
    
    inline def setTotal_dormant_usersUndefined: Self = StObject.set(x, "total_dormant_users", js.undefined)
  }
}
