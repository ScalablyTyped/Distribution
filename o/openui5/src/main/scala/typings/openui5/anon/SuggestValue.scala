package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestValue extends StObject {
  
  /**
    * Current search string of the search field.
    */
  var suggestValue: js.UndefOr[String] = js.undefined
}
object SuggestValue {
  
  inline def apply(): SuggestValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestValue] (val x: Self) extends AnyVal {
    
    inline def setSuggestValue(value: String): Self = StObject.set(x, "suggestValue", value.asInstanceOf[js.Any])
    
    inline def setSuggestValueUndefined: Self = StObject.set(x, "suggestValue", js.undefined)
  }
}
