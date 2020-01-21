package typings.openlayers.mod.geom

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.TransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Abstract base class; only used for creating subclasses; do not instantiate
  * in apps, as cannot be rendered.
  *
  * @api stable
  */
@JSImport("openlayers", "geom.SimpleGeometry")
@js.native
/**
  * @classdesc
  * Abstract base class; only used for creating subclasses; do not instantiate
  * in apps, as cannot be rendered.
  *
  * @api stable
  */
class SimpleGeometry () extends Geometry {
  /**
    * @inheritDoc
    * @api stable
    */
  def applyTransform(transformFn: TransformFunction): Unit = js.native
  /**
    * Return the first coordinate of the geometry.
    * @return First coordinate.
    * @api stable
    */
  def getFirstCoordinate(): Coordinate_ = js.native
  /**
    * Return the last coordinate of the geometry.
    * @return Last point.
    * @api stable
    */
  def getLastCoordinate(): Coordinate_ = js.native
  /**
    * Return the {@link GeometryLayout layout} of the geometry.
    * @return Layout.
    * @api stable
    */
  def getLayout(): GeometryLayout = js.native
  /**
    * @inheritDoc
    * @api stable
    */
  def translate(deltaX: Double, deltaY: Double): Unit = js.native
}

