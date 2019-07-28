package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.formatFilterFilterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter", JSImport.Namespace)
@js.native
object formatFilterMod extends js.Object {
  def and(conditions: default*): typings.ol.formatFilterAndMod.default = js.native
  def bbox(geometryName: String, extent: Extent): typings.ol.formatFilterBboxMod.default = js.native
  def bbox(geometryName: String, extent: Extent, opt_srsName: String): typings.ol.formatFilterBboxMod.default = js.native
  def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typings.ol.formatFilterIsBetweenMod.default = js.native
  def contains(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterContainsMod.default = js.native
  def contains(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterContainsMod.default = js.native
  def during(propertyName: String, begin: String, end: String): typings.ol.formatFilterDuringMod.default = js.native
  def equalTo(propertyName: String, expression: String): typings.ol.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: String, expression: Double): typings.ol.formatFilterEqualToMod.default = js.native
  def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.formatFilterEqualToMod.default = js.native
  def greaterThan(propertyName: String, expression: Double): typings.ol.formatFilterGreaterThanMod.default = js.native
  def greaterThanOrEqualTo(propertyName: String, expression: Double): typings.ol.formatFilterGreaterThanOrEqualToMod.default = js.native
  def intersects(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterIntersectsMod.default = js.native
  def intersects(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterIntersectsMod.default = js.native
  def isNull(propertyName: String): typings.ol.formatFilterIsNullMod.default = js.native
  def lessThan(propertyName: String, expression: Double): typings.ol.formatFilterLessThanMod.default = js.native
  def lessThanOrEqualTo(propertyName: String, expression: Double): typings.ol.formatFilterLessThanOrEqualToMod.default = js.native
  def like(propertyName: String, pattern: String): typings.ol.formatFilterIsLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String): typings.ol.formatFilterIsLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typings.ol.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.formatFilterIsLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = js.native
  def not(condition: default): typings.ol.formatFilterNotMod.default = js.native
  def notEqualTo(propertyName: String, expression: String): typings.ol.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double): typings.ol.formatFilterNotEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.formatFilterNotEqualToMod.default = js.native
  def or(conditions: default*): typings.ol.formatFilterOrMod.default = js.native
  def within(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterWithinMod.default = js.native
  def within(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterWithinMod.default = js.native
}

