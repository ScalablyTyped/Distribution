package typings.nodeAppleReceiptVerify.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERROR_CODES extends js.Object
@JSImport("node-apple-receipt-verify", "ERROR_CODES")
@js.native
object ERROR_CODES extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERROR_CODES with Double] = js.native
  
  /** The receipt could not be authenticated. */
  @js.native
  sealed trait COULD_NOT_AUTHENTICATE extends ERROR_CODES
  /* 21003 */ @js.native
  object COULD_NOT_AUTHENTICATE extends TopLevel[COULD_NOT_AUTHENTICATE with Double]
  
  /** This receipt could not be authorized. Treat this the same as if a purchase was never made. */
  @js.native
  sealed trait COULD_NOT_AUTHORIZE extends ERROR_CODES
  /* 21010 */ @js.native
  object COULD_NOT_AUTHORIZE extends TopLevel[COULD_NOT_AUTHORIZE with Double]
  
  /**
    * This receipt is valid but the subscription has expired. When this status code is returned to your server, the receipt data is also decoded and returned as part of the response.
    * Only returned for iOS 6 style transaction receipts for auto-renewable subscriptions.
    */
  @js.native
  sealed trait EXPIRED_SUBSCRIPTION extends ERROR_CODES
  /* 21006 */ @js.native
  object EXPIRED_SUBSCRIPTION extends TopLevel[EXPIRED_SUBSCRIPTION with Double]
  
  /** The App Store could not read the JSON object you provided. */
  @js.native
  sealed trait INVALID_JSON extends ERROR_CODES
  /* 21000 */ @js.native
  object INVALID_JSON extends TopLevel[INVALID_JSON with Double]
  
  /** The data in the receipt-data property was malformed or missing. */
  @js.native
  sealed trait INVALID_RECEIPT_DATA extends ERROR_CODES
  /* 21002 */ @js.native
  object INVALID_RECEIPT_DATA extends TopLevel[INVALID_RECEIPT_DATA with Double]
  
  /** The shared secret you provided does not match the shared secret on file for your account. */
  @js.native
  sealed trait INVALID_SECRET extends ERROR_CODES
  /* 21004 */ @js.native
  object INVALID_SECRET extends TopLevel[INVALID_SECRET with Double]
  
  /** This receipt is from the production environment, but it was sent to the test environment for verification. Send it to the production environment instead. */
  @js.native
  sealed trait PROD_RECEIPT extends ERROR_CODES
  /* 21008 */ @js.native
  object PROD_RECEIPT extends TopLevel[PROD_RECEIPT with Double]
  
  /** The receipt validated successfully. */
  @js.native
  sealed trait SUCCESS extends ERROR_CODES
  /* 0 */ @js.native
  object SUCCESS extends TopLevel[SUCCESS with Double]
  
  /** This receipt is from the test environment, but it was sent to the production environment for verification. Send it to the test environment instead. */
  @js.native
  sealed trait TEST_RECEIPT extends ERROR_CODES
  /* 21007 */ @js.native
  object TEST_RECEIPT extends TopLevel[TEST_RECEIPT with Double]
  
  /** The receipt server is not currently available. */
  @js.native
  sealed trait UNAVAILABLE extends ERROR_CODES
  /* 21005 */ @js.native
  object UNAVAILABLE extends TopLevel[UNAVAILABLE with Double]
  
  /** The receipt is valid, but purchased nothing. */
  @js.native
  sealed trait VALID_BUT_EMPTY extends ERROR_CODES
  /* 2 */ @js.native
  object VALID_BUT_EMPTY extends TopLevel[VALID_BUT_EMPTY with Double]
}
