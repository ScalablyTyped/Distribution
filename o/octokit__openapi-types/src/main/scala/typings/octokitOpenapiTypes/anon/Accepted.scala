package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accepted extends StObject {
  
  /** Accepted */
  var accepted: Content4
  
  /** Response */
  var actions_runner_labels: ContentApplicationjsonLabels
  
  /** Response */
  var actions_runner_labels_readonly: ContentApplicationjsonLabels
  
  /** Bad Request */
  var bad_request: ContentApplicationscimjson
  
  /** Response if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_read: ContentApplicationjson
  
  /** Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_write: ContentApplicationjson
  
  /** Conflict */
  var conflict: ContentApplicationjson
  
  /** Forbidden */
  var forbidden: ContentApplicationjson
  
  /** Forbidden Gist */
  var forbidden_gist: ContentApplicationjsonBlock
  
  /** Found */
  var found: Any
  
  /** Gone */
  var gone: ContentApplicationjson
  
  /** Internal Error */
  var internal_error: ContentApplicationjson
  
  /** Moved permanently */
  var moved_permanently: ContentApplicationjson
  
  /** A header with no content is returned. */
  var no_content: Any
  
  /** Resource not found */
  var not_found: ContentApplicationjson
  
  /** Not modified */
  var not_modified: Any
  
  /** Requires authentication */
  var requires_authentication: ContentApplicationjson
  
  /** Service unavailable */
  var service_unavailable: ContentApplicationjsonCodeDocumentationurl
  
  /** Temporary Redirect */
  var temporary_redirect: ContentApplicationjson
  
  /** Validation failed, or the endpoint has been spammed. */
  var validation_failed: ContentApplicationjsonMessage
  
  /** Validation failed, or the endpoint has been spammed. */
  var validation_failed_simple: ContentApplicationjsonErrors
}
object Accepted {
  
  inline def apply(
    accepted: Content4,
    actions_runner_labels: ContentApplicationjsonLabels,
    actions_runner_labels_readonly: ContentApplicationjsonLabels,
    bad_request: ContentApplicationscimjson,
    code_scanning_forbidden_read: ContentApplicationjson,
    code_scanning_forbidden_write: ContentApplicationjson,
    conflict: ContentApplicationjson,
    forbidden: ContentApplicationjson,
    forbidden_gist: ContentApplicationjsonBlock,
    found: Any,
    gone: ContentApplicationjson,
    internal_error: ContentApplicationjson,
    moved_permanently: ContentApplicationjson,
    no_content: Any,
    not_found: ContentApplicationjson,
    not_modified: Any,
    requires_authentication: ContentApplicationjson,
    service_unavailable: ContentApplicationjsonCodeDocumentationurl,
    temporary_redirect: ContentApplicationjson,
    validation_failed: ContentApplicationjsonMessage,
    validation_failed_simple: ContentApplicationjsonErrors
  ): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], actions_runner_labels = actions_runner_labels.asInstanceOf[js.Any], actions_runner_labels_readonly = actions_runner_labels_readonly.asInstanceOf[js.Any], bad_request = bad_request.asInstanceOf[js.Any], code_scanning_forbidden_read = code_scanning_forbidden_read.asInstanceOf[js.Any], code_scanning_forbidden_write = code_scanning_forbidden_write.asInstanceOf[js.Any], conflict = conflict.asInstanceOf[js.Any], forbidden = forbidden.asInstanceOf[js.Any], forbidden_gist = forbidden_gist.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], gone = gone.asInstanceOf[js.Any], internal_error = internal_error.asInstanceOf[js.Any], moved_permanently = moved_permanently.asInstanceOf[js.Any], no_content = no_content.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], not_modified = not_modified.asInstanceOf[js.Any], requires_authentication = requires_authentication.asInstanceOf[js.Any], service_unavailable = service_unavailable.asInstanceOf[js.Any], temporary_redirect = temporary_redirect.asInstanceOf[js.Any], validation_failed = validation_failed.asInstanceOf[js.Any], validation_failed_simple = validation_failed_simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  
  extension [Self <: Accepted](x: Self) {
    
    inline def setAccepted(value: Content4): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels(value: ContentApplicationjsonLabels): Self = StObject.set(x, "actions_runner_labels", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels_readonly(value: ContentApplicationjsonLabels): Self = StObject.set(x, "actions_runner_labels_readonly", value.asInstanceOf[js.Any])
    
    inline def setBad_request(value: ContentApplicationscimjson): Self = StObject.set(x, "bad_request", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_read(value: ContentApplicationjson): Self = StObject.set(x, "code_scanning_forbidden_read", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_write(value: ContentApplicationjson): Self = StObject.set(x, "code_scanning_forbidden_write", value.asInstanceOf[js.Any])
    
    inline def setConflict(value: ContentApplicationjson): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    inline def setForbidden(value: ContentApplicationjson): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    inline def setForbidden_gist(value: ContentApplicationjsonBlock): Self = StObject.set(x, "forbidden_gist", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Any): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setGone(value: ContentApplicationjson): Self = StObject.set(x, "gone", value.asInstanceOf[js.Any])
    
    inline def setInternal_error(value: ContentApplicationjson): Self = StObject.set(x, "internal_error", value.asInstanceOf[js.Any])
    
    inline def setMoved_permanently(value: ContentApplicationjson): Self = StObject.set(x, "moved_permanently", value.asInstanceOf[js.Any])
    
    inline def setNo_content(value: Any): Self = StObject.set(x, "no_content", value.asInstanceOf[js.Any])
    
    inline def setNot_found(value: ContentApplicationjson): Self = StObject.set(x, "not_found", value.asInstanceOf[js.Any])
    
    inline def setNot_modified(value: Any): Self = StObject.set(x, "not_modified", value.asInstanceOf[js.Any])
    
    inline def setRequires_authentication(value: ContentApplicationjson): Self = StObject.set(x, "requires_authentication", value.asInstanceOf[js.Any])
    
    inline def setService_unavailable(value: ContentApplicationjsonCodeDocumentationurl): Self = StObject.set(x, "service_unavailable", value.asInstanceOf[js.Any])
    
    inline def setTemporary_redirect(value: ContentApplicationjson): Self = StObject.set(x, "temporary_redirect", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed(value: ContentApplicationjsonMessage): Self = StObject.set(x, "validation_failed", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed_simple(value: ContentApplicationjsonErrors): Self = StObject.set(x, "validation_failed_simple", value.asInstanceOf[js.Any])
  }
}
