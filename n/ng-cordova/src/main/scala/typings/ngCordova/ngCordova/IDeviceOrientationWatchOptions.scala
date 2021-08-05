package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceOrientationWatchOptions extends StObject {
  
  var filter: js.UndefOr[Double] = js.undefined
  
  var frequency: js.UndefOr[Double] = js.undefined
}
object IDeviceOrientationWatchOptions {
  
  inline def apply(): IDeviceOrientationWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeviceOrientationWatchOptions]
  }
  
  extension [Self <: IDeviceOrientationWatchOptions](x: Self) {
    
    inline def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
