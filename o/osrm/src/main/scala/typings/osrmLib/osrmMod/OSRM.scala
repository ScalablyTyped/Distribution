package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The OSRM method is the main constructor for creating an OSRM instance.
 * An OSRM instance requires a .osrm network, which is prepared by the OSRM Backend C++ library.
 *
 * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md
 */
@js.native
trait OSRM extends js.Object {
  /**
       * matches given coordinates to the road network
       */
  def `match`(
    options: osrmLib.osrmMod.OSRMNs.MatchOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* results */ osrmLib.osrmMod.OSRMNs.MatchResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * returns the nearest street segment for a given coordinate
       */
  def nearest(
    options: osrmLib.osrmMod.OSRMNs.NearestOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* results */ osrmLib.osrmMod.OSRMNs.NearestResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * shortest path between given coordinates
       */
  def route(
    options: osrmLib.osrmMod.OSRMNs.RouteOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* results */ osrmLib.osrmMod.OSRMNs.RouteResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * computes distance tables for given coordinates
       */
  def table(
    options: osrmLib.osrmMod.OSRMNs.TableOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* results */ osrmLib.osrmMod.OSRMNs.TableResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Return vector tiles containing debugging info
       */
  def tile(
    options: osrmLib.osrmMod.OSRMNs.TileOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* results */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Return vector tiles containing debugging info
       */
  def tile(
    options: osrmLib.osrmMod.OSRMNs.Tile,
    callback: js.Function2[/* err */ nodeLib.Error, /* results */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Compute the shortest trip between given coordinates
       */
  def trip(
    options: osrmLib.osrmMod.OSRMNs.TripOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* results */ osrmLib.osrmMod.OSRMNs.TripResults, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

