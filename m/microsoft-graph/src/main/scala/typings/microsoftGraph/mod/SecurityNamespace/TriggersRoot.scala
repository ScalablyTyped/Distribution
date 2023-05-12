package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggersRoot
  extends StObject
     with Entity {
  
  var retentionEvents: js.UndefOr[NullableOption[js.Array[RetentionEvent]]] = js.undefined
}
object TriggersRoot {
  
  inline def apply(): TriggersRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggersRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggersRoot] (val x: Self) extends AnyVal {
    
    inline def setRetentionEvents(value: NullableOption[js.Array[RetentionEvent]]): Self = StObject.set(x, "retentionEvents", value.asInstanceOf[js.Any])
    
    inline def setRetentionEventsNull: Self = StObject.set(x, "retentionEvents", null)
    
    inline def setRetentionEventsUndefined: Self = StObject.set(x, "retentionEvents", js.undefined)
    
    inline def setRetentionEventsVarargs(value: RetentionEvent*): Self = StObject.set(x, "retentionEvents", js.Array(value*))
  }
}
