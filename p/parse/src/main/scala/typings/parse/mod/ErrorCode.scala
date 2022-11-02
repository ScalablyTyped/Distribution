package typings.parse.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("parse", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  /**
    * Error code indicating that an an account being linked is already linked
    * to another user.
    */
  @js.native
  sealed trait ACCOUNT_ALREADY_LINKED
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that there were multiple errors. Aggregate errors
    * have an "errors" property, which is an array of error objects with more
    * detail about each error that occurred.
    */
  @js.native
  sealed trait AGGREGATE_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating the result was not found in the cache. */
  @js.native
  sealed trait CACHE_MISS
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that the feature you tried to access is only
    * available internally for testing purposes.
    */
  @js.native
  sealed trait COMMAND_UNAVAILABLE
    extends StObject
       with ErrorCode
  
  /** Error code indicating the connection to the Parse servers failed. */
  @js.native
  sealed trait CONNECTION_FAILED
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that the request was a duplicate and has been discarded due to
    * idempotency rules.
    */
  @js.native
  sealed trait DUPLICATE_REQUEST
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that a unique field was given a value that is
    * already taken.
    */
  @js.native
  sealed trait DUPLICATE_VALUE
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the email is missing, but must be specified. */
  @js.native
  sealed trait EMAIL_MISSING
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a user with the specified email was not found. */
  @js.native
  sealed trait EMAIL_NOT_FOUND
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the email has already been taken. */
  @js.native
  sealed trait EMAIL_TAKEN
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that an application quota was exceeded.
    * Upgrade to resolve.
    */
  @js.native
  sealed trait EXCEEDED_QUOTA
    extends StObject
       with ErrorCode
  
  /** Error code indicating an error deleting a file. */
  @js.native
  sealed trait FILE_DELETE_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating an error deleting an unnamed file. */
  @js.native
  sealed trait FILE_DELETE_UNNAMED_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating the client was unable to read an input file. */
  @js.native
  sealed trait FILE_READ_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating an error saving a file. */
  @js.native
  sealed trait FILE_SAVE_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating a file that was too large. */
  @js.native
  sealed trait FILE_TOO_LARGE
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a field was set to an inconsistent type. */
  @js.native
  sealed trait INCORRECT_TYPE
    extends StObject
       with ErrorCode
  
  /** Error code indicating that something has gone wrong with the server. */
  @js.native
  sealed trait INTERNAL_SERVER_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating an invalid ACL was provided. */
  @js.native
  sealed trait INVALID_ACL
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating an invalid channel name. A channel name is either
    * an empty string (the broadcast channel) or contains only a-zA-Z0-9_
    * characters and starts with a letter.
    */
  @js.native
  sealed trait INVALID_CHANNEL_NAME
    extends StObject
       with ErrorCode
  
  /*
    * Error code indicating a missing or invalid classname. Classnames are
    * case-sensitive. They must start with a letter, and a-zA-Z0-9_ are the
    * only valid characters.
    */
  @js.native
  sealed trait INVALID_CLASS_NAME
    extends StObject
       with ErrorCode
  
  /** Error code indicating an invalid content length. */
  @js.native
  sealed trait INVALID_CONTENT_LENGTH
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the email address was invalid. */
  @js.native
  sealed trait INVALID_EMAIL_ADDRESS
    extends StObject
       with ErrorCode
  
  /** Error code indicating an invalid event name. */
  @js.native
  sealed trait INVALID_EVENT_NAME
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that an invalid filename was used for ParseFile.
    * A valid file name contains only a-zA-Z0-9_. characters and is between 1
    * and 128 characters.
    */
  @js.native
  sealed trait INVALID_FILE_NAME
    extends StObject
       with ErrorCode
  
  /** Error code indicating that invalid image data was provided. */
  @js.native
  sealed trait INVALID_IMAGE_DATA
    extends StObject
       with ErrorCode
  
  /*
    * Error code indicating that badly formed JSON was received upstream. This
    * either indicates you have done something unusual with modifying how
    * things encode to JSON, or the network is failing badly.
    */
  @js.native
  sealed trait INVALID_JSON
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating an invalid key name. Keys are case-sensitive. They
    * must start with a letter, and a-zA-Z0-9_ are the only valid characters.
    */
  @js.native
  sealed trait INVALID_KEY_NAME
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that a user with a linked (e.g. Facebook) account
    * has an invalid session.
    */
  @js.native
  sealed trait INVALID_LINKED_SESSION
    extends StObject
       with ErrorCode
  
  /** Error code indicating that an invalid key was used in a nested JSONObject. */
  @js.native
  sealed trait INVALID_NESTED_KEY
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating a malformed pointer. You should not see this unless
    * you have been mucking about changing internal Parse code.
    */
  @js.native
  sealed trait INVALID_POINTER
    extends StObject
       with ErrorCode
  
  /** Error code indicating an invalid push time. */
  @js.native
  sealed trait INVALID_PUSH_TIME_ERROR
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating you tried to query with a datatype that doesn't
    * support it, like exact matching an array or object.
    */
  @js.native
  sealed trait INVALID_QUERY
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a role's name is invalid. */
  @js.native
  sealed trait INVALID_ROLE_NAME
    extends StObject
       with ErrorCode
  
  /** Error code indicating an invalid operation occured on schema */
  @js.native
  sealed trait INVALID_SCHEMA_OPERATION
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the current session token is invalid. */
  @js.native
  sealed trait INVALID_SESSION_TOKEN
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that a user cannot be linked to an account because
    * that account's id could not be found.
    */
  @js.native
  sealed trait LINKED_ID_MISSING
    extends StObject
       with ErrorCode
  
  /** Error code indicating an error enabling or verifying MFA */
  @js.native
  sealed trait MFA_ERROR
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a valid MFA token must be provided */
  @js.native
  sealed trait MFA_TOKEN_REQUIRED
    extends StObject
       with ErrorCode
  
  /** Error code indicating a missing content length. */
  @js.native
  sealed trait MISSING_CONTENT_LENGTH
    extends StObject
       with ErrorCode
  
  /** Error code indicating a missing content type. */
  @js.native
  sealed trait MISSING_CONTENT_TYPE
    extends StObject
       with ErrorCode
  
  /** Error code indicating an unspecified object id. */
  @js.native
  sealed trait MISSING_OBJECT_ID
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a user can only be created through signup. */
  @js.native
  sealed trait MUST_CREATE_USER_THROUGH_SIGNUP
    extends StObject
       with ErrorCode
  
  /** You must call Parse.initialize before using the Parse library. */
  @js.native
  sealed trait NOT_INITIALIZED
    extends StObject
       with ErrorCode
  
  /** Error code indicating the specified object doesn't exist. */
  @js.native
  sealed trait OBJECT_NOT_FOUND
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the object is too large. */
  @js.native
  sealed trait OBJECT_TOO_LARGE
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the operation isn't allowed for clients. */
  @js.native
  sealed trait OPERATION_FORBIDDEN
    extends StObject
       with ErrorCode
  
  /** Error code indicating some error other than those enumerated here */
  @js.native
  sealed trait OTHER_CAUSE
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the password is missing or empty. */
  @js.native
  sealed trait PASSWORD_MISSING
    extends StObject
       with ErrorCode
  
  /** Error code indicating that push is misconfigured. */
  @js.native
  sealed trait PUSH_MISCONFIGURED
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the application has exceeded its request limit. */
  @js.native
  sealed trait REQUEST_LIMIT_EXCEEDED
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a Cloud Code script failed. */
  @js.native
  sealed trait SCRIPT_FAILED
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that a user object without a valid session could
    * not be altered.
    */
  @js.native
  sealed trait SESSION_MISSING
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that the request timed out on the server. Typically
    * this indicates that the request is too expensive to run.
    */
  @js.native
  sealed trait TIMEOUT
    extends StObject
       with ErrorCode
  
  /** Error code indicating an unsaved file. */
  @js.native
  sealed trait UNSAVED_FILE_ERROR
    extends StObject
       with ErrorCode
  
  /**
    * Error code indicating that a service being linked (e.g. Facebook or
    * Twitter) is unsupported.
    */
  @js.native
  sealed trait UNSUPPORTED_SERVICE
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the username is missing or empty. */
  @js.native
  sealed trait USERNAME_MISSING
    extends StObject
       with ErrorCode
  
  /** Error code indicating that the username has already been taken. */
  @js.native
  sealed trait USERNAME_TAKEN
    extends StObject
       with ErrorCode
  
  /** Error code indicating that a Cloud Code validation failed. */
  @js.native
  sealed trait VALIDATION_ERROR
    extends StObject
       with ErrorCode
  
  /*
    * Error code indicating a real error code is unavailable because
    * we had to use an XDomainRequest object to allow CORS requests in
    * Internet Explorer, which strips the body from HTTP responses that have
    * a non-2XX status code.
    */
  @js.native
  sealed trait X_DOMAIN_REQUEST
    extends StObject
       with ErrorCode
}
