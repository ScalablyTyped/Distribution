package typings.paypalCordovaPlugin

import typings.paypalCordovaPlugin.PayPalCordovaPlugin.PayPalMobileStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  /**
    * @param options A set of options to use. Any options not specified will assume default values.
    */
  class PayPalConfiguration ()
    extends typings.paypalCordovaPlugin.PayPalConfiguration {
    def this(options: PayPalConfigurationOptions) = this()
    /**
      * If set to false, the SDK will only support paying with PayPal, not with credit cards.
      * This applies only to single payments (via PayPalPaymentViewController).
      * Future payments (via PayPalFuturePaymentViewController) always use PayPal.
      * Defaults to true.
      */
    /* CompleteClass */
    override var acceptCreditCards: Boolean = js.native
    /**
      * Will be overridden by email used in most recent PayPal login.
      */
    /* CompleteClass */
    override var defaultUserEmail: String = js.native
    /**
      * Will be overridden by phone country code used in most recent PayPal login
      */
    /* CompleteClass */
    override var defaultUserPhoneCountryCode: String = js.native
    /**
      * Will be overridden by phone number used in most recent PayPal login.
      * @note If you set defaultUserPhoneNumber, be sure to also set defaultUserPhoneCountryCode.
      */
    /* CompleteClass */
    override var defaultUserPhoneNumber: String = js.native
    /**
      * Normally, the SDK blurs the screen when the app is backgrounded,
      * to obscure credit card or PayPal account details in the iOS-saved screenshot.
      * If your app already does its own blurring upon backgrounding, you might choose to disable this.
      * Defaults to false.
      */
    /* CompleteClass */
    override var disableBlurWhenBackgrounding: Boolean = js.native
    /**
      * Sandbox credentials can be difficult to type on a mobile device. Setting this flag to true will
      * cause the sandboxUserPassword and sandboxUserPin to always be pre-populated into login fields.
      *
      * This setting will have no effect if the operation mode is production.
      * Defaults to false.
      */
    /* CompleteClass */
    override var forceDefaultsInSandbox: Boolean = js.native
    /**
      * If not set, or if set to nil, defaults to the device's current language setting.
      *
      * Can be specified as a language code ("en", "fr", "zh-Hans", etc.) or as a locale ("en_AU", "fr_FR", "zh-Hant_HK", etc.).
      * If the library does not contain localized strings for a specified locale, then will fall back to the language. E.g., "es_CO" -> "es".
      * If the library does not contain localized strings for a specified language, then will fall back to American English.
      *
      * If you specify only a language code, and that code matches the device's currently preferred language,
      * then the library will attempt to use the device's current region as well.
      * E.g., specifying "en" on a device set to "English" and "United Kingdom" will result in "en_GB".
      *
      * These localizations are currently included:
      * da,de,en,en_AU,en_GB,en_SV,es,es_MX,fr,he,it,ja,ko,nb,nl,pl,pt,pt_BR,ru,sv,tr,zh-Hans,zh-Hant_HK,zh-Hant_TW.
      */
    /* CompleteClass */
    override var languageOrLocale: String = js.native
    /**
      * Your company name, as it should be displayed to the user
      * when requesting consent via a PayPalFuturePaymentViewController.
      */
    /* CompleteClass */
    override var merchantName: String = js.native
    /**
      * URL of your company's privacy policy, which will be offered to the user
      * when requesting consent via a PayPalFuturePaymentViewController.
      */
    /* CompleteClass */
    override var merchantPrivacyPolicyURL: String = js.native
    /**
      * URL of your company's user agreement, which will be offered to the user
      * when requesting consent via a PayPalFuturePaymentViewController.
      */
    /* CompleteClass */
    override var merchantUserAgreementURL: String = js.native
    /**
      * For single payments, options for the shipping address.
      *
      * - 0 - PayPalShippingAddressOptionNone: no shipping address applies.
      *
      * - 1 - PayPalShippingAddressOptionProvided: shipping address will be provided by your app,
      *   in the shippingAddress property of PayPalPayment.
      *
      * - 2 - PayPalShippingAddressOptionPayPal: user will choose from shipping addresses on file
      *   for their PayPal account.
      *
      * - 3 - PayPalShippingAddressOptionBoth: user will choose from the shipping address provided by your app,
      *   in the shippingAddress property of PayPalPayment, plus the shipping addresses on file for the user's PayPal account.
      *
      * Defaults to 0 (PayPalShippingAddressOptionNone).
      */
    /* CompleteClass */
    override var payPalShippingAddressOption: Double = js.native
    /**
      * If you will present the SDK's view controller within a popover, then set this property to true.
      * Defaults to false. (iOS only)
      */
    /* CompleteClass */
    override var presentingInPopover: Boolean = js.native
    /**
      * If set to true, then if the user pays via their PayPal account,
      * the SDK will remember the user's PayPal username or phone number;
      * if the user pays via their credit card, then the SDK will remember
      * the PayPal Vault token representing the user's credit card.
      *
      * If set to false, then any previously-remembered username, phone number, or
      * credit card token will be erased, and subsequent payment information will
      * not be remembered.
      *
      * Defaults to true.
      */
    /* CompleteClass */
    override var rememberUser: Boolean = js.native
    /**
      * Password to use for sandbox if 'forceDefaultsInSandbox' is set.
      */
    /* CompleteClass */
    override var sandboxUserPassword: String = js.native
    /**
      * PIN to use for sandbox if 'forceDefaultsInSandbox' is set.
      */
    /* CompleteClass */
    override var sandboxUserPin: String = js.native
  }
  
  @js.native
  class PayPalItem protected ()
    extends typings.paypalCordovaPlugin.PayPalItem {
    /**
      * @param name Name of the item. 127 characters max.
      * @param quantity Number of units. 10 characters max.
      * @param price Unit price for this item 10 characters max.
      * May be negative for "coupon" etc.
      * @param currency ISO standard currency code.
      * @param sku The stock keeping unit for this item. 50 characters max (optional).
      */
    def this(name: String, quantity: Double, price: String, currency: String) = this()
    def this(name: String, quantity: Double, price: String, currency: String, sku: String) = this()
    /**
      * ISO standard currency code.
      */
    /* CompleteClass */
    override var currency: String = js.native
    /**
      * Name of the item. 127 characters max.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Unit price for this item 10 characters max.
      * May be negative for "coupon" etc.
      */
    /* CompleteClass */
    override var price: String = js.native
    /**
      * Number of units. 10 characters max.
      */
    /* CompleteClass */
    override var quantity: Double = js.native
    /**
      * The stock keeping unit for this item. 50 characters max (optional).
      */
    /* CompleteClass */
    override var sku: String = js.native
  }
  
  /**
    * Convenience constructor. Returns a PayPalPayment with the specified amount, currency code, and short description.
    */
  @js.native
  class PayPalPayment protected ()
    extends typings.paypalCordovaPlugin.PayPalPayment {
    /**
      * @param amount The amount of the payment.
      * @param currencyCode The ISO 4217 currency for the payment.
      * @param shortDescription A short descripton of the payment.
      * @param intent • "Sale" for an immediate payment.
      * • "Auth" for payment authorization only, to be captured separately at a later time.
      * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
      * @param details PayPalPaymentDetails object (optional).
      */
    def this(amount: String, currency: String, shortDescription: String, intent: String) = this()
    def this(
      amount: String,
      currency: String,
      shortDescription: String,
      intent: String,
      details: typings.paypalCordovaPlugin.PayPalPaymentDetails
    ) = this()
    /**
      * The amount of the payment.
      */
    /* CompleteClass */
    override var amount: String = js.native
    /**
      * Optional Build Notation code ("BN code"), obtained from partnerprogram@paypal.com, for your tracking purposes.
      */
    /* CompleteClass */
    override var bnCode: String = js.native
    /**
      * The ISO 4217 currency for the payment.
      */
    /* CompleteClass */
    override var currency: String = js.native
    /**
      * Optional text, for your tracking purposes. (up to 256 characters).
      */
    /* CompleteClass */
    override var custom: String = js.native
    /**
      * PayPalPaymentDetails object (optional).
      */
    /* CompleteClass */
    override var details: typings.paypalCordovaPlugin.PayPalPaymentDetails = js.native
    /**
      * • "Sale" for an immediate payment.
      * • "Auth" for payment authorization only, to be captured separately at a later time.
      * • "Order" for taking an order, with authorization and capture to be done separately at a later time.
      */
    /* CompleteClass */
    override var intent: String = js.native
    /**
      * Optional invoice number, for your tracking purposes. (up to 256 characters).
      */
    /* CompleteClass */
    override var invoiceNumber: String = js.native
    /**
      * Optional array of PayPalItem objects.
      * @see PayPalItem
      * @note If you provide one or more items, be sure that the various prices correctly sum to the payment `amount` or to `paymentDetails.subtotal`.
      */
    /* CompleteClass */
    override var items: js.Array[typings.paypalCordovaPlugin.PayPalItem] = js.native
    /**
      * Optional customer shipping address, if your app wishes to provide this to the SDK.
      * @note make sure to set `payPalShippingAddressOption` in PayPalConfiguration to 1 or 3.
      */
    /* CompleteClass */
    override var shippingAddress: typings.paypalCordovaPlugin.PayPalShippingAddress = js.native
    /**
      * A short descripton of the payment.
      */
    /* CompleteClass */
    override var shortDescription: String = js.native
    /**
      * Optional text which will appear on the customer's credit card statement. (up to 22 characters).
      */
    /* CompleteClass */
    override var softDescriptor: String = js.native
  }
  
  /**
    * The PayPalPaymentDetails class defines optional amount details.
    *
    * @see https://developer.paypal.com/webapps/developer/docs/api/#details-object for more details.
    */
  @js.native
  class PayPalPaymentDetails protected ()
    extends typings.paypalCordovaPlugin.PayPalPaymentDetails {
    /**
      * @param subtotal Sub-total (amount) of items being paid for. 10 characters max with support for 2 decimal places.
      * @param shipping Amount charged for shipping. 10 characters max with support for 2 decimal places.
      * @param tax Amount charged for tax. 10 characters max with support for 2 decimal places.
      */
    def this(subtotal: String, shipping: String, tax: String) = this()
    /**
      * Amount charged for shipping. 10 characters max with support for 2 decimal places.
      */
    /* CompleteClass */
    override var shipping: String = js.native
    /**
      * Sub-total (amount) of items being paid for. 10 characters max with support for 2 decimal places.
      */
    /* CompleteClass */
    override var subtotal: String = js.native
    /**
      * Amount charged for tax. 10 characters max with support for 2 decimal places.
      */
    /* CompleteClass */
    override var tax: String = js.native
  }
  
  @js.native
  class PayPalShippingAddress protected ()
    extends typings.paypalCordovaPlugin.PayPalShippingAddress {
    /**
      * @param recipientName Name of the recipient at this address. 50 characters max.
      * @param line1 Line 1 of the address (e.g., Number, street, etc). 100 characters max.
      * @param line2 Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
      * @param city City name. 50 characters max.
      * @param state 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
      * @param postalCode ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
      * @param countryCode 2-letter country code. 2 characters max.
      */
    def this(
      recipientName: String,
      line1: String,
      line2: String,
      city: String,
      state: String,
      postalCode: String,
      countryCode: String
    ) = this()
    /**
      * City name. 50 characters max.
      */
    /* CompleteClass */
    override var city: String = js.native
    /**
      * 2-letter country code. 2 characters max.
      */
    /* CompleteClass */
    override var countryCode: String = js.native
    /**
      * Line 1 of the address (e.g., Number, street, etc). 100 characters max.
      */
    /* CompleteClass */
    override var line1: String = js.native
    /**
      * Line 2 of the address (e.g., Suite, apt #, etc). 100 characters max. Optional.
      */
    /* CompleteClass */
    override var line2: String = js.native
    /**
      * ZIP code or equivalent is usually required for countries that have them. 20 characters max. Required in certain countries.
      */
    /* CompleteClass */
    override var postalCode: String = js.native
    /**
      * Name of the recipient at this address. 50 characters max.
      */
    /* CompleteClass */
    override var recipientName: String = js.native
    /**
      * 2-letter code for US states, and the equivalent for other countries. 100 characters max. Required in certain countries.
      */
    /* CompleteClass */
    override var state: String = js.native
  }
  
  var PayPalMobile: PayPalMobileStatic = js.native
  //#endregion
  //#region cdv-plugin-paypal-mobile-sdk.js
  @js.native
  object PayPalCordovaPlugin extends js.Object
  
}

