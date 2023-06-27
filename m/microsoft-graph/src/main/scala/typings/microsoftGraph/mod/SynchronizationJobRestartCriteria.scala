package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationJobRestartCriteria extends StObject {
  
  var resetScope: js.UndefOr[NullableOption[SynchronizationJobRestartScope]] = js.undefined
}
object SynchronizationJobRestartCriteria {
  
  inline def apply(): SynchronizationJobRestartCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationJobRestartCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationJobRestartCriteria] (val x: Self) extends AnyVal {
    
    inline def setResetScope(value: NullableOption[SynchronizationJobRestartScope]): Self = StObject.set(x, "resetScope", value.asInstanceOf[js.Any])
    
    inline def setResetScopeNull: Self = StObject.set(x, "resetScope", null)
    
    inline def setResetScopeUndefined: Self = StObject.set(x, "resetScope", js.undefined)
  }
}
