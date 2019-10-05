package typings.openlayers.openlayersMod.format.filter

import typings.openlayers.openlayersMod.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class Intersects protected () extends Spatial {
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

@JSImport("openlayers", "format.filter.intersects")
@js.native
object intersects extends js.Object {
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
  def apply(geometryName: String, geometry: Geometry): Intersects = js.native
  def apply(geometryName: String, geometry: Geometry, opt_srsName: String): Intersects = js.native
}

