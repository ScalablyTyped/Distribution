package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceOrientationWatchOptions extends StObject {
  
  var filter: js.UndefOr[Double] = js.native
  
  var frequency: js.UndefOr[Double] = js.native
}
object IDeviceOrientationWatchOptions {
  
  @scala.inline
  def apply(): IDeviceOrientationWatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDeviceOrientationWatchOptions]
  }
  
  @scala.inline
  implicit class IDeviceOrientationWatchOptionsMutableBuilder[Self <: IDeviceOrientationWatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: Double): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
