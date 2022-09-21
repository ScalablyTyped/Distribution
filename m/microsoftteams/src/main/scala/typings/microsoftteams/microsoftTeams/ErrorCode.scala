package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSGlobal("microsoftTeams.ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  /**
    * The file specified was not found on the given location
    */
  @js.native
  sealed trait FILE_NOT_FOUND
    extends StObject
       with ErrorCode
  
  /**
    * Could not complete the operation due to insufficient resources
    */
  @js.native
  sealed trait INSUFFICIENT_RESOURCES
    extends StObject
       with ErrorCode
  
  /**
    * Internal error encountered while performing the required operation.
    */
  @js.native
  sealed trait INTERNAL_ERROR
    extends StObject
       with ErrorCode
  
  /**
    * One or more arguments are invalid
    */
  @js.native
  sealed trait INVALID_ARGUMENTS
    extends StObject
       with ErrorCode
  
  /**
    * Network issue
    */
  @js.native
  sealed trait NETWORK_ERROR
    extends StObject
       with ErrorCode
  
  /**
    * API is not supported in the current context
    */
  @js.native
  sealed trait NOT_SUPPORTED_IN_CURRENT_CONTEXT
    extends StObject
       with ErrorCode
  
  /**
    * API not supported in the current platform.
    */
  @js.native
  sealed trait NOT_SUPPORTED_ON_PLATFORM
    extends StObject
       with ErrorCode
  
  /**
    * Underlying hardware doesn't support the capability
    */
  @js.native
  sealed trait NO_HW_SUPPORT
    extends StObject
       with ErrorCode
  
  /**
    * Platform code is old and doesn't implement this API
    */
  @js.native
  sealed trait OLD_PLATFORM
    extends StObject
       with ErrorCode
  
  /**
    * Could not complete the operation in the given time interval
    */
  @js.native
  sealed trait OPERATION_TIMED_OUT
    extends StObject
       with ErrorCode
  
  /**
    * Permissions denied by user
    */
  @js.native
  sealed trait PERMISSION_DENIED
    extends StObject
       with ErrorCode
  
  /**
    * The return value is too big and has exceeded our size boundries
    */
  @js.native
  sealed trait SIZE_EXCEEDED
    extends StObject
       with ErrorCode
  
  /**
    * Platform throttled the request because of API was invoked too frequently
    */
  @js.native
  sealed trait THROTTLE
    extends StObject
       with ErrorCode
  
  /**
    * User is not authorized for this operation
    */
  @js.native
  sealed trait UNAUTHORIZED_USER_OPERATION
    extends StObject
       with ErrorCode
  
  /**
    * User aborted the operation
    */
  @js.native
  sealed trait USER_ABORT
    extends StObject
       with ErrorCode
}
