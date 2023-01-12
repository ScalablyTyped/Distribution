package typings.nodeAppleReceiptVerify

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-apple-receipt-verify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait ERROR_CODES extends StObject
  @JSImport("node-apple-receipt-verify", "ERROR_CODES")
  @js.native
  object ERROR_CODES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ERROR_CODES & Double] = js.native
    
    /** The receipt could not be authenticated. */
    @js.native
    sealed trait COULD_NOT_AUTHENTICATE
      extends StObject
         with ERROR_CODES
    /* 21003 */ val COULD_NOT_AUTHENTICATE: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.COULD_NOT_AUTHENTICATE & Double = js.native
    
    /** This receipt could not be authorized. Treat this the same as if a purchase was never made. */
    @js.native
    sealed trait COULD_NOT_AUTHORIZE
      extends StObject
         with ERROR_CODES
    /* 21010 */ val COULD_NOT_AUTHORIZE: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.COULD_NOT_AUTHORIZE & Double = js.native
    
    /**
      * This receipt is valid but the subscription has expired. When this status code is returned to your server, the receipt data is also decoded and returned as part of the response.
      * Only returned for iOS 6 style transaction receipts for auto-renewable subscriptions.
      */
    @js.native
    sealed trait EXPIRED_SUBSCRIPTION
      extends StObject
         with ERROR_CODES
    /* 21006 */ val EXPIRED_SUBSCRIPTION: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.EXPIRED_SUBSCRIPTION & Double = js.native
    
    /** The App Store could not read the JSON object you provided. */
    @js.native
    sealed trait INVALID_JSON
      extends StObject
         with ERROR_CODES
    /* 21000 */ val INVALID_JSON: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.INVALID_JSON & Double = js.native
    
    /** The data in the receipt-data property was malformed or missing. */
    @js.native
    sealed trait INVALID_RECEIPT_DATA
      extends StObject
         with ERROR_CODES
    /* 21002 */ val INVALID_RECEIPT_DATA: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.INVALID_RECEIPT_DATA & Double = js.native
    
    /** The shared secret you provided does not match the shared secret on file for your account. */
    @js.native
    sealed trait INVALID_SECRET
      extends StObject
         with ERROR_CODES
    /* 21004 */ val INVALID_SECRET: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.INVALID_SECRET & Double = js.native
    
    /** This receipt is from the production environment, but it was sent to the test environment for verification. Send it to the production environment instead. */
    @js.native
    sealed trait PROD_RECEIPT
      extends StObject
         with ERROR_CODES
    /* 21008 */ val PROD_RECEIPT: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.PROD_RECEIPT & Double = js.native
    
    /** The receipt validated successfully. */
    @js.native
    sealed trait SUCCESS
      extends StObject
         with ERROR_CODES
    /* 0 */ val SUCCESS: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.SUCCESS & Double = js.native
    
    /** This receipt is from the test environment, but it was sent to the production environment for verification. Send it to the test environment instead. */
    @js.native
    sealed trait TEST_RECEIPT
      extends StObject
         with ERROR_CODES
    /* 21007 */ val TEST_RECEIPT: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.TEST_RECEIPT & Double = js.native
    
    /** The receipt server is not currently available. */
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with ERROR_CODES
    /* 21005 */ val UNAVAILABLE: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.UNAVAILABLE & Double = js.native
    
    /** The receipt is valid, but purchased nothing. */
    @js.native
    sealed trait VALID_BUT_EMPTY
      extends StObject
         with ERROR_CODES
    /* 2 */ val VALID_BUT_EMPTY: typings.nodeAppleReceiptVerify.mod.ERROR_CODES.VALID_BUT_EMPTY & Double = js.native
  }
  
  inline def EmptyError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EmptyError")().asInstanceOf[Unit]
  
  inline def ServiceUnavailableError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ServiceUnavailableError")().asInstanceOf[Unit]
  
  inline def config(options: ConfigOptions): ConfigOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[ConfigOptions]
  
  inline def extract(options: js.Object): js.Promise[js.Array[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Object]]]
  
  inline def resetConfig(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfig")().asInstanceOf[Unit]
  
  inline def validate(options: ValidateOptions): js.Promise[js.Array[PurchasedProducts]] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[PurchasedProducts]]]
  inline def validate(
    options: ValidateOptions,
    callback: js.Function2[
      /* error */ ValidationError, 
      /* purchasedProducts */ js.Array[PurchasedProducts], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ConfigOptions extends StObject {
    
    var environment: js.UndefOr[js.Array[String]] = js.undefined
    
    var excludeOldTransactions: js.UndefOr[Boolean] = js.undefined
    
    var extended: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpired: js.UndefOr[Boolean] = js.undefined
    
    var ignoreExpiredError: js.UndefOr[Boolean] = js.undefined
    
    var secret: String
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigOptions {
    
    inline def apply(secret: String): ConfigOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
      
      inline def setEnvironment(value: js.Array[String]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setEnvironmentVarargs(value: String*): Self = StObject.set(x, "environment", js.Array(value*))
      
      inline def setExcludeOldTransactions(value: Boolean): Self = StObject.set(x, "excludeOldTransactions", value.asInstanceOf[js.Any])
      
      inline def setExcludeOldTransactionsUndefined: Self = StObject.set(x, "excludeOldTransactions", js.undefined)
      
      inline def setExtended(value: Boolean): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      inline def setExtendedUndefined: Self = StObject.set(x, "extended", js.undefined)
      
      inline def setIgnoreExpired(value: Boolean): Self = StObject.set(x, "ignoreExpired", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpiredError(value: Boolean): Self = StObject.set(x, "ignoreExpiredError", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExpiredErrorUndefined: Self = StObject.set(x, "ignoreExpiredError", js.undefined)
      
      inline def setIgnoreExpiredUndefined: Self = StObject.set(x, "ignoreExpired", js.undefined)
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait PurchasedProducts extends StObject {
    
    // only if extended = true
    var applicationVersion: js.UndefOr[String] = js.undefined
    
    var bundleId: String
    
    // only for subscriptions and if extended = true; since v1.5.1
    var environment: js.UndefOr[String] = js.undefined
    
    var expirationDate: js.UndefOr[Double] = js.undefined
    
    // only for subscriptions and if extended = true
    var isInIntroOfferPeriod: js.UndefOr[Boolean] = js.undefined
    
    var isTrialPeriod: js.UndefOr[Boolean] = js.undefined
    
    // only if extended = true
    var originalApplicationVersion: js.UndefOr[String] = js.undefined
    
    // only if extended = true
    var originalPurchaseDate: js.UndefOr[Double] = js.undefined
    
    var productId: String
    
    var purchaseDate: Double
    
    var quantity: Double
    
    var transactionId: String
  }
  object PurchasedProducts {
    
    inline def apply(bundleId: String, productId: String, purchaseDate: Double, quantity: Double, transactionId: String): PurchasedProducts = {
      val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], purchaseDate = purchaseDate.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PurchasedProducts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PurchasedProducts] (val x: Self) extends AnyVal {
      
      inline def setApplicationVersion(value: String): Self = StObject.set(x, "applicationVersion", value.asInstanceOf[js.Any])
      
      inline def setApplicationVersionUndefined: Self = StObject.set(x, "applicationVersion", js.undefined)
      
      inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setIsInIntroOfferPeriod(value: Boolean): Self = StObject.set(x, "isInIntroOfferPeriod", value.asInstanceOf[js.Any])
      
      inline def setIsInIntroOfferPeriodUndefined: Self = StObject.set(x, "isInIntroOfferPeriod", js.undefined)
      
      inline def setIsTrialPeriod(value: Boolean): Self = StObject.set(x, "isTrialPeriod", value.asInstanceOf[js.Any])
      
      inline def setIsTrialPeriodUndefined: Self = StObject.set(x, "isTrialPeriod", js.undefined)
      
      inline def setOriginalApplicationVersion(value: String): Self = StObject.set(x, "originalApplicationVersion", value.asInstanceOf[js.Any])
      
      inline def setOriginalApplicationVersionUndefined: Self = StObject.set(x, "originalApplicationVersion", js.undefined)
      
      inline def setOriginalPurchaseDate(value: Double): Self = StObject.set(x, "originalPurchaseDate", value.asInstanceOf[js.Any])
      
      inline def setOriginalPurchaseDateUndefined: Self = StObject.set(x, "originalPurchaseDate", js.undefined)
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setPurchaseDate(value: Double): Self = StObject.set(x, "purchaseDate", value.asInstanceOf[js.Any])
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidateOptions extends StObject {
    
    var device: js.UndefOr[String] = js.undefined
    
    var receipt: String
  }
  object ValidateOptions {
    
    inline def apply(receipt: String): ValidateOptions = {
      val __obj = js.Dynamic.literal(receipt = receipt.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidateOptions] (val x: Self) extends AnyVal {
      
      inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setReceipt(value: String): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValidationError
    extends StObject
       with Error {
    
    var appleStatus: Double
    
    var isRetryable: Boolean
  }
  object ValidationError {
    
    inline def apply(appleStatus: Double, isRetryable: Boolean, message: String, name: String): ValidationError = {
      val __obj = js.Dynamic.literal(appleStatus = appleStatus.asInstanceOf[js.Any], isRetryable = isRetryable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setAppleStatus(value: Double): Self = StObject.set(x, "appleStatus", value.asInstanceOf[js.Any])
      
      inline def setIsRetryable(value: Boolean): Self = StObject.set(x, "isRetryable", value.asInstanceOf[js.Any])
    }
  }
}
