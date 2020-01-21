package typings.openlayers.mod.source

import typings.openlayers.mod.Attribution
import typings.openlayers.mod.olx.source.OSMOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

/* static members */
@JSImport("openlayers", "source.OSM")
@js.native
object OSM extends js.Object {
  /**
    * The attribution containing a link to the OpenStreetMap Copyright and License
    * page.
    * @const
    * @api
    */
  var ATTRIBUTION: Attribution = js.native
}

