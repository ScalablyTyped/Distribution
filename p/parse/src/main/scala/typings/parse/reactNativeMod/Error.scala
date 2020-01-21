package typings.parse.reactNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", "Error")
@js.native
class Error protected ()
  extends typings.parse.mod.Error {
  def this(code: typings.parse.mod.ErrorCode, message: String) = this()
}

/* static members */
@JSImport("parse/react-native", "Error")
@js.native
object Error extends js.Object {
  var ACCOUNT_ALREADY_LINKED: typings.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  var AGGREGATE_ERROR: typings.parse.mod.ErrorCode.AGGREGATE_ERROR = js.native
  var CACHE_MISS: typings.parse.mod.ErrorCode.CACHE_MISS = js.native
  var COMMAND_UNAVAILABLE: typings.parse.mod.ErrorCode.COMMAND_UNAVAILABLE = js.native
  var CONNECTION_FAILED: typings.parse.mod.ErrorCode.CONNECTION_FAILED = js.native
  var DUPLICATE_VALUE: typings.parse.mod.ErrorCode.DUPLICATE_VALUE = js.native
  var EMAIL_MISSING: typings.parse.mod.ErrorCode.EMAIL_MISSING = js.native
  var EMAIL_NOT_FOUND: typings.parse.mod.ErrorCode.EMAIL_NOT_FOUND = js.native
  var EMAIL_TAKEN: typings.parse.mod.ErrorCode.EMAIL_TAKEN = js.native
  var EXCEEDED_QUOTA: typings.parse.mod.ErrorCode.EXCEEDED_QUOTA = js.native
  var FILE_DELETE_ERROR: typings.parse.mod.ErrorCode.FILE_DELETE_ERROR = js.native
  var FILE_READ_ERROR: typings.parse.mod.ErrorCode.FILE_READ_ERROR = js.native
  var FILE_SAVE_ERROR: typings.parse.mod.ErrorCode.FILE_SAVE_ERROR = js.native
  var FILE_TOO_LARGE: typings.parse.mod.ErrorCode.FILE_TOO_LARGE = js.native
  var INCORRECT_TYPE: typings.parse.mod.ErrorCode.INCORRECT_TYPE = js.native
  var INTERNAL_SERVER_ERROR: typings.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  var INVALID_ACL: typings.parse.mod.ErrorCode.INVALID_ACL = js.native
  var INVALID_CHANNEL_NAME: typings.parse.mod.ErrorCode.INVALID_CHANNEL_NAME = js.native
  var INVALID_CLASS_NAME: typings.parse.mod.ErrorCode.INVALID_CLASS_NAME = js.native
  var INVALID_CONTENT_LENGTH: typings.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  var INVALID_EMAIL_ADDRESS: typings.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  var INVALID_EVENT_NAME: typings.parse.mod.ErrorCode.INVALID_EVENT_NAME = js.native
  var INVALID_FILE_NAME: typings.parse.mod.ErrorCode.INVALID_FILE_NAME = js.native
  var INVALID_IMAGE_DATA: typings.parse.mod.ErrorCode.INVALID_IMAGE_DATA = js.native
  var INVALID_JSON: typings.parse.mod.ErrorCode.INVALID_JSON = js.native
  var INVALID_KEY_NAME: typings.parse.mod.ErrorCode.INVALID_KEY_NAME = js.native
  var INVALID_LINKED_SESSION: typings.parse.mod.ErrorCode.INVALID_LINKED_SESSION = js.native
  var INVALID_NESTED_KEY: typings.parse.mod.ErrorCode.INVALID_NESTED_KEY = js.native
  var INVALID_POINTER: typings.parse.mod.ErrorCode.INVALID_POINTER = js.native
  var INVALID_PUSH_TIME_ERROR: typings.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  var INVALID_QUERY: typings.parse.mod.ErrorCode.INVALID_QUERY = js.native
  var INVALID_ROLE_NAME: typings.parse.mod.ErrorCode.INVALID_ROLE_NAME = js.native
  var INVALID_SESSION_TOKEN: typings.parse.mod.ErrorCode.INVALID_SESSION_TOKEN = js.native
  var LINKED_ID_MISSING: typings.parse.mod.ErrorCode.LINKED_ID_MISSING = js.native
  var MISSING_CONTENT_LENGTH: typings.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  var MISSING_CONTENT_TYPE: typings.parse.mod.ErrorCode.MISSING_CONTENT_TYPE = js.native
  var MISSING_OBJECT_ID: typings.parse.mod.ErrorCode.MISSING_OBJECT_ID = js.native
  var MUST_CREATE_USER_THROUGH_SIGNUP: typings.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  var NOT_INITIALIZED: typings.parse.mod.ErrorCode.NOT_INITIALIZED = js.native
  var OBJECT_NOT_FOUND: typings.parse.mod.ErrorCode.OBJECT_NOT_FOUND = js.native
  var OBJECT_TOO_LARGE: typings.parse.mod.ErrorCode.OBJECT_TOO_LARGE = js.native
  var OPERATION_FORBIDDEN: typings.parse.mod.ErrorCode.OPERATION_FORBIDDEN = js.native
  var OTHER_CAUSE: typings.parse.mod.ErrorCode.OTHER_CAUSE = js.native
  var PASSWORD_MISSING: typings.parse.mod.ErrorCode.PASSWORD_MISSING = js.native
  var PUSH_MISCONFIGURED: typings.parse.mod.ErrorCode.PUSH_MISCONFIGURED = js.native
  var REQUEST_LIMIT_EXCEEDED: typings.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  var SCRIPT_FAILED: typings.parse.mod.ErrorCode.SCRIPT_FAILED = js.native
  var SESSION_MISSING: typings.parse.mod.ErrorCode.SESSION_MISSING = js.native
  var TIMEOUT: typings.parse.mod.ErrorCode.TIMEOUT = js.native
  var UNSAVED_FILE_ERROR: typings.parse.mod.ErrorCode.UNSAVED_FILE_ERROR = js.native
  var UNSUPPORTED_SERVICE: typings.parse.mod.ErrorCode.UNSUPPORTED_SERVICE = js.native
  var USERNAME_MISSING: typings.parse.mod.ErrorCode.USERNAME_MISSING = js.native
  var USERNAME_TAKEN: typings.parse.mod.ErrorCode.USERNAME_TAKEN = js.native
  var VALIDATION_ERROR: typings.parse.mod.ErrorCode.VALIDATION_ERROR = js.native
  var X_DOMAIN_REQUEST: typings.parse.mod.ErrorCode.X_DOMAIN_REQUEST = js.native
}

