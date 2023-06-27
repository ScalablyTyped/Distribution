package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Marker
  */
@js.native
trait Marker
  extends StObject
     with OverlayView {
  
  def getAnimation(): Animation | Null = js.native
  
  def getClickable(): Boolean = js.native
  
  def getCursor(): String = js.native
  
  def getDraggable(): Boolean = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def getIcon(): ImageIcon | SymbolIcon | HtmlIcon = js.native
  
  def getOptions(): Any = js.native
  def getOptions(key: String): Any = js.native
  
  // if key is undefined, return MarkerOptions
  def getPosition(): Coord = js.native
  
  def getShape(): MarkerShape = js.native
  
  def getTitle(): String = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZIndex(): Double = js.native
  
  def setAnimation(): Unit = js.native
  def setAnimation(animation: Animation): Unit = js.native
  
  def setClickable(clickable: Boolean): Unit = js.native
  
  def setCursor(cursor: String): Unit = js.native
  
  def setDraggable(draggable: Boolean): Unit = js.native
  
  def setIcon(icon: String): Unit = js.native
  def setIcon(icon: HtmlIcon): Unit = js.native
  def setIcon(icon: ImageIcon): Unit = js.native
  def setIcon(icon: SymbolIcon): Unit = js.native
  
  def setOptions(options: MarkerOptions): Unit = js.native
  
  def setPosition(position: Coord): Unit = js.native
  def setPosition(position: CoordLiteral): Unit = js.native
  
  def setShape(shape: MarkerShape): Unit = js.native
  
  def setTitle(title: String): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
