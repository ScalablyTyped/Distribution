package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityContainer
  extends StObject
     with Entity {
  
  var conditionalAccess: js.UndefOr[NullableOption[ConditionalAccessRoot]] = js.undefined
}
object IdentityContainer {
  
  inline def apply(): IdentityContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityContainer]
  }
  
  extension [Self <: IdentityContainer](x: Self) {
    
    inline def setConditionalAccess(value: NullableOption[ConditionalAccessRoot]): Self = StObject.set(x, "conditionalAccess", value.asInstanceOf[js.Any])
    
    inline def setConditionalAccessNull: Self = StObject.set(x, "conditionalAccess", null)
    
    inline def setConditionalAccessUndefined: Self = StObject.set(x, "conditionalAccess", js.undefined)
  }
}
