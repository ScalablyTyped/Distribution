package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterDisjointMod {
  
  /**
    * @classdesc
    * Represents a `<Disjoint>` operator to test whether a geometry-valued property
    * is disjoint to a given geometry.
    * @api
    */
  @JSImport("ol/format/filter/Disjoint", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterSpatialMod.default {
    /**
      * @param {!string} geometryName Geometry name to use.
      * @param {!import("../../geom/Geometry.js").default} geometry Geometry.
      * @param {string} [srsName] SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      */
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, srsName: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<Disjoint>` operator to test whether a geometry-valued property
    * is disjoint to a given geometry.
    * @api
    */
  type Disjoint = typings.ol.formatFilterSpatialMod.default
}
