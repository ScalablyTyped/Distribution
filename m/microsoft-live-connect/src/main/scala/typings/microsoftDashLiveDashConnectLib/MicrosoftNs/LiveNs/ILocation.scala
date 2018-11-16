package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents location information.
     */

trait ILocation extends js.Object {
  /**
           * The altitude portion of the location, expressed as positive (above)
           * or negative (below) values relative to sea level, in units of
           * measurement as determined by the camera.
           */
  var altitude: scala.Double
  /**
           * The latitude portion of the location, expressed as positive (north)
           * or negative (south) degrees relative to the equator.
           */
  var latitude: scala.Double
  /**
           * The longitude portion of the location expressed as positive (east) or
           * negative (west) degrees relative to the Prime Meridian.
           */
  var longitude: scala.Double
}

