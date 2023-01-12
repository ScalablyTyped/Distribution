package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FixedOrPercent extends StObject {
  
  /** Specifies a fixed value. */
  var fixed: js.UndefOr[Double] = js.undefined
  
  /** Specifies the relative value defined as a percentage, which will be multiplied by a reference value. */
  var percent: js.UndefOr[Double] = js.undefined
}
object FixedOrPercent {
  
  inline def apply(): FixedOrPercent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FixedOrPercent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FixedOrPercent] (val x: Self) extends AnyVal {
    
    inline def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
  }
}
