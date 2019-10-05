package typings.openlayers.openlayersMod.source

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.Coordinate
import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.FeatureUrlFunction
import typings.openlayers.openlayersMod.olx.source.VectorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Provides a source of features for vector layers. Vector features provided
  * by this source are suitable for editing. See {@link ol.source.VectorTile} for
  * vector data that is optimized for rendering.
  *
  * @fires ol.source.VectorEvent
  * @param opt_options Vector source options.
  * @api stable
  */
@JSImport("openlayers", "source.Vector")
@js.native
/**
  * @classdesc
  * Provides a source of features for vector layers. Vector features provided
  * by this source are suitable for editing. See {@link ol.source.VectorTile} for
  * vector data that is optimized for rendering.
  *
  * @fires ol.source.VectorEvent
  * @param opt_options Vector source options.
  * @api stable
  */
class Vector () extends Source {
  def this(opt_options: VectorOptions) = this()
  /**
    * Add a single feature to the source.  If you want to add a batch of features
    * at once, call {@link ol.source.Vector#addFeatures source.addFeatures()}
    * instead.
    * @param feature Feature to add.
    * @api stable
    */
  def addFeature(feature: Feature): Unit = js.native
  /**
    * Add a batch of features to the source.
    * @param features Features to add.
    * @api stable
    */
  def addFeatures(features: js.Array[Feature]): Unit = js.native
  /**
    * Remove all features from the source.
    * @param events.
    * @api stable
    */
  def clear(): Unit = js.native
  def clear(opt_fast: Boolean): Unit = js.native
  /**
    * Iterate through all features on the source, calling the provided callback
    * with each one.  If the callback returns any "truthy" value, iteration will
    * stop and the function will return the same value.
    *
    * @param callback Called with each feature
    *     on the source.  Return a truthy value to stop iteration.
    * @param opt_this The object to use as `this` in the callback.
    * @return The return value from the last call to the callback.
    * @template T,S
    * @api stable
    */
  def forEachFeature[S](callback: js.Function1[/* feature */ Feature, S]): S = js.native
  def forEachFeature[S](callback: js.Function1[/* feature */ Feature, S], opt_this: js.Any): S = js.native
  /**
    * Iterate through all features whose bounding box intersects the provided
    * extent (note that the feature's geometry may not intersect the extent),
    * calling the callback with each feature.  If the callback returns a "truthy"
    * value, iteration will stop and the function will return the same value.
    *
    * If you are interested in features whose geometry intersects an extent, call
    * the {@link ol.source.Vector#forEachFeatureIntersectingExtent
    * source.forEachFeatureIntersectingExtent()} method instead.
    *
    * When `useSpatialIndex` is set to false, this method will loop through all
    * features, equivalent to {@link ol.source.Vector#forEachFeature}.
    *
    * @param extent Extent.
    * @param callback Called with each feature
    *     whose bounding box intersects the provided extent.
    * @param opt_this The object to use as `this` in the callback.
    * @return The return value from the last call to the callback.
    * @template T,S
    * @api
    */
  def forEachFeatureInExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S]): S = js.native
  def forEachFeatureInExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S], opt_this: js.Any): S = js.native
  /**
    * Iterate through all features whose geometry intersects the provided extent,
    * calling the callback with each feature.  If the callback returns a "truthy"
    * value, iteration will stop and the function will return the same value.
    *
    * If you only want to test for bounding box intersection, call the
    * {@link ol.source.Vector#forEachFeatureInExtent
    * source.forEachFeatureInExtent()} method instead.
    *
    * @param extent Extent.
    * @param callback Called with each feature
    *     whose geometry intersects the provided extent.
    * @param opt_this The object to use as `this` in the callback.
    * @return The return value from the last call to the callback.
    * @template T,S
    * @api
    */
  def forEachFeatureIntersectingExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S]): S = js.native
  def forEachFeatureIntersectingExtent[S](extent: Extent, callback: js.Function1[/* feature */ Feature, S], opt_this: js.Any): S = js.native
  /**
    * Get the closest feature to the provided coordinate.
    *
    * This method is not available when the source is configured with
    * `useSpatialIndex` set to `false`.
    * @param coordinate Coordinate.
    * @param opt_filter Feature filter function.
    *     The filter function will receive one argument, the {@link ol.Feature feature}
    *     and it should return a boolean value. By default, no filtering is made.
    * @return Closest feature.
    * @api stable
    */
  def getClosestFeatureToCoordinate(coordinate: Coordinate): Feature = js.native
  def getClosestFeatureToCoordinate(coordinate: Coordinate, opt_filter: js.Function1[/* feature */ Feature, Boolean]): Feature = js.native
  /**
    * Get the extent of the features currently in the source.
    *
    * This method is not available when the source is configured with
    * `useSpatialIndex` set to `false`.
    * @return Extent.
    * @api stable
    */
  def getExtent(): Extent = js.native
  /**
    * Get a feature by its identifier (the value returned by feature.getId()).
    * Note that the index treats string and numeric identifiers as the same.  So
    * `source.getFeatureById(2)` will return a feature with id `'2'` or `2`.
    *
    * @param id Feature identifier.
    * @return The feature (or `null` if not found).
    * @api stable
    */
  def getFeatureById(id: String): Feature = js.native
  def getFeatureById(id: Double): Feature = js.native
  /**
    * Get all features on the source.
    * @return Features.
    * @api stable
    */
  def getFeatures(): js.Array[Feature] = js.native
  /**
    * Get all features whose geometry intersects the provided coordinate.
    * @param coordinate Coordinate.
    * @return Features.
    * @api stable
    */
  def getFeaturesAtCoordinate(coordinate: Coordinate): js.Array[Feature] = js.native
  /**
    * Get the features collection associated with this source. Will be `null`
    * unless the source was configured with `useSpatialIndex` set to `false`, or
    * with an {@link ol.Collection} as `features`.
    * @return The collection of features.
    * @api
    */
  def getFeaturesCollection(): Collection[Feature] = js.native
  /**
    * Get all features in the provided extent.  Note that this returns all features
    * whose bounding boxes intersect the given extent (so it may include features
    * whose geometries do not intersect the extent).
    *
    * This method is not available when the source is configured with
    * `useSpatialIndex` set to `false`.
    * @param extent Extent.
    * @return Features.
    * @api
    */
  def getFeaturesInExtent(extent: Extent): js.Array[Feature] = js.native
  /**
    * Get the format associated with this source.
    *
    * @return The feature format.
    * @api
    */
  def getFormat(): typings.openlayers.openlayersMod.format.Feature = js.native
  /**
    * Get the url associated with this source.
    *
    * @return The url.
    * @api
    */
  def getUrl(): String | FeatureUrlFunction = js.native
  /**
    * Remove a single feature from the source.  If you want to remove all features
    * at once, use the {@link ol.source.Vector#clear source.clear()} method
    * instead.
    * @param feature Feature to remove.
    * @api stable
    */
  def removeFeature(feature: Feature): Unit = js.native
}

