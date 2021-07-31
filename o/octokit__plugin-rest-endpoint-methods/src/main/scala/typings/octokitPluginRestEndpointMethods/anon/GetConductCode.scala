package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConductCode extends StObject {
  
  var getAllCodesOfConduct: `673`
  
  var getConductCode: `674`
  
  var getForRepo: `675`
}
object GetConductCode {
  
  @scala.inline
  def apply(getAllCodesOfConduct: `673`, getConductCode: `674`, getForRepo: `675`): GetConductCode = {
    val __obj = js.Dynamic.literal(getAllCodesOfConduct = getAllCodesOfConduct.asInstanceOf[js.Any], getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConductCode]
  }
  
  @scala.inline
  implicit class GetConductCodeMutableBuilder[Self <: GetConductCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllCodesOfConduct(value: `673`): Self = StObject.set(x, "getAllCodesOfConduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConductCode(value: `674`): Self = StObject.set(x, "getConductCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetForRepo(value: `675`): Self = StObject.set(x, "getForRepo", value.asInstanceOf[js.Any])
  }
}
