package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeRange extends StObject {
  
  // The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var maximumSize: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var minimumSize: js.UndefOr[NullableOption[Double]] = js.undefined
}
object SizeRange {
  
  inline def apply(): SizeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeRange]
  }
  
  extension [Self <: SizeRange](x: Self) {
    
    inline def setMaximumSize(value: NullableOption[Double]): Self = StObject.set(x, "maximumSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumSizeNull: Self = StObject.set(x, "maximumSize", null)
    
    inline def setMaximumSizeUndefined: Self = StObject.set(x, "maximumSize", js.undefined)
    
    inline def setMinimumSize(value: NullableOption[Double]): Self = StObject.set(x, "minimumSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumSizeNull: Self = StObject.set(x, "minimumSize", null)
    
    inline def setMinimumSizeUndefined: Self = StObject.set(x, "minimumSize", js.undefined)
  }
}
