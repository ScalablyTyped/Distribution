package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchApiCommands extends StObject {
  
  val WEBDRIVER_ELEMENT_ID: String
  
  def __isBrowserName(browser: String, alternateName: String): Boolean
  
  def __isPlatformName(platform: String): Boolean
  
  val browserName: String
  
  def isAndroid(): Boolean
  
  def isChrome(): Boolean
  
  def isEdge(): Boolean
  
  def isFirefox(): Boolean
  
  def isIOS(): Boolean
  
  def isInternetExplorer(): Boolean
  
  def isMobile(): Boolean
  
  def isOpera(): Boolean
  
  def isSafari(): Boolean
  
  val platformName: String
}
object NightwatchApiCommands {
  
  inline def apply(
    WEBDRIVER_ELEMENT_ID: String,
    __isBrowserName: (String, String) => Boolean,
    __isPlatformName: String => Boolean,
    browserName: String,
    isAndroid: () => Boolean,
    isChrome: () => Boolean,
    isEdge: () => Boolean,
    isFirefox: () => Boolean,
    isIOS: () => Boolean,
    isInternetExplorer: () => Boolean,
    isMobile: () => Boolean,
    isOpera: () => Boolean,
    isSafari: () => Boolean,
    platformName: String
  ): NightwatchApiCommands = {
    val __obj = js.Dynamic.literal(WEBDRIVER_ELEMENT_ID = WEBDRIVER_ELEMENT_ID.asInstanceOf[js.Any], __isBrowserName = js.Any.fromFunction2(__isBrowserName), __isPlatformName = js.Any.fromFunction1(__isPlatformName), browserName = browserName.asInstanceOf[js.Any], isAndroid = js.Any.fromFunction0(isAndroid), isChrome = js.Any.fromFunction0(isChrome), isEdge = js.Any.fromFunction0(isEdge), isFirefox = js.Any.fromFunction0(isFirefox), isIOS = js.Any.fromFunction0(isIOS), isInternetExplorer = js.Any.fromFunction0(isInternetExplorer), isMobile = js.Any.fromFunction0(isMobile), isOpera = js.Any.fromFunction0(isOpera), isSafari = js.Any.fromFunction0(isSafari), platformName = platformName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchApiCommands]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NightwatchApiCommands] (val x: Self) extends AnyVal {
    
    inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
    
    inline def setIsAndroid(value: () => Boolean): Self = StObject.set(x, "isAndroid", js.Any.fromFunction0(value))
    
    inline def setIsChrome(value: () => Boolean): Self = StObject.set(x, "isChrome", js.Any.fromFunction0(value))
    
    inline def setIsEdge(value: () => Boolean): Self = StObject.set(x, "isEdge", js.Any.fromFunction0(value))
    
    inline def setIsFirefox(value: () => Boolean): Self = StObject.set(x, "isFirefox", js.Any.fromFunction0(value))
    
    inline def setIsIOS(value: () => Boolean): Self = StObject.set(x, "isIOS", js.Any.fromFunction0(value))
    
    inline def setIsInternetExplorer(value: () => Boolean): Self = StObject.set(x, "isInternetExplorer", js.Any.fromFunction0(value))
    
    inline def setIsMobile(value: () => Boolean): Self = StObject.set(x, "isMobile", js.Any.fromFunction0(value))
    
    inline def setIsOpera(value: () => Boolean): Self = StObject.set(x, "isOpera", js.Any.fromFunction0(value))
    
    inline def setIsSafari(value: () => Boolean): Self = StObject.set(x, "isSafari", js.Any.fromFunction0(value))
    
    inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    
    inline def setWEBDRIVER_ELEMENT_ID(value: String): Self = StObject.set(x, "WEBDRIVER_ELEMENT_ID", value.asInstanceOf[js.Any])
    
    inline def set__isBrowserName(value: (String, String) => Boolean): Self = StObject.set(x, "__isBrowserName", js.Any.fromFunction2(value))
    
    inline def set__isPlatformName(value: String => Boolean): Self = StObject.set(x, "__isPlatformName", js.Any.fromFunction1(value))
  }
}
