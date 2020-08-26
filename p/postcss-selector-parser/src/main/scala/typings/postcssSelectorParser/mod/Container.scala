package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container[Value /* <: js.UndefOr[String] */]
  extends Base[Value, js.UndefOr[Container[String]]] {
  val first: Node = js.native
  val last: Node = js.native
  val length: Double = js.native
  var nodes: js.Array[Node] = js.native
  def append(selector: Selector_): Container[String] = js.native
  def at(index: Double): Node = js.native
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
  def atPosition(line: Double, column: Double): Node = js.native
  def each(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def empty(): Container[String] = js.native
  def every(callback: js.Function1[/* node */ Node, Boolean]): Boolean = js.native
  def filter(callback: js.Function1[/* node */ Node, Boolean]): js.Array[Node] = js.native
  def index(child: Node): Double = js.native
  def insertAfter(oldNode: Node, newNode: Node): Container[String] = js.native
  def insertBefore(oldNode: Node, newNode: Node): Container[String] = js.native
  def map(callback: js.Function1[/* node */ Node, Node]): js.Array[Node] = js.native
  def prepend(selector: Selector_): Container[String] = js.native
  def reduce[T](callback: js.Function1[/* node */ Node, Node], memo: T): T = js.native
  def removeAll(): Container[String] = js.native
  def removeChild(child: Node): Container[String] = js.native
  def some(callback: js.Function1[/* node */ Node, Boolean]): Boolean = js.native
  def sort(callback: js.Function2[/* nodeA */ Node, /* nodeB */ Node, Double]): js.Array[Node] = js.native
  def split(callback: js.Function1[/* node */ Node, Boolean]): js.Tuple2[js.Array[Node], js.Array[Node]] = js.native
  def walk(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkAttributes(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkClasses(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkCombinators(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkComments(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkIds(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkNesting(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkPseudos(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
  def walkTags(callback: js.Function1[/* node */ Node, Boolean | Unit]): js.UndefOr[Boolean] = js.native
}

object Container {
  @scala.inline
  implicit class ContainerOps[Self <: Container[_], /* <: js.UndefOr[java.lang.String] */ Value] (val x: Self with Container[Value]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppend(value: Selector_ => Container[String]): Self = this.set("append", js.Any.fromFunction1(value))
    @scala.inline
    def setAt(value: Double => Node): Self = this.set("at", js.Any.fromFunction1(value))
    @scala.inline
    def setAtPosition(value: (Double, Double) => Node): Self = this.set("atPosition", js.Any.fromFunction2(value))
    @scala.inline
    def setEach(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("each", js.Any.fromFunction1(value))
    @scala.inline
    def setEmpty(value: () => Container[String]): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setEvery(value: js.Function1[/* node */ Node, Boolean] => Boolean): Self = this.set("every", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: js.Function1[/* node */ Node, Boolean] => js.Array[Node]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFirst(value: Node): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Node => Double): Self = this.set("index", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertAfter(value: (Node, Node) => Container[String]): Self = this.set("insertAfter", js.Any.fromFunction2(value))
    @scala.inline
    def setInsertBefore(value: (Node, Node) => Container[String]): Self = this.set("insertBefore", js.Any.fromFunction2(value))
    @scala.inline
    def setLast(value: Node): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Function1[/* node */ Node, Node] => js.Array[Node]): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrepend(value: Selector_ => Container[String]): Self = this.set("prepend", js.Any.fromFunction1(value))
    @scala.inline
    def setReduce(value: (js.Function1[/* node */ Node, Node], js.Any) => js.Any): Self = this.set("reduce", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveAll(value: () => Container[String]): Self = this.set("removeAll", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveChild(value: Node => Container[String]): Self = this.set("removeChild", js.Any.fromFunction1(value))
    @scala.inline
    def setSome(value: js.Function1[/* node */ Node, Boolean] => Boolean): Self = this.set("some", js.Any.fromFunction1(value))
    @scala.inline
    def setSort(value: js.Function2[/* nodeA */ Node, /* nodeB */ Node, Double] => js.Array[Node]): Self = this.set("sort", js.Any.fromFunction1(value))
    @scala.inline
    def setSplit(value: js.Function1[/* node */ Node, Boolean] => js.Tuple2[js.Array[Node], js.Array[Node]]): Self = this.set("split", js.Any.fromFunction1(value))
    @scala.inline
    def setWalk(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walk", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkAttributes(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkAttributes", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkClasses(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkClasses", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkCombinators(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkCombinators", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkComments(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkComments", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkIds(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkIds", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkNesting(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkNesting", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkPseudos(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkPseudos", js.Any.fromFunction1(value))
    @scala.inline
    def setWalkTags(value: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean]): Self = this.set("walkTags", js.Any.fromFunction1(value))
  }
  
}

