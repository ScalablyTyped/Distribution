package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismissstalereviewsonpush extends StObject {
  
  /** @description New, reviewable commits pushed will dismiss previous pull request review approvals. */
  var dismiss_stale_reviews_on_push: Boolean
  
  /** @description Require an approving review in pull requests that modify files that have a designated code owner. */
  var require_code_owner_review: Boolean
  
  /** @description Whether the most recent reviewable push must be approved by someone other than the person who pushed it. */
  var require_last_push_approval: Boolean
  
  /** @description The number of approving reviews that are required before a pull request can be merged. */
  var required_approving_review_count: Double
  
  /** @description All conversations on code must be resolved before a pull request can be merged. */
  var required_review_thread_resolution: Boolean
}
object Dismissstalereviewsonpush {
  
  inline def apply(
    dismiss_stale_reviews_on_push: Boolean,
    require_code_owner_review: Boolean,
    require_last_push_approval: Boolean,
    required_approving_review_count: Double,
    required_review_thread_resolution: Boolean
  ): Dismissstalereviewsonpush = {
    val __obj = js.Dynamic.literal(dismiss_stale_reviews_on_push = dismiss_stale_reviews_on_push.asInstanceOf[js.Any], require_code_owner_review = require_code_owner_review.asInstanceOf[js.Any], require_last_push_approval = require_last_push_approval.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any], required_review_thread_resolution = required_review_thread_resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismissstalereviewsonpush]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dismissstalereviewsonpush] (val x: Self) extends AnyVal {
    
    inline def setDismiss_stale_reviews_on_push(value: Boolean): Self = StObject.set(x, "dismiss_stale_reviews_on_push", value.asInstanceOf[js.Any])
    
    inline def setRequire_code_owner_review(value: Boolean): Self = StObject.set(x, "require_code_owner_review", value.asInstanceOf[js.Any])
    
    inline def setRequire_last_push_approval(value: Boolean): Self = StObject.set(x, "require_last_push_approval", value.asInstanceOf[js.Any])
    
    inline def setRequired_approving_review_count(value: Double): Self = StObject.set(x, "required_approving_review_count", value.asInstanceOf[js.Any])
    
    inline def setRequired_review_thread_resolution(value: Boolean): Self = StObject.set(x, "required_review_thread_resolution", value.asInstanceOf[js.Any])
  }
}
