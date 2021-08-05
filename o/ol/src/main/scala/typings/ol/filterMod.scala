package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.filterFilterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("ol/format/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(conditions: default*): typings.ol.andMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(conditions.asInstanceOf[js.Any]).asInstanceOf[typings.ol.andMod.default]
  
  inline def bbox(geometryName: String, extent: Extent): typings.ol.bboxMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[typings.ol.bboxMod.default]
  inline def bbox(geometryName: String, extent: Extent, opt_srsName: String): typings.ol.bboxMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.bboxMod.default]
  
  inline def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typings.ol.isBetweenMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(propertyName.asInstanceOf[js.Any], lowerBoundary.asInstanceOf[js.Any], upperBoundary.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isBetweenMod.default]
  
  inline def contains(geometryName: String, geometry: typings.ol.geometryMod.default): typings.ol.containsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.containsMod.default]
  inline def contains(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String): typings.ol.containsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.containsMod.default]
  
  inline def during(propertyName: String, begin: String, end: String): typings.ol.duringMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("during")(propertyName.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.ol.duringMod.default]
  
  inline def equalTo(propertyName: String, expression: String): typings.ol.equalToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.equalToMod.default]
  inline def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.equalToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.equalToMod.default]
  inline def equalTo(propertyName: String, expression: Double): typings.ol.equalToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.equalToMod.default]
  inline def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.equalToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.equalToMod.default]
  
  inline def greaterThan(propertyName: String, expression: Double): typings.ol.greaterThanMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.greaterThanMod.default]
  
  inline def greaterThanOrEqualTo(propertyName: String, expression: Double): typings.ol.greaterThanOrEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.greaterThanOrEqualToMod.default]
  
  inline def intersects(geometryName: String, geometry: typings.ol.geometryMod.default): typings.ol.intersectsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.intersectsMod.default]
  inline def intersects(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String): typings.ol.intersectsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.intersectsMod.default]
  
  inline def isNull(propertyName: String): typings.ol.isNullMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(propertyName.asInstanceOf[js.Any]).asInstanceOf[typings.ol.isNullMod.default]
  
  inline def lessThan(propertyName: String, expression: Double): typings.ol.lessThanMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.lessThanMod.default]
  
  inline def lessThanOrEqualTo(propertyName: String, expression: Double): typings.ol.lessThanOrEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.lessThanOrEqualToMod.default]
  
  inline def like(propertyName: String, pattern: String): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: Unit, opt_singleChar: String): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.isLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.isLikeMod.default]
  
  inline def not(condition: default): typings.ol.notMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(condition.asInstanceOf[js.Any]).asInstanceOf[typings.ol.notMod.default]
  
  inline def notEqualTo(propertyName: String, expression: String): typings.ol.notEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.notEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.notEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.notEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: Double): typings.ol.notEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.notEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.notEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.notEqualToMod.default]
  
  inline def or(conditions: default*): typings.ol.orMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(conditions.asInstanceOf[js.Any]).asInstanceOf[typings.ol.orMod.default]
  
  inline def within(geometryName: String, geometry: typings.ol.geometryMod.default): typings.ol.withinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.withinMod.default]
  inline def within(geometryName: String, geometry: typings.ol.geometryMod.default, opt_srsName: String): typings.ol.withinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.withinMod.default]
}
