package typings.openlayers.mod.format

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filter {
  
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
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: String
    ) = this()
    def this(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: js.UndefOr[scala.Nothing],
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: String,
      opt_escapeChar: String
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: js.UndefOr[scala.Nothing],
      opt_escapeChar: String
    ) = this()
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
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: js.UndefOr[scala.Nothing],
      opt_escapeChar: js.UndefOr[scala.Nothing],
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: js.UndefOr[scala.Nothing],
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: String,
      opt_escapeChar: js.UndefOr[scala.Nothing],
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: js.UndefOr[scala.Nothing],
      opt_singleChar: String,
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: js.UndefOr[scala.Nothing],
      opt_escapeChar: js.UndefOr[scala.Nothing],
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: js.UndefOr[scala.Nothing],
      opt_escapeChar: String,
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: js.UndefOr[scala.Nothing],
      opt_matchCase: Boolean
    ) = this()
    def this(
      propertyName: String,
      pattern: String,
      opt_wildCard: String,
      opt_singleChar: String,
      opt_escapeChar: String,
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
  @JSImport("openlayers", "format.filter.and")
  @js.native
  def and(conditions: Filter*): And_ = js.native
  
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
  @JSImport("openlayers", "format.filter.bbox")
  @js.native
  def bbox(geometryName: String, extent: Extent_): Bbox_ = js.native
  @JSImport("openlayers", "format.filter.bbox")
  @js.native
  def bbox(geometryName: String, extent: Extent_, opt_srsName: String): Bbox_ = js.native
  
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
  @JSImport("openlayers", "format.filter.between")
  @js.native
  def between(propertyName: String, lowerBoundary: Double, upperBoundary: Double): IsBetween = js.native
  
  /**
    * Create a `<During>` temporal operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param begin The begin date in ISO-8601 format.
    * @param end The end date in ISO-8601 format.
    * @returns `<During>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.during")
  @js.native
  def during(propertyName: String, begin: String, end: String): During_ = js.native
  
  /**
    * Creates a `<PropertyIsEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsEqualTo>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.equalTo")
  @js.native
  def equalTo(propertyName: String, expression: String): EqualTo_ = js.native
  @JSImport("openlayers", "format.filter.equalTo")
  @js.native
  def equalTo(propertyName: String, expression: String, opt_matchCase: Boolean): EqualTo_ = js.native
  @JSImport("openlayers", "format.filter.equalTo")
  @js.native
  def equalTo(propertyName: String, expression: Double): EqualTo_ = js.native
  @JSImport("openlayers", "format.filter.equalTo")
  @js.native
  def equalTo(propertyName: String, expression: Double, opt_matchCase: Boolean): EqualTo_ = js.native
  
  /**
    * Creates a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThan>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.greaterThan")
  @js.native
  def greaterThan(propertyName: String, expression: Double): GreaterThan_ = js.native
  
  /**
    * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.greaterThanOrEqualTo")
  @js.native
  def greaterThanOrEqualTo(propertyName: String, expression: Double): GreaterThanOrEqualTo_ = js.native
  
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
  @JSImport("openlayers", "format.filter.intersects")
  @js.native
  def intersects(geometryName: String, geometry: Geometry): Intersects_ = js.native
  @JSImport("openlayers", "format.filter.intersects")
  @js.native
  def intersects(geometryName: String, geometry: Geometry, opt_srsName: String): Intersects_ = js.native
  
  /**
    * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
    * is null.
    *
    * @param propertyName Name of the context property to compare.
    * @returns `<PropertyIsNull>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.isNull")
  @js.native
  def isNull(propertyName: String): IsNull_ = js.native
  
  /**
    * Creates a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThan>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.lessThan")
  @js.native
  def lessThan(propertyName: String, expression: Double): LessThan_ = js.native
  
  /**
    * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThanOrEqualTo>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.lessThanOrEqualTo")
  @js.native
  def lessThanOrEqualTo(propertyName: String, expression: Double): LessThanOrEqualTo_ = js.native
  
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
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(propertyName: String, pattern: String): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: String
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: js.UndefOr[scala.Nothing],
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: js.UndefOr[scala.Nothing],
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(propertyName: String, pattern: String, opt_wildCard: String, opt_singleChar: String): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: js.UndefOr[scala.Nothing],
    opt_matchCase: Boolean
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String
  ): IsLike = js.native
  @JSImport("openlayers", "format.filter.like")
  @js.native
  def like(
    propertyName: String,
    pattern: String,
    opt_wildCard: String,
    opt_singleChar: String,
    opt_escapeChar: String,
    opt_matchCase: Boolean
  ): IsLike = js.native
  
  /**
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @returns `<Not>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.not")
  @js.native
  def not(condition: Filter): Not_ = js.native
  
  /**
    * Creates a `<PropertyIsNotEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsNotEqualTo>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: String): NotEqualTo_ = js.native
  @JSImport("openlayers", "format.filter.notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: String, opt_matchCase: Boolean): NotEqualTo_ = js.native
  @JSImport("openlayers", "format.filter.notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: Double): NotEqualTo_ = js.native
  @JSImport("openlayers", "format.filter.notEqualTo")
  @js.native
  def notEqualTo(propertyName: String, expression: Double, opt_matchCase: Boolean): NotEqualTo_ = js.native
  
  /**
    * Create a logical `<Or>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<Or>` operator.
    * @api
    */
  @JSImport("openlayers", "format.filter.or")
  @js.native
  def or(conditions: Filter*): Or_ = js.native
  
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
  @JSImport("openlayers", "format.filter.within")
  @js.native
  def within(geometryName: String, geometry: Geometry): Within_ = js.native
  @JSImport("openlayers", "format.filter.within")
  @js.native
  def within(geometryName: String, geometry: Geometry, opt_srsName: String): Within_ = js.native
}
