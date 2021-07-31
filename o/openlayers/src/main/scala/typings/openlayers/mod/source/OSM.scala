package typings.openlayers.mod.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.olx.source.OSMOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Layer source for the OpenStreetMap tile server.
  *
  * @param opt_options Open Street Map options.
  * @api stable
  */
@JSImport("openlayers", "source.OSM")
@js.native
/**
  * @classdesc
  * Layer source for the OpenStreetMap tile server.
  *
  * @param opt_options Open Street Map options.
  * @api stable
  */
class OSM () extends XYZ {
  def this(opt_options: OSMOptions) = this()
}
object OSM {
  
  @JSImport("openlayers", "source.OSM")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The attribution containing a link to the OpenStreetMap Copyright and License
    * page.
    * @const
    * @api
    */
  /* static member */
  @JSImport("openlayers", "source.OSM.ATTRIBUTION")
  @js.native
  def ATTRIBUTION: Attribution = js.native
  @scala.inline
  def ATTRIBUTION_=(x: Attribution): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTION")(x.asInstanceOf[js.Any])
}
