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
  
  @scala.inline
  def apply(): InferenceClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceClassification]
  }
  
  @scala.inline
  implicit class InferenceClassificationMutableBuilder[Self <: InferenceClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrides(value: NullableOption[js.Array[InferenceClassificationOverride]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesNull: Self = StObject.set(x, "overrides", null)
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: InferenceClassificationOverride*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
