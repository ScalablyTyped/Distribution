package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nesting_
  extends StObject
     with Base[String, js.UndefOr[Container[String, Node]]] {
  
  @JSName("type")
  var type_Nesting_ : typings.postcssSelectorParser.postcssSelectorParserStrings.nesting
}
object Nesting_ {
  
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
  ): Nesting_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), isAtPosition = js.Any.fromFunction2(isAtPosition), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")("nesting")
    __obj.asInstanceOf[Nesting_]
  }
  
  extension [Self <: Nesting_](x: Self) {
    
    inline def setType(value: typings.postcssSelectorParser.postcssSelectorParserStrings.nesting): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
