package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotation of the whole route leg with fine-grained information about each segment or node id.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#annotation-object
  */
trait Annotation extends js.Object {
  /**
    * The index of the datasource for the speed between each pair of coordinates. 0 is the default profile, other values are supplied via --segment-speed-file to osrm-contract
    */
  var datasources: js.Array[scala.Double]
  /**
    * The distance, in metres, between each pair of coordinates
    */
  var distance: js.Array[scala.Double]
  /**
    * The duration between each pair of coordinates, in seconds. Does not include the duration of any turns.
    */
  var duration: js.Array[scala.Double]
  /**
    * The OSM node ID for each coordinate along the route, excluding the first/last user-supplied coordinates
    */
  var nodes: js.Array[scala.Double]
  /**
    * Convenience field, calculation of distance / duration rounded to one decimal place
    */
  var speed: js.Array[scala.Double]
  /**
    * The weights between each pair of coordinates. Does not include any turn costs.
    */
  var weight: js.Array[scala.Double]
}

object Annotation {
  @scala.inline
  def apply(
    datasources: js.Array[scala.Double],
    distance: js.Array[scala.Double],
    duration: js.Array[scala.Double],
    nodes: js.Array[scala.Double],
    speed: js.Array[scala.Double],
    weight: js.Array[scala.Double]
  ): Annotation = {
    val __obj = js.Dynamic.literal(datasources = datasources, distance = distance, duration = duration, nodes = nodes, speed = speed, weight = weight)
  
    __obj.asInstanceOf[Annotation]
  }
}

