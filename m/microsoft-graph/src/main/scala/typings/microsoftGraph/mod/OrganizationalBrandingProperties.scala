package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationalBrandingProperties
  extends StObject
     with Entity {
  
  /**
    * Color that will appear in place of the background image in low-bandwidth connections. We recommend that you use the
    * primary color of your banner logo or your organization color. Specify this in hexadecimal format, for example, white is
    * #FFFFFF.
    */
  var backgroundColor: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Image that appears as the background of the sign-in page. The allowed types are PNG or JPEG not smaller than 300 KB and
    * not larger than 1920 × 1080 pixels. A smaller image will reduce bandwidth requirements and make the page load faster.
    */
  var backgroundImage: js.UndefOr[NullableOption[Any]] = js.undefined
  
  /**
    * A relative URL for the backgroundImage property that is combined with a CDN base URL from the cdnList to provide the
    * version served by a CDN. Read-only.
    */
  var backgroundImageRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A banner version of your company logo that appears on the sign-in page. The allowed types are PNG or JPEG no larger
    * than 36 × 245 pixels. We recommend using a transparent image with no padding around the logo.
    */
  var bannerLogo: js.UndefOr[NullableOption[Any]] = js.undefined
  
  /**
    * A relative url for the bannerLogo property that is combined with a CDN base URL from the cdnList to provide the
    * read-only version served by a CDN. Read-only.
    */
  var bannerLogoRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A list of base URLs for all available CDN providers that are serving the assets of the current resource. Several CDN
    * providers are used at the same time for high availability of read requests. Read-only.
    */
  var cdnList: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var customAccountResetCredentialsUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customCSS: js.UndefOr[NullableOption[Any]] = js.undefined
  
  var customCSSRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customCannotAccessYourAccountText: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customCannotAccessYourAccountUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customForgotMyPasswordText: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customPrivacyAndCookiesText: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customPrivacyAndCookiesUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customResetItNowText: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customTermsOfUseText: js.UndefOr[NullableOption[String]] = js.undefined
  
  var customTermsOfUseUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var favicon: js.UndefOr[NullableOption[Any]] = js.undefined
  
  var faviconRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var headerBackgroundColor: js.UndefOr[NullableOption[String]] = js.undefined
  
  var headerLogo: js.UndefOr[NullableOption[Any]] = js.undefined
  
  var headerLogoRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  var loginPageLayoutConfiguration: js.UndefOr[NullableOption[LoginPageLayoutConfiguration]] = js.undefined
  
  var loginPageTextVisibilitySettings: js.UndefOr[NullableOption[LoginPageTextVisibilitySettings]] = js.undefined
  
  /**
    * Text that appears at the bottom of the sign-in box. You can use this to communicate additional information, such as the
    * phone number to your help desk or a legal statement. This text must be Unicode and not exceed 1024 characters.
    */
  var signInPageText: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A square version of your company logo that appears in Windows 10 out-of-box experiences (OOBE) and when Windows
    * Autopilot is enabled for deployment. Allowed types are PNG or JPEG no larger than 240 x 240 pixels and no more than 10
    * KB in size. We recommend using a transparent image with no padding around the logo.
    */
  var squareLogo: js.UndefOr[NullableOption[Any]] = js.undefined
  
  var squareLogoDark: js.UndefOr[NullableOption[Any]] = js.undefined
  
  var squareLogoDarkRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * A relative url for the squareLogo property that is combined with a CDN base URL from the cdnList to provide the version
    * served by a CDN. Read-only.
    */
  var squareLogoRelativeUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * String that shows as the hint in the username textbox on the sign-in screen. This text must be a Unicode, without links
    * or code, and can't exceed 64 characters.
    */
  var usernameHintText: js.UndefOr[NullableOption[String]] = js.undefined
}
object OrganizationalBrandingProperties {
  
