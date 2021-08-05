package typings.miniprogram

import typings.miniprogram.anon.Accuracy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLocationArgs
  extends StObject
     with AsyncCallback[Accuracy] {
  
  /**
    * longitude and latitude location cache expiry time in seconds.
    * Default is 30s. Use of cache can speed up location process. Re-location is done upon cache expiry.
    */
  var catchTimeout: js.UndefOr[Double] = js.undefined
  
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
    
    inline def setCatchTimeout(value: Double): Self = StObject.set(x, "catchTimeout", value.asInstanceOf[js.Any])
    
    inline def setCatchTimeoutUndefined: Self = StObject.set(x, "catchTimeout", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
