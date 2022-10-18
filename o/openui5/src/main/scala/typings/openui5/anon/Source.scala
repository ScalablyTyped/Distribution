package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * By default decimals are preserved, unless `oFormatOptions.style` is given as "short" or "long"; since
    * 1.89.0
    */
  var preserveDecimals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional set of format options to be used if the property in the model is not of type `string` and
    * needs formatting as well. If an empty object is given, the grouping is disabled and a dot is used as
    * decimal separator.
    */
  var source: js.UndefOr[js.Object] = js.undefined
}
object Source {
  
  inline def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setPreserveDecimals(value: Boolean): Self = StObject.set(x, "preserveDecimals", value.asInstanceOf[js.Any])
    
    inline def setPreserveDecimalsUndefined: Self = StObject.set(x, "preserveDecimals", js.undefined)
    
    inline def setSource(value: js.Object): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
