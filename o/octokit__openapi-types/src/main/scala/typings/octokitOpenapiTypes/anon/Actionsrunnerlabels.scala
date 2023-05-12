package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionsrunnerlabels extends StObject {
  
  /** @description Accepted */
  var accepted: ContentApplicationjsonRecord
  
  /** @description Response */
  var actions_runner_labels: ContentApplicationjsonLabelsTotalcount
  
  /** @description Response */
  var actions_runner_labels_readonly: ContentApplicationjsonLabelsTotalcount
  
  /** @description Bad Request */
  var bad_request: ContentApplicationscimjson
  
  /** @description Response if there is already a validation run in progress with a different default setup configuration */
  var code_scanning_conflict: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Response if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_read: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_write: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Conflict */
  var conflict: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Forbidden */
  var forbidden: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Forbidden Gist */
  var forbidden_gist: ContentApplicationjsonBlock
  
  /** @description Gone */
  var gone: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Internal Error */
  var internal_error: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Moved permanently */
  var moved_permanently: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Resource not found */
  var not_found: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Unavailable due to service under maintenance. */
  var porter_maintenance: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Requires authentication */
  var requires_authentication: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Service unavailable */
  var service_unavailable: ContentApplicationjsonCodeDocumentationurlMessage
  
  /** @description Temporary Redirect */
  var temporary_redirect: ContentApplicationjsonDocumentationurlMessage
  
  /** @description Validation failed, or the endpoint has been spammed. */
  var validation_failed: ContentApplicationjsonDocumentationurlErrorsMessage
  
  /** @description Validation failed, or the endpoint has been spammed. */
  var validation_failed_simple: ContentApplicationjsonErrorsMessage
}
object Actionsrunnerlabels {
  
  inline def apply(
    accepted: ContentApplicationjsonRecord,
    actions_runner_labels: ContentApplicationjsonLabelsTotalcount,
    actions_runner_labels_readonly: ContentApplicationjsonLabelsTotalcount,
    bad_request: ContentApplicationscimjson,
    code_scanning_conflict: ContentApplicationjsonDocumentationurlMessage,
    code_scanning_forbidden_read: ContentApplicationjsonDocumentationurlMessage,
    code_scanning_forbidden_write: ContentApplicationjsonDocumentationurlMessage,
    conflict: ContentApplicationjsonDocumentationurlMessage,
    forbidden: ContentApplicationjsonDocumentationurlMessage,
    forbidden_gist: ContentApplicationjsonBlock,
    gone: ContentApplicationjsonDocumentationurlMessage,
    internal_error: ContentApplicationjsonDocumentationurlMessage,
    moved_permanently: ContentApplicationjsonDocumentationurlMessage,
    not_found: ContentApplicationjsonDocumentationurlMessage,
    porter_maintenance: ContentApplicationjsonDocumentationurlMessage,
    requires_authentication: ContentApplicationjsonDocumentationurlMessage,
    service_unavailable: ContentApplicationjsonCodeDocumentationurlMessage,
    temporary_redirect: ContentApplicationjsonDocumentationurlMessage,
    validation_failed: ContentApplicationjsonDocumentationurlErrorsMessage,
    validation_failed_simple: ContentApplicationjsonErrorsMessage
  ): Actionsrunnerlabels = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], actions_runner_labels = actions_runner_labels.asInstanceOf[js.Any], actions_runner_labels_readonly = actions_runner_labels_readonly.asInstanceOf[js.Any], bad_request = bad_request.asInstanceOf[js.Any], code_scanning_conflict = code_scanning_conflict.asInstanceOf[js.Any], code_scanning_forbidden_read = code_scanning_forbidden_read.asInstanceOf[js.Any], code_scanning_forbidden_write = code_scanning_forbidden_write.asInstanceOf[js.Any], conflict = conflict.asInstanceOf[js.Any], forbidden = forbidden.asInstanceOf[js.Any], forbidden_gist = forbidden_gist.asInstanceOf[js.Any], gone = gone.asInstanceOf[js.Any], internal_error = internal_error.asInstanceOf[js.Any], moved_permanently = moved_permanently.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], porter_maintenance = porter_maintenance.asInstanceOf[js.Any], requires_authentication = requires_authentication.asInstanceOf[js.Any], service_unavailable = service_unavailable.asInstanceOf[js.Any], temporary_redirect = temporary_redirect.asInstanceOf[js.Any], validation_failed = validation_failed.asInstanceOf[js.Any], validation_failed_simple = validation_failed_simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionsrunnerlabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actionsrunnerlabels] (val x: Self) extends AnyVal {
    
    inline def setAccepted(value: ContentApplicationjsonRecord): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels(value: ContentApplicationjsonLabelsTotalcount): Self = StObject.set(x, "actions_runner_labels", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels_readonly(value: ContentApplicationjsonLabelsTotalcount): Self = StObject.set(x, "actions_runner_labels_readonly", value.asInstanceOf[js.Any])
    
    inline def setBad_request(value: ContentApplicationscimjson): Self = StObject.set(x, "bad_request", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_conflict(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "code_scanning_conflict", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_read(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "code_scanning_forbidden_read", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_write(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "code_scanning_forbidden_write", value.asInstanceOf[js.Any])
    
    inline def setConflict(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    inline def setForbidden(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    inline def setForbidden_gist(value: ContentApplicationjsonBlock): Self = StObject.set(x, "forbidden_gist", value.asInstanceOf[js.Any])
    
    inline def setGone(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "gone", value.asInstanceOf[js.Any])
    
    inline def setInternal_error(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "internal_error", value.asInstanceOf[js.Any])
    
    inline def setMoved_permanently(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "moved_permanently", value.asInstanceOf[js.Any])
    
    inline def setNot_found(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "not_found", value.asInstanceOf[js.Any])
    
    inline def setPorter_maintenance(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "porter_maintenance", value.asInstanceOf[js.Any])
    
    inline def setRequires_authentication(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "requires_authentication", value.asInstanceOf[js.Any])
    
    inline def setService_unavailable(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "service_unavailable", value.asInstanceOf[js.Any])
    
    inline def setTemporary_redirect(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "temporary_redirect", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed(value: ContentApplicationjsonDocumentationurlErrorsMessage): Self = StObject.set(x, "validation_failed", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed_simple(value: ContentApplicationjsonErrorsMessage): Self = StObject.set(x, "validation_failed_simple", value.asInstanceOf[js.Any])
  }
}
