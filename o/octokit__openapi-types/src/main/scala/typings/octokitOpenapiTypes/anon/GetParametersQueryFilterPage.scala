package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryFilterPage extends StObject {
  
  /**
    * List outside collaborators for an organization
    * @description List all users who are outside collaborators of an organization.
    */
  var get: ParametersQueryFilterPage
}
object GetParametersQueryFilterPage {
  
  inline def apply(get: ParametersQueryFilterPage): GetParametersQueryFilterPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryFilterPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryFilterPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryFilterPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
