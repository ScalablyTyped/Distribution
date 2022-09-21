package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accepted extends StObject {
  
  /** Accepted */
  var accepted: Content47
  
  /** Response */
  var actions_runner_labels: ContentApplicationjsonLabelsTotalcount
  
  /** Response */
  var actions_runner_labels_readonly: ContentApplicationjsonLabelsTotalcount
  
  /** Bad Request */
  var bad_request: ContentApplicationjsonApplicationscimjson
  
  /** Response if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_read: ContentApplicationjsonDocumentationurlMessage
  
  /** Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_write: ContentApplicationjsonDocumentationurlMessage
  
  /** Conflict */
  var conflict: ContentApplicationjsonDocumentationurlMessage
  
  /** Forbidden */
  var forbidden: ContentApplicationjsonDocumentationurlMessage
  
  /** Forbidden Gist */
  var forbidden_gist: ContentApplicationjsonBlock
  
  /** Found */
  var found: Any
  
  /** Gone */
  var gone: ContentApplicationjsonDocumentationurlMessage
  
  /** Internal Error */
  var internal_error: ContentApplicationjsonDocumentationurlMessage
  
  /** Moved permanently */
  var moved_permanently: ContentApplicationjsonDocumentationurlMessage
  
  /** A header with no content is returned. */
  var no_content: Any
  
  /** Resource not found */
  var not_found: ContentApplicationjsonDocumentationurlMessage
  
  /** Not modified */
  var not_modified: Any
  
  /** Requires authentication */
  var requires_authentication: ContentApplicationjsonDocumentationurlMessage
  
  /** Bad Request */
  var scim_bad_request: ContentApplicationjsonDetail
  
  /** Conflict */
  var scim_conflict: ContentApplicationjsonDetail
  
  /** Forbidden */
  var scim_forbidden: ContentApplicationjsonDetail
  
  /** Internal Error */
  var scim_internal_error: ContentApplicationjsonDetail
  
  /** Resource not found */
  var scim_not_found: ContentApplicationjsonDetail
  
  /** Too Many Requests */
  var scim_too_many_requests: ContentApplicationjsonDetail
  
  /** Service unavailable */
  var service_unavailable: ContentApplicationjsonCodeDocumentationurlMessage
  
  /** Temporary Redirect */
  var temporary_redirect: ContentApplicationjsonDocumentationurlMessage
  
  /** Validation failed */
  var validation_failed: ContentApplicationjsonDocumentationurlErrorsMessage
  
  /** Validation failed */
  var validation_failed_simple: ContentApplicationjsonErrorsMessage
}
object Accepted {
  
