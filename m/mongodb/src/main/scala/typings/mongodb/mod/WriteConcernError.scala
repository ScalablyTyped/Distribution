package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteConcernError extends StObject {
  
  //Write concern error code.
  var code: scala.Double = js.native
  
  //Write concern error message.
  var errmsg: String = js.native
}
object WriteConcernError {
  
  @scala.inline
  def apply(code: scala.Double, errmsg: String): WriteConcernError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteConcernError]
  }
  
  @scala.inline
  implicit class WriteConcernErrorMutableBuilder[Self <: WriteConcernError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: scala.Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
  }
}
