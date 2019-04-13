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
    options: MatchOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ MatchResults, scala.Unit]
  ): scala.Unit = js.native
  /**
    * returns the nearest street segment for a given coordinate
    */
  def nearest(
    options: NearestOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ NearestResults, scala.Unit]
  ): scala.Unit = js.native
  /**
    * shortest path between given coordinates
    */
  def route(
    options: RouteOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ RouteResults, scala.Unit]
  ): scala.Unit = js.native
  /**
    * computes distance tables for given coordinates
    */
  def table(
    options: TableOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ TableResults, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Return vector tiles containing debugging info
    */
  def tile(
    options: TileOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def tile(
    options: Tile,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Compute the shortest trip between given coordinates
    */
  def trip(
    options: TripOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* results */ TripResults, scala.Unit]
  ): scala.Unit = js.native
}

