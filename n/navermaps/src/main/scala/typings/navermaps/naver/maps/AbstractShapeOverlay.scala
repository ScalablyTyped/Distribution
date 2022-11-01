package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AbstractShapeOverlay
  */
@js.native
trait AbstractShapeOverlay
  extends StObject
     with OverlayView {
  
  def getClickable(): Boolean = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getOptions(): Any = js.native
  def getOptions(key: String): Any = js.native
  
  def getStyles(): Any = js.native
  def getStyles(key: String): Any = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZIndex(): Double = js.native
  
  def setClickable(clickable: Boolean): Unit = js.native
  
  def setOptions(key: String, value: Any): Unit = js.native
  def setOptions(options: StringDictionary[Any]): Unit = js.native
  
  def setStyles(key: String, value: Any): Unit = js.native
  def setStyles(styles: StringDictionary[Any]): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
