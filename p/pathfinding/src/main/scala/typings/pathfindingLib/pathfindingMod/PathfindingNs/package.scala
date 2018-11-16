package typings
package pathfindingLib.pathfindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PathfindingNs {
  type JumpPointFinder = js.Function1[
    /* opt */ JumpPointFinderOptions, 
    JPFNeverMoveDiagonally | JPFAlwaysMoveDiagonally | JPFMoveDiagonallyIfNoObstacles | JPFMoveDiagonallyIfAtMostOneObstacle
  ]
}
