package typings.parse.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "Error")
@js.native
class Error protected ()
  extends typings.parse.parseMod._Global_.Parse.Error {
  def this(code: ErrorCode, message: String) = this()
}

/* static members */
@JSImport("parse", "Error")
@js.native
object Error extends js.Object {
  var ACCOUNT_ALREADY_LINKED: typings.parse.parseMod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  var AGGREGATE_ERROR: typings.parse.parseMod.ErrorCode.AGGREGATE_ERROR = js.native
  var CACHE_MISS: typings.parse.parseMod.ErrorCode.CACHE_MISS = js.native
  var COMMAND_UNAVAILABLE: typings.parse.parseMod.ErrorCode.COMMAND_UNAVAILABLE = js.native
  var CONNECTION_FAILED: typings.parse.parseMod.ErrorCode.CONNECTION_FAILED = js.native
  var DUPLICATE_VALUE: typings.parse.parseMod.ErrorCode.DUPLICATE_VALUE = js.native
  var EMAIL_MISSING: typings.parse.parseMod.ErrorCode.EMAIL_MISSING = js.native
  var EMAIL_NOT_FOUND: typings.parse.parseMod.ErrorCode.EMAIL_NOT_FOUND = js.native
  var EMAIL_TAKEN: typings.parse.parseMod.ErrorCode.EMAIL_TAKEN = js.native
  var EXCEEDED_QUOTA: typings.parse.parseMod.ErrorCode.EXCEEDED_QUOTA = js.native
  var FILE_DELETE_ERROR: typings.parse.parseMod.ErrorCode.FILE_DELETE_ERROR = js.native
  var FILE_READ_ERROR: typings.parse.parseMod.ErrorCode.FILE_READ_ERROR = js.native
  var FILE_SAVE_ERROR: typings.parse.parseMod.ErrorCode.FILE_SAVE_ERROR = js.native
  var FILE_TOO_LARGE: typings.parse.parseMod.ErrorCode.FILE_TOO_LARGE = js.native
  var INCORRECT_TYPE: typings.parse.parseMod.ErrorCode.INCORRECT_TYPE = js.native
  var INTERNAL_SERVER_ERROR: typings.parse.parseMod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  var INVALID_ACL: typings.parse.parseMod.ErrorCode.INVALID_ACL = js.native
  var INVALID_CHANNEL_NAME: typings.parse.parseMod.ErrorCode.INVALID_CHANNEL_NAME = js.native
  var INVALID_CLASS_NAME: typings.parse.parseMod.ErrorCode.INVALID_CLASS_NAME = js.native
  var INVALID_CONTENT_LENGTH: typings.parse.parseMod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  var INVALID_EMAIL_ADDRESS: typings.parse.parseMod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  var INVALID_EVENT_NAME: typings.parse.parseMod.ErrorCode.INVALID_EVENT_NAME = js.native
  var INVALID_FILE_NAME: typings.parse.parseMod.ErrorCode.INVALID_FILE_NAME = js.native
  var INVALID_IMAGE_DATA: typings.parse.parseMod.ErrorCode.INVALID_IMAGE_DATA = js.native
  var INVALID_JSON: typings.parse.parseMod.ErrorCode.INVALID_JSON = js.native
  var INVALID_KEY_NAME: typings.parse.parseMod.ErrorCode.INVALID_KEY_NAME = js.native
  var INVALID_LINKED_SESSION: typings.parse.parseMod.ErrorCode.INVALID_LINKED_SESSION = js.native
  var INVALID_NESTED_KEY: typings.parse.parseMod.ErrorCode.INVALID_NESTED_KEY = js.native
  var INVALID_POINTER: typings.parse.parseMod.ErrorCode.INVALID_POINTER = js.native
  var INVALID_PUSH_TIME_ERROR: typings.parse.parseMod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  var INVALID_QUERY: typings.parse.parseMod.ErrorCode.INVALID_QUERY = js.native
  var INVALID_ROLE_NAME: typings.parse.parseMod.ErrorCode.INVALID_ROLE_NAME = js.native
  var INVALID_SESSION_TOKEN: typings.parse.parseMod.ErrorCode.INVALID_SESSION_TOKEN = js.native
  var LINKED_ID_MISSING: typings.parse.parseMod.ErrorCode.LINKED_ID_MISSING = js.native
  var MISSING_CONTENT_LENGTH: typings.parse.parseMod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  var MISSING_CONTENT_TYPE: typings.parse.parseMod.ErrorCode.MISSING_CONTENT_TYPE = js.native
  var MISSING_OBJECT_ID: typings.parse.parseMod.ErrorCode.MISSING_OBJECT_ID = js.native
  var MUST_CREATE_USER_THROUGH_SIGNUP: typings.parse.parseMod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  var NOT_INITIALIZED: typings.parse.parseMod.ErrorCode.NOT_INITIALIZED = js.native
  var OBJECT_NOT_FOUND: typings.parse.parseMod.ErrorCode.OBJECT_NOT_FOUND = js.native
  var OBJECT_TOO_LARGE: typings.parse.parseMod.ErrorCode.OBJECT_TOO_LARGE = js.native
  var OPERATION_FORBIDDEN: typings.parse.parseMod.ErrorCode.OPERATION_FORBIDDEN = js.native
  var OTHER_CAUSE: typings.parse.parseMod.ErrorCode.OTHER_CAUSE = js.native
  var PASSWORD_MISSING: typings.parse.parseMod.ErrorCode.PASSWORD_MISSING = js.native
  var PUSH_MISCONFIGURED: typings.parse.parseMod.ErrorCode.PUSH_MISCONFIGURED = js.native
  var REQUEST_LIMIT_EXCEEDED: typings.parse.parseMod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  var SCRIPT_FAILED: typings.parse.parseMod.ErrorCode.SCRIPT_FAILED = js.native
  var SESSION_MISSING: typings.parse.parseMod.ErrorCode.SESSION_MISSING = js.native
  var TIMEOUT: typings.parse.parseMod.ErrorCode.TIMEOUT = js.native
  var UNSAVED_FILE_ERROR: typings.parse.parseMod.ErrorCode.UNSAVED_FILE_ERROR = js.native
  var UNSUPPORTED_SERVICE: typings.parse.parseMod.ErrorCode.UNSUPPORTED_SERVICE = js.native
  var USERNAME_MISSING: typings.parse.parseMod.ErrorCode.USERNAME_MISSING = js.native
  var USERNAME_TAKEN: typings.parse.parseMod.ErrorCode.USERNAME_TAKEN = js.native
  var VALIDATION_ERROR: typings.parse.parseMod.ErrorCode.VALIDATION_ERROR = js.native
  var X_DOMAIN_REQUEST: typings.parse.parseMod.ErrorCode.X_DOMAIN_REQUEST = js.native
}

