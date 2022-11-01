package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Polyline
  */
@js.native
trait Polyline
  extends StObject
     with AbstractShapeOverlay {
  
  def getBounds(): Bounds = js.native
  
  def getDistance(): Double = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  
  def setOptions(options: PolylineOptions): Unit = js.native
  
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): Unit = js.native
  def setPath(path: KVOArrayOfCoords): Unit = js.native
  
  def setStyles(options: PolylineOptions): Unit = js.native
}
