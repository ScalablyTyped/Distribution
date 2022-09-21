package typings.nats.natsBaseClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nats/lib/src/nats-base-client", "ErrorCode")
@js.native
object ErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.nats.errorMod.ErrorCode & String] = js.native
  
  /* "BAD API" */ val ApiError: typings.nats.errorMod.ErrorCode.ApiError & String = js.native
  
  /* "AUTHENTICATION_EXPIRED" */ val AuthenticationExpired: typings.nats.errorMod.ErrorCode.AuthenticationExpired & String = js.native
  
  /* "AUTHORIZATION_VIOLATION" */ val AuthorizationViolation: typings.nats.errorMod.ErrorCode.AuthorizationViolation & String = js.native
  
  /* "BAD_AUTHENTICATION" */ val BadAuthentication: typings.nats.errorMod.ErrorCode.BadAuthentication & String = js.native
  
  /* "BAD_CREDS" */ val BadCreds: typings.nats.errorMod.ErrorCode.BadCreds & String = js.native
  
  /* "BAD_HEADER" */ val BadHeader: typings.nats.errorMod.ErrorCode.BadHeader & String = js.native
  
  /* "BAD_JSON" */ val BadJson: typings.nats.errorMod.ErrorCode.BadJson & String = js.native
  
  /* "BAD_PAYLOAD" */ val BadPayload: typings.nats.errorMod.ErrorCode.BadPayload & String = js.native
  
  /* "BAD_SUBJECT" */ val BadSubject: typings.nats.errorMod.ErrorCode.BadSubject & String = js.native
  
  /* "CANCELLED" */ val Cancelled: typings.nats.errorMod.ErrorCode.Cancelled & String = js.native
  
  /* "CONNECTION_CLOSED" */ val ConnectionClosed: typings.nats.errorMod.ErrorCode.ConnectionClosed & String = js.native
  
  /* "CONNECTION_DRAINING" */ val ConnectionDraining: typings.nats.errorMod.ErrorCode.ConnectionDraining & String = js.native
  
  /* "CONNECTION_REFUSED" */ val ConnectionRefused: typings.nats.errorMod.ErrorCode.ConnectionRefused & String = js.native
  
  /* "CONNECTION_TIMEOUT" */ val ConnectionTimeout: typings.nats.errorMod.ErrorCode.ConnectionTimeout & String = js.native
  
  /* "DISCONNECT" */ val Disconnect: typings.nats.errorMod.ErrorCode.Disconnect & String = js.native
  
  /* "INVALID_OPTION" */ val InvalidOption: typings.nats.errorMod.ErrorCode.InvalidOption & String = js.native
  
  /* "INVALID_PAYLOAD" */ val InvalidPayload: typings.nats.errorMod.ErrorCode.InvalidPayload & String = js.native
  
  /* "404" */ val JetStream404NoMessages: typings.nats.errorMod.ErrorCode.JetStream404NoMessages & String = js.native
  
  /* "408" */ val JetStream408RequestTimeout: typings.nats.errorMod.ErrorCode.JetStream408RequestTimeout & String = js.native
  
  /* "409" */ val JetStream409: typings.nats.errorMod.ErrorCode.JetStream409 & String = js.native
  
  /* "409" */ val JetStream409MaxAckPendingExceeded: typings.nats.errorMod.ErrorCode.JetStream409MaxAckPendingExceeded & String = js.native
  
  /* "JESTREAM_INVALID_ACK" */ val JetStreamInvalidAck: typings.nats.errorMod.ErrorCode.JetStreamInvalidAck & String = js.native
  
  /* "503" */ val JetStreamNotEnabled: typings.nats.errorMod.ErrorCode.JetStreamNotEnabled & String = js.native
  
  /* "MAX_PAYLOAD_EXCEEDED" */ val MaxPayloadExceeded: typings.nats.errorMod.ErrorCode.MaxPayloadExceeded & String = js.native
  
  /* "503" */ val NoResponders: typings.nats.errorMod.ErrorCode.NoResponders & String = js.native
  
  /* "NOT_FUNC" */ val NotFunction: typings.nats.errorMod.ErrorCode.NotFunction & String = js.native
  
  /* "PERMISSIONS_VIOLATION" */ val PermissionsViolation: typings.nats.errorMod.ErrorCode.PermissionsViolation & String = js.native
  
  /* "NATS_PROTOCOL_ERR" */ val ProtocolError: typings.nats.errorMod.ErrorCode.ProtocolError & String = js.native
  
  /* "REQUEST_ERROR" */ val RequestError: typings.nats.errorMod.ErrorCode.RequestError & String = js.native
  
  /* "SERVER_OPT_NA" */ val ServerOptionNotAvailable: typings.nats.errorMod.ErrorCode.ServerOptionNotAvailable & String = js.native
  
  /* "SUB_CLOSED" */ val SubClosed: typings.nats.errorMod.ErrorCode.SubClosed & String = js.native
  
  /* "SUB_DRAINING" */ val SubDraining: typings.nats.errorMod.ErrorCode.SubDraining & String = js.native
  
  /* "TIMEOUT" */ val Timeout: typings.nats.errorMod.ErrorCode.Timeout & String = js.native
  
  /* "TLS" */ val Tls: typings.nats.errorMod.ErrorCode.Tls & String = js.native
  
  /* "UNKNOWN_ERROR" */ val Unknown: typings.nats.errorMod.ErrorCode.Unknown & String = js.native
  
  /* "WSS_REQUIRED" */ val WssRequired: typings.nats.errorMod.ErrorCode.WssRequired & String = js.native
}
