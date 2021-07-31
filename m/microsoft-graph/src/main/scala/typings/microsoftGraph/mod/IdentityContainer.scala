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
  
  @scala.inline
  def apply(): IdentityContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityContainer]
  }
  
  @scala.inline
  implicit class IdentityContainerMutableBuilder[Self <: IdentityContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditionalAccess(value: NullableOption[ConditionalAccessRoot]): Self = StObject.set(x, "conditionalAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionalAccessNull: Self = StObject.set(x, "conditionalAccess", null)
    
    @scala.inline
    def setConditionalAccessUndefined: Self = StObject.set(x, "conditionalAccess", js.undefined)
  }
}
