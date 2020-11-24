package typings.openlayers.mod.format.filter

import typings.openlayers.mod.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
