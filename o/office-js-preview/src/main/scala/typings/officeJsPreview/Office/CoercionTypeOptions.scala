package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides an option for the data format.
  */
trait CoercionTypeOptions extends StObject {
  
  /**
    * The desired data format.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.undefined
}
object CoercionTypeOptions {
  
  inline def apply(): CoercionTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoercionTypeOptions]
  }
  
  extension [Self <: CoercionTypeOptions](x: Self) {
    
    inline def setCoercionType(value: CoercionType | String): Self = StObject.set(x, "coercionType", value.asInstanceOf[js.Any])
    
    inline def setCoercionTypeUndefined: Self = StObject.set(x, "coercionType", js.undefined)
  }
}
