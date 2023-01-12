package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DerivedMetric extends StObject {
  
  /** The name of the denominator metric. e.g. "rows". */
  var denominator: js.UndefOr[LocalizedString] = js.undefined
  
  /** The name of the numerator metric. e.g. "latency". */
  var numerator: js.UndefOr[LocalizedString] = js.undefined
}
object DerivedMetric {
  
  inline def apply(): DerivedMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DerivedMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DerivedMetric] (val x: Self) extends AnyVal {
    
    inline def setDenominator(value: LocalizedString): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
    
    inline def setNumerator(value: LocalizedString): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
    
    inline def setNumeratorUndefined: Self = StObject.set(x, "numerator", js.undefined)
  }
}
