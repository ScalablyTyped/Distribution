package typings.openlayers.mod.format

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filter {
  
  @JSImport("openlayers", "format.filter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @classdesc
    * Represents a logical <And> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  @JSImport("openlayers", "format.filter.And")
  @js.native
  class And_ protected () extends LogicalNary {
    /**
      * @classdesc
      * Represents a logical <And> operator between two or more filter conditions.
      *
      * @param conditions Conditions
      * @api
      */
    def this(conditions: Filter*) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<BBOX>` operator to test whether a geometry-valued property
    * intersects a fixed bounding box
    *
    * @param geometryName Geometry name to use.
    * @param extent Extent.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @api
    */
  @JSImport("openlayers", "format.filter.Bbox")
  @js.native
  class Bbox_ protected () extends Filter {
    /**
      * @classdesc
      * Represents a `<BBOX>` operator to test whether a geometry-valued property
      * intersects a fixed bounding box
      *
      * @param geometryName Geometry name to use.
      * @param extent Extent.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    def this(geometryName: String, extent: Extent_) = this()
    def this(geometryName: String, extent: Extent_, opt_srsName: String) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property comparison filters.
    *
    * deprecated: This class will no longer be exported starting from the next major version.
    *
    * @param tagName The XML tag name for this filter.
    * @param propertyName Name of the context property to compare.
    * @api
    */
  @JSImport("openlayers", "format.filter.Comparison")
  @js.native
  class Comparison protected () extends Filter {
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature property comparison filters.
      *
      * deprecated: This class will no longer be exported starting from the next major version.
      *
      * @param tagName The XML tag name for this filter.
      * @param propertyName Name of the context property to compare.
      * @api
      */
    def this(tagName: String, propertyName: String) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property binary comparison filters.
    *
    * deprecated: This class will no longer be exported starting from the next major version.
    *
    * @param tagName The XML tag name for this filter.
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  @JSImport("openlayers", "format.filter.ComparisonBinary")
  @js.native
  class ComparisonBinary protected () extends Comparison {
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature property binary comparison filters.
      *
      * deprecated: This class will no longer be exported starting from the next major version.
      *
      * @param tagName The XML tag name for this filter.
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    def this(tagName: String, propertyName: String, expression: String) = this()
    def this(tagName: String, propertyName: String, expression: Double) = this()
    def this(tagName: String, propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(tagName: String, propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<During>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param begin The begin date in ISO-8601 format.
    * @param end The end date in ISO-8601 format.
    * @api
    */
  @JSImport("openlayers", "format.filter.During")
  @js.native
  class During_ protected () extends Comparison {
    /**
      * @classdesc
      * Represents a `<During>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param begin The begin date in ISO-8601 format.
      * @param end The end date in ISO-8601 format.
      * @api
      */
    def this(propertyName: String, begin: String, end: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  @JSImport("openlayers", "format.filter.EqualTo")
  @js.native
  class EqualTo_ protected () extends ComparisonBinary {
    /**
      * @classdesc
      * Represents a `<PropertyIsEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    def this(propertyName: String, expression: String) = this()
    def this(propertyName: String, expression: Double) = this()
    def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature filters.
    *
    * @param tagName The XML tag name for this filter.
    * @struct
    * @api
    */
  @JSImport("openlayers", "format.filter.Filter")
  @js.native
  class Filter protected () extends StObject {
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature filters.
      *
      * @param tagName The XML tag name for this filter.
      * @struct
      * @api
      */
    def this(tagName: String) = this()
    
    /**
      * The XML tag name for a filter.
      * @returns Name.
      */
    def getTagName(): String = js.native
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @JSImport("openlayers", "format.filter.GreaterThanOrEqualTo")
  @js.native
  class GreaterThanOrEqualTo_ protected () extends ComparisonBinary {
    /**
      * @classdesc
      * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: String, expression: Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @JSImport("openlayers", "format.filter.GreaterThan")
  @js.native
  class GreaterThan_ protected () extends ComparisonBinary {
    /**
      * @classdesc
      * Represents a `<PropertyIsGreaterThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: String, expression: Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<Intersects>` operator to test whether a geometry-valued property
    * intersects a given geometry.
    *
    * @param geometryName Geometry name to use.
    * @param geometry Geometry.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @api
    */
  @JSImport("openlayers", "format.filter.Intersects")
  @js.native
  class Intersects_ protected () extends Spatial {
    /**
      * @classdesc
      * Represents a `<Intersects>` operator to test whether a geometry-valued property
      * intersects a given geometry.
      *
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    def this(geometryName: String, geometry: Geometry) = this()
    def this(geometryName: String, geometry: Geometry, opt_srsName: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsBetween>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param lowerBoundary The lower bound of the range.
    * @param upperBoundary The upper bound of the range.
    * @api
    */
  @JSImport("openlayers", "format.filter.IsBetween")
  @js.native
  class IsBetween protected () extends Comparison {
    /**
      * @classdesc
      * Represents a `<PropertyIsBetween>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param lowerBoundary The lower bound of the range.
      * @param upperBoundary The upper bound of the range.
      * @api
      */
    def this(propertyName: String, lowerBoundary: Double, upperBoundary: Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLike>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param pattern Text pattern.
    * @param opt_wildCard Pattern character which matches any sequence of
    *    zero or more string characters. Default is '*'.
    * @param opt_singleChar pattern character which matches any single
    *    string character. Default is '.'.
    * @param opt_escapeChar Escape character which can be used to escape
    *    the pattern characters. Default is '!'.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  @JSImport("openlayers", "format.filter.IsLike")
  @js.native
  class IsLike protected () extends Comparison {
    /**
      * @classdesc
      * Represents a `<PropertyIsLike>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param pattern Text pattern.
      * @param opt_wildCard Pattern character which matches any sequence of
      *    zero or more string characters. Default is '*'.
      * @param opt_singleChar pattern character which matches any single
      *    string character. Default is '.'.
      * @param opt_escapeChar Escape character which can be used to escape
      *    the pattern characters. Default is '!'.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    def this(propertyName: String, pattern: String) = this()
    def this(propertyName: String, pattern: String, opt_wildCard: String) = this()
    def this(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String) = this()
    def this(propertyName: String, pattern: String, opt_wildCard: Unit, opt_singleChar: String) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: Unit,
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: Unit,
      opt_singleChar: String,
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: Unit,
      opt_singleChar: Unit,
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: Unit,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: Unit,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: Unit,
      opt_escapeChar: Unit,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: Unit,
      opt_singleChar: String,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: Unit,
      opt_singleChar: String,
      opt_escapeChar: Unit,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: Unit,
      opt_singleChar: Unit,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: Unit,
      opt_singleChar: Unit,
      opt_escapeChar: Unit,
      opt_matchCase: Boolean
    ) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsNull>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @api
    */
  @JSImport("openlayers", "format.filter.IsNull")
  @js.native
  class IsNull_ protected () extends Comparison {
    /**
      * @classdesc
      * Represents a `<PropertyIsNull>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @api
      */
    def this(propertyName: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @JSImport("openlayers", "format.filter.LessThanOrEqualTo")
  @js.native
  class LessThanOrEqualTo_ protected () extends ComparisonBinary {
    /**
      * @classdesc
      * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: String, expression: Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @JSImport("openlayers", "format.filter.LessThan")
  @js.native
  class LessThan_ protected () extends ComparisonBinary {
    /**
      * @classdesc
      * Represents a `<PropertyIsLessThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: String, expression: Double) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature n-ary logical filters.
    */
  @JSImport("openlayers", "format.filter.LogicalNary")
  @js.native
  class LogicalNary protected () extends Filter {
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature filters.
      *
      * @param tagName The XML tag name for this filter.
      * @struct
      * @api
      */
    def this(tagName: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsNotEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @api
    */
  @JSImport("openlayers", "format.filter.NotEqualTo")
  @js.native
  class NotEqualTo_ protected () extends ComparisonBinary {
    /**
      * @classdesc
      * Represents a `<PropertyIsNotEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    def this(propertyName: String, expression: String) = this()
    def this(propertyName: String, expression: Double) = this()
    def this(propertyName: String, expression: String, opt_matchCase: Boolean) = this()
    def this(propertyName: String, expression: Double, opt_matchCase: Boolean) = this()
  }
  
  /**
    * @classdesc
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @api
    */
  @JSImport("openlayers", "format.filter.Not")
  @js.native
  class Not_ protected () extends Filter {
    /**
      * @classdesc
      * Represents a logical `<Not>` operator for a filter condition.
      *
      * @param condition Filter condition.
      * @api
      */
    def this(condition: Filter) = this()
  }
  
  /**
    * @classdesc
    * Represents a logical <Or> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  @JSImport("openlayers", "format.filter.Or")
  @js.native
  class Or_ protected () extends LogicalNary {
    /**
      * @classdesc
      * Represents a logical <Or> operator between two or more filter conditions.
      *
      * @param conditions Conditions
      * @api
      */
    def this(conditions: Filter*) = this()
  }
  
  /**
    * @classdesc
    * Represents a spatial operator to test whether a geometry-valued property
    * relates to a given geometry.
    *
    * @param tagName The XML tag name for this filter.
    * @param geometryName Geometry name to use.
    * @param geometry Geometry.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @api
    */
  @JSImport("openlayers", "format.filter.Spatial")
  @js.native
  class Spatial protected () extends Filter {
    /**
      * @classdesc
      * Represents a spatial operator to test whether a geometry-valued property
      * relates to a given geometry.
      *
      * @param tagName The XML tag name for this filter.
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    def this(tagName: String, geometryName: String, geometry: Geometry) = this()
    def this(tagName: String, geometryName: String, geometry: Geometry, opt_srsName: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<Within>` operator to test whether a geometry-valued property
    * is within a given geometry.
    *
    * @param geometryName Geometry name to use.
    * @param geometry Geometry.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @api
    */
  @JSImport("openlayers", "format.filter.Within")
  @js.native
  class Within_ protected () extends Spatial {
    /**
      * @classdesc
      * Represents a `<Within>` operator to test whether a geometry-valued property
      * is within a given geometry.
      *
      * @param geometryName Geometry name to use.
      * @param geometry Geometry.
      * @param opt_srsName SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      * @api
      */
    def this(geometryName: String, geometry: Geometry) = this()
    def this(geometryName: String, geometry: Geometry, opt_srsName: String) = this()
  }
  
  /**
    * Create a logical `<And>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<And>` operator.
    * @api
    */
  inline def and(conditions: Filter*): And_ = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(conditions.asInstanceOf[js.Any]).asInstanceOf[And_]
  
  /**
    * Create a `<BBOX>` operator to test whether a geometry-valued property
    * intersects a fixed bounding box
    *
    * @param geometryName Geometry name to use.
    * @param extent Extent.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @returns `<BBOX>` operator.
    * @api
    */
  inline def bbox(geometryName: String, extent: Extent_): Bbox_ = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[Bbox_]
  inline def bbox(geometryName: String, extent: Extent_, opt_srsName: String): Bbox_ = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(geometryName.asInstanceOf[js.Any], extent.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[Bbox_]
  
  /**
    * Creates a `<PropertyIsBetween>` comparison operator to test whether an expression
    * value lies within a range given by a lower and upper bound (inclusive).
    *
    * @param propertyName Name of the context property to compare.
    * @param lowerBoundary The lower bound of the range.
    * @param upperBoundary The upper bound of the range.
    * @returns `<PropertyIsBetween>` operator.
    * @api
    */
  inline def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): IsBetween = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(propertyName.asInstanceOf[js.Any], lowerBoundary.asInstanceOf[js.Any], upperBoundary.asInstanceOf[js.Any])).asInstanceOf[IsBetween]
  
  /**
    * Create a `<During>` temporal operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param begin The begin date in ISO-8601 format.
    * @param end The end date in ISO-8601 format.
    * @returns `<During>` operator.
    * @api
    */
  inline def during(propertyName: String, begin: String, end: String): During_ = (^.asInstanceOf[js.Dynamic].applyDynamic("during")(propertyName.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[During_]
  
  /**
    * Creates a `<PropertyIsEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsEqualTo>` operator.
    * @api
    */
  inline def equalTo(propertyName: String, expression: String): EqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[EqualTo_]
  inline def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): EqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[EqualTo_]
  inline def equalTo(propertyName: String, expression: Double): EqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[EqualTo_]
  inline def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): EqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[EqualTo_]
  
  /**
    * Creates a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThan>` operator.
    * @api
    */
  inline def greaterThan(propertyName: String, expression: Double): GreaterThan_ = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[GreaterThan_]
  
  /**
    * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
    * @api
    */
  inline def greaterThanOrEqualTo(propertyName: String, expression: Double): GreaterThanOrEqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("greaterThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[GreaterThanOrEqualTo_]
  
  /**
    * Create a `<Intersects>` operator to test whether a geometry-valued property
    * intersects a given geometry.
    *
    * @param geometryName Geometry name to use.
    * @param geometry Geometry.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @returns `<Intersects>` operator.
    * @api
    */
  inline def intersects(geometryName: String, geometry: Geometry): Intersects_ = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[Intersects_]
  inline def intersects(geometryName: String, geometry: Geometry, opt_srsName: String): Intersects_ = (^.asInstanceOf[js.Dynamic].applyDynamic("intersects")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[Intersects_]
  
  /**
    * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
    * is null.
    *
    * @param propertyName Name of the context property to compare.
    * @returns `<PropertyIsNull>` operator.
    * @api
    */
  inline def isNull(propertyName: String): IsNull_ = ^.asInstanceOf[js.Dynamic].applyDynamic("isNull")(propertyName.asInstanceOf[js.Any]).asInstanceOf[IsNull_]
  
  /**
    * Creates a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThan>` operator.
    * @api
    */
  inline def lessThan(propertyName: String, expression: Double): LessThan_ = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThan")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[LessThan_]
  
  /**
    * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThanOrEqualTo>` operator.
    * @api
    */
  inline def lessThanOrEqualTo(propertyName: String, expression: Double): LessThanOrEqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("lessThanOrEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[LessThanOrEqualTo_]
  
  /**
    * Represents a `<PropertyIsLike>` comparison operator that matches a string property
    * value against a text pattern.
    *
    * @param propertyName Name of the context property to compare.
    * @param pattern Text pattern.
    * @param opt_wildCard Pattern character which matches any sequence of
    *    zero or more string characters. Default is '*'.
    * @param opt_singleChar pattern character which matches any single
    *    string character. Default is '.'.
    * @param opt_escapeChar Escape character which can be used to escape
    *    the pattern characters. Default is '!'.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsLike>` operator.
    * @api
    */
  inline def like(propertyName: String, pattern: String): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(propertyName: String, pattern: String, opt_wildCard: Unit, opt_singleChar: String): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: String,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  inline def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: Unit,
    opt_singleChar: Unit,
    opt_escapeChar: Unit,
    opt_matchCase: Boolean
  ): IsLike = (^.asInstanceOf[js.Dynamic].applyDynamic("like")(propertyName.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opt_wildCard.asInstanceOf[js.Any], opt_singleChar.asInstanceOf[js.Any], opt_escapeChar.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[IsLike]
  
  /**
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @returns `<Not>` operator.
    * @api
    */
  inline def not(condition: Filter): Not_ = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(condition.asInstanceOf[js.Any]).asInstanceOf[Not_]
  
  /**
    * Creates a `<PropertyIsNotEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsNotEqualTo>` operator.
    * @api
    */
  inline def notEqualTo(propertyName: String, expression: String): NotEqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[NotEqualTo_]
  inline def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): NotEqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[NotEqualTo_]
  inline def notEqualTo(propertyName: String, expression: Double): NotEqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any])).asInstanceOf[NotEqualTo_]
  inline def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): NotEqualTo_ = (^.asInstanceOf[js.Dynamic].applyDynamic("notEqualTo")(propertyName.asInstanceOf[js.Any], expression.asInstanceOf[js.Any], opt_matchCase.asInstanceOf[js.Any])).asInstanceOf[NotEqualTo_]
  
  /**
    * Create a logical `<Or>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<Or>` operator.
    * @api
    */
  inline def or(conditions: Filter*): Or_ = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(conditions.asInstanceOf[js.Any]).asInstanceOf[Or_]
  
  /**
    * Create a `<Within>` operator to test whether a geometry-valued property
    * is within a given geometry.
    *
    * @param geometryName Geometry name to use.
    * @param geometry Geometry.
    * @param opt_srsName SRS name. No srsName attribute will be
    *    set on geometries when this is not provided.
    * @returns `<Within>` operator.
    * @api
    */
  inline def within(geometryName: String, geometry: Geometry): Within_ = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any])).asInstanceOf[Within_]
  inline def within(geometryName: String, geometry: Geometry, opt_srsName: String): Within_ = (^.asInstanceOf[js.Dynamic].applyDynamic("within")(geometryName.asInstanceOf[js.Any], geometry.asInstanceOf[js.Any], opt_srsName.asInstanceOf[js.Any])).asInstanceOf[Within_]
}
