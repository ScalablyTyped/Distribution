package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomUnits extends StObject {
  
  /**
    * Not supported; the type derives this from its unit customizing part.
    */
  var customUnits: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Defines how an empty string is parsed into the measure. With the default value `0` the measure becomes
    * `0` when an empty string is parsed.
    */
  var emptyString: js.UndefOr[Any] = js.undefined
  
  /**
    * Whether the measure is parsed to a string; set to `false` if the measure's underlying type is represented
    * as a `number`, for example {@link sap.ui.model.odata.type.Int32}
    */
  var parseAsString: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default decimals are preserved, unless `oFormatOptions.style` is given as "short" or "long"; since
    * 1.89.0
    */
  var preserveDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the measure is parsed if no unit is entered; defaults to `true` if neither `showMeasure` nor
    * `showNumber` is set to a falsy value, otherwise defaults to `false`
    */
  var unitOptional: js.UndefOr[Boolean] = js.undefined
}
object CustomUnits {
  
  inline def apply(): CustomUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomUnits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomUnits] (val x: Self) extends AnyVal {
    
    inline def setCustomUnits(value: js.Object): Self = StObject.set(x, "customUnits", value.asInstanceOf[js.Any])
    
    inline def setCustomUnitsUndefined: Self = StObject.set(x, "customUnits", js.undefined)
    
    inline def setEmptyString(value: Any): Self = StObject.set(x, "emptyString", value.asInstanceOf[js.Any])
    
    inline def setEmptyStringUndefined: Self = StObject.set(x, "emptyString", js.undefined)
    
    inline def setParseAsString(value: Boolean): Self = StObject.set(x, "parseAsString", value.asInstanceOf[js.Any])
    
    inline def setParseAsStringUndefined: Self = StObject.set(x, "parseAsString", js.undefined)
    
    inline def setPreserveDecimals(value: Boolean): Self = StObject.set(x, "preserveDecimals", value.asInstanceOf[js.Any])
    
    inline def setPreserveDecimalsUndefined: Self = StObject.set(x, "preserveDecimals", js.undefined)
    
    inline def setUnitOptional(value: Boolean): Self = StObject.set(x, "unitOptional", value.asInstanceOf[js.Any])
    
    inline def setUnitOptionalUndefined: Self = StObject.set(x, "unitOptional", js.undefined)
  }
}
