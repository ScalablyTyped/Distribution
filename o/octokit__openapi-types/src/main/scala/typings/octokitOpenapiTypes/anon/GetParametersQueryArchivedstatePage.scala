package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryArchivedstatePage extends StObject {
  
  var get: ParametersQueryArchivedstatePage
  
  var post: Responses304401403422503
}
object GetParametersQueryArchivedstatePage {
  
  inline def apply(get: ParametersQueryArchivedstatePage, post: Responses304401403422503): GetParametersQueryArchivedstatePage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryArchivedstatePage]
  }
  
  extension [Self <: GetParametersQueryArchivedstatePage](x: Self) {
    
    inline def setGet(value: ParametersQueryArchivedstatePage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPost(value: Responses304401403422503): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}
