package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regexp extends StObject {
  
  var regexp: js.UndefOr[MessageSummary] = js.undefined
  
  var required: js.UndefOr[Hint] = js.undefined
}
object Regexp {
  
  inline def apply(): Regexp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regexp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Regexp] (val x: Self) extends AnyVal {
    
    inline def setRegexp(value: MessageSummary): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    inline def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
