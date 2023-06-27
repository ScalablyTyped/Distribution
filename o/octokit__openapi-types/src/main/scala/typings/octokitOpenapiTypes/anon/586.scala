package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.local_only
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.none_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `586` extends StObject {
  
  var allowed_actions: js.UndefOr[all | local_only | selected] = js.undefined
  
  var enabled_repositories: all | none_ | selected
}
object `586` {
  
  inline def apply(enabled_repositories: all | none_ | selected): `586` = {
    val __obj = js.Dynamic.literal(enabled_repositories = enabled_repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[`586`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `586`] (val x: Self) extends AnyVal {
    
    inline def setAllowed_actions(value: all | local_only | selected): Self = StObject.set(x, "allowed_actions", value.asInstanceOf[js.Any])
    
    inline def setAllowed_actionsUndefined: Self = StObject.set(x, "allowed_actions", js.undefined)
    
    inline def setEnabled_repositories(value: all | none_ | selected): Self = StObject.set(x, "enabled_repositories", value.asInstanceOf[js.Any])
  }
}
