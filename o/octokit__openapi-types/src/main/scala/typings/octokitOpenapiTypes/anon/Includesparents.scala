package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includesparents extends StObject {
  
  /** @description Include rulesets configured at higher levels that apply to this repository */
  var includes_parents: js.UndefOr[Boolean] = js.undefined
}
object Includesparents {
  
  inline def apply(): Includesparents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Includesparents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Includesparents] (val x: Self) extends AnyVal {
    
    inline def setIncludes_parents(value: Boolean): Self = StObject.set(x, "includes_parents", value.asInstanceOf[js.Any])
    
    inline def setIncludes_parentsUndefined: Self = StObject.set(x, "includes_parents", js.undefined)
  }
}
