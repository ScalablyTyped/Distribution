package typings
package olLib.formatFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/filter", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  /**
    * @classdesc
    * Represents a logical <And> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  @js.native
  class And protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.And {
    /**
      * @classdesc
      * Represents a logical <And> operator between two or more filter conditions.
      *
      * @param conditions Conditions
      * @api
      */
    def this(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*) = this()
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
  @js.native
  class Bbox protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Bbox {
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
    def this(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent) = this()
    def this(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent, opt_srsName: java.lang.String) = this()
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
  @js.native
  class Comparison protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Comparison {
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
    def this(tagName: java.lang.String, propertyName: java.lang.String) = this()
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
  @js.native
  class ComparisonBinary protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.ComparisonBinary {
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
    def this(tagName: java.lang.String, propertyName: java.lang.String, expression: java.lang.String) = this()
    def this(tagName: java.lang.String, propertyName: java.lang.String, expression: scala.Double) = this()
    def this(tagName: java.lang.String, propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
    def this(tagName: java.lang.String, propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
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
  @js.native
  class During protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.During {
    /**
      * @classdesc
      * Represents a `<During>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param begin The begin date in ISO-8601 format.
      * @param end The end date in ISO-8601 format.
      * @api
      */
    def this(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String) = this()
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
  @js.native
  class EqualTo protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.EqualTo {
    /**
      * @classdesc
      * Represents a `<PropertyIsEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    def this(propertyName: java.lang.String, expression: java.lang.String) = this()
    def this(propertyName: java.lang.String, expression: scala.Double) = this()
    def this(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
    def this(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
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
  @js.native
  class Filter protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Filter {
    /**
      * @classdesc
      * Abstract class; normally only used for creating subclasses and not instantiated in apps.
      * Base class for WFS GetFeature filters.
      *
      * @param tagName The XML tag name for this filter.
      * @struct
      * @api
      */
    def this(tagName: java.lang.String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @js.native
  class GreaterThan protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.GreaterThan {
    /**
      * @classdesc
      * Represents a `<PropertyIsGreaterThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: java.lang.String, expression: scala.Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @js.native
  class GreaterThanOrEqualTo protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.GreaterThanOrEqualTo {
    /**
      * @classdesc
      * Represents a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: java.lang.String, expression: scala.Double) = this()
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
  @js.native
  class Intersects protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Intersects {
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
    def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
    def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
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
  @js.native
  class IsBetween protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.IsBetween {
    /**
      * @classdesc
      * Represents a `<PropertyIsBetween>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param lowerBoundary The lower bound of the range.
      * @param upperBoundary The upper bound of the range.
      * @api
      */
    def this(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double) = this()
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
  @js.native
  class IsLike protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.IsLike {
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
    def this(propertyName: java.lang.String, pattern: java.lang.String) = this()
    def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String) = this()
    def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String) = this()
    def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String, opt_escapeChar: java.lang.String) = this()
    def this(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String, opt_singleChar: java.lang.String, opt_escapeChar: java.lang.String, opt_matchCase: scala.Boolean) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsNull>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @api
    */
  @js.native
  class IsNull protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.IsNull {
    /**
      * @classdesc
      * Represents a `<PropertyIsNull>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @api
      */
    def this(propertyName: java.lang.String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @js.native
  class LessThan protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.LessThan {
    /**
      * @classdesc
      * Represents a `<PropertyIsLessThan>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: java.lang.String, expression: scala.Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @api
    */
  @js.native
  class LessThanOrEqualTo protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.LessThanOrEqualTo {
    /**
      * @classdesc
      * Represents a `<PropertyIsLessThanOrEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @api
      */
    def this(propertyName: java.lang.String, expression: scala.Double) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature n-ary logical filters.
    */
  @js.native
  class LogicalNary ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.LogicalNary
  
  /**
    * @classdesc
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @api
    */
  @js.native
  class Not protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Not {
    /**
      * @classdesc
      * Represents a logical `<Not>` operator for a filter condition.
      *
      * @param condition Filter condition.
      * @api
      */
    def this(condition: openlayersLib.openlayersMod.formatNs.filterNs.Filter) = this()
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
  @js.native
  class NotEqualTo protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo {
    /**
      * @classdesc
      * Represents a `<PropertyIsNotEqualTo>` comparison operator.
      *
      * @param propertyName Name of the context property to compare.
      * @param expression The value to compare.
      * @param opt_matchCase Case-sensitive?
      * @api
      */
    def this(propertyName: java.lang.String, expression: java.lang.String) = this()
    def this(propertyName: java.lang.String, expression: scala.Double) = this()
    def this(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean) = this()
    def this(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean) = this()
  }
  
  /**
    * @classdesc
    * Represents a logical <Or> operator between two or more filter conditions.
    *
    * @param conditions Conditions
    * @api
    */
  @js.native
  class Or protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Or {
    /**
      * @classdesc
      * Represents a logical <Or> operator between two or more filter conditions.
      *
      * @param conditions Conditions
      * @api
      */
    def this(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*) = this()
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
  @js.native
  class Spatial protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Spatial {
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
    def this(tagName: java.lang.String, geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
    def this(tagName: java.lang.String, geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
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
  @js.native
  class Within protected ()
    extends openlayersLib.openlayersMod.formatNs.filterNs.Within {
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
    def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry) = this()
    def this(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry, opt_srsName: java.lang.String) = this()
  }
  
  /**
    * Create a logical `<And>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<And>` operator.
    * @api
    */
  def and(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*): openlayersLib.openlayersMod.formatNs.filterNs.And = js.native
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
  def bbox(geometryName: java.lang.String, extent: openlayersLib.openlayersMod.Extent): openlayersLib.openlayersMod.formatNs.filterNs.Bbox = js.native
  def bbox(
    geometryName: java.lang.String,
    extent: openlayersLib.openlayersMod.Extent,
    opt_srsName: java.lang.String
  ): openlayersLib.openlayersMod.formatNs.filterNs.Bbox = js.native
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
  def between(propertyName: java.lang.String, lowerBoundary: scala.Double, upperBoundary: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.IsBetween = js.native
  /**
    * Create a `<During>` temporal operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param begin The begin date in ISO-8601 format.
    * @param end The end date in ISO-8601 format.
    * @returns `<During>` operator.
    * @api
    */
  def during(propertyName: java.lang.String, begin: java.lang.String, end: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.During = js.native
  /**
    * Creates a `<PropertyIsEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsEqualTo>` operator.
    * @api
    */
  def equalTo(propertyName: java.lang.String, expression: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
  def equalTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
  def equalTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
  def equalTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.EqualTo = js.native
  /**
    * Creates a `<PropertyIsGreaterThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThan>` operator.
    * @api
    */
  def greaterThan(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.GreaterThan = js.native
  /**
    * Creates a `<PropertyIsGreaterThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsGreaterThanOrEqualTo>` operator.
    * @api
    */
  def greaterThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.GreaterThanOrEqualTo = js.native
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
  def intersects(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry): openlayersLib.openlayersMod.formatNs.filterNs.Intersects = js.native
  def intersects(
    geometryName: java.lang.String,
    geometry: openlayersLib.openlayersMod.geomNs.Geometry,
    opt_srsName: java.lang.String
  ): openlayersLib.openlayersMod.formatNs.filterNs.Intersects = js.native
  /**
    * Creates a `<PropertyIsNull>` comparison operator to test whether a property value
    * is null.
    *
    * @param propertyName Name of the context property to compare.
    * @returns `<PropertyIsNull>` operator.
    * @api
    */
  def isNull(propertyName: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.IsNull = js.native
  /**
    * Creates a `<PropertyIsLessThan>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThan>` operator.
    * @api
    */
  def lessThan(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.LessThan = js.native
  /**
    * Creates a `<PropertyIsLessThanOrEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @returns `<PropertyIsLessThanOrEqualTo>` operator.
    * @api
    */
  def lessThanOrEqualTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.LessThanOrEqualTo = js.native
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
  def like(propertyName: java.lang.String, pattern: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
  def like(propertyName: java.lang.String, pattern: java.lang.String, opt_wildCard: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
  def like(
    propertyName: java.lang.String,
    pattern: java.lang.String,
    opt_wildCard: java.lang.String,
    opt_singleChar: java.lang.String
  ): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
  def like(
    propertyName: java.lang.String,
    pattern: java.lang.String,
    opt_wildCard: java.lang.String,
    opt_singleChar: java.lang.String,
    opt_escapeChar: java.lang.String
  ): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
  def like(
    propertyName: java.lang.String,
    pattern: java.lang.String,
    opt_wildCard: java.lang.String,
    opt_singleChar: java.lang.String,
    opt_escapeChar: java.lang.String,
    opt_matchCase: scala.Boolean
  ): openlayersLib.openlayersMod.formatNs.filterNs.IsLike = js.native
  /**
    * Represents a logical `<Not>` operator for a filter condition.
    *
    * @param condition Filter condition.
    * @returns `<Not>` operator.
    * @api
    */
  def not(condition: openlayersLib.openlayersMod.formatNs.filterNs.Filter): openlayersLib.openlayersMod.formatNs.filterNs.Not = js.native
  /**
    * Creates a `<PropertyIsNotEqualTo>` comparison operator.
    *
    * @param propertyName Name of the context property to compare.
    * @param expression The value to compare.
    * @param opt_matchCase Case-sensitive?
    * @returns `<PropertyIsNotEqualTo>` operator.
    * @api
    */
  def notEqualTo(propertyName: java.lang.String, expression: java.lang.String): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
  def notEqualTo(propertyName: java.lang.String, expression: java.lang.String, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
  def notEqualTo(propertyName: java.lang.String, expression: scala.Double): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
  def notEqualTo(propertyName: java.lang.String, expression: scala.Double, opt_matchCase: scala.Boolean): openlayersLib.openlayersMod.formatNs.filterNs.NotEqualTo = js.native
  /**
    * Create a logical `<Or>` operator between two or more filter conditions.
    *
    * @param conditions Filter conditions.
    * @returns `<Or>` operator.
    * @api
    */
  def or(conditions: openlayersLib.openlayersMod.formatNs.filterNs.Filter*): openlayersLib.openlayersMod.formatNs.filterNs.Or = js.native
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
  def within(geometryName: java.lang.String, geometry: openlayersLib.openlayersMod.geomNs.Geometry): openlayersLib.openlayersMod.formatNs.filterNs.Within = js.native
  def within(
    geometryName: java.lang.String,
    geometry: openlayersLib.openlayersMod.geomNs.Geometry,
    opt_srsName: java.lang.String
  ): openlayersLib.openlayersMod.formatNs.filterNs.Within = js.native
}

