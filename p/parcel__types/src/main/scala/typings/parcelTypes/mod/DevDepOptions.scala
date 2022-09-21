package typings.parcelTypes.mod

import typings.parcelTypes.anon.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevDepOptions extends StObject {
  
  /**
    * When this dev dependency is invalidated, also invalidate these dependencies.
    * This is useful if the parcel plugin or another parent dependency
    * has its own cache for this dev dependency other than Node's require cache.
    */
  var additionalInvalidations: js.UndefOr[js.Array[Range]] = js.undefined
  
  var range: js.UndefOr[SemverRange | Null] = js.undefined
  
  var resolveFrom: FilePath
  
  var specifier: DependencySpecifier
}
object DevDepOptions {
  
  inline def apply(resolveFrom: FilePath, specifier: DependencySpecifier): DevDepOptions = {
    val __obj = js.Dynamic.literal(resolveFrom = resolveFrom.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevDepOptions]
  }
  
  extension [Self <: DevDepOptions](x: Self) {
    
    inline def setAdditionalInvalidations(value: js.Array[Range]): Self = StObject.set(x, "additionalInvalidations", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInvalidationsUndefined: Self = StObject.set(x, "additionalInvalidations", js.undefined)
    
    inline def setAdditionalInvalidationsVarargs(value: Range*): Self = StObject.set(x, "additionalInvalidations", js.Array(value*))
    
    inline def setRange(value: SemverRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeNull: Self = StObject.set(x, "range", null)
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setResolveFrom(value: FilePath): Self = StObject.set(x, "resolveFrom", value.asInstanceOf[js.Any])
    
    inline def setSpecifier(value: DependencySpecifier): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
  }
}
