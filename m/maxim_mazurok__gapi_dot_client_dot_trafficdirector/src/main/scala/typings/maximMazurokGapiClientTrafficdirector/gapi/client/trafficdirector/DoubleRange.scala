package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleRange extends StObject {
  
  /** end of the range (exclusive) */
  var end: js.UndefOr[Double] = js.undefined
  
  /** start of the range (inclusive) */
  var start: js.UndefOr[Double] = js.undefined
}
object DoubleRange {
  
  @scala.inline
  def apply(): DoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleRange]
  }
  
  @scala.inline
  implicit class DoubleRangeMutableBuilder[Self <: DoubleRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
