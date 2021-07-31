package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.gmlbaseMod.Options
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gml2Mod {
  
  @JSImport("ol/format/GML2", JSImport.Default)
  @js.native
  class default () extends GML2 {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GML2
    extends typings.ol.gmlbaseMod.default {
    
    def innerBoundaryIsParser(node: Element, objectStack: js.Array[js.Any]): Unit = js.native
    
    def outerBoundaryIsParser(node: Element, objectStack: js.Array[js.Any]): Unit = js.native
    
    def readBox(node: Element, objectStack: js.Array[js.Any]): js.UndefOr[Extent] = js.native
    
    def readFlatCoordinates(node: Node, objectStack: js.Array[js.Any]): js.UndefOr[js.Array[Double]] = js.native
    
    def writeCurveOrLineString(node: Element, geometry: typings.ol.lineStringMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeEnvelope(node: Element, extent: Extent, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeFeatureElement(
      node: Element,
      feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
      objectStack: js.Array[js.Any]
    ): Unit = js.native
    
    def writeGeometryElement(node: Node, geometry: Extent, objectStack: js.Array[js.Any]): Unit = js.native
    def writeGeometryElement(node: Node, geometry: typings.ol.geometryMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeLineStringOrCurveMember(node: Element, line: typings.ol.lineStringMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeLinearRing(node: Element, geometry: typings.ol.linearRingMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeMultiCurveOrLineString(node: Element, geometry: typings.ol.multiLineStringMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeMultiPoint(node: Element, geometry: typings.ol.multiPointMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeMultiSurfaceOrPolygon(node: Element, geometry: typings.ol.multiPolygonMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writePoint(node: Element, geometry: typings.ol.pointMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writePointMember(node: Node, point: typings.ol.pointMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeRing(node: Node, ring: typings.ol.linearRingMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeSurfaceOrPolygon(node: Element, geometry: typings.ol.polygonMod.default, objectStack: js.Array[js.Any]): Unit = js.native
    
    def writeSurfaceOrPolygonMember(node: Node, polygon: typings.ol.polygonMod.default, objectStack: js.Array[js.Any]): Unit = js.native
  }
}
