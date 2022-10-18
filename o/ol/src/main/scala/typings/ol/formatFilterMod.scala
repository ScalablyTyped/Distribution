package typings.ol

import typings.ol.extentMod.Extent
import typings.ol.formatFilterFilterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterMod {
  
  @JSImport("ol/format/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(conditions: default*): typings.ol.formatFilterAndMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(conditions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.ol.formatFilterAndMod.default]
  
  inline def bbox(geometryName: String, extent: Extent): typings.ol.formatFilterBboxMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterBboxMod.default]
  inline def bbox(geometryName: String, extent: Extent, opt_srsName: String): typings.ol.formatFilterBboxMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterBboxMod.default]
  
  inline def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): typings.ol.formatFilterIsBetweenMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(propertyName.asInstanceOf[js.Any], lowerBoundary.asInstanceOf[js.Any], upperBoundary.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsBetweenMod.default]
  
  inline def contains(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterContainsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterContainsMod.default]
  inline def contains(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterContainsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterContainsMod.default]
  
  inline def disjoint(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterDisjointMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("disjoint")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterDisjointMod.default]
  inline def disjoint(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterDisjointMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("disjoint")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterDisjointMod.default]
  
  inline def during(propertyName: String, begin: String, end: String): typings.ol.formatFilterDuringMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("during")(propertyName.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterDuringMod.default]
  
  inline def dwithin(geometryName: String, geometry: typings.ol.geomGeometryMod.default, distance: Double, unit: String): typings.ol.formatFilterDwithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("dwithin")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterDwithinMod.default]
  inline def dwithin(
    geometryName: String,
    geometry: typings.ol.geomGeometryMod.default,
    distance: Double,
    unit: String,
    opt_srsName: String
  ): typings.ol.formatFilterDwithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("dwithin")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterDwithinMod.default]
  
  inline def equalTo(propertyName: String, expression: String): typings.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterEqualToMod.default]
  inline def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterEqualToMod.default]
  inline def equalTo(propertyName: String, expression: Double): typings.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterEqualToMod.default]
  inline def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.formatFilterEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterEqualToMod.default]
  
  inline def greaterThan(propertyName: String, expression: Double): typings.ol.formatFilterGreaterThanMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterGreaterThanMod.default]
  
  inline def greaterThanOrEqualTo(propertyName: String, expression: Double): typings.ol.formatFilterGreaterThanOrEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterGreaterThanOrEqualToMod.default]
  
  inline def intersects(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterIntersectsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIntersectsMod.default]
  inline def intersects(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterIntersectsMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIntersectsMod.default]
  
  inline def isNull(propertyName: String): typings.ol.formatFilterIsNullMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(propertyName.asInstanceOf[js.Any]).asInstanceOf[typings.ol.formatFilterIsNullMod.default]
  
  inline def lessThan(propertyName: String, expression: Double): typings.ol.formatFilterLessThanMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterLessThanMod.default]
  
  inline def lessThanOrEqualTo(propertyName: String, expression: Double): typings.ol.formatFilterLessThanOrEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterLessThanOrEqualToMod.default]
  
  inline def like(propertyName: String, pattern: String): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(propertyName: String, pattern: String, opt_wildCard: Unit, opt_singleChar: String): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): typings.ol.formatFilterIsLikeMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterIsLikeMod.default]
  
  inline def not(condition: default): typings.ol.formatFilterNotMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(condition.asInstanceOf[js.Any]).asInstanceOf[typings.ol.formatFilterNotMod.default]
  
  inline def notEqualTo(propertyName: String, expression: String): typings.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterNotEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): typings.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterNotEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: Double): typings.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterNotEqualToMod.default]
  inline def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): typings.ol.formatFilterNotEqualToMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterNotEqualToMod.default]
  
  inline def or(conditions: default*): typings.ol.formatFilterOrMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(conditions.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.ol.formatFilterOrMod.default]
  
  inline def within(geometryName: String, geometry: typings.ol.geomGeometryMod.default): typings.ol.formatFilterWithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterWithinMod.default]
  inline def within(geometryName: String, geometry: typings.ol.geomGeometryMod.default, opt_srsName: String): typings.ol.formatFilterWithinMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[typings.ol.formatFilterWithinMod.default]
}
