package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextValue extends StObject {
  
  /** The label for the context value. e.g. "latency". */
  var label: js.UndefOr[LocalizedString] = js.undefined
  
  /** The severity of this context. */
  var severity: js.UndefOr[String] = js.undefined
  
  /** The unit of the context value. */
  var unit: js.UndefOr[String] = js.undefined
  
  /** The value for the context. */
  var value: js.UndefOr[Double] = js.undefined
}
object ContextValue {
  
  inline def apply(): ContextValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextValue] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: LocalizedString): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
