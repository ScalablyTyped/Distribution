package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPackageTextInputQuestion
  extends StObject
     with AccessPackageQuestion {
  
  // Indicates whether the answer will be in single or multiple line format.
  var isSingleLineQuestion: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The regular expression pattern which any answer to this question must match.
  var regexPattern: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessPackageTextInputQuestion {
  
  inline def apply(): AccessPackageTextInputQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessPackageTextInputQuestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessPackageTextInputQuestion] (val x: Self) extends AnyVal {
    
    inline def setIsSingleLineQuestion(value: NullableOption[Boolean]): Self = StObject.set(x, "isSingleLineQuestion", value.asInstanceOf[js.Any])
    
    inline def setIsSingleLineQuestionNull: Self = StObject.set(x, "isSingleLineQuestion", null)
    
    inline def setIsSingleLineQuestionUndefined: Self = StObject.set(x, "isSingleLineQuestion", js.undefined)
    
    inline def setRegexPattern(value: NullableOption[String]): Self = StObject.set(x, "regexPattern", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternNull: Self = StObject.set(x, "regexPattern", null)
    
    inline def setRegexPatternUndefined: Self = StObject.set(x, "regexPattern", js.undefined)
  }
}
