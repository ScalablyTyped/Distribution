package typings.openpay.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResponseError extends StObject
@JSImport("openpay", "ResponseError")
@js.native
object ResponseError extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResponseError & Double] = js.native
  
  @js.native
  sealed trait BadRequest
    extends StObject
       with ResponseError
  /* 1001 */ val BadRequest: typings.openpay.mod.ResponseError.BadRequest & Double = js.native
  
  @js.native
  sealed trait BankAccountConflict
    extends StObject
       with ResponseError
  /* 2001 */ val BankAccountConflict: typings.openpay.mod.ResponseError.BankAccountConflict & Double = js.native
  
  @js.native
  sealed trait BankAuthorizationRequired
    extends StObject
       with ResponseError
  /* 3012 */ val BankAuthorizationRequired: typings.openpay.mod.ResponseError.BankAuthorizationRequired & Double = js.native
  
  @js.native
  sealed trait CardConflict
    extends StObject
       with ResponseError
  /* 2002 */ val CardConflict: typings.openpay.mod.ResponseError.CardConflict & Double = js.native
  
  @js.native
  sealed trait CardExpiredOnCharge
    extends StObject
       with ResponseError
  /* 3002 */ val CardExpiredOnCharge: typings.openpay.mod.ResponseError.CardExpiredOnCharge & Double = js.native
  
  @js.native
  sealed trait CardExpiredOnSave
    extends StObject
       with ResponseError
  /* 2005 */ val CardExpiredOnSave: typings.openpay.mod.ResponseError.CardExpiredOnSave & Double = js.native
  
  @js.native
  sealed trait CardPointsUnavailable
    extends StObject
       with ResponseError
  /* 2008 */ val CardPointsUnavailable: typings.openpay.mod.ResponseError.CardPointsUnavailable & Double = js.native
  
  @js.native
  sealed trait Conflict
    extends StObject
       with ResponseError
  /* 1006 */ val Conflict: typings.openpay.mod.ResponseError.Conflict & Double = js.native
  
  @js.native
  sealed trait CustomerExternalIdConflict
    extends StObject
       with ResponseError
  /* 2003 */ val CustomerExternalIdConflict: typings.openpay.mod.ResponseError.CustomerExternalIdConflict & Double = js.native
  
  @js.native
  sealed trait DeclinedCard
    extends StObject
       with ResponseError
  /* 3001 */ val DeclinedCard: typings.openpay.mod.ResponseError.DeclinedCard & Double = js.native
  
  @js.native
  sealed trait DisabledAccount
    extends StObject
       with ResponseError
  /* 1008 */ val DisabledAccount: typings.openpay.mod.ResponseError.DisabledAccount & Double = js.native
  
  @js.native
  sealed trait Forbidden
    extends StObject
       with ResponseError
  /* 1010 */ val Forbidden: typings.openpay.mod.ResponseError.Forbidden & Double = js.native
  
  @js.native
  sealed trait ForbiddenOperation
    extends StObject
       with ResponseError
  /* 3006 */ val ForbiddenOperation: typings.openpay.mod.ResponseError.ForbiddenOperation & Double = js.native
  
  @js.native
  sealed trait FraudulentCard
    extends StObject
       with ResponseError
  /* 3005 */ val FraudulentCard: typings.openpay.mod.ResponseError.FraudulentCard & Double = js.native
  
  @js.native
  sealed trait InsufficientAccountFunds
    extends StObject
       with ResponseError
  /* 4001 */ val InsufficientAccountFunds: typings.openpay.mod.ResponseError.InsufficientAccountFunds & Double = js.native
  
  @js.native
  sealed trait InsufficientCardFunds
    extends StObject
       with ResponseError
  /* 3003 */ val InsufficientCardFunds: typings.openpay.mod.ResponseError.InsufficientCardFunds & Double = js.native
  
  @js.native
  sealed trait InvalidCardSecurityCode
    extends StObject
       with ResponseError
  /* 2009 */ val InvalidCardSecurityCode: typings.openpay.mod.ResponseError.InvalidCardSecurityCode & Double = js.native
  
  @js.native
  sealed trait InvalidCardVerifyingCode
    extends StObject
       with ResponseError
  /* 2004 */ val InvalidCardVerifyingCode: typings.openpay.mod.ResponseError.InvalidCardVerifyingCode & Double = js.native
  
  @js.native
  sealed trait LostCard
    extends StObject
       with ResponseError
  /* 3009 */ val LostCard: typings.openpay.mod.ResponseError.LostCard & Double = js.native
  
  @js.native
  sealed trait MissingCardSecurityCode
    extends StObject
       with ResponseError
  /* 2006 */ val MissingCardSecurityCode: typings.openpay.mod.ResponseError.MissingCardSecurityCode & Double = js.native
  
  @js.native
  sealed trait NotFound
    extends StObject
       with ResponseError
  /* 1005 */ val NotFound: typings.openpay.mod.ResponseError.NotFound & Double = js.native
  
  @js.native
  sealed trait OpenpayInternalError
    extends StObject
       with ResponseError
  /* 1000 */ val OpenpayInternalError: typings.openpay.mod.ResponseError.OpenpayInternalError & Double = js.native
  
  @js.native
  sealed trait RejectedTransaction
    extends StObject
       with ResponseError
  /* 1007 */ val RejectedTransaction: typings.openpay.mod.ResponseError.RejectedTransaction & Double = js.native
  
  @js.native
  sealed trait RequestEntityTooLarge
    extends StObject
       with ResponseError
  /* 1009 */ val RequestEntityTooLarge: typings.openpay.mod.ResponseError.RequestEntityTooLarge & Double = js.native
  
  @js.native
  sealed trait RestrictedCard
    extends StObject
       with ResponseError
  /* 3010 */ val RestrictedCard: typings.openpay.mod.ResponseError.RestrictedCard & Double = js.native
  
  @js.native
  sealed trait RetainedCard
    extends StObject
       with ResponseError
  /* 3011 */ val RetainedCard: typings.openpay.mod.ResponseError.RetainedCard & Double = js.native
  
  @js.native
  sealed trait SandboxCard
    extends StObject
       with ResponseError
  /* 2007 */ val SandboxCard: typings.openpay.mod.ResponseError.SandboxCard & Double = js.native
  
  @js.native
  sealed trait ServiceUnavailable
    extends StObject
       with ResponseError
  /* 1004 */ val ServiceUnavailable: typings.openpay.mod.ResponseError.ServiceUnavailable & Double = js.native
  
  @js.native
  sealed trait StolenCard
    extends StObject
       with ResponseError
  /* 3004 */ val StolenCard: typings.openpay.mod.ResponseError.StolenCard & Double = js.native
  
  @js.native
  sealed trait Unauthorized
    extends StObject
       with ResponseError
  /* 1002 */ val Unauthorized: typings.openpay.mod.ResponseError.Unauthorized & Double = js.native
  
  @js.native
  sealed trait UnprocessableEntity
    extends StObject
       with ResponseError
  /* 1003 */ val UnprocessableEntity: typings.openpay.mod.ResponseError.UnprocessableEntity & Double = js.native
  
  @js.native
  sealed trait UnsupportedCard
    extends StObject
       with ResponseError
  /* 3008 */ val UnsupportedCard: typings.openpay.mod.ResponseError.UnsupportedCard & Double = js.native
}
