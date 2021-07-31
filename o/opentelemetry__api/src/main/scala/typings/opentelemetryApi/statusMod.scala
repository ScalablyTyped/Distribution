package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @js.native
  sealed trait CanonicalCode extends StObject
  @JSImport("@opentelemetry/api/build/src/trace/status", "CanonicalCode")
  @js.native
  object CanonicalCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CanonicalCode & Double] = js.native
    
    /**
      * The operation was aborted, typically due to a concurrency issue
      * like sequencer check failures, transaction aborts, etc.
      *
      * See litmus test above for deciding between FAILED_PRECONDITION,
      * ABORTED, and UNAVAILABLE.
      */
    @js.native
    sealed trait ABORTED
      extends StObject
         with CanonicalCode
    /* 10 */ val ABORTED: typings.opentelemetryApi.statusMod.CanonicalCode.ABORTED & Double = js.native
    
    /**
      * Some entity that we attempted to create (e.g., file or directory)
      * already exists.
      */
    @js.native
    sealed trait ALREADY_EXISTS
      extends StObject
         with CanonicalCode
    /* 6 */ val ALREADY_EXISTS: typings.opentelemetryApi.statusMod.CanonicalCode.ALREADY_EXISTS & Double = js.native
    
    /**
      * The operation was cancelled (typically by the caller).
      */
    @js.native
    sealed trait CANCELLED
      extends StObject
         with CanonicalCode
    /* 1 */ val CANCELLED: typings.opentelemetryApi.statusMod.CanonicalCode.CANCELLED & Double = js.native
    
    /**
      * Unrecoverable data loss or corruption.
      */
    @js.native
    sealed trait DATA_LOSS
      extends StObject
         with CanonicalCode
    /* 15 */ val DATA_LOSS: typings.opentelemetryApi.statusMod.CanonicalCode.DATA_LOSS & Double = js.native
    
    /**
      * Deadline expired before operation could complete.  For operations
      * that change the state of the system, this error may be returned
      * even if the operation has completed successfully.  For example, a
      * successful response from a server could have been delayed long
      * enough for the deadline to expire.
      */
    @js.native
    sealed trait DEADLINE_EXCEEDED
      extends StObject
         with CanonicalCode
    /* 4 */ val DEADLINE_EXCEEDED: typings.opentelemetryApi.statusMod.CanonicalCode.DEADLINE_EXCEEDED & Double = js.native
    
    /**
      * Operation was rejected because the system is not in a state
      * required for the operation's execution.  For example, directory
      * to be deleted may be non-empty, an rmdir operation is applied to
      * a non-directory, etc.
      *
      * A litmus test that may help a service implementor in deciding
      * between FAILED_PRECONDITION, ABORTED, and UNAVAILABLE:
      *
      *  - Use UNAVAILABLE if the client can retry just the failing call.
      *  - Use ABORTED if the client should retry at a higher-level
      *    (e.g., restarting a read-modify-write sequence).
      *  - Use FAILED_PRECONDITION if the client should not retry until
      *    the system state has been explicitly fixed.  E.g., if an "rmdir"
      *    fails because the directory is non-empty, FAILED_PRECONDITION
      *    should be returned since the client should not retry unless
      *    they have first fixed up the directory by deleting files from it.
      *  - Use FAILED_PRECONDITION if the client performs conditional
      *    REST Get/Update/Delete on a resource and the resource on the
      *    server does not match the condition. E.g., conflicting
      *    read-modify-write on the same resource.
      */
    @js.native
    sealed trait FAILED_PRECONDITION
      extends StObject
         with CanonicalCode
    /* 9 */ val FAILED_PRECONDITION: typings.opentelemetryApi.statusMod.CanonicalCode.FAILED_PRECONDITION & Double = js.native
    
    /**
      * Internal errors.  Means some invariants expected by underlying
      * system has been broken.  If you see one of these errors,
      * something is very broken.
      */
    @js.native
    sealed trait INTERNAL
      extends StObject
         with CanonicalCode
    /* 13 */ val INTERNAL: typings.opentelemetryApi.statusMod.CanonicalCode.INTERNAL & Double = js.native
    
    /**
      * Client specified an invalid argument.  Note that this differs
      * from FAILED_PRECONDITION.  INVALID_ARGUMENT indicates arguments
      * that are problematic regardless of the state of the system
      * (e.g., a malformed file name).
      */
    @js.native
    sealed trait INVALID_ARGUMENT
      extends StObject
         with CanonicalCode
    /* 3 */ val INVALID_ARGUMENT: typings.opentelemetryApi.statusMod.CanonicalCode.INVALID_ARGUMENT & Double = js.native
    
    /**
      * Some requested entity (e.g., file or directory) was not found.
      */
    @js.native
    sealed trait NOT_FOUND
      extends StObject
         with CanonicalCode
    /* 5 */ val NOT_FOUND: typings.opentelemetryApi.statusMod.CanonicalCode.NOT_FOUND & Double = js.native
    
    /**
      * Not an error; returned on success
      */
    @js.native
    sealed trait OK
      extends StObject
         with CanonicalCode
    /* 0 */ val OK: typings.opentelemetryApi.statusMod.CanonicalCode.OK & Double = js.native
    
    /**
      * Operation was attempted past the valid range.  E.g., seeking or
      * reading past end of file.
      *
      * Unlike INVALID_ARGUMENT, this error indicates a problem that may
      * be fixed if the system state changes. For example, a 32-bit file
      * system will generate INVALID_ARGUMENT if asked to read at an
      * offset that is not in the range [0,2^32-1], but it will generate
      * OUT_OF_RANGE if asked to read from an offset past the current
      * file size.
      *
      * There is a fair bit of overlap between FAILED_PRECONDITION and
      * OUT_OF_RANGE.  We recommend using OUT_OF_RANGE (the more specific
      * error) when it applies so that callers who are iterating through
      * a space can easily look for an OUT_OF_RANGE error to detect when
      * they are done.
      */
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with CanonicalCode
    /* 11 */ val OUT_OF_RANGE: typings.opentelemetryApi.statusMod.CanonicalCode.OUT_OF_RANGE & Double = js.native
    
    /**
      * The caller does not have permission to execute the specified
      * operation.  PERMISSION_DENIED must not be used for rejections
      * caused by exhausting some resource (use RESOURCE_EXHAUSTED
      * instead for those errors).  PERMISSION_DENIED must not be
      * used if the caller can not be identified (use UNAUTHENTICATED
      * instead for those errors).
      */
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with CanonicalCode
    /* 7 */ val PERMISSION_DENIED: typings.opentelemetryApi.statusMod.CanonicalCode.PERMISSION_DENIED & Double = js.native
    
    /**
      * Some resource has been exhausted, perhaps a per-user quota, or
      * perhaps the entire file system is out of space.
      */
    @js.native
    sealed trait RESOURCE_EXHAUSTED
      extends StObject
         with CanonicalCode
    /* 8 */ val RESOURCE_EXHAUSTED: typings.opentelemetryApi.statusMod.CanonicalCode.RESOURCE_EXHAUSTED & Double = js.native
    
    /**
      * The request does not have valid authentication credentials for the
      * operation.
      */
    @js.native
    sealed trait UNAUTHENTICATED
      extends StObject
         with CanonicalCode
    /* 16 */ val UNAUTHENTICATED: typings.opentelemetryApi.statusMod.CanonicalCode.UNAUTHENTICATED & Double = js.native
    
    /**
      * The service is currently unavailable.  This is a most likely a
      * transient condition and may be corrected by retrying with
      * a backoff.
      *
      * See litmus test above for deciding between FAILED_PRECONDITION,
      * ABORTED, and UNAVAILABLE.
      */
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with CanonicalCode
    /* 14 */ val UNAVAILABLE: typings.opentelemetryApi.statusMod.CanonicalCode.UNAVAILABLE & Double = js.native
    
    /**
      * Operation is not implemented or not supported/enabled in this service.
      */
    @js.native
    sealed trait UNIMPLEMENTED
      extends StObject
         with CanonicalCode
    /* 12 */ val UNIMPLEMENTED: typings.opentelemetryApi.statusMod.CanonicalCode.UNIMPLEMENTED & Double = js.native
    
    /**
      * Unknown error.  An example of where this error may be returned is
      * if a status value received from another address space belongs to
      * an error-space that is not known in this address space.  Also
      * errors raised by APIs that do not return enough error information
      * may be converted to this error.
      */
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with CanonicalCode
    /* 2 */ val UNKNOWN: typings.opentelemetryApi.statusMod.CanonicalCode.UNKNOWN & Double = js.native
  }
  
  trait Status extends StObject {
    
    /** The canonical code of this message. */
    var code: CanonicalCode
    
    /** A developer-facing error message. */
    var message: js.UndefOr[String] = js.undefined
  }
  object Status {
    
    @scala.inline
    def apply(code: CanonicalCode): Status = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: CanonicalCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
