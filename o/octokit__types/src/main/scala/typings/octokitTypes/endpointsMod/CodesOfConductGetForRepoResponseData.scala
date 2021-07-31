package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodesOfConductGetForRepoResponseData extends StObject {
  
  var body: String
  
  var key: String
  
  var name: String
  
  var url: String
}
object CodesOfConductGetForRepoResponseData {
  
  @scala.inline
  def apply(body: String, key: String, name: String, url: String): CodesOfConductGetForRepoResponseData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetForRepoResponseData]
  }
  
  @scala.inline
  implicit class CodesOfConductGetForRepoResponseDataMutableBuilder[Self <: CodesOfConductGetForRepoResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
