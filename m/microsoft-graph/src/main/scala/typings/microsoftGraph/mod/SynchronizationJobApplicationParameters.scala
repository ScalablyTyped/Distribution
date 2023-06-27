package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynchronizationJobApplicationParameters extends StObject {
  
  var ruleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var subjects: js.UndefOr[NullableOption[js.Array[SynchronizationJobSubject]]] = js.undefined
}
object SynchronizationJobApplicationParameters {
  
  inline def apply(): SynchronizationJobApplicationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynchronizationJobApplicationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynchronizationJobApplicationParameters] (val x: Self) extends AnyVal {
    
    inline def setRuleId(value: NullableOption[String]): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdNull: Self = StObject.set(x, "ruleId", null)
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setSubjects(value: NullableOption[js.Array[SynchronizationJobSubject]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
    
    inline def setSubjectsNull: Self = StObject.set(x, "subjects", null)
    
    inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
    
    inline def setSubjectsVarargs(value: SynchronizationJobSubject*): Self = StObject.set(x, "subjects", js.Array(value*))
  }
}
