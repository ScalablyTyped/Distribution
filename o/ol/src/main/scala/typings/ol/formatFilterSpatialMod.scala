package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterSpatialMod {
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Represents a spatial operator to test whether a geometry-valued property
    * relates to a given geometry.
    *
    * @abstract
    */
  @JSImport("ol/format/filter/Spatial", JSImport.Default)
  @js.native
  open class default protected () extends Spatial {
    /**
      * @param {!string} tagName The XML tag name for this filter.
      * @param {!string} geometryName Geometry name to use.
      * @param {!import("../../geom/Geometry.js").default} geometry Geometry.
      * @param {string} [srsName] SRS name. No srsName attribute will be
      *    set on geometries when this is not provided.
      */
    def this(tagName: String, geometryName: String, geometry: typings.ol.geomGeometryMod.default) = this()
    def this(
      tagName: String,
      geometryName: String,
      geometry: typings.ol.geomGeometryMod.default,
      srsName: String
    ) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Represents a spatial operator to test whether a geometry-valued property
    * relates to a given geometry.
    *
    * @abstract
    */
  @js.native
  trait Spatial
    extends typings.ol.formatFilterFilterMod.default {
    
    /**
      * @type {import("../../geom/Geometry.js").default}
      */
    var geometry: typings.ol.geomGeometryMod.default = js.native
    
    /**
      * @type {!string}
      */
    var geometryName: String = js.native
    
    /**
      * @type {string|undefined}
      */
    var srsName: js.UndefOr[String] = js.native
  }
}
