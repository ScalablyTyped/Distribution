package typings
package nodeDashDijkstraLib.nodeDashDijkstraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-dijkstra", JSImport.Namespace)
@js.native
/**
  * Creates a new Graph, optionally initializing it a nodes graph representation.
  *
  * A graph representation is an object that has as keys the name of the point and as values
  * the points reachable from that node, with the cost to get there:
  *
  *     {
  *       node (Number|String): {
  *         neighbor (Number|String): cost (Number),
  *         ...,
  *       },
  *     }
  *
  * In alternative to an object, you can pass a `Map` of `Map`. This will
  * allow you to specify numbers as keys.
  *
  * @param [graph] - Initial graph definition
  * @example
  *
  * const route = new Graph();
  *
  * // Pre-populated graph
  * const route = new Graph({
  *   A: { B: 1 },
  *   B: { A: 1, C: 2, D: 4 },
  * });
  *
  * // Passing a Map
  * const g = new Map()
  *
  * const a = new Map()
  * a.set('B', 1)
  *
  * const b = new Map()
  * b.set('A', 1)
  * b.set('C', 2)
  * b.set('D', 4)
  *
  * g.set('A', a)
  * g.set('B', b)
  *
  * const route = new Graph(g)
  */
class ^ () extends Graph {
  def this(nodes: js.Array[_]) = this()
}

