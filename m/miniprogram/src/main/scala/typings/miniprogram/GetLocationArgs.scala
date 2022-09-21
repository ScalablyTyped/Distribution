package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationArgs
  extends StObject
     with AsyncCallback[GetLocationCallbackValue] {
  
  /**
    * longitude and latitude location cache expiry time in seconds.
    * Default is 30s. Use of cache can speed up location process. Re-location is done upon cache expiry.
    */
  var cacheTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * 0: default, get the longitude and latitude.
    */
  var `type`: js.UndefOr[Double] = js.undefined
}
object GetLocationArgs {
  
  inline def apply(): GetLocationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLocationArgs]
  }
  
  extension [Self <: GetLocationArgs](x: Self) {
    
    inline def setCacheTimeout(value: Double): Self = StObject.set(x, "cacheTimeout", value.asInstanceOf[js.Any])
    
    inline def setCacheTimeoutUndefined: Self = StObject.set(x, "cacheTimeout", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
