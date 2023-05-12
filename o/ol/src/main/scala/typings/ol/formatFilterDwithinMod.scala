package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterDwithinMod {
  
  /**
    * @classdesc
    * Represents a `<DWithin>` operator to test whether a geometry-valued property
    * is within a distance to a given geometry.
    * @api
    */
  @JSImport("ol/format/filter/DWithin", JSImport.Default)
  @js.native
  open class default protected () extends DWithin {
    /**
      * @param {!string} geometryName Geometry name to use.
      * @param {!import("../../geom/Geometry.js").default} geometry Geometry.
      * @param {!number} distance Distance.
      * @param {!string} unit Unit.
      * @param {string} [srsName] SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      */
    def this(geometryName: String, geometry: typings.ol.geomGeometryMod.default, distance: Double, unit: String) = this()
    def this(
      geometryName: String,
      geometry: typings.ol.geomGeometryMod.default,
      distance: Double,
      unit: String,
      srsName: String
    ) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<DWithin>` operator to test whether a geometry-valued property
    * is within a distance to a given geometry.
    * @api
    */
  @js.native
  trait DWithin
    extends typings.ol.formatFilterSpatialMod.default {
    
    /**
      * @public
      * @type {!number}
      */
    var distance: Double = js.native
    
    /**
      * @public
      * @type {!string}
      */
    var unit: String = js.native
  }
}
