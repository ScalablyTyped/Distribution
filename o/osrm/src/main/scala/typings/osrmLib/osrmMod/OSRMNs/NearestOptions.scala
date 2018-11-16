package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Snaps a coordinate to the street network and returns the nearest n matches.
     *
     * Note: coordinates in the general options only supports a single {longitude},{latitude} entry.
     *
     * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#nearest
     */

trait NearestOptions extends Options {
  /**
           * Number of nearest segments that should be returned. Must be an integer greater than or equal to 1. (optional, default 1)
           */
  var number: js.UndefOr[scala.Double] = js.undefined
}

