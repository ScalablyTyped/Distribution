package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlteredQueryToken extends StObject {
  
  // Defines the length of a changed segment.
  var length: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Defines the offset of a changed segment.
  var offset: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Represents the corrected segment string.
  var suggestion: js.UndefOr[NullableOption[String]] = js.undefined
}
object AlteredQueryToken {
  
  inline def apply(): AlteredQueryToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlteredQueryToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlteredQueryToken] (val x: Self) extends AnyVal {
    
    inline def setLength(value: NullableOption[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthNull: Self = StObject.set(x, "length", null)
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: NullableOption[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSuggestion(value: NullableOption[String]): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionNull: Self = StObject.set(x, "suggestion", null)
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
