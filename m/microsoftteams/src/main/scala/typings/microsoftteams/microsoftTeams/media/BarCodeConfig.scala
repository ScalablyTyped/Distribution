package typings.microsoftteams.microsoftTeams.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Barcode configuration supplied to scanBarCode API to customize barcode scanning experience in mobile
  * All properties in BarCodeConfig are optional and have default values in the platform
  */
trait BarCodeConfig extends StObject {
  
  /**
    * Optional; Lets the developer specify the scan timeout interval in seconds
    * Default value is 30 seconds and max allowed value is 60 seconds
    */
  var timeOutIntervalInSec: js.UndefOr[Double] = js.undefined
}
object BarCodeConfig {
  
  inline def apply(): BarCodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarCodeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarCodeConfig] (val x: Self) extends AnyVal {
    
    inline def setTimeOutIntervalInSec(value: Double): Self = StObject.set(x, "timeOutIntervalInSec", value.asInstanceOf[js.Any])
    
    inline def setTimeOutIntervalInSecUndefined: Self = StObject.set(x, "timeOutIntervalInSec", js.undefined)
  }
}
