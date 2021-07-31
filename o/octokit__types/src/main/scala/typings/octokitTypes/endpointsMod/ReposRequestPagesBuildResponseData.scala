package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposRequestPagesBuildResponseData extends StObject {
  
  var status: String
  
  var url: String
}
object ReposRequestPagesBuildResponseData {
  
  @scala.inline
  def apply(status: String, url: String): ReposRequestPagesBuildResponseData = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRequestPagesBuildResponseData]
  }
  
  @scala.inline
  implicit class ReposRequestPagesBuildResponseDataMutableBuilder[Self <: ReposRequestPagesBuildResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
