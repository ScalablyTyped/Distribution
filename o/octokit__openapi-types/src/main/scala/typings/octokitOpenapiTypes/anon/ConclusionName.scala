package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConclusionName extends StObject {
  
  var completed_at: String | Null
  
  var conclusion: String | Null
  
  var name: String
  
  var number: Double
  
  var started_at: String | Null
  
  /** @enum {string} */
  var status: in_progress | completed | pending | queued_
}
object ConclusionName {
  
  inline def apply(name: String, number: Double, status: in_progress | completed | pending | queued_): ConclusionName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], completed_at = null, conclusion = null, started_at = null)
    __obj.asInstanceOf[ConclusionName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConclusionName] (val x: Self) extends AnyVal {
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStarted_atNull: Self = StObject.set(x, "started_at", null)
    
    inline def setStatus(value: in_progress | completed | pending | queued_): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
