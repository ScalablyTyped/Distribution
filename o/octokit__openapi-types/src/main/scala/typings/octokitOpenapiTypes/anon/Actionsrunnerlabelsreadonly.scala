package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actionsrunnerlabelsreadonly extends StObject {
  
  /** @description Accepted */
  var accepted: ContentApplicationjsonRecord
  
  /** @description Response */
  var actions_runner_labels: ContentApplicationjsonLabelsArray
  
  /** @description Response */
  var actions_runner_labels_readonly: ContentApplicationjsonLabelsArray
  
  /** @description Bad Request */
  var bad_request: ContentApplicationjsonApplicationscimjson
  
  /** @description Response if there is already a validation run in progress with a different default setup configuration */
  var code_scanning_conflict: Content36
  
  /** @description Response if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_read: Content36
  
  /** @description Response if the repository is archived or if GitHub Advanced Security is not enabled for this repository */
  var code_scanning_forbidden_write: Content36
  
  /** @description Conflict */
  var conflict: Content36
  
  /** @description Forbidden */
  var forbidden: Content36
  
  /** @description Forbidden Gist */
  var forbidden_gist: ContentApplicationjsonBlock
  
  /** @description Gone */
  var gone: Content36
  
  /** @description Internal Error */
  var internal_error: Content36
  
  /** @description Moved permanently */
  var moved_permanently: Content36
  
  /** @description Resource not found */
  var not_found: Content36
  
  /** @description Unavailable due to service under maintenance. */
  var porter_maintenance: Content36
  
  /** @description Requires authentication */
  var requires_authentication: Content36
  
  /** @description Service unavailable */
  var service_unavailable: ContentApplicationjsonCodeDocumentationurlMessage
  
  /** @description Temporary Redirect */
  var temporary_redirect: Content36
  
  /** @description Validation failed, or the endpoint has been spammed. */
  var validation_failed: Content346
  
  /** @description Validation failed, or the endpoint has been spammed. */
  var validation_failed_simple: Content471
}
object Actionsrunnerlabelsreadonly {
  
  inline def apply(
    accepted: ContentApplicationjsonRecord,
    actions_runner_labels: ContentApplicationjsonLabelsArray,
    actions_runner_labels_readonly: ContentApplicationjsonLabelsArray,
    bad_request: ContentApplicationjsonApplicationscimjson,
    code_scanning_conflict: Content36,
    code_scanning_forbidden_read: Content36,
    code_scanning_forbidden_write: Content36,
    conflict: Content36,
    forbidden: Content36,
    forbidden_gist: ContentApplicationjsonBlock,
    gone: Content36,
    internal_error: Content36,
    moved_permanently: Content36,
    not_found: Content36,
    porter_maintenance: Content36,
    requires_authentication: Content36,
    service_unavailable: ContentApplicationjsonCodeDocumentationurlMessage,
    temporary_redirect: Content36,
    validation_failed: Content346,
    validation_failed_simple: Content471
  ): Actionsrunnerlabelsreadonly = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], actions_runner_labels = actions_runner_labels.asInstanceOf[js.Any], actions_runner_labels_readonly = actions_runner_labels_readonly.asInstanceOf[js.Any], bad_request = bad_request.asInstanceOf[js.Any], code_scanning_conflict = code_scanning_conflict.asInstanceOf[js.Any], code_scanning_forbidden_read = code_scanning_forbidden_read.asInstanceOf[js.Any], code_scanning_forbidden_write = code_scanning_forbidden_write.asInstanceOf[js.Any], conflict = conflict.asInstanceOf[js.Any], forbidden = forbidden.asInstanceOf[js.Any], forbidden_gist = forbidden_gist.asInstanceOf[js.Any], gone = gone.asInstanceOf[js.Any], internal_error = internal_error.asInstanceOf[js.Any], moved_permanently = moved_permanently.asInstanceOf[js.Any], not_found = not_found.asInstanceOf[js.Any], porter_maintenance = porter_maintenance.asInstanceOf[js.Any], requires_authentication = requires_authentication.asInstanceOf[js.Any], service_unavailable = service_unavailable.asInstanceOf[js.Any], temporary_redirect = temporary_redirect.asInstanceOf[js.Any], validation_failed = validation_failed.asInstanceOf[js.Any], validation_failed_simple = validation_failed_simple.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actionsrunnerlabelsreadonly]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Actionsrunnerlabelsreadonly] (val x: Self) extends AnyVal {
    
    inline def setAccepted(value: ContentApplicationjsonRecord): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "actions_runner_labels", value.asInstanceOf[js.Any])
    
    inline def setActions_runner_labels_readonly(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "actions_runner_labels_readonly", value.asInstanceOf[js.Any])
    
    inline def setBad_request(value: ContentApplicationjsonApplicationscimjson): Self = StObject.set(x, "bad_request", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_conflict(value: Content36): Self = StObject.set(x, "code_scanning_conflict", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_read(value: Content36): Self = StObject.set(x, "code_scanning_forbidden_read", value.asInstanceOf[js.Any])
    
    inline def setCode_scanning_forbidden_write(value: Content36): Self = StObject.set(x, "code_scanning_forbidden_write", value.asInstanceOf[js.Any])
    
    inline def setConflict(value: Content36): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    inline def setForbidden(value: Content36): Self = StObject.set(x, "forbidden", value.asInstanceOf[js.Any])
    
    inline def setForbidden_gist(value: ContentApplicationjsonBlock): Self = StObject.set(x, "forbidden_gist", value.asInstanceOf[js.Any])
    
    inline def setGone(value: Content36): Self = StObject.set(x, "gone", value.asInstanceOf[js.Any])
    
    inline def setInternal_error(value: Content36): Self = StObject.set(x, "internal_error", value.asInstanceOf[js.Any])
    
    inline def setMoved_permanently(value: Content36): Self = StObject.set(x, "moved_permanently", value.asInstanceOf[js.Any])
    
    inline def setNot_found(value: Content36): Self = StObject.set(x, "not_found", value.asInstanceOf[js.Any])
    
    inline def setPorter_maintenance(value: Content36): Self = StObject.set(x, "porter_maintenance", value.asInstanceOf[js.Any])
    
    inline def setRequires_authentication(value: Content36): Self = StObject.set(x, "requires_authentication", value.asInstanceOf[js.Any])
    
    inline def setService_unavailable(value: ContentApplicationjsonCodeDocumentationurlMessage): Self = StObject.set(x, "service_unavailable", value.asInstanceOf[js.Any])
    
    inline def setTemporary_redirect(value: Content36): Self = StObject.set(x, "temporary_redirect", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed(value: Content346): Self = StObject.set(x, "validation_failed", value.asInstanceOf[js.Any])
    
    inline def setValidation_failed_simple(value: Content471): Self = StObject.set(x, "validation_failed_simple", value.asInstanceOf[js.Any])
  }
}
