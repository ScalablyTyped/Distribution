package typings.platform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The platform object.
  */
@js.native
trait Platform extends js.Object {
  
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
