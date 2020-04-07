package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pseudo_ extends Container[String] {
  @JSName("type")
  var type_Pseudo_ : typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo
}

object Pseudo_ {
  @scala.inline
  def apply(
    append: Selector_ => Container[String],
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    at: Double => Node,
    atPosition: (Double, Double) => Node,
    clone: StringDictionary[js.Any] => Node,
    each: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    empty: () => Container[String],
    every: js.Function1[/* node */ Node, Boolean] => Boolean,
    filter: js.Function1[/* node */ Node, Boolean] => js.Array[Node],
    first: Node,
    index: Node => Double,
    insertAfter: (Node, Node) => Container[String],
    insertBefore: (Node, Node) => Container[String],
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    last: Node,
    length: Double,
    map: js.Function1[/* node */ Node, Node] => js.Array[Node],
    next: () => Node,
    nodes: js.Array[Node],
    prepend: Selector_ => Container[String],
    prev: () => Node,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    reduce: (js.Function1[/* node */ Node, Node], js.Any) => js.Any,
    remove: () => Node,
    removeAll: () => Container[String],
    removeChild: Node => Container[String],
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    some: js.Function1[/* node */ Node, Boolean] => Boolean,
    sort: js.Function2[/* nodeA */ Node, /* nodeB */ Node, Double] => js.Array[Node],
    sourceIndex: Double,
    spaces: Spaces,
    split: js.Function1[/* node */ Node, Boolean] => js.Tuple2[js.Array[Node], js.Array[Node]],
    `type`: typings.postcssSelectorParser.postcssSelectorParserStrings.pseudo,
    value: String,
    walk: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkAttributes: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkClasses: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkCombinators: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkComments: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkIds: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkNesting: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkPseudos: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    walkTags: js.Function1[/* node */ Node, Boolean | Unit] => js.UndefOr[Boolean],
    parent: Container[String] = null,
    source: NodeSource = null
  ): Pseudo_ = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), at = js.Any.fromFunction1(at), atPosition = js.Any.fromFunction2(atPosition), clone = js.Any.fromFunction1(clone), each = js.Any.fromFunction1(each), empty = js.Any.fromFunction0(empty), every = js.Any.fromFunction1(every), filter = js.Any.fromFunction1(filter), first = first.asInstanceOf[js.Any], index = js.Any.fromFunction1(index), insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), isAtPosition = js.Any.fromFunction2(isAtPosition), last = last.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), next = js.Any.fromFunction0(next), nodes = nodes.asInstanceOf[js.Any], prepend = js.Any.fromFunction1(prepend), prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], reduce = js.Any.fromFunction2(reduce), remove = js.Any.fromFunction0(remove), removeAll = js.Any.fromFunction0(removeAll), removeChild = js.Any.fromFunction1(removeChild), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction1(sort), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], split = js.Any.fromFunction1(split), value = value.asInstanceOf[js.Any], walk = js.Any.fromFunction1(walk), walkAttributes = js.Any.fromFunction1(walkAttributes), walkClasses = js.Any.fromFunction1(walkClasses), walkCombinators = js.Any.fromFunction1(walkCombinators), walkComments = js.Any.fromFunction1(walkComments), walkIds = js.Any.fromFunction1(walkIds), walkNesting = js.Any.fromFunction1(walkNesting), walkPseudos = js.Any.fromFunction1(walkPseudos), walkTags = js.Any.fromFunction1(walkTags))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pseudo_]
  }
}

