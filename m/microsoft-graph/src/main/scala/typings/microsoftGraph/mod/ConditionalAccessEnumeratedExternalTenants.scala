package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalAccessEnumeratedExternalTenants
  extends StObject
     with ConditionalAccessExternalTenants {
  
  var members: js.UndefOr[js.Array[String]] = js.undefined
}
object ConditionalAccessEnumeratedExternalTenants {
  
  inline def apply(): ConditionalAccessEnumeratedExternalTenants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalAccessEnumeratedExternalTenants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalAccessEnumeratedExternalTenants] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
    
    inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
  }
}
