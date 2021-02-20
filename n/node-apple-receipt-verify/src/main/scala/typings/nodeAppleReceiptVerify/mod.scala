package typings.nodeAppleReceiptVerify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait ERROR_CODES extends StObject
  @JSImport("node-apple-receipt-verify", "ERROR_CODES")
  @js.native
  object ERROR_CODES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ERROR_CODES with Double] = js.native
    
    /** The receipt could not be authenticated. */
    @js.native
    sealed trait COULD_NOT_AUTHENTICATE extends ERROR_CODES
    /* 21003 */ val COULD_NOT_AUTHENTICATE: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.COULD_NOT_AUTHENTICATE with Double = js.native
    
    /** This receipt could not be authorized. Treat this the same as if a purchase was never made. */
    @js.native
    sealed trait COULD_NOT_AUTHORIZE extends ERROR_CODES
    /* 21010 */ val COULD_NOT_AUTHORIZE: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.COULD_NOT_AUTHORIZE with Double = js.native
    
    /**
      * This receipt is valid but the subscription has expired. When this status code is returned to your server, the receipt data is also decoded and returned as part of the response.
      * Only returned for iOS 6 style transaction receipts for auto-renewable subscriptions.
      */
    @js.native
    sealed trait EXPIRED_SUBSCRIPTION extends ERROR_CODES
    /* 21006 */ val EXPIRED_SUBSCRIPTION: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.EXPIRED_SUBSCRIPTION with Double = js.native
    
    /** The App Store could not read the JSON object you provided. */
    @js.native
    sealed trait INVALID_JSON extends ERROR_CODES
    /* 21000 */ val INVALID_JSON: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.INVALID_JSON with Double = js.native
    
    /** The data in the receipt-data property was malformed or missing. */
    @js.native
    sealed trait INVALID_RECEIPT_DATA extends ERROR_CODES
    /* 21002 */ val INVALID_RECEIPT_DATA: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.INVALID_RECEIPT_DATA with Double = js.native
    
    /** The shared secret you provided does not match the shared secret on file for your account. */
    @js.native
    sealed trait INVALID_SECRET extends ERROR_CODES
    /* 21004 */ val INVALID_SECRET: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.INVALID_SECRET with Double = js.native
    
    /** This receipt is from the production environment, but it was sent to the test environment for verification. Send it to the production environment instead. */
    @js.native
    sealed trait PROD_RECEIPT extends ERROR_CODES
    /* 21008 */ val PROD_RECEIPT: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.PROD_RECEIPT with Double = js.native
    
    /** The receipt validated successfully. */
    @js.native
    sealed trait SUCCESS extends ERROR_CODES
    /* 0 */ val SUCCESS: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.SUCCESS with Double = js.native
    
    /** This receipt is from the test environment, but it was sent to the production environment for verification. Send it to the test environment instead. */
    @js.native
    sealed trait TEST_RECEIPT extends ERROR_CODES
    /* 21007 */ val TEST_RECEIPT: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.TEST_RECEIPT with Double = js.native
    
    /** The receipt server is not currently available. */
    @js.native
    sealed trait UNAVAILABLE extends ERROR_CODES
    /* 21005 */ val UNAVAILABLE: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.UNAVAILABLE with Double = js.native
    
    /** The receipt is valid, but purchased nothing. */
    @js.native
    sealed trait VALID_BUT_EMPTY extends ERROR_CODES
    /* 2 */ val VALID_BUT_EMPTY: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.VALID_BUT_EMPTY with Double = js.native
  }
  
  @JSImport("node-apple-receipt-verify", "EmptyError")
  @js.native
  def EmptyError(): Unit = js.native
  
  @JSImport("node-apple-receipt-verify", "ServiceUnavailableError")
  @js.native
  def ServiceUnavailableError(): Unit = js.native
  
  @JSImport("node-apple-receipt-verify", "config")
  @js.native
  def config(options: ConfigOptions): ConfigOptions = js.native
  
  @JSImport("node-apple-receipt-verify", "extract")
  @js.native
  def extract(options: js.Object): js.Promise[js.Array[js.Object]] = js.native
  
  @JSImport("node-apple-receipt-verify", "resetConfig")
  @js.native
  def resetConfig(): Unit = js.native
  
  @JSImport("node-apple-receipt-verify", "validate")
  @js.native
  def validate(options: ValidateOptions): js.Promise[js.Array[PurchasedProducts]] = js.native
  @JSImport("node-apple-receipt-verify", "validate")
  @js.native
  def validate(
    options: ValidateOptions,
    callback: js.Function2[
      /* error */ ValidationError, 
      /* purchasedProducts */ js.Array[PurchasedProducts], 
      Unit
    ]
  ): Unit = js.native
  
  @js.native
  trait ConfigOptions extends StObject {
    
    var environment: js.UndefOr[js.Array[String]] = js.native
    
    var excludeOldTransactions: js.UndefOr[Boolean] = js.native
    
    var extended: js.UndefOr[Boolean] = js.native
    
    var ignoreExpired: js.UndefOr[Boolean] = js.native
    
    var ignoreExpiredError: js.UndefOr[Boolean] = js.native
    
    var secret: String = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object ConfigOptions {
    
    @scala.inline
    def apply(secret: String): ConfigOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: js.Array[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setEnvironmentVarargs(value: String*): Self = StObject.set(x, "environment", js.Array(value :_*))
      
      @scala.inline
      def setExcludeOldTransactions(value: Boolean): Self = StObject.set(x, "excludeOldTransactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeOldTransactionsUndefined: Self = StObject.set(x, "excludeOldTransactions", js.undefined)
      
      @scala.inline
      def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      @scala.inline
      def setIgnoreExpired(value: Boolean): Self = StObject.set(x, "ignoreExpired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpiredError(value: Boolean): Self = StObject.set(x, "ignoreExpiredError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreExpiredErrorUndefined: Self = StObject.set(x, "ignoreExpiredError", js.undefined)
      
      @scala.inline
      def setIgnoreExpiredUndefined: Self = StObject.set(x, "ignoreExpired", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait PurchasedProducts extends StObject {
    
    // only if extended = true
    var applicationVersion: js.UndefOr[String] = js.native
    
    var bundleId: String = js.native
    
    // only for subscriptions and if extended = true; since v1.5.1
    var environment: js.UndefOr[String] = js.native
    
    var expirationDate: js.UndefOr[Double] = js.native
    
    // only for subscriptions and if extended = true
    var isInIntroOfferPeriod: js.UndefOr[Boolean] = js.native
    
    var isTrialPeriod: js.UndefOr[Boolean] = js.native
    
    // only if extended = true
    var originalApplicationVersion: js.UndefOr[String] = js.native
    
    // only if extended = true
    var originalPurchaseDate: js.UndefOr[Double] = js.native
    
    var productId: String = js.native
    
    var purchaseDate: Double = js.native
    
    var quantity: Double = js.native
    
    var transactionId: String = js.native
  }
  object PurchasedProducts {
    
    @scala.inline
    def apply(bundleId: String, productId: String, purchaseDate: Double, quantity: Double, transactionId: String): PurchasedProducts = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurchasedProducts]
    }
    
    @scala.inline
    implicit class PurchasedProductsMutableBuilder[Self <: PurchasedProducts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
      
      @scala.inline
      def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setIsInIntroOfferPeriod(value: Boolean): Self = StObject.set(x, "isInIntroOfferPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInIntroOfferPeriodUndefined: Self = StObject.set(x, "isInIntroOfferPeriod", js.undefined)
      
      @scala.inline
      def setIsTrialPeriod(value: Boolean): Self = StObject.set(x, "isTrialPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrialPeriodUndefined: Self = StObject.set(x, "isTrialPeriod", js.undefined)
      
      @scala.inline
      def setOriginalApplicationVersion(value: String): Self = StObject.set(x, "originalApplicationVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalApplicationVersionUndefined: Self = StObject.set(x, "originalApplicationVersion", js.undefined)
      
      @scala.inline
      def setOriginalPurchaseDate(value: Double): Self = StObject.set(x, "originalPurchaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalPurchaseDateUndefined: Self = StObject.set(x, "originalPurchaseDate", js.undefined)
      
      @scala.inline
      def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurchaseDate(value: Double): Self = StObject.set(x, "purchaseDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidateOptions extends StObject {
    
    var device: js.UndefOr[String] = js.native
    
    var receipt: String = js.native
  }
  object ValidateOptions {
    
    @scala.inline
    def apply(receipt: String): ValidateOptions = {
      val __obj = js.Dynamic.literal(receipt = receipt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateOptions]
    }
    
    @scala.inline
    implicit class ValidateOptionsMutableBuilder[Self <: ValidateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setReceipt(value: String): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ValidationError extends Error {
    
    var appleStatus: Double = js.native
    
    var isRetryable: Boolean = js.native
  }
  object ValidationError {
    
    @scala.inline
    def apply(appleStatus: Double, isRetryable: Boolean, message: String, name: String): ValidationError = {
      val __obj = js.Dynamic.literal(appleStatus = appleStatus.asInstanceOf[js.Any], isRetryable = isRetryable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppleStatus(value: Double): Self = StObject.set(x, "appleStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRetryable(value: Boolean): Self = StObject.set(x, "isRetryable", value.asInstanceOf[js.Any])
    }
  }
}
