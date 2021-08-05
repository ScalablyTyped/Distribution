package typings.platform

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("platform", JSImport.Namespace)
  @js.native
  val ^ : Platform = js.native
  
  trait OperatingSystem extends StObject {
    
    /**
      * The CPU architecture the OS is built for.
      */
    var architecture: js.UndefOr[Double] = js.undefined
    
    /**
      * The family of the OS.
      *
      * Common values include:
      * "Windows", "Windows Server 2008 R2 / 7", "Windows Server 2008 / Vista",
      * "Windows XP", "OS X", "Linux", "Ubuntu", "Debian", "Fedora", "Red Hat",
      * "SuSE", "Android", "iOS" and "Windows Phone"
      */
    var family: js.UndefOr[String] = js.undefined
    
    /**
      * The version of the OS.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object OperatingSystem {
    
    inline def apply(): OperatingSystem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperatingSystem]
    }
    
    extension [Self <: OperatingSystem](x: Self) {
      
      inline def setArchitecture(value: Double): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
      
      inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
      
      inline def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /**
    * The platform object.
    */
  @js.native
  trait Platform extends StObject {
    
    /**
      * The platform description.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The name of the browser's layout engine.
      *
      * The list of common layout engines include:
      * "Blink", "EdgeHTML", "Gecko", "Trident" and "WebKit"
      */
    var layout: js.UndefOr[String] = js.native
    
    /**
      * The name of the product's manufacturer.
      *
      * The list of manufacturers include:
      * "Apple", "Archos", "Amazon", "Asus", "Barnes & Noble", "BlackBerry",
      * "Google", "HP", "HTC", "LG", "Microsoft", "Motorola", "Nintendo",
      * "Nokia", "Samsung" and "Sony"
      */
    var manufacturer: js.UndefOr[String] = js.native
    
    /**
      * The name of the browser/environment.
      *
      * The list of common browser names include:
      * "Chrome", "Electron", "Firefox", "Firefox for iOS", "IE",
      * "Microsoft Edge", "PhantomJS", "Safari", "SeaMonkey", "Silk",
      * "Opera Mini" and "Opera"
      *
      * Mobile versions of some browsers have "Mobile" appended to their name:
      * eg. "Chrome Mobile", "Firefox Mobile", "IE Mobile" and "Opera Mobile"
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The name of the operating system.
      */
    var os: js.UndefOr[OperatingSystem] = js.native
    
    /**
      * Creates a new platform object.
      * @param [ua=navigator.userAgent] The user agent string or
      *  context object.
      */
    def parse(): Platform = js.native
    def parse(ua: String): Platform = js.native
    def parse(ua: js.Object): Platform = js.native
    
    /**
      * The alpha/beta release indicator.
      */
    var prerelease: js.UndefOr[String] = js.native
    
    /**
      * The name of the product hosting the browser.
      *
      * The list of common products include:
      *
      * "BlackBerry", "Galaxy S4", "Lumia", "iPad", "iPod", "iPhone", "Kindle",
      * "Kindle Fire", "Nexus", "Nook", "PlayBook", "TouchPad" and "Transformer"
      */
    var product: js.UndefOr[String] = js.native
    
    /**
      * The browser's user agent string.
      */
    var ua: js.UndefOr[String] = js.native
    
    /**
      * The version of the OS.
      */
    var version: js.UndefOr[String] = js.native
  }
  
  type _To = Platform
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Platform = ^
}
