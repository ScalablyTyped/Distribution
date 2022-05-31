package typings.openlayers.global.ol

import org.scalablytyped.runtime.StringDictionary
import typings.openlayers.mod.geom.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Feature")
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
class Feature ()
  extends typings.openlayers.mod.Feature {
  def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  def this(opt_geometryOrProperties: Geometry) = this()
}
