package typings.ol.gmlbaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.featureMod.ReadOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GMLBase
  extends typings.ol.xmlfeatureMod.default {
  
  var featureNS: StringDictionary[String] | String = js.native
  
  var featureType: js.Array[String] | String = js.native
  
  def lineStringMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
  
  def pointMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
  
  def polygonMemberParser(node: Element, objectStack: js.Array[_]): Unit = js.native
  
  def readFeatureElement(node: Element, objectStack: js.Array[_]): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  
  def readFeatureElementInternal(node: Element, objectStack: js.Array[_], asFeature: Boolean): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] | js.Object = js.native
  
  def readFeaturesInternal(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]] = js.native
  
  def readFlatCoordinatesFromNode(node: Element, objectStack: js.Array[_]): js.Array[Double] = js.native
  
  def readFlatLinearRing(node: Element, objectStack: js.Array[_]): js.UndefOr[js.Array[Double]] = js.native
  
  def readGeometryElement(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.geometryMod.default | Extent] = js.native
  
  @JSName("readGeometryFromNode")
  /* protected */ def readGeometryFromNode_default(node: Element): typings.ol.geometryMod.default = js.native
  @JSName("readGeometryFromNode")
  /* protected */ def readGeometryFromNode_default(node: Element, opt_options: ReadOptions): typings.ol.geometryMod.default = js.native
  
  def readLineString(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.lineStringMod.default] = js.native
  
  def readLinearRing(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.linearRingMod.default] = js.native
  
  def readMultiLineString(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.multiLineStringMod.default] = js.native
  
  def readMultiPoint(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.multiPointMod.default] = js.native
  
  def readMultiPolygon(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.multiPolygonMod.default] = js.native
  
  def readPoint(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.pointMod.default] = js.native
  
  def readPolygon(node: Element, objectStack: js.Array[_]): js.UndefOr[typings.ol.polygonMod.default] = js.native
  
  var schemaLocation: String = js.native
  
  var srsName: String = js.native
}
