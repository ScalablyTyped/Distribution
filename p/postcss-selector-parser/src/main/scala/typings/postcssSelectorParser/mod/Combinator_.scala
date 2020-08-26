package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Combinator_
  extends Base[String, js.UndefOr[Container[String]]] {
  @JSName("type")
  var type_Combinator_ : typings.postcssSelectorParser.postcssSelectorParserStrings.combinator = js.native
}

object Combinator_ {
  @scala.inline
  def apply(
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone: StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    next: () => Node,
    prev: () => Node,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    `type`: typings.postcssSelectorParser.postcssSelectorParserStrings.combinator,
    value: String
  ): Combinator_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), clone = js.Any.fromFunction1(clone), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combinator_]
  }
  @scala.inline
  implicit class Combinator_Ops[Self <: Combinator_] (val x: Self) extends AnyVal {
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
    def setType(value: typings.postcssSelectorParser.postcssSelectorParserStrings.combinator): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

