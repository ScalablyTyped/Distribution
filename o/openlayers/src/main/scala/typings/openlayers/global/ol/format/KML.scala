package typings.openlayers.global.ol.format

import typings.openlayers.mod.olx.format.KMLOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Feature format for reading and writing data in the KML format.
  *
  * Note that the KML format uses the URL() constructor. Older browsers such as IE
  * which do not support this will need a URL polyfill to be loaded before use.
  *
  * @param opt_options Options.
  * @api stable
  */
@JSGlobal("ol.format.KML")
@js.native
/**
  * @classdesc
  * Feature format for reading and writing data in the KML format.
  *
  * Note that the KML format uses the URL() constructor. Older browsers such as IE
  * which do not support this will need a URL polyfill to be loaded before use.
  *
  * @param opt_options Options.
  * @api stable
  */
open class KML ()
  extends typings.openlayers.mod.format.KML {
  def this(opt_options: KMLOptions) = this()
}
