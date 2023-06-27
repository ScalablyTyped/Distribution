package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters4 extends StObject {
  
  /**
    * List installation requests for the authenticated app
    * @description Lists all the pending installation requests for the authenticated GitHub App.
    */
  var get: Parameters4
}
object GetParameters4 {
  
  inline def apply(get: Parameters4): GetParameters4 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters4]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters4] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters4): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
