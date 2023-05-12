package typings.ol

import typings.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterBboxMod {
  
  /**
    * @classdesc
    * Represents a `<BBOX>` operator to test whether a geometry-valued property
    * intersects a fixed bounding box
    *
    * @api
    */
  @JSImport("ol/format/filter/Bbox", JSImport.Default)
  @js.native
  open class default protected () extends Bbox {
    /**
      * @param {!string} geometryName Geometry name to use.
      * @param {!import("../../extent.js").Extent} extent Extent.
      * @param {string} [srsName] SRS name. No srsName attribute will be set
      * on geometries when this is not provided.
      */
    def this(geometryName: String, extent: Extent) = this()
    def this(geometryName: String, extent: Extent, srsName: String) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<BBOX>` operator to test whether a geometry-valued property
    * intersects a fixed bounding box
    *
    * @api
    */
  @js.native
  trait Bbox
    extends typings.ol.formatFilterFilterMod.default {
    
    /**
      * @type {import("../../extent.js").Extent}
      */
    var extent: Extent = js.native
    
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
