package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter", JSImport.Namespace)
@js.native
object formatFilterMod extends js.Object {
  def and(conditions: olLib.formatFilterFilterMod.default*): olLib.formatFilterAndMod.default = js.native
  def bbox(geometryName: java.lang.String, extent: olLib.extentMod.Extent): olLib.formatFilterBboxMod.default = js.native
  def bbox(geometryName: java.lang.String, extent: olLib.extentMod.Extent, opt_srsName: java.lang.String): olLib.formatFilterBboxMod.default = js.native
  def between(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double): olLib.formatFilterIsBetweenMod.default = js.native
  def contains(geometryName: java.lang.String, geometry: olLib.geomGeometryMod.default): olLib.formatFilterContainsMod.default = js.native
  def contains(
    geometryName: java.lang.String,
    geometry: olLib.geomGeometryMod.default,
    opt_srsName: java.lang.String
  ): olLib.formatFilterContainsMod.default = js.native
  def during(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String): olLib.formatFilterDuringMod.default = js.native
  def equalTo(propertyName: java.lang.String, expression: java.lang.String): olLib.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): olLib.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: java.lang.String, expression: scala.Double): olLib.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): olLib.formatFilterEqualToMod.default = js.native
  def greaterThan(propertyName: java.lang.String, expression: scala.Double): olLib.formatFilterGreaterThanMod.default = js.native
  def greaterThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): olLib.formatFilterGreaterThanOrEqualToMod.default = js.native
  def intersects(geometryName: java.lang.String, geometry: olLib.geomGeometryMod.default): olLib.formatFilterIntersectsMod.default = js.native
  def intersects(
    geometryName: java.lang.String,
    geometry: olLib.geomGeometryMod.default,
    opt_srsName: java.lang.String
  ): olLib.formatFilterIntersectsMod.default = js.native
  def isNull(propertyName: java.lang.String): olLib.formatFilterIsNullMod.default = js.native
  def lessThan(propertyName: java.lang.String, expression: scala.Double): olLib.formatFilterLessThanMod.default = js.native
  def lessThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): olLib.formatFilterLessThanOrEqualToMod.default = js.native
  def like(propertyName: java.lang.String, pattern: java.lang.String): olLib.formatFilterIsLikeMod.default = js.native
  def like(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String): olLib.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: java.lang.String,
    pattern: java.lang.String,
    opt_wildCard: java.lang.String,
    opt_singleChar: java.lang.String
  ): olLib.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: java.lang.String,
    pattern: java.lang.String,
    opt_wildCard: java.lang.String,
    opt_singleChar: java.lang.String,
    opt_escapeChar: java.lang.String
  ): olLib.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: java.lang.String,
    pattern: java.lang.String,
    opt_wildCard: java.lang.String,
    opt_singleChar: java.lang.String,
    opt_escapeChar: java.lang.String,
    opt_matchCase: scala.Boolean
  ): olLib.formatFilterIsLikeMod.default = js.native
  def not(condition: olLib.formatFilterFilterMod.default): olLib.formatFilterNotMod.default = js.native
  def notEqualTo(propertyName: java.lang.String, expression: java.lang.String): olLib.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): olLib.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: java.lang.String, expression: scala.Double): olLib.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): olLib.formatFilterNotEqualToMod.default = js.native
  def or(conditions: olLib.formatFilterFilterMod.default*): olLib.formatFilterOrMod.default = js.native
  def within(geometryName: java.lang.String, geometry: olLib.geomGeometryMod.default): olLib.formatFilterWithinMod.default = js.native
  def within(
    geometryName: java.lang.String,
    geometry: olLib.geomGeometryMod.default,
    opt_srsName: java.lang.String
  ): olLib.formatFilterWithinMod.default = js.native
}