  inline def apply(): OrganizationalBrandingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalBrandingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationalBrandingProperties] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: NullableOption[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorNull: Self = StObject.set(x, "backgroundColor", null)
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundImage(value: NullableOption[Any]): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
    
    inline def setBackgroundImageRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "backgroundImageRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setBackgroundImageRelativeUrlNull: Self = StObject.set(x, "backgroundImageRelativeUrl", null)
    
    inline def setBackgroundImageRelativeUrlUndefined: Self = StObject.set(x, "backgroundImageRelativeUrl", js.undefined)
    
    inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
    
    inline def setBannerLogo(value: NullableOption[Any]): Self = StObject.set(x, "bannerLogo", value.asInstanceOf[js.Any])
    
    inline def setBannerLogoNull: Self = StObject.set(x, "bannerLogo", null)
    
    inline def setBannerLogoRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "bannerLogoRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerLogoRelativeUrlNull: Self = StObject.set(x, "bannerLogoRelativeUrl", null)
    
    inline def setBannerLogoRelativeUrlUndefined: Self = StObject.set(x, "bannerLogoRelativeUrl", js.undefined)
    
    inline def setBannerLogoUndefined: Self = StObject.set(x, "bannerLogo", js.undefined)
    
    inline def setCdnList(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "cdnList", value.asInstanceOf[js.Any])
    
    inline def setCdnListNull: Self = StObject.set(x, "cdnList", null)
    
    inline def setCdnListUndefined: Self = StObject.set(x, "cdnList", js.undefined)
    
    inline def setCdnListVarargs(value: String*): Self = StObject.set(x, "cdnList", js.Array(value*))
    
    inline def setCustomAccountResetCredentialsUrl(value: NullableOption[String]): Self = StObject.set(x, "customAccountResetCredentialsUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomAccountResetCredentialsUrlNull: Self = StObject.set(x, "customAccountResetCredentialsUrl", null)
    
    inline def setCustomAccountResetCredentialsUrlUndefined: Self = StObject.set(x, "customAccountResetCredentialsUrl", js.undefined)
    
    inline def setCustomCSS(value: NullableOption[Any]): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
    
    inline def setCustomCSSNull: Self = StObject.set(x, "customCSS", null)
    
    inline def setCustomCSSRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "customCSSRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomCSSRelativeUrlNull: Self = StObject.set(x, "customCSSRelativeUrl", null)
    
    inline def setCustomCSSRelativeUrlUndefined: Self = StObject.set(x, "customCSSRelativeUrl", js.undefined)
    
    inline def setCustomCSSUndefined: Self = StObject.set(x, "customCSS", js.undefined)
    
    inline def setCustomCannotAccessYourAccountText(value: NullableOption[String]): Self = StObject.set(x, "customCannotAccessYourAccountText", value.asInstanceOf[js.Any])
    
    inline def setCustomCannotAccessYourAccountTextNull: Self = StObject.set(x, "customCannotAccessYourAccountText", null)
    
    inline def setCustomCannotAccessYourAccountTextUndefined: Self = StObject.set(x, "customCannotAccessYourAccountText", js.undefined)
    
    inline def setCustomCannotAccessYourAccountUrl(value: NullableOption[String]): Self = StObject.set(x, "customCannotAccessYourAccountUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomCannotAccessYourAccountUrlNull: Self = StObject.set(x, "customCannotAccessYourAccountUrl", null)
    
    inline def setCustomCannotAccessYourAccountUrlUndefined: Self = StObject.set(x, "customCannotAccessYourAccountUrl", js.undefined)
    
    inline def setCustomForgotMyPasswordText(value: NullableOption[String]): Self = StObject.set(x, "customForgotMyPasswordText", value.asInstanceOf[js.Any])
    
    inline def setCustomForgotMyPasswordTextNull: Self = StObject.set(x, "customForgotMyPasswordText", null)
    
    inline def setCustomForgotMyPasswordTextUndefined: Self = StObject.set(x, "customForgotMyPasswordText", js.undefined)
    
    inline def setCustomPrivacyAndCookiesText(value: NullableOption[String]): Self = StObject.set(x, "customPrivacyAndCookiesText", value.asInstanceOf[js.Any])
    
    inline def setCustomPrivacyAndCookiesTextNull: Self = StObject.set(x, "customPrivacyAndCookiesText", null)
    
    inline def setCustomPrivacyAndCookiesTextUndefined: Self = StObject.set(x, "customPrivacyAndCookiesText", js.undefined)
    
    inline def setCustomPrivacyAndCookiesUrl(value: NullableOption[String]): Self = StObject.set(x, "customPrivacyAndCookiesUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomPrivacyAndCookiesUrlNull: Self = StObject.set(x, "customPrivacyAndCookiesUrl", null)
    
    inline def setCustomPrivacyAndCookiesUrlUndefined: Self = StObject.set(x, "customPrivacyAndCookiesUrl", js.undefined)
    
    inline def setCustomResetItNowText(value: NullableOption[String]): Self = StObject.set(x, "customResetItNowText", value.asInstanceOf[js.Any])
    
    inline def setCustomResetItNowTextNull: Self = StObject.set(x, "customResetItNowText", null)
    
    inline def setCustomResetItNowTextUndefined: Self = StObject.set(x, "customResetItNowText", js.undefined)
    
    inline def setCustomTermsOfUseText(value: NullableOption[String]): Self = StObject.set(x, "customTermsOfUseText", value.asInstanceOf[js.Any])
    
    inline def setCustomTermsOfUseTextNull: Self = StObject.set(x, "customTermsOfUseText", null)
    
    inline def setCustomTermsOfUseTextUndefined: Self = StObject.set(x, "customTermsOfUseText", js.undefined)
    
    inline def setCustomTermsOfUseUrl(value: NullableOption[String]): Self = StObject.set(x, "customTermsOfUseUrl", value.asInstanceOf[js.Any])
    
    inline def setCustomTermsOfUseUrlNull: Self = StObject.set(x, "customTermsOfUseUrl", null)
    
    inline def setCustomTermsOfUseUrlUndefined: Self = StObject.set(x, "customTermsOfUseUrl", js.undefined)
    
    inline def setFavicon(value: NullableOption[Any]): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
    
    inline def setFaviconNull: Self = StObject.set(x, "favicon", null)
    
    inline def setFaviconRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "faviconRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setFaviconRelativeUrlNull: Self = StObject.set(x, "faviconRelativeUrl", null)
    
    inline def setFaviconRelativeUrlUndefined: Self = StObject.set(x, "faviconRelativeUrl", js.undefined)
    
    inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
    
    inline def setHeaderBackgroundColor(value: NullableOption[String]): Self = StObject.set(x, "headerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackgroundColorNull: Self = StObject.set(x, "headerBackgroundColor", null)
    
    inline def setHeaderBackgroundColorUndefined: Self = StObject.set(x, "headerBackgroundColor", js.undefined)
    
    inline def setHeaderLogo(value: NullableOption[Any]): Self = StObject.set(x, "headerLogo", value.asInstanceOf[js.Any])
    
    inline def setHeaderLogoNull: Self = StObject.set(x, "headerLogo", null)
    
    inline def setHeaderLogoRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "headerLogoRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setHeaderLogoRelativeUrlNull: Self = StObject.set(x, "headerLogoRelativeUrl", null)
    
    inline def setHeaderLogoRelativeUrlUndefined: Self = StObject.set(x, "headerLogoRelativeUrl", js.undefined)
    
    inline def setHeaderLogoUndefined: Self = StObject.set(x, "headerLogo", js.undefined)
    
    inline def setLoginPageLayoutConfiguration(value: NullableOption[LoginPageLayoutConfiguration]): Self = StObject.set(x, "loginPageLayoutConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLoginPageLayoutConfigurationNull: Self = StObject.set(x, "loginPageLayoutConfiguration", null)
    
    inline def setLoginPageLayoutConfigurationUndefined: Self = StObject.set(x, "loginPageLayoutConfiguration", js.undefined)
    
    inline def setLoginPageTextVisibilitySettings(value: NullableOption[LoginPageTextVisibilitySettings]): Self = StObject.set(x, "loginPageTextVisibilitySettings", value.asInstanceOf[js.Any])
    
    inline def setLoginPageTextVisibilitySettingsNull: Self = StObject.set(x, "loginPageTextVisibilitySettings", null)
    
    inline def setLoginPageTextVisibilitySettingsUndefined: Self = StObject.set(x, "loginPageTextVisibilitySettings", js.undefined)
    
    inline def setSignInPageText(value: NullableOption[String]): Self = StObject.set(x, "signInPageText", value.asInstanceOf[js.Any])
    
    inline def setSignInPageTextNull: Self = StObject.set(x, "signInPageText", null)
    
    inline def setSignInPageTextUndefined: Self = StObject.set(x, "signInPageText", js.undefined)
    
    inline def setSquareLogo(value: NullableOption[Any]): Self = StObject.set(x, "squareLogo", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoDark(value: NullableOption[Any]): Self = StObject.set(x, "squareLogoDark", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoDarkNull: Self = StObject.set(x, "squareLogoDark", null)
    
    inline def setSquareLogoDarkRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "squareLogoDarkRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoDarkRelativeUrlNull: Self = StObject.set(x, "squareLogoDarkRelativeUrl", null)
    
    inline def setSquareLogoDarkRelativeUrlUndefined: Self = StObject.set(x, "squareLogoDarkRelativeUrl", js.undefined)
    
    inline def setSquareLogoDarkUndefined: Self = StObject.set(x, "squareLogoDark", js.undefined)
    
    inline def setSquareLogoNull: Self = StObject.set(x, "squareLogo", null)
    
    inline def setSquareLogoRelativeUrl(value: NullableOption[String]): Self = StObject.set(x, "squareLogoRelativeUrl", value.asInstanceOf[js.Any])
    
    inline def setSquareLogoRelativeUrlNull: Self = StObject.set(x, "squareLogoRelativeUrl", null)
    
    inline def setSquareLogoRelativeUrlUndefined: Self = StObject.set(x, "squareLogoRelativeUrl", js.undefined)
    
    inline def setSquareLogoUndefined: Self = StObject.set(x, "squareLogo", js.undefined)
    
    inline def setUsernameHintText(value: NullableOption[String]): Self = StObject.set(x, "usernameHintText", value.asInstanceOf[js.Any])
    
    inline def setUsernameHintTextNull: Self = StObject.set(x, "usernameHintText", null)
    
    inline def setUsernameHintTextUndefined: Self = StObject.set(x, "usernameHintText", js.undefined)
  }
}
