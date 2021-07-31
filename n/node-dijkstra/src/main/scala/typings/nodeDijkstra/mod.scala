package typings.nodeDijkstra

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  class ^ ()
    extends StObject
       with Graph {
    def this(nodes: js.Array[js.Any]) = this()
  }
  
  @js.native
  trait Graph extends StObject {
    
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
  
  trait PathOption extends StObject {
    
    var avoid: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var cost: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object PathOption {
    
    @scala.inline
    def apply(): PathOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOption]
    }
    
    @scala.inline
    implicit class PathOptionMutableBuilder[Self <: PathOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvoid(value: js.Array[js.Any]): Self = StObject.set(x, "avoid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvoidUndefined: Self = StObject.set(x, "avoid", js.undefined)
      
      @scala.inline
      def setAvoidVarargs(value: js.Any*): Self = StObject.set(x, "avoid", js.Array(value :_*))
      
      @scala.inline
      def setCost(value: Boolean): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
