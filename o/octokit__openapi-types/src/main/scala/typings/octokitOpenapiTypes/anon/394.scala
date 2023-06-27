package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `394` extends StObject {
  
  /** @description Include rulesets configured at higher levels that apply to this repository */
  var includes_parents: js.UndefOr[Boolean] = js.undefined
}
object `394` {
  
  inline def apply(): `394` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`394`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `394`] (val x: Self) extends AnyVal {
    
    inline def setIncludes_parents(value: Boolean): Self = StObject.set(x, "includes_parents", value.asInstanceOf[js.Any])
    
    inline def setIncludes_parentsUndefined: Self = StObject.set(x, "includes_parents", js.undefined)
  }
}
