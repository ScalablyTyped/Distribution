package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystraceSetup extends StObject {
  
  /** Systrace duration in seconds. Should be between 1 and 30 seconds. 0 disables systrace. */
  var durationSeconds: js.UndefOr[Double] = js.undefined
}
object SystraceSetup {
  
  inline def apply(): SystraceSetup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystraceSetup]
  }
  
  extension [Self <: SystraceSetup](x: Self) {
    
    inline def setDurationSeconds(value: Double): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
  }
}
