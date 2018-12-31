package typings
package osrmLib.osrmMod.OSRMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The trip plugin solves the Traveling Salesman Problem using a greedy heuristic (farthest-insertion algorithm).
  * The returned path does not have to be the fastest path, as TSP is NP-hard it is only an approximation.
  * Note that all input coordinates have to be connected for the trip service to work.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
trait TripOptions extends Options {
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * Return route ends at any coordinate. Can also be last. (optional, default any)
    */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Add overview geometry either full, simplified (optional, default simplified)
    */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return route is a roundtrip. (optional, default true)
    */
  var roundtrip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return route starts at any coordinate. Can also be first. (optional, default any)
    */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[scala.Boolean] = js.undefined
}

