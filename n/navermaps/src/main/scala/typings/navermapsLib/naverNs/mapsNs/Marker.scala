package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Marker")
@js.native
class Marker protected () extends OverlayView {
  def this(options: MarkerOptions) = this()
  def getAnimation(): Animation = js.native
  def getClickable(): scala.Boolean = js.native
  def getCursor(): java.lang.String = js.native
  def getDraggable(): scala.Boolean = js.native
  def getDrawingRect(): Bounds = js.native
  def getIcon(): ImageIcon | SymbolIcon | HtmlIcon = js.native
  def getOptions(): MarkerOptions = js.native
  def getOptions(key: java.lang.String): MarkerOptions = js.native
  def getPosition(): Coord = js.native
  def getShape(): MarkerShape = js.native
  def getTitle(): java.lang.String = js.native
  def getVisible(): scala.Boolean = js.native
  def getZIndex(): scala.Double = js.native
  def setAnimation(animation: Animation): scala.Unit = js.native
  def setClickable(clickable: scala.Boolean): scala.Unit = js.native
  def setCursor(cursor: java.lang.String): scala.Unit = js.native
  def setDraggable(draggable: scala.Boolean): scala.Unit = js.native
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  def setIcon(icon: HtmlIcon): scala.Unit = js.native
  def setIcon(icon: ImageIcon): scala.Unit = js.native
  def setIcon(icon: SymbolIcon): scala.Unit = js.native
  def setOptions(options: MarkerOptions): scala.Unit = js.native
  def setPosition(position: Coord): scala.Unit = js.native
  def setPosition(position: CoordLiteral): scala.Unit = js.native
  def setShape(shape: MarkerShape): scala.Unit = js.native
  def setTitle(title: java.lang.String): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

