package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpResponseCode extends StObject {
  
  var httpResponseCode: Double = js.native
}
object HttpResponseCode {
  
  @scala.inline
  def apply(httpResponseCode: Double): HttpResponseCode = {
    val __obj = js.Dynamic.literal(httpResponseCode = httpResponseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponseCode]
  }
  
  @scala.inline
  implicit class HttpResponseCodeMutableBuilder[Self <: HttpResponseCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHttpResponseCode(value: Double): Self = StObject.set(x, "httpResponseCode", value.asInstanceOf[js.Any])
  }
}
