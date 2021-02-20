package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Api extends StObject {
  
  var api: String = js.native
  
  var software: String = js.native
}
object Api {
  
  @scala.inline
  def apply(api: String, software: String): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], software = software.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  @scala.inline
  implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftware(value: String): Self = StObject.set(x, "software", value.asInstanceOf[js.Any])
  }
}
