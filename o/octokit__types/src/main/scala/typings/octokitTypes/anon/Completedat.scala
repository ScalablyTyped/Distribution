package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Completedat extends StObject {
  
  var completed_at: String
  
  var conclusion: String
  
  var name: String
  
  var number: Double
  
  var started_at: String
  
  var status: String
}
object Completedat {
  
  @scala.inline
  def apply(
    completed_at: String,
    conclusion: String,
    name: String,
    number: Double,
    started_at: String,
    status: String
  ): Completedat = {
    val __obj = js.Dynamic.literal(completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Completedat]
  }
  
  @scala.inline
  implicit class CompletedatMutableBuilder[Self <: Completedat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted_at(value: String): Self = StObject.set(x, "completed_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConclusion(value: String): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted_at(value: String): Self = StObject.set(x, "started_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
