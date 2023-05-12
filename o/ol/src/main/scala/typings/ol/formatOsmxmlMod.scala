package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatOsmxmlMod {
  
  /**
    * @classdesc
    * Feature format for reading data in the
    * [OSMXML format](https://wiki.openstreetmap.org/wiki/OSM_XML).
    *
    * @api
    */
  @JSImport("ol/format/OSMXML", JSImport.Default)
  @js.native
  open class default () extends OSMXML
  
  /**
    * @classdesc
    * Feature format for reading data in the
    * [OSMXML format](https://wiki.openstreetmap.org/wiki/OSM_XML).
    *
    * @api
    */
  @js.native
  trait OSMXML
    extends typings.ol.formatXmlfeatureMod.default {
    
    /**
      * @type {import("../proj/Projection.js").default}
      */
    @JSName("dataProjection")
    var dataProjection_OSMXML: typings.ol.projProjectionMod.default = js.native
  }
}
