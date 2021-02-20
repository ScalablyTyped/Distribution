package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.gmlbaseMod.Options
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gml3Mod {
  
  @JSImport("ol/format/GML3", JSImport.Default)
  @js.native
  class default () extends GML3 {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GML3
    extends typings.ol.gmlbaseMod.default {
    
    def curveMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def exteriorParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def interiorParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def readCurve(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.lineStringMod.default] = js.native
    
    def readEnvelope(node: Element, objectStack: js.Array[_]): js.UndefOr[Extent] = js.native
    
    def readFlatPos(node: Node, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readFlatPosList(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readLineStringSegment(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readMultiCurve(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.multiLineStringMod.default] = js.native
    
    def readMultiSurface(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.multiPolygonMod.default] = js.native
    
    def readPatch(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readPolygonPatch(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    def readSegment(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
    
    def readSurface(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.polygonMod.default] = js.native
    
    def surfaceMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
    
    def writeCurveOrLineString(node: Element, geometry: typings.ol.lineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[_]): Unit = js.native
    
    def writeFeatureElement(
      node: Element,
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      objectStack: js.Array[_]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[_]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typings.ol.geometryMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeLineStringOrCurveMember(node: Node, line: typings.ol.lineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeLinearRing(node: Element, geometry: typings.ol.linearRingMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeMultiCurveOrLineString(node: Element, geometry: typings.ol.multiLineStringMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeMultiPoint(node: Element, geometry: typings.ol.multiPointMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeMultiSurfaceOrPolygon(node: Element, geometry: typings.ol.multiPolygonMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writePoint(node: Element, geometry: typings.ol.pointMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writePointMember(node: Node, point: typings.ol.pointMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeRing(node: Node, ring: typings.ol.linearRingMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeSurfaceOrPolygon(node: Element, geometry: typings.ol.polygonMod.default, objectStack: js.Array[_]): Unit = js.native
    
    def writeSurfaceOrPolygonMember(node: Node, polygon: typings.ol.polygonMod.default, objectStack: js.Array[_]): Unit = js.native
  }
}
