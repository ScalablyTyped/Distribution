package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideBrowser extends StObject {
  
  /**
    * whether the browser UI should be hidden as far as possible to make the app feel more native
    */
  var hideBrowser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * deprecated since 1.12, use sap/ui/util/Mobile.setIcons instead.
    */
  var homeIcon: js.UndefOr[String] = js.undefined
  
  /**
    * deprecated since 1.12, use sap/ui/util/Mobile.setIcons instead.
    */
  var homeIconPrecomposed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether the Application will be loaded in full screen mode after added to home screen on mobile devices.
    * The default value for this property only enables the full screen mode when runs on iOS device.
    */
  var mobileWebAppCapable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether Safari mobile should be prevented from transforming any numbers that look like phone numbers
    * into clickable links
    */
  var preventPhoneNumberDetection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether native scrolling should be disabled in order to prevent the "rubber-band" effect where the whole
    * window is moved
    */
  var preventScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * the ID of the root element that should be made fullscreen; only used when hideBrowser is set. If not
    * set, the body is used
    */
  var rootId: js.UndefOr[String] = js.undefined
  
  /**
    * the iOS status bar color, "default", "black" or "black-translucent"
    */
  var statusBar: js.UndefOr[String] = js.undefined
  
  /**
    * whether the height of the html root element should be set to 100%, which is required for other elements
    * to cover the full height
    */
  var useFullScreenHeight: js.UndefOr[Boolean] = js.undefined
  
  /**
    * whether to set the viewport in a way that disables zooming
    */
  var viewport: js.UndefOr[Boolean] = js.undefined
}
object HideBrowser {
  
  inline def apply(): HideBrowser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideBrowser]
  }
  
  extension [Self <: HideBrowser](x: Self) {
    
    inline def setHideBrowser(value: Boolean): Self = StObject.set(x, "hideBrowser", value.asInstanceOf[js.Any])
    
    inline def setHideBrowserUndefined: Self = StObject.set(x, "hideBrowser", js.undefined)
    
    inline def setHomeIcon(value: String): Self = StObject.set(x, "homeIcon", value.asInstanceOf[js.Any])
    
    inline def setHomeIconPrecomposed(value: Boolean): Self = StObject.set(x, "homeIconPrecomposed", value.asInstanceOf[js.Any])
    
    inline def setHomeIconPrecomposedUndefined: Self = StObject.set(x, "homeIconPrecomposed", js.undefined)
    
    inline def setHomeIconUndefined: Self = StObject.set(x, "homeIcon", js.undefined)
    
    inline def setMobileWebAppCapable(value: Boolean): Self = StObject.set(x, "mobileWebAppCapable", value.asInstanceOf[js.Any])
    
    inline def setMobileWebAppCapableUndefined: Self = StObject.set(x, "mobileWebAppCapable", js.undefined)
    
    inline def setPreventPhoneNumberDetection(value: Boolean): Self = StObject.set(x, "preventPhoneNumberDetection", value.asInstanceOf[js.Any])
    
    inline def setPreventPhoneNumberDetectionUndefined: Self = StObject.set(x, "preventPhoneNumberDetection", js.undefined)
    
    inline def setPreventScroll(value: Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
    
    inline def setRootId(value: String): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
    
    inline def setRootIdUndefined: Self = StObject.set(x, "rootId", js.undefined)
    
    inline def setStatusBar(value: String): Self = StObject.set(x, "statusBar", value.asInstanceOf[js.Any])
    
    inline def setStatusBarUndefined: Self = StObject.set(x, "statusBar", js.undefined)
    
    inline def setUseFullScreenHeight(value: Boolean): Self = StObject.set(x, "useFullScreenHeight", value.asInstanceOf[js.Any])
    
    inline def setUseFullScreenHeightUndefined: Self = StObject.set(x, "useFullScreenHeight", js.undefined)
    
    inline def setViewport(value: Boolean): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
