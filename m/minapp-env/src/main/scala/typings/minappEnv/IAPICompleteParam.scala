package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.minappEnv.IAPISuccessParam
  - typings.minappEnv.IAPIError
*/
trait IAPICompleteParam extends StObject
object IAPICompleteParam {
  
  @scala.inline
  def IAPIError(errMsg: java.lang.String): typings.minappEnv.IAPIError = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minappEnv.IAPIError]
  }
  
  @scala.inline
  def IAPISuccessParam(errMsg: java.lang.String): typings.minappEnv.IAPISuccessParam = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minappEnv.IAPISuccessParam]
  }
}
