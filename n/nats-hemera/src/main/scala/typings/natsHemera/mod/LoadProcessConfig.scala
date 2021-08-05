package typings.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadProcessConfig extends StObject {
  
  var sampleInterval: js.UndefOr[Double] = js.undefined
}
object LoadProcessConfig {
  
  inline def apply(): LoadProcessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadProcessConfig]
  }
  
  extension [Self <: LoadProcessConfig](x: Self) {
    
    inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
    
    inline def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
  }
}
