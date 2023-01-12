package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dates extends StObject {
  
  var dates: InvalidDate
  
  var f: js.Array[Boolean]
  
  var inObject: F
  
  var mixed: js.Array[js.UndefOr[Boolean | Null]]
  
  var nulls: js.Array[Null]
  
  var t: js.Array[Boolean]
  
  var undef: Unit
}
object Dates {
  
  inline def apply(
    dates: InvalidDate,
    f: js.Array[Boolean],
    inObject: F,
    mixed: js.Array[js.UndefOr[Boolean | Null]],
    nulls: js.Array[Null],
    t: js.Array[Boolean],
    undef: Unit
  ): Dates = {
    val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], inObject = inObject.asInstanceOf[js.Any], mixed = mixed.asInstanceOf[js.Any], nulls = nulls.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], undef = undef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dates] (val x: Self) extends AnyVal {
    
    inline def setDates(value: InvalidDate): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
    
    inline def setF(value: js.Array[Boolean]): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setFVarargs(value: Boolean*): Self = StObject.set(x, "f", js.Array(value*))
    
    inline def setInObject(value: F): Self = StObject.set(x, "inObject", value.asInstanceOf[js.Any])
    
    inline def setMixed(value: js.Array[js.UndefOr[Boolean | Null]]): Self = StObject.set(x, "mixed", value.asInstanceOf[js.Any])
    
    inline def setMixedVarargs(value: (js.UndefOr[Boolean | Null])*): Self = StObject.set(x, "mixed", js.Array(value*))
    
    inline def setNulls(value: js.Array[Null]): Self = StObject.set(x, "nulls", value.asInstanceOf[js.Any])
    
    inline def setNullsVarargs(value: Null*): Self = StObject.set(x, "nulls", js.Array(value*))
    
    inline def setT(value: js.Array[Boolean]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTVarargs(value: Boolean*): Self = StObject.set(x, "t", js.Array(value*))
    
    inline def setUndef(value: Unit): Self = StObject.set(x, "undef", value.asInstanceOf[js.Any])
  }
}
