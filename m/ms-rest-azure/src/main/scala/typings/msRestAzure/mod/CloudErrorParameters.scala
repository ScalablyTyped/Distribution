package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudErrorParameters extends StObject {
  
  var code: String
  
  var details: js.UndefOr[js.Array[CloudError]] = js.undefined
  
  var message: String
  
  var target: js.UndefOr[String] = js.undefined
}
object CloudErrorParameters {
  
  @scala.inline
  def apply(code: String, message: String): CloudErrorParameters = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudErrorParameters]
  }
  
  @scala.inline
  implicit class CloudErrorParametersMutableBuilder[Self <: CloudErrorParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: js.Array[CloudError]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: CloudError*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
