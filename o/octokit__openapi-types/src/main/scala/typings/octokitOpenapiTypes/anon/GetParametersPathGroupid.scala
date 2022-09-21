package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathGroupid extends StObject {
  
  /**
    * Displays information about the specific group's usage.  Provides a list of the group's external members as well as a list of teams that this group is connected to.
    *
    * You can manage team membership with your identity provider using Enterprise Managed Users for GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)" in the GitHub Help documentation.
    */
  var get: ParametersPathGroupid
}
object GetParametersPathGroupid {
  
  inline def apply(get: ParametersPathGroupid): GetParametersPathGroupid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathGroupid]
  }
  
  extension [Self <: GetParametersPathGroupid](x: Self) {
    
    inline def setGet(value: ParametersPathGroupid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
