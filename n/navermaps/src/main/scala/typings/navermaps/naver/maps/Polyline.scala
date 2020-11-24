package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends OverlayView {
  
  def getBounds(): Bounds = js.native
  
  def getClickable(): Boolean = js.native
  
  def getDistance(): Double = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def getOptions(): PolylineOptions = js.native
  def getOptions(key: String): PolylineOptions = js.native
  
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  
  def getStyles(): PolylineOptions = js.native
  def getStyles(key: String): PolylineOptions = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZIndex(): Double = js.native
  
  def setClickable(clickable: Boolean): Unit = js.native
  
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: PolylineOptions): Unit = js.native
  
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): Unit = js.native
  def setPath(path: KVOArrayOfCoords): Unit = js.native
  
  def setStyles(key: String, value: js.Any): Unit = js.native
  def setStyles(options: PolylineOptions): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
