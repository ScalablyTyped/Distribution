package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.completed
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.in_progress
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.queued_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Startedat extends StObject {
  
  /**
    * Format: date-time
    * @description The time that the job finished, in ISO 8601 format.
    * @example 2019-08-08T08:00:00-07:00
    */
  var completed_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The outcome of the job.
    * @example success
    */
  var conclusion: String | Null
  
  /**
    * @description The name of the job.
    * @example test-coverage
    */
  var name: String
  
  /** @example 1 */
  var number: Double
  
  /**
    * Format: date-time
    * @description The time that the step started, in ISO 8601 format.
    * @example 2019-08-08T08:00:00-07:00
    */
  var started_at: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The phase of the lifecycle that the job is currently in.
    * @example queued
    * @enum {string}
    */
  var status: queued_ | in_progress | completed
}
object Startedat {
  
  inline def apply(name: String, number: Double, status: queued_ | in_progress | completed): Startedat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], conclusion = null)
    __obj.asInstanceOf[Startedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Startedat] (val x: Self) extends AnyVal {
    
    inline def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    inline def setCompleted_atNull: Self = StObject.set(x, "completed_at", null)
    
    inline def setCompleted_atUndefined: Self = StObject.set(x, "completed_at", js.undefined)
    
    inline def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    inline def setConclusionNull: Self = StObject.set(x, "conclusion", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    inline def setStarted_atNull: Self = StObject.set(x, "started_at", null)
    
    inline def setStarted_atUndefined: Self = StObject.set(x, "started_at", js.undefined)
    
    inline def setStatus(value: queued_ | in_progress | completed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
