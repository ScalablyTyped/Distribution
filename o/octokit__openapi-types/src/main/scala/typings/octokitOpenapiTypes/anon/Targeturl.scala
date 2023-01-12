package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.error
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.pending
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targeturl extends StObject {
  
  /**
    * @description A string label to differentiate this status from the status of other systems. This field is case-insensitive.
    * @default default
    */
  var context: js.UndefOr[String] = js.undefined
  
  /** @description A short description of the status. */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * @description The state of the status.
    * @enum {string}
    */
  var state: error | failure | pending | success
  
  /**
    * @description The target URL to associate with this status. This URL will be linked from the GitHub UI to allow users to easily see the source of the status.
    * For example, if your continuous integration system is posting build status, you would want to provide the deep link for the build output for this specific SHA:
    * `http://ci.example.com/user/repo/build/sha`
    */
  var target_url: js.UndefOr[String | Null] = js.undefined
}
object Targeturl {
  
  inline def apply(state: error | failure | pending | success): Targeturl = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targeturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Targeturl] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setState(value: error | failure | pending | success): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTarget_url(value: String): Self = StObject.set(x, "target_url", value.asInstanceOf[js.Any])
    
    inline def setTarget_urlNull: Self = StObject.set(x, "target_url", null)
    
    inline def setTarget_urlUndefined: Self = StObject.set(x, "target_url", js.undefined)
  }
}
