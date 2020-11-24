package typings.openlayers.mod.geom

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * An array of {@link ol.geom.Geometry} objects.
  *
  * @param opt_geometries Geometries.
  * @api stable
  */
@JSImport("openlayers", "geom.GeometryCollection")
@js.native
/**
  * @classdesc
  * An array of {@link ol.geom.Geometry} objects.
  *
  * @param opt_geometries Geometries.
  * @api stable
  */
class GeometryCollection () extends Geometry {
  def this(opt_geometries: js.Array[Geometry]) = this()
  
  /**
    * @inheritDoc
    * @api stable
    */
  def applyTransform(transformFn: TransformFunction): Unit = js.native
  
  /**
    * Return the geometries that make up this geometry collection.
    * @return Geometries.
    * @api stable
    */
  def getGeometries(): js.Array[Geometry] = js.native
  
  /**
    * @inheritDoc
    * @api stable
    */
  def intersectsExtent(extent: Extent_): Boolean = js.native
  
  /**
    * Set the geometries that make up this geometry collection.
    * @param geometries Geometries.
    * @api stable
    */
  def setGeometries(geometries: js.Array[Geometry]): Unit = js.native
  
  /**
    * Translate the geometry.
    * @param deltaX Delta X.
    * @param deltaY Delta Y.
    * @api
    */
  def translate(deltaX: Double, deltaY: Double): Unit = js.native
}