  inline def apply(
    accepted: Content47,
    actions_runner_labels: ContentApplicationjsonLabelsTotalcount,
    actions_runner_labels_readonly: ContentApplicationjsonLabelsTotalcount,
    bad_request: ContentApplicationjsonApplicationscimjson,
    code_scanning_forbidden_read: ContentApplicationjsonDocumentationurlMessage,
    code_scanning_forbidden_write: ContentApplicationjsonDocumentationurlMessage,
    conflict: ContentApplicationjsonDocumentationurlMessage,
    forbidden: ContentApplicationjsonDocumentationurlMessage,
    forbidden_gist: ContentApplicationjsonBlock,
    found: Any,
    gone: ContentApplicationjsonDocumentationurlMessage,
    internal_error: ContentApplicationjsonDocumentationurlMessage,
    moved_permanently: ContentApplicationjsonDocumentationurlMessage,
    no_content: Any,
    not_found: ContentApplicationjsonDocumentationurlMessage,
    not_modified: Any,
    requires_authentication: ContentApplicationjsonDocumentationurlMessage,
    scim_bad_request: ContentApplicationjsonDetail,
    scim_conflict: ContentApplicationjsonDetail,
    scim_forbidden: ContentApplicationjsonDetail,
    scim_internal_error: ContentApplicationjsonDetail,
    scim_not_found: ContentApplicationjsonDetail,
    scim_too_many_requests: ContentApplicationjsonDetail,
    service_unavailable: ContentApplicationjsonCodeDocumentationurlMessage,
    temporary_redirect: ContentApplicationjsonDocumentationurlMessage,
    validation_failed: ContentApplicationjsonDocumentationurlErrorsMessage,
    validation_failed_simple: ContentApplicationjsonErrorsMessage
  ): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], actions_runner_labels = actions_runner_labels.asInstanceOf[js.Any], actions_runner_labels_readonly = actions_runner_labels_readonly.asInstanceOf[js.Any], bad_request = bad_request.asInstanceOf[js.Any], code_scanning_forbidden_read = code_scanning_forbidden_read.asInstanceOf[js.Any], code_scanning_forbidden_write = code_scanning_forbidden_write.asInstanceOf[js.Any], conflict = conflict.asInstanceOf[js.Any], forbidden = forbidden.asInstanceOf[js.Any], forbidden_gist = forbidden_gist.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], gone = gone.asInstanceOf[js.Any], internal_error = internal_error.asInstanceOf[js.Any], moved_permanently = moved_permanently.asInstanceOf[js.Any], no_content = no_content.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], not_modified = not_modified.asInstanceOf[js.Any], requires_authentication = requires_authentication.asInstanceOf[js.Any], scim_bad_request = scim_bad_request.asInstanceOf[js.Any], scim_conflict = scim_conflict.asInstanceOf[js.Any], scim_forbidden = scim_forbidden.asInstanceOf[js.Any], scim_internal_error = scim_internal_error.asInstanceOf[js.Any], scim_not_found = scim_not_found.asInstanceOf[js.Any], scim_too_many_requests = scim_too_many_requests.asInstanceOf[js.Any], service_unavailable = service_unavailable.asInstanceOf[js.Any], temporary_redirect = temporary_redirect.asInstanceOf[js.Any], validation_failed = validation_failed.asInstanceOf[js.Any], validation_failed_simple = validation_failed_simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  
  extension [Self <: Accepted](x: Self) {
    
    inline def setAccepted(value: Content47): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels(value: ContentApplicationjsonLabelsTotalcount): Self = StObject.set(x, "actions_runner_labels", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels_readonly(value: ContentApplicationjsonLabelsTotalcount): Self = StObject.set(x, "actions_runner_labels_readonly", value.asInstanceOf[js.Any])
    
    inline def setBad_request(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "bad_request", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_read(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "code_scanning_forbidden_read", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_write(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "code_scanning_forbidden_write", value.asInstanceOf[js.Any])
    
    inline def setConflict(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    inline def setForbidden(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    inline def setForbidden_gist(value: ContentApplicationjsonBlock): Self = StObject.set(x, "forbidden_gist", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Any): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setGone(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "gone", value.asInstanceOf[js.Any])
    
    inline def setInternal_error(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "internal_error", value.asInstanceOf[js.Any])
    
    inline def setMoved_permanently(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "moved_permanently", value.asInstanceOf[js.Any])
    
    inline def setNo_content(value: Any): Self = StObject.set(x, "no_content", value.asInstanceOf[js.Any])
    
    inline def setNot_found(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "not_found", value.asInstanceOf[js.Any])
    
    inline def setNot_modified(value: Any): Self = StObject.set(x, "not_modified", value.asInstanceOf[js.Any])
    
    inline def setRequires_authentication(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "requires_authentication", value.asInstanceOf[js.Any])
    
    inline def setScim_bad_request(value: ContentApplicationjsonDetail): Self = StObject.set(x, "scim_bad_request", value.asInstanceOf[js.Any])
    
    inline def setScim_conflict(value: ContentApplicationjsonDetail): Self = StObject.set(x, "scim_conflict", value.asInstanceOf[js.Any])
    
    inline def setScim_forbidden(value: ContentApplicationjsonDetail): Self = StObject.set(x, "scim_forbidden", value.asInstanceOf[js.Any])
    
    inline def setScim_internal_error(value: ContentApplicationjsonDetail): Self = StObject.set(x, "scim_internal_error", value.asInstanceOf[js.Any])
    
    inline def setScim_not_found(value: ContentApplicationjsonDetail): Self = StObject.set(x, "scim_not_found", value.asInstanceOf[js.Any])
    
    inline def setScim_too_many_requests(value: ContentApplicationjsonDetail): Self = StObject.set(x, "scim_too_many_requests", value.asInstanceOf[js.Any])
    
    inline def setService_unavailable(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "service_unavailable", value.asInstanceOf[js.Any])
    
    inline def setTemporary_redirect(value: ContentApplicationjsonDocumentationurlMessage): Self = StObject.set(x, "temporary_redirect", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed(value: ContentApplicationjsonDocumentationurlErrorsMessage): Self = StObject.set(x, "validation_failed", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed_simple(value: ContentApplicationjsonErrorsMessage): Self = StObject.set(x, "validation_failed_simple", value.asInstanceOf[js.Any])
  }
}
