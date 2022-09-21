package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentusercanapprove extends StObject {
  
  /**
    * @description Whether the currently authenticated user can approve the deployment
    * @example true
    */
  var current_user_can_approve: Boolean
  
  var environment: HtmlurlId
  
  /** @description The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed. */
  var reviewers: js.Array[Reviewer]
  
  /**
    * @description The set duration of the wait timer
    * @example 30
    */
  var wait_timer: Double
  
  /**
    * Format: date-time
    * @description The time that the wait timer began.
    * @example 2020-11-23T22:00:40Z
    */
  var wait_timer_started_at: String | Null
}
object Currentusercanapprove {
  
  inline def apply(
    current_user_can_approve: Boolean,
    environment: HtmlurlId,
    reviewers: js.Array[Reviewer],
    wait_timer: Double
  ): Currentusercanapprove = {
    val __obj = js.Dynamic.literal(current_user_can_approve = current_user_can_approve.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], reviewers = reviewers.asInstanceOf[js.Any], wait_timer = wait_timer.asInstanceOf[js.Any], wait_timer_started_at = null)
    __obj.asInstanceOf[Currentusercanapprove]
  }
  
  extension [Self <: Currentusercanapprove](x: Self) {
    
    inline def setCurrent_user_can_approve(value: Boolean): Self = StObject.set(x, "current_user_can_approve", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: HtmlurlId): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setReviewers(value: js.Array[Reviewer]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersVarargs(value: Reviewer*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setWait_timer(value: Double): Self = StObject.set(x, "wait_timer", value.asInstanceOf[js.Any])
    
    inline def setWait_timer_started_at(value: String): Self = StObject.set(x, "wait_timer_started_at", value.asInstanceOf[js.Any])
    
    inline def setWait_timer_started_atNull: Self = StObject.set(x, "wait_timer_started_at", null)
  }
}
