package typings.openlayers.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.geom.Geometry
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openlayers", "Feature")
@js.native
/**
  * @classdesc
  * A vector object for geographic features with a geometry and other
  * attribute properties, similar to the features in vector file formats like
  * GeoJSON.
  *
  * Features can be styled individually with `setStyle`; otherwise they use the
  * style of their vector layer.
  *
  * Note that attribute properties are set as {@link ol.Object} properties on
  * the feature object, so they are observable, and have get/set accessors.
  *
  * Typically, a feature has a single geometry property. You can set the
  * geometry using the `setGeometry` method and get it with `getGeometry`.
  * It is possible to store more than one geometry on a feature using attribute
  * properties. By default, the geometry used for rendering is identified by
  * the property name `geometry`. If you want to use another geometry property
  * for rendering, use the `setGeometryName` method to change the attribute
  * property associated with the geometry for the feature.  For example:
  *
  * ```js
  * var feature = new ol.Feature({
  *   geometry: new ol.geom.Polygon(polyCoords),
  *   labelPoint: new ol.geom.Point(labelCoords),
  *   name: 'My Polygon'
  * });
  *
  * // get the polygon geometry
  * var poly = feature.getGeometry();
  *
  * // Render the feature as a point using the coordinates from labelPoint
  * feature.setGeometryName('labelPoint');
  *
  * // get the point geometry
  * var point = feature.getGeometry();
  * ```
  *
  * @param opt_geometryOrProperties
  *     You may pass a Geometry object directly, or an object literal
  *     containing properties.  If you pass an object literal, you may
  *     include a Geometry associated with a `geometry` key.
  * @api stable
  */
class Feature () extends Object {
  def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  def this(opt_geometryOrProperties: Geometry) = this()
  
  /**
    * Get the feature's default geometry.  A feature may have any number of named
    * geometries.  The "default" geometry (the one that is rendered by default) is
    * set when calling {@link ol.Feature#setGeometry}.
    * @return The default geometry for the feature.
    * @api stable
    * @observable
    */
  def getGeometry(): Geometry = js.native
  
  /**
    * Get the name of the feature's default geometry.  By default, the default
    * geometry is named `geometry`.
    * @return Get the property name associated with the default geometry
    *     for this feature.
    * @api stable
    */
  def getGeometryName(): String = js.native
  
  /**
    * Get the feature identifier.  This is a stable identifier for the feature and
    * is either set when reading data from a remote source or set explicitly by
    * calling {@link ol.Feature#setId}.
    * @return Id.
    * @api stable
    * @observable
    */
  def getId(): Double | String = js.native
  
  /**
    * Get the feature's style.  This return for this method depends on what was
    * provided to the {@link ol.Feature#setStyle} method.
    * @return The feature style.
    * @api stable
    * @observable
    */
  def getStyle(): Style | js.Array[Style] | FeatureStyleFunction | StyleFunction = js.native
  
  /**
    * Get the feature's style function.
    * @return Return a function
    * representing the current style of this feature.
    * @api stable
    */
  def getStyleFunction(): js.UndefOr[FeatureStyleFunction] = js.native
  
  /**
    * Set the default geometry for the feature.  This will update the property
    * with the name returned by {@link ol.Feature#getGeometryName}.
    * @param geometry The new geometry.
    * @api stable
    * @observable
    */
  def setGeometry(geometry: Geometry): Unit = js.native
  
  /**
    * Set the property name to be used when getting the feature's default geometry.
    * When calling {@link ol.Feature#getGeometry}, the value of the property with
    * this name will be returned.
    * @param name The property name of the default geometry.
    * @api stable
    */
  def setGeometryName(name: String): Unit = js.native
  
  def setId(id: String): Unit = js.native
  /**
    * Set the feature id.  The feature id is considered stable and may be used when
    * requesting features or comparing identifiers returned from a remote source.
    * The feature id can be used with the {@link ol.source.Vector#getFeatureById}
    * method.
    * @param id The feature id.
    * @api stable
    * @observable
    */
  def setId(id: Double): Unit = js.native
  
  /**
    * Set the style for the feature.  This can be a single style object, an array
    * of styles, or a function that takes a resolution and returns an array of
    * styles. If it is `null` the feature has no style (a `null` style).
    * @param style Style for this feature.
    * @api stable
    * @observable
    */
  def setStyle(): Unit = js.native
  def setStyle(style: js.Array[Style]): Unit = js.native
  def setStyle(style: FeatureStyleFunction): Unit = js.native
  def setStyle(style: StyleFunction): Unit = js.native
  def setStyle(style: Style): Unit = js.native
}
