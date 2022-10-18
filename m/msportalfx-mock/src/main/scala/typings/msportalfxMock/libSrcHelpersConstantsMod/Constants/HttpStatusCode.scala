package typings.msportalfxMock.libSrcHelpersConstantsMod.Constants

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpStatusCode extends StObject
/**
  * Http status codes
  */
@JSImport("msportalfx-mock/lib/src/Helpers/constants", "Constants.HttpStatusCode")
@js.native
object HttpStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpStatusCode & Double] = js.native
  
  @js.native
  sealed trait Accepted
    extends StObject
       with HttpStatusCode
  /* 202 */ val Accepted: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Accepted & Double = js.native
  
  @js.native
  sealed trait Ambiguous
    extends StObject
       with HttpStatusCode
  /* 300 */ val Ambiguous: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Ambiguous & Double = js.native
  
  @js.native
  sealed trait BadGateway
    extends StObject
       with HttpStatusCode
  /* 502 */ val BadGateway: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.BadGateway & Double = js.native
  
  @js.native
  sealed trait BadRequest
    extends StObject
       with HttpStatusCode
  /* 400 */ val BadRequest: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.BadRequest & Double = js.native
  
  @js.native
  sealed trait Conflict
    extends StObject
       with HttpStatusCode
  /* 409 */ val Conflict: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Conflict & Double = js.native
  
  @js.native
  sealed trait Continue
    extends StObject
       with HttpStatusCode
  /* 100 */ val Continue: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Continue & Double = js.native
  
  @js.native
  sealed trait Created
    extends StObject
       with HttpStatusCode
  /* 201 */ val Created: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Created & Double = js.native
  
  @js.native
  sealed trait ExpectationFailed
    extends StObject
       with HttpStatusCode
  /* 417 */ val ExpectationFailed: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ExpectationFailed & Double = js.native
  
  @js.native
  sealed trait Forbidden
    extends StObject
       with HttpStatusCode
  /* 403 */ val Forbidden: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Forbidden & Double = js.native
  
  @js.native
  sealed trait Found
    extends StObject
       with HttpStatusCode
  /* 302 */ val Found: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Found & Double = js.native
  
  @js.native
  sealed trait GatewayTimeout
    extends StObject
       with HttpStatusCode
  /* 504 */ val GatewayTimeout: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.GatewayTimeout & Double = js.native
  
  @js.native
  sealed trait Gone
    extends StObject
       with HttpStatusCode
  /* 410 */ val Gone: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Gone & Double = js.native
  
  @js.native
  sealed trait HttpVersionNotSupported
    extends StObject
       with HttpStatusCode
  /* 505 */ val HttpVersionNotSupported: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.HttpVersionNotSupported & Double = js.native
  
  @js.native
  sealed trait InternalServerError
    extends StObject
       with HttpStatusCode
  /* 500 */ val InternalServerError: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.InternalServerError & Double = js.native
  
  @js.native
  sealed trait LengthRequired
    extends StObject
       with HttpStatusCode
  /* 411 */ val LengthRequired: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.LengthRequired & Double = js.native
  
  @js.native
  sealed trait MethodNotAllowed
    extends StObject
       with HttpStatusCode
  /* 405 */ val MethodNotAllowed: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.MethodNotAllowed & Double = js.native
  
  @js.native
  sealed trait Moved
    extends StObject
       with HttpStatusCode
  /* 301 */ val Moved: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Moved & Double = js.native
  
  @js.native
  sealed trait MovedPermanently
    extends StObject
       with HttpStatusCode
  /* 301 */ val MovedPermanently: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.MovedPermanently & Double = js.native
  
  @js.native
  sealed trait MultipleChoices
    extends StObject
       with HttpStatusCode
  /* 300 */ val MultipleChoices: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.MultipleChoices & Double = js.native
  
  @js.native
  sealed trait NoContent
    extends StObject
       with HttpStatusCode
  /* 204 */ val NoContent: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NoContent & Double = js.native
  
  @js.native
  sealed trait NonAuthoritativeInformation
    extends StObject
       with HttpStatusCode
  /* 203 */ val NonAuthoritativeInformation: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NonAuthoritativeInformation & Double = js.native
  
  @js.native
  sealed trait NotAcceptable
    extends StObject
       with HttpStatusCode
  /* 406 */ val NotAcceptable: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotAcceptable & Double = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with HttpStatusCode
  /* 404 */ val NotFound: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotFound & Double = js.native
  
  @js.native
  sealed trait NotImplemented
    extends StObject
       with HttpStatusCode
  /* 501 */ val NotImplemented: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotImplemented & Double = js.native
  
  @js.native
  sealed trait NotModified
    extends StObject
       with HttpStatusCode
  /* 304 */ val NotModified: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.NotModified & Double = js.native
  
  @js.native
  sealed trait Ok
    extends StObject
       with HttpStatusCode
  /* 200 */ val Ok: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Ok & Double = js.native
  
  @js.native
  sealed trait PartialContent
    extends StObject
       with HttpStatusCode
  /* 206 */ val PartialContent: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.PartialContent & Double = js.native
  
  @js.native
  sealed trait PaymentRequired
    extends StObject
       with HttpStatusCode
  /* 402 */ val PaymentRequired: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.PaymentRequired & Double = js.native
  
  @js.native
  sealed trait PreconditionFailed
    extends StObject
       with HttpStatusCode
  /* 412 */ val PreconditionFailed: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.PreconditionFailed & Double = js.native
  
  @js.native
  sealed trait ProxyAuthenticationRequired
    extends StObject
       with HttpStatusCode
  /* 407 */ val ProxyAuthenticationRequired: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ProxyAuthenticationRequired & Double = js.native
  
  @js.native
  sealed trait Redirect
    extends StObject
       with HttpStatusCode
  /* 302 */ val Redirect: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Redirect & Double = js.native
  
  @js.native
  sealed trait RedirectKeepVerb
    extends StObject
       with HttpStatusCode
  /* 307 */ val RedirectKeepVerb: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RedirectKeepVerb & Double = js.native
  
  @js.native
  sealed trait RedirectMethod
    extends StObject
       with HttpStatusCode
  /* 303 */ val RedirectMethod: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RedirectMethod & Double = js.native
  
  @js.native
  sealed trait RequestEntityTooLarge
    extends StObject
       with HttpStatusCode
  /* 413 */ val RequestEntityTooLarge: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestEntityTooLarge & Double = js.native
  
  @js.native
  sealed trait RequestTimeout
    extends StObject
       with HttpStatusCode
  /* 408 */ val RequestTimeout: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestTimeout & Double = js.native
  
  @js.native
  sealed trait RequestUriTooLong
    extends StObject
       with HttpStatusCode
  /* 414 */ val RequestUriTooLong: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestUriTooLong & Double = js.native
  
  @js.native
  sealed trait RequestedRangeNotSatisfiable
    extends StObject
       with HttpStatusCode
  /* 416 */ val RequestedRangeNotSatisfiable: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.RequestedRangeNotSatisfiable & Double = js.native
  
  @js.native
  sealed trait ResetContent
    extends StObject
       with HttpStatusCode
  /* 205 */ val ResetContent: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ResetContent & Double = js.native
  
  @js.native
  sealed trait SeeOther
    extends StObject
       with HttpStatusCode
  /* 303 */ val SeeOther: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.SeeOther & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with HttpStatusCode
  /* 503 */ val ServiceUnavailable: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait SwitchingProtocols
    extends StObject
       with HttpStatusCode
  /* 101 */ val SwitchingProtocols: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.SwitchingProtocols & Double = js.native
  
  @js.native
  sealed trait TemporaryRedirect
    extends StObject
       with HttpStatusCode
  /* 307 */ val TemporaryRedirect: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.TemporaryRedirect & Double = js.native
  
  @js.native
  sealed trait Unauthorized
    extends StObject
       with HttpStatusCode
  /* 401 */ val Unauthorized: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Unauthorized & Double = js.native
  
  @js.native
  sealed trait UnsupportedMediaType
    extends StObject
       with HttpStatusCode
  /* 415 */ val UnsupportedMediaType: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.UnsupportedMediaType & Double = js.native
  
  @js.native
  sealed trait Unused
    extends StObject
       with HttpStatusCode
  /* 306 */ val Unused: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.Unused & Double = js.native
  
  @js.native
  sealed trait UpgradeRequired
    extends StObject
       with HttpStatusCode
  /* 426 */ val UpgradeRequired: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.UpgradeRequired & Double = js.native
  
  @js.native
  sealed trait UseProxy
    extends StObject
       with HttpStatusCode
  /* 305 */ val UseProxy: typings.msportalfxMock.libSrcHelpersConstantsMod.Constants.HttpStatusCode.UseProxy & Double = js.native
}
