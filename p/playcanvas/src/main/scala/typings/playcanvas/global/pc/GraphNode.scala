package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A hierarchical scene node.
  * @property name - The non-unique name of a graph node.
  * @property tags - Interface for tagging graph nodes. Tag based searches can be performed using the {@link pc.GraphNode#findByTag} function.
  * @param [name] - The non-unique name of the graph node, default is "Untitled".
  */
@JSGlobal("pc.GraphNode")
@js.native
class GraphNode ()
  extends StObject
     with typings.playcanvas.pc.GraphNode {
  def this(name: String) = this()
}
