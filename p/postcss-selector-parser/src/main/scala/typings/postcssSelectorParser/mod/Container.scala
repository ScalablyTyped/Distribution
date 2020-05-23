package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container[Value /* <: js.UndefOr[String] */]
  extends Base[Value, js.UndefOr[Container[String]]] {
  val first: Node
  val last: Node
  val length: Double
  var nodes: js.Array[Node]
  def append(selector: Selector_): Container[String]
  def at(index: Double): Node
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
  def atPosition(line: Double, column: Double): Node
  def each(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def empty(): Container[String]
  def every(callback: js.Function1[/* node */ Node, Boolean]): Boolean
  def filter(callback: js.Function1[/* node */ Node, Boolean]): js.Array[Node]
  def index(child: Node): Double
  def insertAfter(oldNode: Node, newNode: Node): Container[String]
  def insertBefore(oldNode: Node, newNode: Node): Container[String]
  def map(callback: js.Function1[/* node */ Node, Node]): js.Array[Node]
  def prepend(selector: Selector_): Container[String]
  def reduce[T](callback: js.Function1[/* node */ Node, Node], memo: T): T
  def removeAll(): Container[String]
  def removeChild(child: Node): Container[String]
  def some(callback: js.Function1[/* node */ Node, Boolean]): Boolean
  def sort(callback: js.Function2[/* nodeA */ Node, /* nodeB */ Node, Double]): js.Array[Node]
  def split(callback: js.Function1[/* node */ Node, Boolean]): js.Tuple2[js.Array[Node], js.Array[Node]]
  def walk(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkAttributes(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkClasses(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkCombinators(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkComments(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkIds(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkNesting(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkPseudos(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
  def walkTags(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean]
}

