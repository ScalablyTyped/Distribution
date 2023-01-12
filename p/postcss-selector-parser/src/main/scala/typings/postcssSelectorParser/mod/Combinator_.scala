package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Combinator_
  extends StObject
     with Base[String, js.UndefOr[Container[String, Node]]] {
  
  var raws: js.UndefOr[CombinatorRaws] = js.undefined
  
  @JSName("type")
  var type_Combinator_ : typings.postcssSelectorParser.postcssSelectorParserStrings.combinator
}
object Combinator_ {
  
  inline def apply(
    appendToPropertyAndEscape: (String, Any, String) => Unit,
    clone_ : StringDictionary[Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    next: () => Node,
    prev: () => Node,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, Any, String) => Unit,
    setPropertyWithoutEscape: (String, Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    value: String
  ): Combinator_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")("combinator")
    __obj.asInstanceOf[Combinator_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Combinator_] (val x: Self) extends AnyVal {
    
    inline def setRaws(value: CombinatorRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    inline def setType(value: typings.postcssSelectorParser.postcssSelectorParserStrings.combinator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
