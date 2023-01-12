package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDate extends StObject {
  
  var defaultDate: js.UndefOr[Double] = js.undefined
  
  var defaultNumeric: js.UndefOr[Double] = js.undefined
  
  var defaultString: js.UndefOr[Double] = js.undefined
  
  var noGroupingColumns: js.UndefOr[js.Array[String]] = js.undefined
  
  def pivotFormatter(arg0: Any): String
  
  var totalizePivot: js.UndefOr[Boolean] = js.undefined
}
object DefaultDate {
  
  inline def apply(pivotFormatter: Any => String): DefaultDate = {
    val __obj = js.Dynamic.literal(pivotFormatter = js.Any.fromFunction1(pivotFormatter))
    __obj.asInstanceOf[DefaultDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultDate] (val x: Self) extends AnyVal {
    
    inline def setDefaultDate(value: Double): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    inline def setDefaultNumeric(value: Double): Self = StObject.set(x, "defaultNumeric", value.asInstanceOf[js.Any])
    
    inline def setDefaultNumericUndefined: Self = StObject.set(x, "defaultNumeric", js.undefined)
    
    inline def setDefaultString(value: Double): Self = StObject.set(x, "defaultString", value.asInstanceOf[js.Any])
    
    inline def setDefaultStringUndefined: Self = StObject.set(x, "defaultString", js.undefined)
    
    inline def setNoGroupingColumns(value: js.Array[String]): Self = StObject.set(x, "noGroupingColumns", value.asInstanceOf[js.Any])
    
    inline def setNoGroupingColumnsUndefined: Self = StObject.set(x, "noGroupingColumns", js.undefined)
    
    inline def setNoGroupingColumnsVarargs(value: String*): Self = StObject.set(x, "noGroupingColumns", js.Array(value*))
    
    inline def setPivotFormatter(value: Any => String): Self = StObject.set(x, "pivotFormatter", js.Any.fromFunction1(value))
    
    inline def setTotalizePivot(value: Boolean): Self = StObject.set(x, "totalizePivot", value.asInstanceOf[js.Any])
    
    inline def setTotalizePivotUndefined: Self = StObject.set(x, "totalizePivot", js.undefined)
  }
}
