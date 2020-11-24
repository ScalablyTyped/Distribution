package typings.pathfinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JumpPointFinder = js.Function1[
    /* opt */ typings.pathfinding.mod.JumpPointFinderOptions, 
    typings.pathfinding.mod.JPFNeverMoveDiagonally | typings.pathfinding.mod.JPFAlwaysMoveDiagonally | typings.pathfinding.mod.JPFMoveDiagonallyIfNoObstacles | typings.pathfinding.mod.JPFMoveDiagonallyIfAtMostOneObstacle
  ]
}
