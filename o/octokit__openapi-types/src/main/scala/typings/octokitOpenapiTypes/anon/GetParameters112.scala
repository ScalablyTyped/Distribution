package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters112 extends StObject {
  
  /**
    * List outside collaborators for an organization
    * @description List all users who are outside collaborators of an organization.
    */
  var get: Parameters112
}
object GetParameters112 {
  
  inline def apply(get: Parameters112): GetParameters112 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters112]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters112] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters112): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
