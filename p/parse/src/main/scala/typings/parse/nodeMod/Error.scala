package typings.parse.nodeMod

import typings.parse.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Error")
@js.native
class Error protected ()
  extends typings.parse.ParseNs.Error {
  def this(code: ErrorCode, message: String) = this()
}

/* static members */
@JSImport("parse/node", "Error")
@js.native
object Error extends js.Object {
  var ACCOUNT_ALREADY_LINKED: typings.parse.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  var AGGREGATE_ERROR: typings.parse.ErrorCode.AGGREGATE_ERROR = js.native
  var CACHE_MISS: typings.parse.ErrorCode.CACHE_MISS = js.native
  var COMMAND_UNAVAILABLE: typings.parse.ErrorCode.COMMAND_UNAVAILABLE = js.native
  var CONNECTION_FAILED: typings.parse.ErrorCode.CONNECTION_FAILED = js.native
  var DUPLICATE_VALUE: typings.parse.ErrorCode.DUPLICATE_VALUE = js.native
  var EMAIL_MISSING: typings.parse.ErrorCode.EMAIL_MISSING = js.native
  var EMAIL_NOT_FOUND: typings.parse.ErrorCode.EMAIL_NOT_FOUND = js.native
  var EMAIL_TAKEN: typings.parse.ErrorCode.EMAIL_TAKEN = js.native
  var EXCEEDED_QUOTA: typings.parse.ErrorCode.EXCEEDED_QUOTA = js.native
  var FILE_DELETE_ERROR: typings.parse.ErrorCode.FILE_DELETE_ERROR = js.native
  var FILE_READ_ERROR: typings.parse.ErrorCode.FILE_READ_ERROR = js.native
  var FILE_SAVE_ERROR: typings.parse.ErrorCode.FILE_SAVE_ERROR = js.native
  var FILE_TOO_LARGE: typings.parse.ErrorCode.FILE_TOO_LARGE = js.native
  var INCORRECT_TYPE: typings.parse.ErrorCode.INCORRECT_TYPE = js.native
  var INTERNAL_SERVER_ERROR: typings.parse.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  var INVALID_ACL: typings.parse.ErrorCode.INVALID_ACL = js.native
  var INVALID_CHANNEL_NAME: typings.parse.ErrorCode.INVALID_CHANNEL_NAME = js.native
  var INVALID_CLASS_NAME: typings.parse.ErrorCode.INVALID_CLASS_NAME = js.native
  var INVALID_CONTENT_LENGTH: typings.parse.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  var INVALID_EMAIL_ADDRESS: typings.parse.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  var INVALID_EVENT_NAME: typings.parse.ErrorCode.INVALID_EVENT_NAME = js.native
  var INVALID_FILE_NAME: typings.parse.ErrorCode.INVALID_FILE_NAME = js.native
  var INVALID_IMAGE_DATA: typings.parse.ErrorCode.INVALID_IMAGE_DATA = js.native
  var INVALID_JSON: typings.parse.ErrorCode.INVALID_JSON = js.native
  var INVALID_KEY_NAME: typings.parse.ErrorCode.INVALID_KEY_NAME = js.native
  var INVALID_LINKED_SESSION: typings.parse.ErrorCode.INVALID_LINKED_SESSION = js.native
  var INVALID_NESTED_KEY: typings.parse.ErrorCode.INVALID_NESTED_KEY = js.native
  var INVALID_POINTER: typings.parse.ErrorCode.INVALID_POINTER = js.native
  var INVALID_PUSH_TIME_ERROR: typings.parse.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  var INVALID_QUERY: typings.parse.ErrorCode.INVALID_QUERY = js.native
  var INVALID_ROLE_NAME: typings.parse.ErrorCode.INVALID_ROLE_NAME = js.native
  var INVALID_SESSION_TOKEN: typings.parse.ErrorCode.INVALID_SESSION_TOKEN = js.native
  var LINKED_ID_MISSING: typings.parse.ErrorCode.LINKED_ID_MISSING = js.native
  var MISSING_CONTENT_LENGTH: typings.parse.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  var MISSING_CONTENT_TYPE: typings.parse.ErrorCode.MISSING_CONTENT_TYPE = js.native
  var MISSING_OBJECT_ID: typings.parse.ErrorCode.MISSING_OBJECT_ID = js.native
  var MUST_CREATE_USER_THROUGH_SIGNUP: typings.parse.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  var NOT_INITIALIZED: typings.parse.ErrorCode.NOT_INITIALIZED = js.native
  var OBJECT_NOT_FOUND: typings.parse.ErrorCode.OBJECT_NOT_FOUND = js.native
  var OBJECT_TOO_LARGE: typings.parse.ErrorCode.OBJECT_TOO_LARGE = js.native
  var OPERATION_FORBIDDEN: typings.parse.ErrorCode.OPERATION_FORBIDDEN = js.native
  var OTHER_CAUSE: typings.parse.ErrorCode.OTHER_CAUSE = js.native
  var PASSWORD_MISSING: typings.parse.ErrorCode.PASSWORD_MISSING = js.native
  var PUSH_MISCONFIGURED: typings.parse.ErrorCode.PUSH_MISCONFIGURED = js.native
  var REQUEST_LIMIT_EXCEEDED: typings.parse.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  var SCRIPT_FAILED: typings.parse.ErrorCode.SCRIPT_FAILED = js.native
  var SESSION_MISSING: typings.parse.ErrorCode.SESSION_MISSING = js.native
  var TIMEOUT: typings.parse.ErrorCode.TIMEOUT = js.native
  var UNSAVED_FILE_ERROR: typings.parse.ErrorCode.UNSAVED_FILE_ERROR = js.native
  var UNSUPPORTED_SERVICE: typings.parse.ErrorCode.UNSUPPORTED_SERVICE = js.native
  var USERNAME_MISSING: typings.parse.ErrorCode.USERNAME_MISSING = js.native
  var USERNAME_TAKEN: typings.parse.ErrorCode.USERNAME_TAKEN = js.native
  var VALIDATION_ERROR: typings.parse.ErrorCode.VALIDATION_ERROR = js.native
  var X_DOMAIN_REQUEST: typings.parse.ErrorCode.X_DOMAIN_REQUEST = js.native
}

