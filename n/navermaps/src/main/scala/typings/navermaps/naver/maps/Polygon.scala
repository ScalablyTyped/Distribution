package typings.navermaps.naver.maps

import typings.navermaps.navermapsStrings.clickable
import typings.navermaps.navermapsStrings.fillColor
import typings.navermaps.navermapsStrings.fillOpacity
import typings.navermaps.navermapsStrings.map
import typings.navermaps.navermapsStrings.paths
import typings.navermaps.navermapsStrings.strokeColor
import typings.navermaps.navermapsStrings.strokeLineCap
import typings.navermaps.navermapsStrings.strokeLineJoin
import typings.navermaps.navermapsStrings.strokeOpacity
import typings.navermaps.navermapsStrings.strokeStyle
import typings.navermaps.navermapsStrings.strokeWeight
import typings.navermaps.navermapsStrings.visible
import typings.navermaps.navermapsStrings.zIndex
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
  
  @JSName("getOptions")
  def getOptions_clickable(key: clickable): js.UndefOr[Boolean] = js.native
  @JSName("getOptions")
  def getOptions_fillColor(key: fillColor): js.UndefOr[String] = js.native
  @JSName("getOptions")
  def getOptions_fillOpacity(key: fillOpacity): js.UndefOr[Double] = js.native
  @JSName("getOptions")
  def getOptions_map(key: map): js.UndefOr[Map] = js.native
  @JSName("getOptions")
  def getOptions_paths(key: paths): (js.Array[ArrayOfCoords | ArrayOfCoordsLiteral]) | KVOArray[KVOArrayOfCoords] = js.native
  @JSName("getOptions")
  def getOptions_strokeColor(key: strokeColor): js.UndefOr[String] = js.native
  @JSName("getOptions")
  def getOptions_strokeLineCap(key: strokeLineCap): js.UndefOr[StrokeLineCapType] = js.native
  @JSName("getOptions")
  def getOptions_strokeLineJoin(key: strokeLineJoin): js.UndefOr[StrokeLineJoinType] = js.native
  @JSName("getOptions")
  def getOptions_strokeOpacity(key: strokeOpacity): js.UndefOr[Double] = js.native
  @JSName("getOptions")
  def getOptions_strokeStyle(key: strokeStyle): js.UndefOr[StrokeStyleType] = js.native
  @JSName("getOptions")
  def getOptions_strokeWeight(key: strokeWeight): js.UndefOr[Double] = js.native
  @JSName("getOptions")
  def getOptions_visible(key: visible): js.UndefOr[Boolean] = js.native
  @JSName("getOptions")
  def getOptions_zIndex(key: zIndex): js.UndefOr[Double] = js.native
  
  def getPath(): ArrayOfCoords | KVOArrayOfCoords = js.native
  
  def getPaths(): js.Array[ArrayOfCoords] | KVOArray[KVOArrayOfCoords] = js.native
  
  def setOptions(options: PolygonOptions): Unit = js.native
  @JSName("setOptions")
  def setOptions_clickable(key: clickable): Unit = js.native
  @JSName("setOptions")
  def setOptions_clickable(key: clickable, value: Boolean): Unit = js.native
  @JSName("setOptions")
  def setOptions_fillColor(key: fillColor): Unit = js.native
  @JSName("setOptions")
  def setOptions_fillColor(key: fillColor, value: String): Unit = js.native
  @JSName("setOptions")
  def setOptions_fillOpacity(key: fillOpacity): Unit = js.native
  @JSName("setOptions")
  def setOptions_fillOpacity(key: fillOpacity, value: Double): Unit = js.native
  @JSName("setOptions")
  def setOptions_map(key: map): Unit = js.native
  @JSName("setOptions")
  def setOptions_map(key: map, value: Map): Unit = js.native
  @JSName("setOptions")
  def setOptions_paths(key: paths, value: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral]): Unit = js.native
  @JSName("setOptions")
  def setOptions_paths(key: paths, value: KVOArray[KVOArrayOfCoords]): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeColor(key: strokeColor): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeColor(key: strokeColor, value: String): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeLineCap(key: strokeLineCap): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeLineCap(key: strokeLineCap, value: StrokeLineCapType): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeLineJoin(key: strokeLineJoin): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeLineJoin(key: strokeLineJoin, value: StrokeLineJoinType): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeOpacity(key: strokeOpacity): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeOpacity(key: strokeOpacity, value: Double): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeStyle(key: strokeStyle): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeStyle(key: strokeStyle, value: StrokeStyleType): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeWeight(key: strokeWeight): Unit = js.native
  @JSName("setOptions")
  def setOptions_strokeWeight(key: strokeWeight, value: Double): Unit = js.native
  @JSName("setOptions")
  def setOptions_visible(key: visible): Unit = js.native
  @JSName("setOptions")
  def setOptions_visible(key: visible, value: Boolean): Unit = js.native
  @JSName("setOptions")
  def setOptions_zIndex(key: zIndex): Unit = js.native
  @JSName("setOptions")
  def setOptions_zIndex(key: zIndex, value: Double): Unit = js.native
  
  def setPath(path: ArrayOfCoords | ArrayOfCoordsLiteral): Unit = js.native
  def setPath(path: KVOArrayOfCoords): Unit = js.native
  
  def setPaths(paths: js.Array[ArrayOfCoords | ArrayOfCoordsLiteral]): Unit = js.native
  def setPaths(paths: KVOArray[KVOArrayOfCoords]): Unit = js.native
  
  def setStyles(options: PolygonOptions): Unit = js.native
}
