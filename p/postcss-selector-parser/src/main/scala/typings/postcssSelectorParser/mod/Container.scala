package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container[Value /* <: js.UndefOr[String] */, Child /* <: Node */]
  extends Base[Value, js.UndefOr[Container[String, Node]]] {
  
  def append(selector: Selector_): this.type = js.native
  
  def at(index: Double): Child = js.native
  
  /**
    * Return the most specific node at the line and column number given.
    * The source location is based on the original parsed location, locations aren't
    * updated as selector nodes are mutated.
    *
    * Note that this location is relative to the location of the first character
    * of the selector, and not the location of the selector in the overall document
    * when used in conjunction with postcss.
    *
    * If not found, returns undefined.
    * @param line The line number of the node to find. (1-based index)
    * @param col  The column number of the node to find. (1-based index)
    */
  def atPosition(line: Double, column: Double): Child = js.native
  
  def each(callback: js.Function1[/* node */ Child, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def empty(): Container[String, Node] = js.native
  
  def every(callback: js.Function1[/* node */ Child, Boolean]): Boolean = js.native
  
  def filter(callback: js.Function1[/* node */ Child, Boolean]): js.Array[Child] = js.native
  
  val first: Child = js.native
  
  def index(child: Child): Double = js.native
  
  def insertAfter(oldNode: Child, newNode: Child): this.type = js.native
  
  def insertBefore(oldNode: Child, newNode: Child): this.type = js.native
  
  val last: Child = js.native
  
  val length: Double = js.native
  
  def map[T](callback: js.Function1[/* node */ Child, T]): js.Array[T] = js.native
  
  var nodes: js.Array[Child] = js.native
  
  def prepend(selector: Selector_): this.type = js.native
  
  def reduce(
    callback: js.Function4[
      /* previousValue */ Child, 
      /* currentValue */ Child, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Child], 
      Child
    ]
  ): Child = js.native
  def reduce(
    callback: js.Function4[
      /* previousValue */ Child, 
      /* currentValue */ Child, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Child], 
      Child
    ],
    initialValue: Child
  ): Child = js.native
  @JSName("reduce")
  def reduce_T_T[T](
    callback: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ Child, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Child], 
      T
    ],
    initialValue: T
  ): T = js.native
  
  def removeAll(): Container[String, Node] = js.native
  
  def removeChild(child: Child): this.type = js.native
  
  def some(callback: js.Function1[/* node */ Child, Boolean]): Boolean = js.native
  
  def sort(callback: js.Function2[/* nodeA */ Child, /* nodeB */ Child, Double]): js.Array[Child] = js.native
  
  def split(callback: js.Function1[/* node */ Child, Boolean]): js.Tuple2[js.Array[Child], js.Array[Child]] = js.native
  
  def walk(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkAttributes(callback: js.Function1[/* node */ Attribute_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkClasses(callback: js.Function1[/* node */ ClassName_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkCombinators(callback: js.Function1[/* node */ Combinator_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkComments(callback: js.Function1[/* node */ Comment_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkIds(callback: js.Function1[/* node */ Identifier, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkNesting(callback: js.Function1[/* node */ Nesting_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkPseudos(callback: js.Function1[/* node */ Pseudo_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  
  def walkTags(callback: js.Function1[/* node */ Tag_, Boolean | Unit]): js.UndefOr[Boolean] = js.native
}
