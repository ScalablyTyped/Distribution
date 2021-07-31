package typings.postcssSelectorParser.mod

import org.scalablytyped.runtime.StringDictionary
import typings.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tag_
  extends StObject
     with Namespace[String] {
  
  @JSName("type")
  var type_Tag_ : typings.postcssSelectorParser.postcssSelectorParserStrings.tag
}
object Tag_ {
  
  @scala.inline
  def apply(
    appendToPropertyAndEscape: (String, js.Any, String) => Unit,
    clone_ : StringDictionary[js.Any] => Node,
    isAtPosition: (Double, Double) => js.UndefOr[Boolean],
    namespace: String | `true`,
    namespaceString: String,
    next: () => Node,
    ns: String | `true`,
    prev: () => Node,
    qualifiedName: String => String,
    rawSpaceAfter: String,
    rawSpaceBefore: String,
    remove: () => Node,
    replaceWith: /* repeated */ Node => Node,
    setPropertyAndEscape: (String, js.Any, String) => Unit,
    setPropertyWithoutEscape: (String, js.Any) => Unit,
    sourceIndex: Double,
    spaces: Spaces,
    value: String
  ): Tag_ = {
    val __obj = js.Dynamic.literal(appendToPropertyAndEscape = js.Any.fromFunction3(appendToPropertyAndEscape), isAtPosition = js.Any.fromFunction2(isAtPosition), namespace = namespace.asInstanceOf[js.Any], namespaceString = namespaceString.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), ns = ns.asInstanceOf[js.Any], prev = js.Any.fromFunction0(prev), qualifiedName = js.Any.fromFunction1(qualifiedName), rawSpaceAfter = rawSpaceAfter.asInstanceOf[js.Any], rawSpaceBefore = rawSpaceBefore.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), replaceWith = js.Any.fromFunction1(replaceWith), setPropertyAndEscape = js.Any.fromFunction3(setPropertyAndEscape), setPropertyWithoutEscape = js.Any.fromFunction2(setPropertyWithoutEscape), sourceIndex = sourceIndex.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.updateDynamic("type")("tag")
    __obj.asInstanceOf[Tag_]
  }
  
  @scala.inline
  implicit class Tag_MutableBuilder[Self <: Tag_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.postcssSelectorParser.postcssSelectorParserStrings.tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
