package typings.pathfinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("pathfinding", "BiBreadthFirstFinder")
@js.native
class BiBreadthFirstFinderCls ()
  extends StObject
     with BiBreadthFirstFinder {
  def this(opt: BiBreadthFirstFinderOptions) = this()
  
  /* CompleteClass */
  override def findPath(startX: Double, startY: Double, endX: Double, endY: Double, matrix: Grid): js.Array[js.Array[Double]] = js.native
}
