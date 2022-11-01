package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Polygon
  */
@js.native
trait Polygon
  extends StObject
     with AbstractShapeOverlay {
  
  def getAreaSize(): Double = js.native
  
  def getBounds(): Bounds = js.native
  
  def getDrawingRect(): Bounds = js.native
  
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  
  def getPaths(): js.Array[ArrayOfCoords | KVOArrayOfCoords] = js.native
  
  def setOptions(options: PolygonOptions): Unit = js.native
  
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): Unit = js.native
  def setPath(path: KVOArrayOfCoords): Unit = js.native
  
  def setPaths(paths: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral | KVOArrayOfCoords]): Unit = js.native
  
  def setStyles(options: PolygonOptions): Unit = js.native
}
