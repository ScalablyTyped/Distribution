package typings.osrm.mod

import typings.node.bufferMod.global.Buffer
import typings.osrm.anon.PluginConfigformatjsonbuf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The OSRM method is the main constructor for creating an OSRM instance.
  * An OSRM instance requires a .osrm network, which is prepared by the OSRM Backend C++ library.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md
  */
@js.native
trait OSRM extends StObject {
  
  /**
    * Returns Object containing tracepoints and matchings. tracepoints Array of Ẁaypoint objects representing all points
    * of the trace in order. If the trace point was ommited by map matching because it is an outlier, the entry will be
    * null. Each Waypoint object includes two additional properties, 1) matchings_index: Index to the Route object in
    * matchings the sub-trace was matched to, 2) waypoint_index: Index of the waypoint inside the matched route. matchings
    * is an array of Route objects that assemble the trace. Each Route object has an additional confidence property, which
    * is the confidence of the matching. float value between 0 and 1. 1 is very confident that the matching is correct.
    */
  def `match`(
    options: MatchOptions,
    callback: js.Function2[/* err */ js.Error, /* results */ MatchResults, Unit]
  ): Unit = js.native
  def `match`(
    options: MatchOptions,
    pluginConfig: PluginConfigformatjsonbuf,
    callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]
  ): Unit = js.native
  def `match`(
    options: MatchOptions,
    pluginConfig: PluginConfig,
    callback: js.Function2[/* err */ js.Error, /* results */ MatchResults, Unit]
  ): Unit = js.native
  
  /**
    * Returns Object containing waypoints. waypoints: array of Ẁaypoint objects sorted by distance to the input coordinate.
    * Each object has an additional distance property, which is the distance in meters to the supplied input coordinate.
    */
  def nearest(
    options: NearestOptions,
    callback: js.Function2[/* err */ js.Error, /* results */ NearestResults, Unit]
  ): Unit = js.native
  def nearest(
    options: NearestOptions,
    pluginConfig: PluginConfigformatjsonbuf,
    callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]
  ): Unit = js.native
  def nearest(
    options: NearestOptions,
    pluginConfig: PluginConfig,
    callback: js.Function2[/* err */ js.Error, /* results */ NearestResults, Unit]
  ): Unit = js.native
  
  /**
    * Returns the fastest route between two or more coordinates while visiting the waypoints in order.
    */
  def route(
    options: RouteOptions,
    callback: js.Function2[/* err */ js.Error, /* results */ RouteResults, Unit]
  ): Unit = js.native
  def route(
    options: RouteOptions,
    pluginConfig: PluginConfigformatjsonbuf,
    callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]
  ): Unit = js.native
  def route(
    options: RouteOptions,
    pluginConfig: PluginConfig,
    callback: js.Function2[/* err */ js.Error, /* results */ RouteResults, Unit]
  ): Unit = js.native
  
  /**
    * Returns Object containing durations, sources, and destinations. durations: array of arrays that stores the matrix in
    * row-major order. durations[i][j] gives the travel time from the i-th waypoint to the j-th waypoint. Values are given
    * in seconds. sources: array of Ẁaypoint objects describing all sources in order. destinations: array of Ẁaypoint
    * objects describing all destinations in order. fallback_speed_cells: (optional) if fallback_speed is used, will be an
    * array of arrays of row,column values, indicating which cells contain estimated values.
    */
  def table(
    options: TableOptions,
    callback: js.Function2[/* err */ js.Error, /* results */ TableResults, Unit]
  ): Unit = js.native
  def table(
    options: TableOptions,
    pluginConfig: PluginConfigformatjsonbuf,
    callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]
  ): Unit = js.native
  def table(
    options: TableOptions,
    pluginConfig: PluginConfig,
    callback: js.Function2[/* err */ js.Error, /* results */ TableResults, Unit]
  ): Unit = js.native
  
  /**
    * Returns Buffer contains a Protocol Buffer encoded vector tile.
    */
  def tile(XYZ: Tile, callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]): Unit = js.native
  def tile(
    XYZ: Tile,
    pluginConfig: PluginConfig,
    callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]
  ): Unit = js.native
  
  /**
    * Returns Object containing waypoints and trips. waypoints: an array of Waypoint objects representing all waypoints
    * in input order. Each Waypoint object has the following additional properties, 1) trips_index: index to trips of the
    * sub-trip the point was matched to, and 2) waypoint_index: index of the point in the trip. trips: an array of Route
    * objects that assemble the trace.
    */
  def trip(options: TripOptions, callback: js.Function2[/* err */ js.Error, /* results */ TripResults, Unit]): Unit = js.native
  def trip(
    options: TripOptions,
    pluginConfig: PluginConfigformatjsonbuf,
    callback: js.Function2[/* err */ js.Error, /* results */ Buffer, Unit]
  ): Unit = js.native
  def trip(
    options: TripOptions,
    pluginConfig: PluginConfig,
    callback: js.Function2[/* err */ js.Error, /* results */ TripResults, Unit]
  ): Unit = js.native
}
