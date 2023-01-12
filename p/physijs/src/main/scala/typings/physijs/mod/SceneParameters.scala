package typings.physijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneParameters extends StObject {
  
  var ammo: js.UndefOr[String] = js.undefined
  
  var fixedTimeStep: js.UndefOr[Double] = js.undefined
  
  var rateLimit: js.UndefOr[Boolean] = js.undefined
}
object SceneParameters {
  
  inline def apply(): SceneParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneParameters] (val x: Self) extends AnyVal {
    
    inline def setAmmo(value: String): Self = StObject.set(x, "ammo", value.asInstanceOf[js.Any])
    
    inline def setAmmoUndefined: Self = StObject.set(x, "ammo", js.undefined)
    
    inline def setFixedTimeStep(value: Double): Self = StObject.set(x, "fixedTimeStep", value.asInstanceOf[js.Any])
    
    inline def setFixedTimeStepUndefined: Self = StObject.set(x, "fixedTimeStep", js.undefined)
    
    inline def setRateLimit(value: Boolean): Self = StObject.set(x, "rateLimit", value.asInstanceOf[js.Any])
    
    inline def setRateLimitUndefined: Self = StObject.set(x, "rateLimit", js.undefined)
  }
}
