package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWmtscapabilitiesMod {
  
  /**
    * @classdesc
    * Format for reading WMTS capabilities data.
    *
    * @api
    */
  @JSImport("ol/format/WMTSCapabilities", JSImport.Default)
  @js.native
  open class default () extends WMTSCapabilities
  
  /**
    * @classdesc
    * Format for reading WMTS capabilities data.
    *
    * @api
    */
  @js.native
  trait WMTSCapabilities
    extends typings.ol.formatXmlMod.default {
    
    /**
      * @type {OWS}
      * @private
      */
    /* private */ var owsParser_ : Any = js.native
  }
}
