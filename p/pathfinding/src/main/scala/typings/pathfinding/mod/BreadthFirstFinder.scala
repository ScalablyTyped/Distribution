package typings.pathfinding.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.pathfinding.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreadthFirstFinder
  extends StObject
     with Finder
     with Instantiable0[BreadthFirstFinder]
     with Instantiable1[/* opt */ BiBreadthFirstFinderOptions, BreadthFirstFinder]
object BreadthFirstFinder {
  
  @scala.inline
  def apply: BreadthFirstFinder = ^.asInstanceOf[js.Dynamic].selectDynamic("BreadthFirstFinder").asInstanceOf[BreadthFirstFinder]
}
