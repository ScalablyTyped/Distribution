package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Defined in lib.d.ts
interface LocalStorage {
  key;
  getItem;
  setItem;
  removeItem;
  clear;
}
*/
trait StatusBar extends StObject {
  
  def backgroundColorByHexString(hexString: String): Unit
  
  def backgroundColorByName(colorname: String): Unit
  
  def hide(): Unit
  
  var isVisible: Boolean
  
  def overlaysWebView(doOverlay: Boolean): Unit
  
  def show(): Unit
  
  def styleBlackOpaque(): Unit
  
  def styleBlackTranslucent(): Unit
  
  def styleDefault(): Unit
  
  def styleLightContent(): Unit
}
object StatusBar {
  
  inline def apply(
    backgroundColorByHexString: String => Unit,
    backgroundColorByName: String => Unit,
    hide: () => Unit,
    isVisible: Boolean,
    overlaysWebView: Boolean => Unit,
    show: () => Unit,
    styleBlackOpaque: () => Unit,
    styleBlackTranslucent: () => Unit,
    styleDefault: () => Unit,
    styleLightContent: () => Unit
  ): StatusBar = {
    val __obj = js.Dynamic.literal(backgroundColorByHexString = js.Any.fromFunction1(backgroundColorByHexString), backgroundColorByName = js.Any.fromFunction1(backgroundColorByName), hide = js.Any.fromFunction0(hide), isVisible = isVisible.asInstanceOf[js.Any], overlaysWebView = js.Any.fromFunction1(overlaysWebView), show = js.Any.fromFunction0(show), styleBlackOpaque = js.Any.fromFunction0(styleBlackOpaque), styleBlackTranslucent = js.Any.fromFunction0(styleBlackTranslucent), styleDefault = js.Any.fromFunction0(styleDefault), styleLightContent = js.Any.fromFunction0(styleLightContent))
    __obj.asInstanceOf[StatusBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusBar] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColorByHexString(value: String => Unit): Self = StObject.set(x, "backgroundColorByHexString", js.Any.fromFunction1(value))
    
    inline def setBackgroundColorByName(value: String => Unit): Self = StObject.set(x, "backgroundColorByName", js.Any.fromFunction1(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setOverlaysWebView(value: Boolean => Unit): Self = StObject.set(x, "overlaysWebView", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setStyleBlackOpaque(value: () => Unit): Self = StObject.set(x, "styleBlackOpaque", js.Any.fromFunction0(value))
    
    inline def setStyleBlackTranslucent(value: () => Unit): Self = StObject.set(x, "styleBlackTranslucent", js.Any.fromFunction0(value))
    
    inline def setStyleDefault(value: () => Unit): Self = StObject.set(x, "styleDefault", js.Any.fromFunction0(value))
    
    inline def setStyleLightContent(value: () => Unit): Self = StObject.set(x, "styleLightContent", js.Any.fromFunction0(value))
  }
}
