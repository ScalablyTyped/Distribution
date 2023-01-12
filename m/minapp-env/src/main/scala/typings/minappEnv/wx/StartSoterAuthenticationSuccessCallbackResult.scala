package typings.minappEnv.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSoterAuthenticationSuccessCallbackResult extends StObject {
  
  /** 生物认证方式 */
  var authMode: String
  
  /** 错误码 */
  var errCode: Double
  
  /** 错误信息 */
  var errMsg: String
  
  /** 在设备安全区域（TEE）内获得的本机安全信息（如TEE名称版本号等以及防重放参数）以及本次认证信息（仅Android支持，本次认证的指纹ID）。具体说明见下文 */
  var resultJSON: String
  
  /** 用SOTER安全密钥对 `resultJSON` 的签名(SHA256 with RSA/PSS, saltlen=20) */
  var resultJSONSignature: String
}
object StartSoterAuthenticationSuccessCallbackResult {
  
  inline def apply(authMode: String, errCode: Double, errMsg: String, resultJSON: String, resultJSONSignature: String): StartSoterAuthenticationSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], resultJSON = resultJSON.asInstanceOf[js.Any], resultJSONSignature = resultJSONSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSoterAuthenticationSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setAuthMode(value: String): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
    
    inline def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setResultJSON(value: String): Self = StObject.set(x, "resultJSON", value.asInstanceOf[js.Any])
    
    inline def setResultJSONSignature(value: String): Self = StObject.set(x, "resultJSONSignature", value.asInstanceOf[js.Any])
  }
}
