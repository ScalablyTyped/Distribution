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
  
  extension [Self <: OrganizationalBrandingProperties](x: Self) {
    
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
    
    inline def setSignInPageText(value: NullableOption[String]): Self = StObject.set(x, "signInPageText", value.asInstanceOf[js.Any])
    
    inline def setSignInPageTextNull: Self = StObject.set(x, "signInPageText", null)
    
    inline def setSignInPageTextUndefined: Self = StObject.set(x, "signInPageText", js.undefined)
    
    inline def setSquareLogo(value: NullableOption[Any]): Self = StObject.set(x, "squareLogo", value.asInstanceOf[js.Any])
    
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
