package typings.nats.errorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ErrorCode extends StObject
@JSImport("nats/lib/nats-base-client/error", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode & String] = js.native
  
  @js.native
  sealed trait ApiError
    extends StObject
       with ErrorCode
  /* "BAD API" */ val ApiError: typings.nats.errorMod.ErrorCode.ApiError & String = js.native
  
  @js.native
  sealed trait AuthenticationExpired
    extends StObject
       with ErrorCode
  /* "AUTHENTICATION_EXPIRED" */ val AuthenticationExpired: typings.nats.errorMod.ErrorCode.AuthenticationExpired & String = js.native
  
  @js.native
  sealed trait AuthorizationViolation
    extends StObject
       with ErrorCode
  /* "AUTHORIZATION_VIOLATION" */ val AuthorizationViolation: typings.nats.errorMod.ErrorCode.AuthorizationViolation & String = js.native
  
  @js.native
  sealed trait BadAuthentication
    extends StObject
       with ErrorCode
  /* "BAD_AUTHENTICATION" */ val BadAuthentication: typings.nats.errorMod.ErrorCode.BadAuthentication & String = js.native
  
  @js.native
  sealed trait BadCreds
    extends StObject
       with ErrorCode
  /* "BAD_CREDS" */ val BadCreds: typings.nats.errorMod.ErrorCode.BadCreds & String = js.native
  
  @js.native
  sealed trait BadHeader
    extends StObject
       with ErrorCode
  /* "BAD_HEADER" */ val BadHeader: typings.nats.errorMod.ErrorCode.BadHeader & String = js.native
  
  @js.native
  sealed trait BadJson
    extends StObject
       with ErrorCode
  /* "BAD_JSON" */ val BadJson: typings.nats.errorMod.ErrorCode.BadJson & String = js.native
  
  @js.native
  sealed trait BadPayload
    extends StObject
       with ErrorCode
  /* "BAD_PAYLOAD" */ val BadPayload: typings.nats.errorMod.ErrorCode.BadPayload & String = js.native
  
  @js.native
  sealed trait BadSubject
    extends StObject
       with ErrorCode
  /* "BAD_SUBJECT" */ val BadSubject: typings.nats.errorMod.ErrorCode.BadSubject & String = js.native
  
  @js.native
  sealed trait Cancelled
    extends StObject
       with ErrorCode
  /* "CANCELLED" */ val Cancelled: typings.nats.errorMod.ErrorCode.Cancelled & String = js.native
  
  @js.native
  sealed trait ConnectionClosed
    extends StObject
       with ErrorCode
  /* "CONNECTION_CLOSED" */ val ConnectionClosed: typings.nats.errorMod.ErrorCode.ConnectionClosed & String = js.native
  
  @js.native
  sealed trait ConnectionDraining
    extends StObject
       with ErrorCode
  /* "CONNECTION_DRAINING" */ val ConnectionDraining: typings.nats.errorMod.ErrorCode.ConnectionDraining & String = js.native
  
  @js.native
  sealed trait ConnectionRefused
    extends StObject
       with ErrorCode
  /* "CONNECTION_REFUSED" */ val ConnectionRefused: typings.nats.errorMod.ErrorCode.ConnectionRefused & String = js.native
  
  @js.native
  sealed trait ConnectionTimeout
    extends StObject
       with ErrorCode
  /* "CONNECTION_TIMEOUT" */ val ConnectionTimeout: typings.nats.errorMod.ErrorCode.ConnectionTimeout & String = js.native
  
  @js.native
  sealed trait Disconnect
    extends StObject
       with ErrorCode
  /* "DISCONNECT" */ val Disconnect: typings.nats.errorMod.ErrorCode.Disconnect & String = js.native
  
  @js.native
  sealed trait InvalidOption
    extends StObject
       with ErrorCode
  /* "INVALID_OPTION" */ val InvalidOption: typings.nats.errorMod.ErrorCode.InvalidOption & String = js.native
  
  @js.native
  sealed trait InvalidPayload
    extends StObject
       with ErrorCode
  /* "INVALID_PAYLOAD" */ val InvalidPayload: typings.nats.errorMod.ErrorCode.InvalidPayload & String = js.native
  
  @js.native
  sealed trait JetStream404NoMessages
    extends StObject
       with ErrorCode
  /* "404" */ val JetStream404NoMessages: typings.nats.errorMod.ErrorCode.JetStream404NoMessages & String = js.native
  
  @js.native
  sealed trait JetStream408RequestTimeout
    extends StObject
       with ErrorCode
  /* "408" */ val JetStream408RequestTimeout: typings.nats.errorMod.ErrorCode.JetStream408RequestTimeout & String = js.native
  
  @js.native
  sealed trait JetStream409
    extends StObject
       with ErrorCode
  /* "409" */ val JetStream409: typings.nats.errorMod.ErrorCode.JetStream409 & String = js.native
  
  @js.native
  sealed trait JetStream409MaxAckPendingExceeded
    extends StObject
       with ErrorCode
  /* "409" */ val JetStream409MaxAckPendingExceeded: typings.nats.errorMod.ErrorCode.JetStream409MaxAckPendingExceeded & String = js.native
  
  @js.native
  sealed trait JetStreamInvalidAck
    extends StObject
       with ErrorCode
  /* "JESTREAM_INVALID_ACK" */ val JetStreamInvalidAck: typings.nats.errorMod.ErrorCode.JetStreamInvalidAck & String = js.native
  
  @js.native
  sealed trait JetStreamNotEnabled
    extends StObject
       with ErrorCode
  /* "503" */ val JetStreamNotEnabled: typings.nats.errorMod.ErrorCode.JetStreamNotEnabled & String = js.native
  
  @js.native
  sealed trait MaxPayloadExceeded
    extends StObject
       with ErrorCode
  /* "MAX_PAYLOAD_EXCEEDED" */ val MaxPayloadExceeded: typings.nats.errorMod.ErrorCode.MaxPayloadExceeded & String = js.native
  
  @js.native
  sealed trait NoResponders
    extends StObject
       with ErrorCode
  /* "503" */ val NoResponders: typings.nats.errorMod.ErrorCode.NoResponders & String = js.native
  
  @js.native
  sealed trait NotFunction
    extends StObject
       with ErrorCode
  /* "NOT_FUNC" */ val NotFunction: typings.nats.errorMod.ErrorCode.NotFunction & String = js.native
  
  @js.native
  sealed trait PermissionsViolation
    extends StObject
       with ErrorCode
  /* "PERMISSIONS_VIOLATION" */ val PermissionsViolation: typings.nats.errorMod.ErrorCode.PermissionsViolation & String = js.native
  
  @js.native
  sealed trait ProtocolError
    extends StObject
       with ErrorCode
  /* "NATS_PROTOCOL_ERR" */ val ProtocolError: typings.nats.errorMod.ErrorCode.ProtocolError & String = js.native
  
  @js.native
  sealed trait RequestError
    extends StObject
       with ErrorCode
  /* "REQUEST_ERROR" */ val RequestError: typings.nats.errorMod.ErrorCode.RequestError & String = js.native
  
  @js.native
  sealed trait ServerOptionNotAvailable
    extends StObject
       with ErrorCode
  /* "SERVER_OPT_NA" */ val ServerOptionNotAvailable: typings.nats.errorMod.ErrorCode.ServerOptionNotAvailable & String = js.native
  
  @js.native
  sealed trait SubClosed
    extends StObject
       with ErrorCode
  /* "SUB_CLOSED" */ val SubClosed: typings.nats.errorMod.ErrorCode.SubClosed & String = js.native
  
  @js.native
  sealed trait SubDraining
    extends StObject
       with ErrorCode
  /* "SUB_DRAINING" */ val SubDraining: typings.nats.errorMod.ErrorCode.SubDraining & String = js.native
  
  @js.native
  sealed trait Timeout
    extends StObject
       with ErrorCode
  /* "TIMEOUT" */ val Timeout: typings.nats.errorMod.ErrorCode.Timeout & String = js.native
  
  @js.native
  sealed trait Tls
    extends StObject
       with ErrorCode
  /* "TLS" */ val Tls: typings.nats.errorMod.ErrorCode.Tls & String = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with ErrorCode
  /* "UNKNOWN_ERROR" */ val Unknown: typings.nats.errorMod.ErrorCode.Unknown & String = js.native
  
  @js.native
  sealed trait WssRequired
    extends StObject
       with ErrorCode
  /* "WSS_REQUIRED" */ val WssRequired: typings.nats.errorMod.ErrorCode.WssRequired & String = js.native
}
