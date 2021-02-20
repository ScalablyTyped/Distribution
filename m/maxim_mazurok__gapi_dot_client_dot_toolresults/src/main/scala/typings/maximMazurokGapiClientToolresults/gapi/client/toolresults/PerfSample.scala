package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfSample extends StObject {
  
  /** Timestamp of collection. */
  var sampleTime: js.UndefOr[Timestamp] = js.native
  
  /** Value observed */
  var value: js.UndefOr[Double] = js.native
}
object PerfSample {
  
  @scala.inline
  def apply(): PerfSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerfSample]
  }
  
  @scala.inline
  implicit class PerfSampleMutableBuilder[Self <: PerfSample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSampleTime(value: Timestamp): Self = StObject.set(x, "sampleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleTimeUndefined: Self = StObject.set(x, "sampleTime", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
