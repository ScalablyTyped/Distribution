package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.formatGmlbaseMod.Options
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGml3Mod {
  
  @JSImport("ol/format/GML3", JSImport.Default)
  @js.native
  open class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GML3
    extends typings.ol.formatGmlbaseMod.default {
    
    def curveMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def exteriorParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def interiorParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def readCurve(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomLineStringMod.default] = js.native
    
    def readEnvelope(node: Element, objectStack: js.Array[Any]): js.UndefOr[Extent] = js.native
    
    def readFlatPos(node: Node, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readFlatPosList(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readLineStringSegment(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readMultiCurve(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiLineStringMod.default] = js.native
    
    def readMultiSurface(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomMultiPolygonMod.default] = js.native
    
    def readPatch(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readPolygonPatch(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readSegment(node: Element, objectStack: js.Array[Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def readSurface(node: Element, objectStack: js.Array[Any]): js.UndefOr[typings.ol.geomPolygonMod.default] = js.native
    
    def surfaceMemberParser(node: Element, objectStack: js.Array[Any]): Unit = js.native
    
    def writeCurveOrLineString(node: Element, geometry: typings.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[Any]): Unit = js.native
    
    def writeFeatureElement(
      node: Element,
      feature: typings.ol.featureMod.default[typings.ol.geomGeometryMod.default],
      objectStack: js.Array[Any]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[Any]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typings.ol.geomGeometryMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeLineStringOrCurveMember(node: Node, line: typings.ol.geomLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeLinearRing(node: Element, geometry: typings.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeMultiCurveOrLineString(node: Element, geometry: typings.ol.geomMultiLineStringMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeMultiPoint(node: Element, geometry: typings.ol.geomMultiPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeMultiSurfaceOrPolygon(node: Element, geometry: typings.ol.geomMultiPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writePoint(node: Element, geometry: typings.ol.geomPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writePointMember(node: Node, point: typings.ol.geomPointMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeRing(node: Node, ring: typings.ol.geomLinearRingMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeSurfaceOrPolygon(node: Element, geometry: typings.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
    
    def writeSurfaceOrPolygonMember(node: Node, polygon: typings.ol.geomPolygonMod.default, objectStack: js.Array[Any]): Unit = js.native
  }
}
