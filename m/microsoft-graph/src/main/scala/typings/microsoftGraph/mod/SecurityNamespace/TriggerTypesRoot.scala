package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerTypesRoot
  extends StObject
     with Entity {
  
  var retentionEventTypes: js.UndefOr[NullableOption[js.Array[RetentionEventType]]] = js.undefined
}
object TriggerTypesRoot {
  
  inline def apply(): TriggerTypesRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerTypesRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerTypesRoot] (val x: Self) extends AnyVal {
    
    inline def setRetentionEventTypes(value: NullableOption[js.Array[RetentionEventType]]): Self = StObject.set(x, "retentionEventTypes", value.asInstanceOf[js.Any])
    
    inline def setRetentionEventTypesNull: Self = StObject.set(x, "retentionEventTypes", null)
    
    inline def setRetentionEventTypesUndefined: Self = StObject.set(x, "retentionEventTypes", js.undefined)
    
    inline def setRetentionEventTypesVarargs(value: RetentionEventType*): Self = StObject.set(x, "retentionEventTypes", js.Array(value*))
  }
}
