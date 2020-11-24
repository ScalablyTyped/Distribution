package typings.openlayers.mod.format.filter

import typings.openlayers.mod.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
