package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regexp extends StObject {
  
  var regexp: js.UndefOr[MessageSummary] = js.native
  
  var required: js.UndefOr[Hint] = js.native
}
object Regexp {
  
  @scala.inline
  def apply(): Regexp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Regexp]
  }
  
  @scala.inline
  implicit class RegexpMutableBuilder[Self <: Regexp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegexp(value: MessageSummary): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
