package typings.paypalCordovaPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the options that can be passed into the PayPalConfiguration class constructor.
  */
trait PayPalConfigurationOptions extends StObject {
  
  /**
    * If set to false, the SDK will only support paying with PayPal, not with credit cards.
    * This applies only to single payments (via PayPalPaymentViewController).
    * Future payments (via PayPalFuturePaymentViewController) always use PayPal.
    * Defaults to true.
    */
  var acceptCreditCards: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will be overridden by email used in most recent PayPal login.
    */
  var defaultUserEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Will be overridden by phone country code used in most recent PayPal login
    */
  var defaultUserPhoneCountryCode: js.UndefOr[String] = js.undefined
  
  /**
    * Will be overridden by phone number used in most recent PayPal login.
    * @note If you set defaultUserPhoneNumber, be sure to also set defaultUserPhoneCountryCode.
    */
  var defaultUserPhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Normally, the SDK blurs the screen when the app is backgrounded,
    * to obscure credit card or PayPal account details in the iOS-saved screenshot.
    * If your app already does its own blurring upon backgrounding, you might choose to disable this.
    * Defaults to false.
    */
  var disableBlurWhenBackgrounding: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sandbox credentials can be difficult to type on a mobile device. Setting this flag to true will
    * cause the sandboxUserPassword and sandboxUserPin to always be pre-populated into login fields.
    *
    * This setting will have no effect if the operation mode is production.
    * Defaults to false.
    */
  var forceDefaultsInSandbox: js.UndefOr[Boolean] = js.undefined
  
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
  var languageOrLocale: js.UndefOr[String] = js.undefined
  
  /**
    * Your company name, as it should be displayed to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantName: js.UndefOr[String] = js.undefined
  
  /**
    * URL of your company's privacy policy, which will be offered to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantPrivacyPolicyURL: js.UndefOr[String] = js.undefined
  
  /**
    * URL of your company's user agreement, which will be offered to the user
    * when requesting consent via a PayPalFuturePaymentViewController.
    */
  var merchantUserAgreementURL: js.UndefOr[String] = js.undefined
  
  /**
    * For single payments, options for the shipping address.
    *
    * - 0 - PayPalShippingAddressOptionNone?: no shipping address applies.
    *
    * - 1 - PayPalShippingAddressOptionProvided?: shipping address will be provided by your app,
    *   in the shippingAddress property of PayPalPayment.
    *
    * - 2 - PayPalShippingAddressOptionPayPal?: user will choose from shipping addresses on file
    *   for their PayPal account.
    *
    * - 3 - PayPalShippingAddressOptionBoth?: user will choose from the shipping address provided by your app,
    *   in the shippingAddress property of PayPalPayment, plus the shipping addresses on file for the user's PayPal account.
    *
    * Defaults to 0 (PayPalShippingAddressOptionNone).
    */
  var payPalShippingAddressOption: js.UndefOr[Double] = js.undefined
  
  /**
    * If you will present the SDK's view controller within a popover, then set this property to true.
    * Defaults to false. (iOS only)
    */
  var presentingInPopover: js.UndefOr[Boolean] = js.undefined
  
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
  var rememberUser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Password to use for sandbox if 'forceDefaultsInSandbox' is set.
    */
  var sandboxUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * PIN to use for sandbox if 'forceDefaultsInSandbox' is set.
    */
  var sandboxUserPin: js.UndefOr[String] = js.undefined
}
object PayPalConfigurationOptions {
  
  @scala.inline
  def apply(): PayPalConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PayPalConfigurationOptions]
  }
  
  @scala.inline
  implicit class PayPalConfigurationOptionsMutableBuilder[Self <: PayPalConfigurationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptCreditCards(value: Boolean): Self = StObject.set(x, "acceptCreditCards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptCreditCardsUndefined: Self = StObject.set(x, "acceptCreditCards", js.undefined)
    
    @scala.inline
    def setDefaultUserEmail(value: String): Self = StObject.set(x, "defaultUserEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserEmailUndefined: Self = StObject.set(x, "defaultUserEmail", js.undefined)
    
    @scala.inline
    def setDefaultUserPhoneCountryCode(value: String): Self = StObject.set(x, "defaultUserPhoneCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserPhoneCountryCodeUndefined: Self = StObject.set(x, "defaultUserPhoneCountryCode", js.undefined)
    
    @scala.inline
    def setDefaultUserPhoneNumber(value: String): Self = StObject.set(x, "defaultUserPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUserPhoneNumberUndefined: Self = StObject.set(x, "defaultUserPhoneNumber", js.undefined)
    
    @scala.inline
    def setDisableBlurWhenBackgrounding(value: Boolean): Self = StObject.set(x, "disableBlurWhenBackgrounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableBlurWhenBackgroundingUndefined: Self = StObject.set(x, "disableBlurWhenBackgrounding", js.undefined)
    
    @scala.inline
    def setForceDefaultsInSandbox(value: Boolean): Self = StObject.set(x, "forceDefaultsInSandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDefaultsInSandboxUndefined: Self = StObject.set(x, "forceDefaultsInSandbox", js.undefined)
    
    @scala.inline
    def setLanguageOrLocale(value: String): Self = StObject.set(x, "languageOrLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageOrLocaleUndefined: Self = StObject.set(x, "languageOrLocale", js.undefined)
    
    @scala.inline
    def setMerchantName(value: String): Self = StObject.set(x, "merchantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantNameUndefined: Self = StObject.set(x, "merchantName", js.undefined)
    
    @scala.inline
    def setMerchantPrivacyPolicyURL(value: String): Self = StObject.set(x, "merchantPrivacyPolicyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantPrivacyPolicyURLUndefined: Self = StObject.set(x, "merchantPrivacyPolicyURL", js.undefined)
    
    @scala.inline
    def setMerchantUserAgreementURL(value: String): Self = StObject.set(x, "merchantUserAgreementURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantUserAgreementURLUndefined: Self = StObject.set(x, "merchantUserAgreementURL", js.undefined)
    
    @scala.inline
    def setPayPalShippingAddressOption(value: Double): Self = StObject.set(x, "payPalShippingAddressOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayPalShippingAddressOptionUndefined: Self = StObject.set(x, "payPalShippingAddressOption", js.undefined)
    
    @scala.inline
    def setPresentingInPopover(value: Boolean): Self = StObject.set(x, "presentingInPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresentingInPopoverUndefined: Self = StObject.set(x, "presentingInPopover", js.undefined)
    
    @scala.inline
    def setRememberUser(value: Boolean): Self = StObject.set(x, "rememberUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberUserUndefined: Self = StObject.set(x, "rememberUser", js.undefined)
    
    @scala.inline
    def setSandboxUserPassword(value: String): Self = StObject.set(x, "sandboxUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUserPasswordUndefined: Self = StObject.set(x, "sandboxUserPassword", js.undefined)
    
    @scala.inline
    def setSandboxUserPin(value: String): Self = StObject.set(x, "sandboxUserPin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUserPinUndefined: Self = StObject.set(x, "sandboxUserPin", js.undefined)
  }
}
