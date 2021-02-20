package typings.minappEnv.wx

import typings.minappEnv.Array
import typings.minappEnv.minappEnvStrings.facial
import typings.minappEnv.minappEnvStrings.fingerPrint
import typings.minappEnv.minappEnvStrings.speech
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSoterAuthenticationOption extends StObject {
  
  /** 验证描述，即识别过程中显示在界面上的对话框提示内容 */
  var authContent: js.UndefOr[String] = js.native
  
  /** 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键识别信息，将作为 `resultJSON` 的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。 */
  var challenge: String = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartSoterAuthenticationCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartSoterAuthenticationFailCallback] = js.native
  
  /** 请求使用的可接受的生物认证方式
    *
    * 可选值：
    * - 'fingerPrint': 指纹识别;
    * - 'facial': 人脸识别（暂未支持）;
    * - 'speech': 声纹识别（暂未支持）; */
  var requestAuthModes: Array[fingerPrint | facial | speech] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartSoterAuthenticationSuccessCallback] = js.native
}
object StartSoterAuthenticationOption {
  
  @scala.inline
  def apply(challenge: String, requestAuthModes: Array[fingerPrint | facial | speech]): StartSoterAuthenticationOption = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSoterAuthenticationOption]
  }
  
  @scala.inline
  implicit class StartSoterAuthenticationOptionMutableBuilder[Self <: StartSoterAuthenticationOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthContent(value: String): Self = StObject.set(x, "authContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthContentUndefined: Self = StObject.set(x, "authContent", js.undefined)
    
    @scala.inline
    def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setRequestAuthModes(value: Array[fingerPrint | facial | speech]): Self = StObject.set(x, "requestAuthModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* result */ StartSoterAuthenticationSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
