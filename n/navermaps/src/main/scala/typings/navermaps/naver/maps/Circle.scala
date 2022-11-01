package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Circle
  */
@js.native
trait Circle
  extends StObject
     with AbstractShapeOverlay {
  
  def getAreaSize(): Double = js.native
  
  def getBounds(): Bounds = js.native
  
  def getCenter(): Coord = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def getRadius(): Double = js.native
  
  def setCenter(center: Coord): Unit = js.native
  def setCenter(center: CoordLiteral): Unit = js.native
  
  def setOptions(options: CircleOptions): Unit = js.native
  
  def setRadius(radius: Double): Unit = js.native
  
  def setStyles(options: CircleOptions): Unit = js.native
}
