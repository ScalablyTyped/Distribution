package typings.osrm.osrmMod

import typings.node.Buffer
import typings.std.Error
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
  def `match`(options: MatchOptions, callback: js.Function2[/* err */ Error, /* results */ MatchResults, Unit]): Unit = js.native
  /**
    * returns the nearest street segment for a given coordinate
    */
  def nearest(
    options: NearestOptions,
    callback: js.Function2[/* err */ Error, /* results */ NearestResults, Unit]
  ): Unit = js.native
  /**
    * shortest path between given coordinates
    */
  def route(options: RouteOptions, callback: js.Function2[/* err */ Error, /* results */ RouteResults, Unit]): Unit = js.native
  /**
    * computes distance tables for given coordinates
    */
  def table(options: TableOptions, callback: js.Function2[/* err */ Error, /* results */ TableResults, Unit]): Unit = js.native
  /**
    * Return vector tiles containing debugging info
    */
  def tile(options: TileOptions, callback: js.Function2[/* err */ Error, /* results */ Buffer, Unit]): Unit = js.native
  def tile(options: Tile, callback: js.Function2[/* err */ Error, /* results */ Buffer, Unit]): Unit = js.native
  /**
    * Compute the shortest trip between given coordinates
    */
  def trip(options: TripOptions, callback: js.Function2[/* err */ Error, /* results */ TripResults, Unit]): Unit = js.native
}

