package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatWmscapabilitiesMod {
  
  /**
    * @classdesc
    * Format for reading WMS capabilities data
    *
    * @api
    */
  @JSImport("ol/format/WMSCapabilities", JSImport.Default)
  @js.native
  open class default () extends WMSCapabilities
  
  /**
    * @classdesc
    * Format for reading WMS capabilities data
    *
    * @api
    */
  @js.native
  trait WMSCapabilities
    extends typings.ol.formatXmlMod.default {
    
    /**
      * @type {string|undefined}
      */
    var version: js.UndefOr[String] = js.native
  }
}
