package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceClassification
  extends StObject
     with Entity {
  
  /**
    * A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other.
    * Read-only. Nullable.
    */
  var overrides: js.UndefOr[NullableOption[js.Array[InferenceClassificationOverride]]] = js.undefined
}
object InferenceClassification {
  
  inline def apply(): InferenceClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceClassification]
  }
  
  extension [Self <: InferenceClassification](x: Self) {
    
    inline def setOverrides(value: NullableOption[js.Array[InferenceClassificationOverride]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesNull: Self = StObject.set(x, "overrides", null)
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: InferenceClassificationOverride*): Self = StObject.set(x, "overrides", js.Array(value*))
  }
}
