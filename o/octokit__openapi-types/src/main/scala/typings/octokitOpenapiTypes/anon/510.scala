package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit_author_email_pattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `510` extends StObject {
  
  var parameters: js.UndefOr[Negate] = js.undefined
  
  /** @enum {string} */
  var `type`: commit_author_email_pattern
}
object `510` {
  
  inline def apply(): `510` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("commit_author_email_pattern")
    __obj.asInstanceOf[`510`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `510`] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Negate): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setType(value: commit_author_email_pattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
