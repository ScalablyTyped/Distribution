package typings.p2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p2", "IslandManager")
@js.native
class IslandManager () extends Solver {
  def this(options: IslandManagerOptions) = this()
  
  def bfs(root: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
  
  var islands: js.Array[Island] = js.native
  
  var nodes: js.Array[IslandNode] = js.native
  
  def split(world: World): js.Array[Island] = js.native
  
  def visit(node: IslandNode, bds: js.Array[Body], eqs: js.Array[Equation]): Unit = js.native
}
/* static members */
object IslandManager {
  
  @JSImport("p2", "IslandManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUnvisitedNode(nodes: js.Array[IslandNode]): IslandNode | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnvisitedNode")(nodes.asInstanceOf[js.Any]).asInstanceOf[IslandNode | Boolean]
}
