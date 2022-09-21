package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericTargetingDimension extends StObject {
  
  /** The IDs excluded in a configuration. */
  var excludedIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The IDs included in a configuration. */
  var includedIds: js.UndefOr[js.Array[String]] = js.undefined
}
object NumericTargetingDimension {
  
  inline def apply(): NumericTargetingDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericTargetingDimension]
  }
  
  extension [Self <: NumericTargetingDimension](x: Self) {
    
    inline def setExcludedIds(value: js.Array[String]): Self = StObject.set(x, "excludedIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedIdsUndefined: Self = StObject.set(x, "excludedIds", js.undefined)
    
    inline def setExcludedIdsVarargs(value: String*): Self = StObject.set(x, "excludedIds", js.Array(value*))
    
    inline def setIncludedIds(value: js.Array[String]): Self = StObject.set(x, "includedIds", value.asInstanceOf[js.Any])
    
    inline def setIncludedIdsUndefined: Self = StObject.set(x, "includedIds", js.undefined)
    
    inline def setIncludedIdsVarargs(value: String*): Self = StObject.set(x, "includedIds", js.Array(value*))
  }
}
