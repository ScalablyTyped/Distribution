package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestTiming extends StObject {
  
  /** How long it took to run the test process. - In response: present if previously set. - In create/update request: optional */
  var testProcessDuration: js.UndefOr[Duration] = js.undefined
}
object TestTiming {
  
  inline def apply(): TestTiming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestTiming] (val x: Self) extends AnyVal {
    
    inline def setTestProcessDuration(value: Duration): Self = StObject.set(x, "testProcessDuration", value.asInstanceOf[js.Any])
    
    inline def setTestProcessDurationUndefined: Self = StObject.set(x, "testProcessDuration", js.undefined)
  }
}
