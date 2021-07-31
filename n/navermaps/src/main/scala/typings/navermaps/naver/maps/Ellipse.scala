package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ellipse
  extends StObject
     with OverlayView {
  
  def getAreaSize(): Double = js.native
  
  def getBounds(): Bounds = js.native
  
  def getClickable(): Boolean = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def getOptions(): EllipseOptions = js.native
  def getOptions(key: String): EllipseOptions = js.native
  
  def getStyles(): EllipseOptions = js.native
  def getStyles(key: String): EllipseOptions = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZIndex(): Double = js.native
  
  def setBounds(bounds: Bounds): Unit = js.native
  def setBounds(bounds: BoundsLiteral): Unit = js.native
  
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: EllipseOptions): Unit = js.native
  
  def setStyles(key: String, value: js.Any): Unit = js.native
  def setStyles(options: EllipseOptions): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
