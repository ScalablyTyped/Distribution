package typings.parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSGlobal("ErrorCode")
@js.native
object ErrorCode extends js.Object {
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
  
  /* 208 */ val ACCOUNT_ALREADY_LINKED: typings.parse.ErrorCode.ACCOUNT_ALREADY_LINKED with Double = js.native
  /* 600 */ val AGGREGATE_ERROR: typings.parse.ErrorCode.AGGREGATE_ERROR with Double = js.native
  /* 120 */ val CACHE_MISS: typings.parse.ErrorCode.CACHE_MISS with Double = js.native
  /* 108 */ val COMMAND_UNAVAILABLE: typings.parse.ErrorCode.COMMAND_UNAVAILABLE with Double = js.native
  /* 100 */ val CONNECTION_FAILED: typings.parse.ErrorCode.CONNECTION_FAILED with Double = js.native
  /* 137 */ val DUPLICATE_VALUE: typings.parse.ErrorCode.DUPLICATE_VALUE with Double = js.native
  /* 204 */ val EMAIL_MISSING: typings.parse.ErrorCode.EMAIL_MISSING with Double = js.native
  /* 205 */ val EMAIL_NOT_FOUND: typings.parse.ErrorCode.EMAIL_NOT_FOUND with Double = js.native
  /* 203 */ val EMAIL_TAKEN: typings.parse.ErrorCode.EMAIL_TAKEN with Double = js.native
  /* 140 */ val EXCEEDED_QUOTA: typings.parse.ErrorCode.EXCEEDED_QUOTA with Double = js.native
  /* 153 */ val FILE_DELETE_ERROR: typings.parse.ErrorCode.FILE_DELETE_ERROR with Double = js.native
  /* 601 */ val FILE_READ_ERROR: typings.parse.ErrorCode.FILE_READ_ERROR with Double = js.native
  /* 130 */ val FILE_SAVE_ERROR: typings.parse.ErrorCode.FILE_SAVE_ERROR with Double = js.native
  /* 129 */ val FILE_TOO_LARGE: typings.parse.ErrorCode.FILE_TOO_LARGE with Double = js.native
  /* 111 */ val INCORRECT_TYPE: typings.parse.ErrorCode.INCORRECT_TYPE with Double = js.native
  /* 1 */ val INTERNAL_SERVER_ERROR: typings.parse.ErrorCode.INTERNAL_SERVER_ERROR with Double = js.native
  /* 123 */ val INVALID_ACL: typings.parse.ErrorCode.INVALID_ACL with Double = js.native
  /* 112 */ val INVALID_CHANNEL_NAME: typings.parse.ErrorCode.INVALID_CHANNEL_NAME with Double = js.native
  /* 103 */ val INVALID_CLASS_NAME: typings.parse.ErrorCode.INVALID_CLASS_NAME with Double = js.native
  /* 128 */ val INVALID_CONTENT_LENGTH: typings.parse.ErrorCode.INVALID_CONTENT_LENGTH with Double = js.native
  /* 125 */ val INVALID_EMAIL_ADDRESS: typings.parse.ErrorCode.INVALID_EMAIL_ADDRESS with Double = js.native
  /* 160 */ val INVALID_EVENT_NAME: typings.parse.ErrorCode.INVALID_EVENT_NAME with Double = js.native
  /* 122 */ val INVALID_FILE_NAME: typings.parse.ErrorCode.INVALID_FILE_NAME with Double = js.native
  /* 150 */ val INVALID_IMAGE_DATA: typings.parse.ErrorCode.INVALID_IMAGE_DATA with Double = js.native
  /* 107 */ val INVALID_JSON: typings.parse.ErrorCode.INVALID_JSON with Double = js.native
  /* 105 */ val INVALID_KEY_NAME: typings.parse.ErrorCode.INVALID_KEY_NAME with Double = js.native
  /* 251 */ val INVALID_LINKED_SESSION: typings.parse.ErrorCode.INVALID_LINKED_SESSION with Double = js.native
  /* 121 */ val INVALID_NESTED_KEY: typings.parse.ErrorCode.INVALID_NESTED_KEY with Double = js.native
  /* 106 */ val INVALID_POINTER: typings.parse.ErrorCode.INVALID_POINTER with Double = js.native
  /* 152 */ val INVALID_PUSH_TIME_ERROR: typings.parse.ErrorCode.INVALID_PUSH_TIME_ERROR with Double = js.native
  /* 102 */ val INVALID_QUERY: typings.parse.ErrorCode.INVALID_QUERY with Double = js.native
  /* 139 */ val INVALID_ROLE_NAME: typings.parse.ErrorCode.INVALID_ROLE_NAME with Double = js.native
  /* 209 */ val INVALID_SESSION_TOKEN: typings.parse.ErrorCode.INVALID_SESSION_TOKEN with Double = js.native
  /* 250 */ val LINKED_ID_MISSING: typings.parse.ErrorCode.LINKED_ID_MISSING with Double = js.native
  /* 127 */ val MISSING_CONTENT_LENGTH: typings.parse.ErrorCode.MISSING_CONTENT_LENGTH with Double = js.native
  /* 126 */ val MISSING_CONTENT_TYPE: typings.parse.ErrorCode.MISSING_CONTENT_TYPE with Double = js.native
  /* 104 */ val MISSING_OBJECT_ID: typings.parse.ErrorCode.MISSING_OBJECT_ID with Double = js.native
  /* 207 */ val MUST_CREATE_USER_THROUGH_SIGNUP: typings.parse.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP with Double = js.native
  /* 109 */ val NOT_INITIALIZED: typings.parse.ErrorCode.NOT_INITIALIZED with Double = js.native
  /* 101 */ val OBJECT_NOT_FOUND: typings.parse.ErrorCode.OBJECT_NOT_FOUND with Double = js.native
  /* 116 */ val OBJECT_TOO_LARGE: typings.parse.ErrorCode.OBJECT_TOO_LARGE with Double = js.native
  /* 119 */ val OPERATION_FORBIDDEN: typings.parse.ErrorCode.OPERATION_FORBIDDEN with Double = js.native
  /* -1 */ val OTHER_CAUSE: typings.parse.ErrorCode.OTHER_CAUSE with Double = js.native
  /* 201 */ val PASSWORD_MISSING: typings.parse.ErrorCode.PASSWORD_MISSING with Double = js.native
  /* 115 */ val PUSH_MISCONFIGURED: typings.parse.ErrorCode.PUSH_MISCONFIGURED with Double = js.native
  /* 155 */ val REQUEST_LIMIT_EXCEEDED: typings.parse.ErrorCode.REQUEST_LIMIT_EXCEEDED with Double = js.native
  /* 141 */ val SCRIPT_FAILED: typings.parse.ErrorCode.SCRIPT_FAILED with Double = js.native
  /* 206 */ val SESSION_MISSING: typings.parse.ErrorCode.SESSION_MISSING with Double = js.native
  /* 124 */ val TIMEOUT: typings.parse.ErrorCode.TIMEOUT with Double = js.native
  /* 151 */ val UNSAVED_FILE_ERROR: typings.parse.ErrorCode.UNSAVED_FILE_ERROR with Double = js.native
  /* 252 */ val UNSUPPORTED_SERVICE: typings.parse.ErrorCode.UNSUPPORTED_SERVICE with Double = js.native
  /* 200 */ val USERNAME_MISSING: typings.parse.ErrorCode.USERNAME_MISSING with Double = js.native
  /* 202 */ val USERNAME_TAKEN: typings.parse.ErrorCode.USERNAME_TAKEN with Double = js.native
  /* 142 */ val VALIDATION_ERROR: typings.parse.ErrorCode.VALIDATION_ERROR with Double = js.native
  /* 602 */ val X_DOMAIN_REQUEST: typings.parse.ErrorCode.X_DOMAIN_REQUEST with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
}

