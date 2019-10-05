package typings.openlayers.openlayersMod.format.filter

import typings.openlayers.openlayersMod.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class Within protected () extends Spatial {
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

@JSImport("openlayers", "format.filter.within")
@js.native
object within extends js.Object {
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
  def apply(geometryName: String, geometry: Geometry): Within = js.native
  def apply(geometryName: String, geometry: Geometry, opt_srsName: String): Within = js.native
}

