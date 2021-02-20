package typings.minappEnv.WXNS

import typings.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRequestSuccessResult extends StObject {
  
  var data: AnyObject | String | ArrayBuffer = js.native
  
  var header: AnyObject = js.native
  
  var statusCode: Double = js.native
}
object IRequestSuccessResult {
  
  @scala.inline
  def apply(data: AnyObject | String | ArrayBuffer, header: AnyObject, statusCode: Double): IRequestSuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestSuccessResult]
  }
  
  @scala.inline
  implicit class IRequestSuccessResultMutableBuilder[Self <: IRequestSuccessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: AnyObject | String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
