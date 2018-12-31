package typings
package parseLib.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * We need to inline the codes in order to make compilation work without this type definition as dependency.
  */
@JSImport("parse/node", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  /* 208 */ val ACCOUNT_ALREADY_LINKED: parseLib.ParseNs.ErrorCode.ACCOUNT_ALREADY_LINKED with scala.Double = js.native
  /* 600 */ val AGGREGATE_ERROR: parseLib.ParseNs.ErrorCode.AGGREGATE_ERROR with scala.Double = js.native
  /* 120 */ val CACHE_MISS: parseLib.ParseNs.ErrorCode.CACHE_MISS with scala.Double = js.native
  /* 108 */ val COMMAND_UNAVAILABLE: parseLib.ParseNs.ErrorCode.COMMAND_UNAVAILABLE with scala.Double = js.native
  /* 100 */ val CONNECTION_FAILED: parseLib.ParseNs.ErrorCode.CONNECTION_FAILED with scala.Double = js.native
  /* 137 */ val DUPLICATE_VALUE: parseLib.ParseNs.ErrorCode.DUPLICATE_VALUE with scala.Double = js.native
  /* 204 */ val EMAIL_MISSING: parseLib.ParseNs.ErrorCode.EMAIL_MISSING with scala.Double = js.native
  /* 205 */ val EMAIL_NOT_FOUND: parseLib.ParseNs.ErrorCode.EMAIL_NOT_FOUND with scala.Double = js.native
  /* 203 */ val EMAIL_TAKEN: parseLib.ParseNs.ErrorCode.EMAIL_TAKEN with scala.Double = js.native
  /* 140 */ val EXCEEDED_QUOTA: parseLib.ParseNs.ErrorCode.EXCEEDED_QUOTA with scala.Double = js.native
  /* 153 */ val FILE_DELETE_ERROR: parseLib.ParseNs.ErrorCode.FILE_DELETE_ERROR with scala.Double = js.native
  /* 601 */ val FILE_READ_ERROR: parseLib.ParseNs.ErrorCode.FILE_READ_ERROR with scala.Double = js.native
  /* 130 */ val FILE_SAVE_ERROR: parseLib.ParseNs.ErrorCode.FILE_SAVE_ERROR with scala.Double = js.native
  /* 129 */ val FILE_TOO_LARGE: parseLib.ParseNs.ErrorCode.FILE_TOO_LARGE with scala.Double = js.native
  /* 111 */ val INCORRECT_TYPE: parseLib.ParseNs.ErrorCode.INCORRECT_TYPE with scala.Double = js.native
  /* 1 */ val INTERNAL_SERVER_ERROR: parseLib.ParseNs.ErrorCode.INTERNAL_SERVER_ERROR with scala.Double = js.native
  /* 123 */ val INVALID_ACL: parseLib.ParseNs.ErrorCode.INVALID_ACL with scala.Double = js.native
  /* 112 */ val INVALID_CHANNEL_NAME: parseLib.ParseNs.ErrorCode.INVALID_CHANNEL_NAME with scala.Double = js.native
  /* 103 */ val INVALID_CLASS_NAME: parseLib.ParseNs.ErrorCode.INVALID_CLASS_NAME with scala.Double = js.native
  /* 128 */ val INVALID_CONTENT_LENGTH: parseLib.ParseNs.ErrorCode.INVALID_CONTENT_LENGTH with scala.Double = js.native
  /* 125 */ val INVALID_EMAIL_ADDRESS: parseLib.ParseNs.ErrorCode.INVALID_EMAIL_ADDRESS with scala.Double = js.native
  /* 160 */ val INVALID_EVENT_NAME: parseLib.ParseNs.ErrorCode.INVALID_EVENT_NAME with scala.Double = js.native
  /* 122 */ val INVALID_FILE_NAME: parseLib.ParseNs.ErrorCode.INVALID_FILE_NAME with scala.Double = js.native
  /* 150 */ val INVALID_IMAGE_DATA: parseLib.ParseNs.ErrorCode.INVALID_IMAGE_DATA with scala.Double = js.native
  /* 107 */ val INVALID_JSON: parseLib.ParseNs.ErrorCode.INVALID_JSON with scala.Double = js.native
  /* 105 */ val INVALID_KEY_NAME: parseLib.ParseNs.ErrorCode.INVALID_KEY_NAME with scala.Double = js.native
  /* 251 */ val INVALID_LINKED_SESSION: parseLib.ParseNs.ErrorCode.INVALID_LINKED_SESSION with scala.Double = js.native
  /* 121 */ val INVALID_NESTED_KEY: parseLib.ParseNs.ErrorCode.INVALID_NESTED_KEY with scala.Double = js.native
  /* 106 */ val INVALID_POINTER: parseLib.ParseNs.ErrorCode.INVALID_POINTER with scala.Double = js.native
  /* 152 */ val INVALID_PUSH_TIME_ERROR: parseLib.ParseNs.ErrorCode.INVALID_PUSH_TIME_ERROR with scala.Double = js.native
  /* 102 */ val INVALID_QUERY: parseLib.ParseNs.ErrorCode.INVALID_QUERY with scala.Double = js.native
  /* 139 */ val INVALID_ROLE_NAME: parseLib.ParseNs.ErrorCode.INVALID_ROLE_NAME with scala.Double = js.native
  /* 209 */ val INVALID_SESSION_TOKEN: parseLib.ParseNs.ErrorCode.INVALID_SESSION_TOKEN with scala.Double = js.native
  /* 250 */ val LINKED_ID_MISSING: parseLib.ParseNs.ErrorCode.LINKED_ID_MISSING with scala.Double = js.native
  /* 127 */ val MISSING_CONTENT_LENGTH: parseLib.ParseNs.ErrorCode.MISSING_CONTENT_LENGTH with scala.Double = js.native
  /* 126 */ val MISSING_CONTENT_TYPE: parseLib.ParseNs.ErrorCode.MISSING_CONTENT_TYPE with scala.Double = js.native
  /* 104 */ val MISSING_OBJECT_ID: parseLib.ParseNs.ErrorCode.MISSING_OBJECT_ID with scala.Double = js.native
  /* 207 */ val MUST_CREATE_USER_THROUGH_SIGNUP: parseLib.ParseNs.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP with scala.Double = js.native
  /* 109 */ val NOT_INITIALIZED: parseLib.ParseNs.ErrorCode.NOT_INITIALIZED with scala.Double = js.native
  /* 101 */ val OBJECT_NOT_FOUND: parseLib.ParseNs.ErrorCode.OBJECT_NOT_FOUND with scala.Double = js.native
  /* 116 */ val OBJECT_TOO_LARGE: parseLib.ParseNs.ErrorCode.OBJECT_TOO_LARGE with scala.Double = js.native
  /* 119 */ val OPERATION_FORBIDDEN: parseLib.ParseNs.ErrorCode.OPERATION_FORBIDDEN with scala.Double = js.native
  /* -1 */ val OTHER_CAUSE: parseLib.ParseNs.ErrorCode.OTHER_CAUSE with scala.Double = js.native
  /* 201 */ val PASSWORD_MISSING: parseLib.ParseNs.ErrorCode.PASSWORD_MISSING with scala.Double = js.native
  /* 115 */ val PUSH_MISCONFIGURED: parseLib.ParseNs.ErrorCode.PUSH_MISCONFIGURED with scala.Double = js.native
  /* 155 */ val REQUEST_LIMIT_EXCEEDED: parseLib.ParseNs.ErrorCode.REQUEST_LIMIT_EXCEEDED with scala.Double = js.native
  /* 141 */ val SCRIPT_FAILED: parseLib.ParseNs.ErrorCode.SCRIPT_FAILED with scala.Double = js.native
  /* 206 */ val SESSION_MISSING: parseLib.ParseNs.ErrorCode.SESSION_MISSING with scala.Double = js.native
  /* 124 */ val TIMEOUT: parseLib.ParseNs.ErrorCode.TIMEOUT with scala.Double = js.native
  /* 151 */ val UNSAVED_FILE_ERROR: parseLib.ParseNs.ErrorCode.UNSAVED_FILE_ERROR with scala.Double = js.native
  /* 252 */ val UNSUPPORTED_SERVICE: parseLib.ParseNs.ErrorCode.UNSUPPORTED_SERVICE with scala.Double = js.native
  /* 200 */ val USERNAME_MISSING: parseLib.ParseNs.ErrorCode.USERNAME_MISSING with scala.Double = js.native
  /* 202 */ val USERNAME_TAKEN: parseLib.ParseNs.ErrorCode.USERNAME_TAKEN with scala.Double = js.native
  /* 142 */ val VALIDATION_ERROR: parseLib.ParseNs.ErrorCode.VALIDATION_ERROR with scala.Double = js.native
  /* 602 */ val X_DOMAIN_REQUEST: parseLib.ParseNs.ErrorCode.X_DOMAIN_REQUEST with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[parseLib.ParseNs.ErrorCode with scala.Double] = js.native
}

