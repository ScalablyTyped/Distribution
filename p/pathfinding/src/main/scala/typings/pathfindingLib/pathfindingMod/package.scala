package typings
package pathfindingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pathfindingMod {
  type JumpPointFinder = js.Function1[
    /* opt */ JumpPointFinderOptions, 
    JPFNeverMoveDiagonally | JPFAlwaysMoveDiagonally | JPFMoveDiagonallyIfNoObstacles | JPFMoveDiagonallyIfAtMostOneObstacle
  ]
}
