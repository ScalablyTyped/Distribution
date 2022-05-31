package typings.p2.global.p2

import typings.p2.mod.IslandManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("p2.IslandManager")
@js.native
class IslandManager ()
  extends typings.p2.mod.IslandManager {
  def this(options: IslandManagerOptions) = this()
}
/* static members */
object IslandManager {
  
  @JSGlobal("p2.IslandManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getUnvisitedNode(nodes: js.Array[typings.p2.mod.IslandNode]): typings.p2.mod.IslandNode | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnvisitedNode")(nodes.asInstanceOf[js.Any]).asInstanceOf[typings.p2.mod.IslandNode | Boolean]
}
