package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationLinkedObjects extends StObject {
  
  var manager: js.UndefOr[NullableOption[SynchronizationJobSubject]] = js.undefined
  
  var members: js.UndefOr[NullableOption[js.Array[SynchronizationJobSubject]]] = js.undefined
  
  var owners: js.UndefOr[NullableOption[js.Array[SynchronizationJobSubject]]] = js.undefined
}
object SynchronizationLinkedObjects {
  
  inline def apply(): SynchronizationLinkedObjects = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationLinkedObjects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationLinkedObjects] (val x: Self) extends AnyVal {
    
    inline def setManager(value: NullableOption[SynchronizationJobSubject]): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    
    inline def setManagerNull: Self = StObject.set(x, "manager", null)
    
    inline def setManagerUndefined: Self = StObject.set(x, "manager", js.undefined)
    
    inline def setMembers(value: NullableOption[js.Array[SynchronizationJobSubject]]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersNull: Self = StObject.set(x, "members", null)
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: SynchronizationJobSubject*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setOwners(value: NullableOption[js.Array[SynchronizationJobSubject]]): Self = StObject.set(x, "owners", value.asInstanceOf[js.Any])
    
    inline def setOwnersNull: Self = StObject.set(x, "owners", null)
    
    inline def setOwnersUndefined: Self = StObject.set(x, "owners", js.undefined)
    
    inline def setOwnersVarargs(value: SynchronizationJobSubject*): Self = StObject.set(x, "owners", js.Array(value*))
  }
}
