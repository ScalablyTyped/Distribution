package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfoWindow extends OverlayView {
  
  def close(): Unit = js.native
  
  def getContent(): HTMLElement = js.native
  
  def getOptions(): InfoWindowOptions = js.native
  def getOptions(key: String): InfoWindowOptions = js.native
  
  def getPosition(): Coord = js.native
  
  def getZIndex(): Double = js.native
  
  def open(map: Map, anchor: Coord): Unit = js.native
  def open(map: Map, anchor: CoordLiteral): Unit = js.native
  def open(map: Map, anchor: Marker): Unit = js.native
  
  def setContent(content: String): Unit = js.native
  def setContent(content: HTMLElement): Unit = js.native
  
  def setOptions(options: InfoWindowOptions): Unit = js.native
  
  def setPosition(position: Coord): Unit = js.native
  def setPosition(position: CoordLiteral): Unit = js.native
  
  def setZIndex(zIndex: Double): Unit = js.native
}
