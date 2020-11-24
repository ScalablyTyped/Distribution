package typings.nodeDijkstra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Graph extends js.Object {
  
  /**
    * Adds a node to the graph
    *
    * @param name      - Name of the node
    * @param neighbors - Neighboring nodes and cost to reach them
    * @example
    *
    * const route = new Graph();
    *
    * route.addNode('A', { B: 1 });
    *
    * // It's possible to chain the calls
    * route
    *   .addNode('B', { A: 1 })
    *   .addNode('C', { A: 3 });
    *
    * // The neighbors can be expressed in a Map
    * const d = new Map()
    * d.set('A', 2)
    * d.set('B', 8)
    *
    * route.addNode('D', d)
    */
  def addNode(name: String, neighbors: js.Any): Graph = js.native
  
  /**
    * Compute the shortest path between the specified nodes
    *
    * @param start     - Starting node
    * @param goal      - Node we want to reach
    * @param [options] - Options
    *
    * @param [options.trim]    - Exclude the origin and destination nodes from the result
    * @param [options.reverse] - Return the path in reversed order
    * @param [options.cost]    - Also return the cost of the path when set to true
    *
    * @return Computed path between the nodes.
    *
    *  When `option.cost` is set to true, the returned value will be an object with shape:
    *    - `path` *(Array)*: Computed path between the nodes
    *    - `cost` *(Number)*: Cost of the path
    *
    * @example
    *
    * const route = new Graph()
    *
    * route.addNode('A', { B: 1 })
    * route.addNode('B', { A: 1, C: 2, D: 4 })
    * route.addNode('C', { B: 2, D: 1 })
    * route.addNode('D', { C: 1, B: 4 })
    *
    * route.path('A', 'D') // => ['A', 'B', 'C', 'D']
    *
    * // trimmed
    * route.path('A', 'D', { trim: true }) // => [B', 'C']
    *
    * // reversed
    * route.path('A', 'D', { reverse: true }) // => ['D', 'C', 'B', 'A']
    *
    * // include the cost
    * route.path('A', 'D', { cost: true })
    * // => {
    * //       path: [ 'A', 'B', 'C', 'D' ],
    * //       cost: 4
    * //    }
    */
  def path(start: js.Any, goal: js.Any): js.Any = js.native
  def path(start: js.Any, goal: js.Any, options: PathOption): js.Any = js.native
  
  /**
    * Removes a node and all of its references from the graph
    *
    * @param key - Key of the node to remove from the graph
    * @example
    *
    * const route = new Graph({
    *   A: { B: 1, C: 5 },
    *   B: { A: 3 },
    *   C: { B: 2, A: 2 },
    * });
    *
    * route.removeNode('C');
    * // The graph now is:
    * // { A: { B: 1 }, B: { A: 3 } }
    */
  def removeNode(name: String): Graph = js.native
}
