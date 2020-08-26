package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.filterFilterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter", JSImport.Namespace)
@js.native
object filterMod extends js.Object {
  def and(conditions: default*): typings.ol.andMod.default = js.native
  def bbox(geometryName: String, extent: Extent): typings.ol.bboxMod.default = js.native
  def bbox(geometryName: String, extent: Extent, opt_srsName: String): typings.ol.bboxMod.default = js.native
  def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typings.ol.isBetweenMod.default = js.native
  def contains(geometryName: String, geometry: typings.ol.geometryMod.default): typings.ol.containsMod.default = js.native
  def contains(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String): typings.ol.containsMod.default = js.native
  def during(propertyName: String, begin: String, end: String): typings.ol.duringMod.default = js.native
  def equalTo(propertyName: String, expression: String): typings.ol.equalToMod.default = js.native
  def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.equalToMod.default = js.native
  def equalTo(propertyName: String, expression: Double): typings.ol.equalToMod.default = js.native
  def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.equalToMod.default = js.native
  def greaterThan(propertyName: String, expression: Double): typings.ol.greaterThanMod.default = js.native
  def greaterThanOrEqualTo(propertyName: String, expression: Double): typings.ol.greaterThanOrEqualToMod.default = js.native
  def intersects(geometryName: String, geometry: typings.ol.geometryMod.default): typings.ol.intersectsMod.default = js.native
  def intersects(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String): typings.ol.intersectsMod.default = js.native
  def isNull(propertyName: String): typings.ol.isNullMod.default = js.native
  def lessThan(propertyName: String, expression: Double): typings.ol.lessThanMod.default = js.native
  def lessThanOrEqualTo(propertyName: String, expression: Double): typings.ol.lessThanOrEqualToMod.default = js.native
  def like(propertyName: String, pattern: String): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = js.native
  def not(condition: default): typings.ol.notMod.default = js.native
  def notEqualTo(propertyName: String, expression: String): typings.ol.notEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.notEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double): typings.ol.notEqualToMod.default = js.native
  def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.notEqualToMod.default = js.native
  def or(conditions: default*): typings.ol.orMod.default = js.native
  def within(geometryName: String, geometry: typings.ol.geometryMod.default): typings.ol.withinMod.default = js.native
  def within(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String): typings.ol.withinMod.default = js.native
}

