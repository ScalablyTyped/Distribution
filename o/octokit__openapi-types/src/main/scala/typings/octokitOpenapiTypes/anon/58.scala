package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.revoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  /**
    * @description Action to apply to the fine-grained personal access token.
    * @enum {string}
    */
  var action: revoke
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal(action = "revoke")
    __obj.asInstanceOf[`58`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `58`] (val x: Self) extends AnyVal {
    
    inline def setAction(value: revoke): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
