package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForRepo extends StObject {
  
  var get: `757`
  
  var getAllCommonlyUsed: `758`
  
  var getForRepo: `759`
}
object GetForRepo {
  
  @scala.inline
  def apply(get: `757`, getAllCommonlyUsed: `758`, getForRepo: `759`): GetForRepo = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllCommonlyUsed = getAllCommonlyUsed.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetForRepo]
  }
  
  @scala.inline
  implicit class GetForRepoMutableBuilder[Self <: GetForRepo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: `757`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAllCommonlyUsed(value: `758`): Self = StObject.set(x, "getAllCommonlyUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetForRepo(value: `759`): Self = StObject.set(x, "getForRepo", value.asInstanceOf[js.Any])
  }
}
