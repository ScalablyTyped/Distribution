package typings.parse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("parse", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @js.native
  sealed trait ACCOUNT_ALREADY_LINKED extends ErrorCode
  
  @js.native
  sealed trait AGGREGATE_ERROR extends ErrorCode
  
  @js.native
  sealed trait CACHE_MISS extends ErrorCode
  
  @js.native
  sealed trait COMMAND_UNAVAILABLE extends ErrorCode
  
  @js.native
  sealed trait CONNECTION_FAILED extends ErrorCode
  
  @js.native
  sealed trait DUPLICATE_VALUE extends ErrorCode
  
  @js.native
  sealed trait EMAIL_MISSING extends ErrorCode
  
  @js.native
  sealed trait EMAIL_NOT_FOUND extends ErrorCode
  
  @js.native
  sealed trait EMAIL_TAKEN extends ErrorCode
  
  @js.native
  sealed trait EXCEEDED_QUOTA extends ErrorCode
  
  @js.native
  sealed trait FILE_DELETE_ERROR extends ErrorCode
  
  @js.native
  sealed trait FILE_READ_ERROR extends ErrorCode
  
  @js.native
  sealed trait FILE_SAVE_ERROR extends ErrorCode
  
  @js.native
  sealed trait FILE_TOO_LARGE extends ErrorCode
  
  @js.native
  sealed trait INCORRECT_TYPE extends ErrorCode
  
  @js.native
  sealed trait INTERNAL_SERVER_ERROR extends ErrorCode
  
  @js.native
  sealed trait INVALID_ACL extends ErrorCode
  
  @js.native
  sealed trait INVALID_CHANNEL_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_CLASS_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_CONTENT_LENGTH extends ErrorCode
  
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS extends ErrorCode
  
  @js.native
  sealed trait INVALID_EVENT_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_FILE_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_IMAGE_DATA extends ErrorCode
  
  @js.native
  sealed trait INVALID_JSON extends ErrorCode
  
  @js.native
  sealed trait INVALID_KEY_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_LINKED_SESSION extends ErrorCode
  
  @js.native
  sealed trait INVALID_NESTED_KEY extends ErrorCode
  
  @js.native
  sealed trait INVALID_POINTER extends ErrorCode
  
  @js.native
  sealed trait INVALID_PUSH_TIME_ERROR extends ErrorCode
  
  @js.native
  sealed trait INVALID_QUERY extends ErrorCode
  
  @js.native
  sealed trait INVALID_ROLE_NAME extends ErrorCode
  
  @js.native
  sealed trait INVALID_SESSION_TOKEN extends ErrorCode
  
  @js.native
  sealed trait LINKED_ID_MISSING extends ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_LENGTH extends ErrorCode
  
  @js.native
  sealed trait MISSING_CONTENT_TYPE extends ErrorCode
  
  @js.native
  sealed trait MISSING_OBJECT_ID extends ErrorCode
  
  @js.native
  sealed trait MUST_CREATE_USER_THROUGH_SIGNUP extends ErrorCode
  
  @js.native
  sealed trait NOT_INITIALIZED extends ErrorCode
  
  @js.native
  sealed trait OBJECT_NOT_FOUND extends ErrorCode
  
  @js.native
  sealed trait OBJECT_TOO_LARGE extends ErrorCode
  
  @js.native
  sealed trait OPERATION_FORBIDDEN extends ErrorCode
  
  @js.native
  sealed trait OTHER_CAUSE extends ErrorCode
  
  @js.native
  sealed trait PASSWORD_MISSING extends ErrorCode
  
  @js.native
  sealed trait PUSH_MISCONFIGURED extends ErrorCode
  
  @js.native
  sealed trait REQUEST_LIMIT_EXCEEDED extends ErrorCode
  
  @js.native
  sealed trait SCRIPT_FAILED extends ErrorCode
  
  @js.native
  sealed trait SESSION_MISSING extends ErrorCode
  
  @js.native
  sealed trait TIMEOUT extends ErrorCode
  
  @js.native
  sealed trait UNSAVED_FILE_ERROR extends ErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_SERVICE extends ErrorCode
  
  @js.native
  sealed trait USERNAME_MISSING extends ErrorCode
  
  @js.native
  sealed trait USERNAME_TAKEN extends ErrorCode
  
  @js.native
  sealed trait VALIDATION_ERROR extends ErrorCode
  
  @js.native
  sealed trait X_DOMAIN_REQUEST extends ErrorCode
}
