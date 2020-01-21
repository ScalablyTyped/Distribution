package typings.ol.gmlbaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.olXmlMod.Parser
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GMLBase
  extends typings.ol.xmlfeatureMod.default {
  var FLAT_LINEAR_RINGS_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var GEOMETRY_FLAT_COORDINATES_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var GEOMETRY_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var RING_PARSERS: StringDictionary[StringDictionary[Parser]] = js.native
  var featureNS: StringDictionary[String] | String = js.native
  var featureType: js.Array[String] | String = js.native
  var schemaLocation: String = js.native
  var srsName: String = js.native
  def readFeatureElement(node: Element, objectStack: js.Array[_]): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  def readFeatureElementInternal(node: Element, objectStack: js.Array[_], asFeature: Boolean): typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] | js.Object = js.native
  def readFeaturesInternal(node: Element, objectStack: js.Array[_]): js.Array[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = js.native
  def readGeometryElement(node: Element, objectStack: js.Array[_]): typings.ol.geometryMod.default | Extent = js.native
  def readLineString(node: Element, objectStack: js.Array[_]): typings.ol.lineStringMod.default = js.native
  def readLinearRing(node: Element, objectStack: js.Array[_]): typings.ol.linearRingMod.default = js.native
  def readMultiLineString(node: Element, objectStack: js.Array[_]): typings.ol.multiLineStringMod.default = js.native
  def readMultiPoint(node: Element, objectStack: js.Array[_]): typings.ol.multiPointMod.default = js.native
  def readMultiPolygon(node: Element, objectStack: js.Array[_]): typings.ol.multiPolygonMod.default = js.native
  def readPoint(node: Element, objectStack: js.Array[_]): typings.ol.pointMod.default = js.native
  def readPolygon(node: Element, objectStack: js.Array[_]): typings.ol.polygonMod.default = js.native
}

