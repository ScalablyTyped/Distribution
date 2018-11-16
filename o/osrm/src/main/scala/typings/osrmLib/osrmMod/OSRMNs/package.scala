package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OSRMNs {
  type Bearing = js.Array[scala.Double]
  type Coordinate = js.Array[scala.Double]
  type Duration = scala.Double
  type GeometriesTypes = osrmLib.osrmLibStrings.polyline | osrmLib.osrmLibStrings.geojson | osrmLib.osrmLibStrings.polyline6
  type Hint = java.lang.String
  type Indication = osrmLib.osrmLibStrings.uturn | (osrmLib.osrmLibStrings.`sharp right`) | osrmLib.osrmLibStrings.right | (osrmLib.osrmLibStrings.`slight rigth`) | osrmLib.osrmLibStrings.straight | (osrmLib.osrmLibStrings.`slight left`) | osrmLib.osrmLibStrings.left | (osrmLib.osrmLibStrings.`sharp left`)
  type OverviewTypes = osrmLib.osrmLibStrings.full | osrmLib.osrmLibStrings.simplified | osrmLib.osrmLibStrings.`false`
  type Polyline = java.lang.String
  type Radius = scala.Double
  type StepManeuverTypes = osrmLib.osrmLibStrings.turn | (osrmLib.osrmLibStrings.`new name`) | osrmLib.osrmLibStrings.depart | osrmLib.osrmLibStrings.arrive | osrmLib.osrmLibStrings.merge | osrmLib.osrmLibStrings.ramp | (osrmLib.osrmLibStrings.`on ramp`) | (osrmLib.osrmLibStrings.`off ramp`) | osrmLib.osrmLibStrings.fork | (osrmLib.osrmLibStrings.`end of road`) | (osrmLib.osrmLibStrings.`use lane`) | osrmLib.osrmLibStrings.continue | osrmLib.osrmLibStrings.roundabout | osrmLib.osrmLibStrings.rotary | (osrmLib.osrmLibStrings.`roundabout turn`) | osrmLib.osrmLibStrings.notification | (osrmLib.osrmLibStrings.`exit roundabout`) | (osrmLib.osrmLibStrings.`exit rotary`)
  type Tile = js.Tuple3[scala.Double, scala.Double, scala.Double]
}
