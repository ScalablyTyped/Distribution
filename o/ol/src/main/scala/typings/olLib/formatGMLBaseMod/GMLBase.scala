package typings
package olLib.formatGMLBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GMLBase
  extends olLib.formatXMLFeatureMod.default {
  var FLAT_LINEAR_RINGS_PARSERS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.xmlMod.Parser]] = js.native
  var GEOMETRY_FLAT_COORDINATES_PARSERS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.xmlMod.Parser]] = js.native
  var GEOMETRY_PARSERS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.xmlMod.Parser]] = js.native
  var RING_PARSERS: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[olLib.xmlMod.Parser]] = js.native
  var featureNS: org.scalablytyped.runtime.StringDictionary[java.lang.String] | java.lang.String = js.native
  var featureType: js.Array[java.lang.String] | java.lang.String = js.native
  var schemaLocation: java.lang.String = js.native
  var srsName: java.lang.String = js.native
  def readFeatureElement(node: stdLib.Element, objectStack: js.Array[_]): olLib.featureMod.default = js.native
  def readFeatureElementInternal(node: stdLib.Element, objectStack: js.Array[_], asFeature: scala.Boolean): olLib.featureMod.default | org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def readFeaturesInternal(node: stdLib.Element, objectStack: js.Array[_]): js.Array[olLib.featureMod.default] = js.native
  def readGeometryElement(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomGeometryMod.default = js.native
  def readLineString(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomLineStringMod.default = js.native
  def readLinearRing(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomLinearRingMod.default = js.native
  def readMultiLineString(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomMultiLineStringMod.default = js.native
  def readMultiPoint(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomMultiPointMod.default = js.native
  def readMultiPolygon(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomMultiPolygonMod.default = js.native
  def readPoint(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomPointMod.default = js.native
  def readPolygon(node: stdLib.Element, objectStack: js.Array[_]): olLib.geomPolygonMod.default = js.native
}

