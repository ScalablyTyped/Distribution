package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Typeofbrowser
import typings.openui5.anon.Typeofmedia
import typings.openui5.anon.Typeoforientation
import typings.openui5.anon.Typeofos
import typings.openui5.anon.Typeofresize
import typings.openui5.anon.Typeofsupport
import typings.openui5.anon.Typeofsystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDeviceMod extends Shortcut {
  
  @JSImport("sap/ui/Device", JSImport.Default)
  @js.native
  val default: Device = js.native
  
  /**
    * Device and Feature Detection API: Provides information about the used browser / device and cross platform
    * support for certain events like media queries, orientation change or resizing.
    *
    * This API is independent from any other part of the UI5 framework. This allows it to be loaded beforehand,
    * if it is needed, to create the UI5 bootstrap dynamically depending on the capabilities of the browser
    * or device.
    */
  trait Device extends StObject {
    
    /**
      * Contains information about the used browser.
      */
    var browser: Typeofbrowser
    
    /**
      * Event API for screen width changes.
      *
      * This API is based on media queries but can also be used if media queries are not natively supported by
      * the used browser. In this case, the behavior of media queries is simulated by this API.
      *
      * There are several predefined {@link sap.ui.Device.media.RANGESETS range sets} available. Each of them
      * defines a set of intervals for the screen width (from small to large). Whenever the screen width changes
      * and the current screen width is in a different interval to the one before the change, the registered
      * event handlers for the range set are called.
      *
      * If needed, it is also possible to define a custom set of intervals.
      *
      * The following example shows a typical use case:
      * ```javascript
      *
      * function sizeChanged(mParams) {
      *     switch(mParams.name) {
      *         case "Phone":
      *             // Do what is needed for a little screen
      *             break;
      *         case "Tablet":
      *             // Do what is needed for a medium sized screen
      *             break;
      *         case "Desktop":
      *             // Do what is needed for a large screen
      *     }
      * }
      *
      * // Register an event handler to changes of the screen size
      * sap.ui.Device.media.attachHandler(sizeChanged, null, sap.ui.Device.media.RANGESETS.SAP_STANDARD);
      * // Do some initialization work based on the current size
      * sizeChanged(sap.ui.Device.media.getCurrentRange(sap.ui.Device.media.RANGESETS.SAP_STANDARD));
      * ```
      */
    var media: Typeofmedia
    
    /**
      * Common API for orientation change notifications across all platforms.
      *
      * For browsers or devices that do not provide native support for orientation change events the API simulates
      * them based on the ratio of the document's width and height.
      */
    var orientation: Typeoforientation
    
    /**
      * Contains information about the operating system of the Device.
      */
    var os: Typeofos
    
    /**
      * Common API for document window size change notifications across all platforms.
      */
    var resize: Typeofresize
    
    /**
      * Contains information about detected capabilities of the used browser or Device.
      */
    var support: Typeofsupport
    
    /**
      * Provides a basic categorization of the used device based on various indicators.
      *
      * These indicators are, for example, the support of touch events, the used operating system, and the user
      * agent of the browser.
      *
      * **Note:** There is no easy way to precisely determine the used device from the information provided by
      * the browser. We therefore rely especially on the user agent. In combination with given device capabilities,
      * it is therefore possible that multiple flags are set to `true`. This is mostly the case for desktop devices
      * with touch capability, and for mobile devices requesting web pages as desktop pages.
      */
    var system: Typeofsystem
  }
  object Device {
    
    inline def apply(
      browser: Typeofbrowser,
      media: Typeofmedia,
      orientation: Typeoforientation,
      os: Typeofos,
      resize: Typeofresize,
      support: Typeofsupport,
      system: Typeofsystem
    ): Device = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any])
      __obj.asInstanceOf[Device]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Device] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Typeofbrowser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Typeofmedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Typeoforientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOs(value: Typeofos): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setResize(value: Typeofresize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setSupport(value: Typeofsupport): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: Typeofsystem): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Device
  
  /* This means you don't have to write `default`, but can instead just say `sapUiDeviceMod.foo` */
  override def _to: Device = default
}
