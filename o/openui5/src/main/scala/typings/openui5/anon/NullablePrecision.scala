package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullablePrecision extends StObject {
  
  /**
    * If `true`, the value `null` is accepted
    */
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of decimal places allowed in the seconds portion of a valid value; must be an integer between
    * 0 and 12, otherwise the default value 0 is used.
    */
  var precision: js.UndefOr[Double] = js.undefined
}
object NullablePrecision {
  
  inline def apply(): NullablePrecision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullablePrecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullablePrecision] (val x: Self) extends AnyVal {
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
  }
}
