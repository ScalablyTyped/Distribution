package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Callback used by {@link GraphNode#find} and {@link GraphNode#findOne} to search through a graph
  * node and all of its descendants.
  *
  * @callback FindNodeCallback
  * @param {GraphNode} node - The current graph node.
  * @returns {boolean} Returning `true` will result in that node being returned from
  * {@link GraphNode#find} or {@link GraphNode#findOne}.
  */
/**
  * Callback used by {@link GraphNode#forEach} to iterate through a graph node and all of its
  * descendants.
  *
  * @callback ForEachNodeCallback
  * @param {GraphNode} node - The current graph node.
  */
/**
  * A hierarchical scene node.
  *
  * @augments EventHandler
  */
@JSGlobal("pc.GraphNode")
@js.native
/**
  * Create a new GraphNode instance.
  *
  * @param {string} [name] - The non-unique name of a graph node. Defaults to 'Untitled'.
  */
open class GraphNode ()
  extends typings.playcanvas.mod.GraphNode {
  def this(name: String) = this()
}
