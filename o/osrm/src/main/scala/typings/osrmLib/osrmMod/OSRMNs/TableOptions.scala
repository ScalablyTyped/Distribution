package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Computes duration tables for the given locations. Allows for both symmetric and asymmetric tables.
     *
     * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#table
     */

trait TableOptions extends Options {
  /**
           * to use location with given index as destination. Default is to use all.
           */
  var destinations: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
           * to use location with given index as source. Default is to use all.
           */
  var sources: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

