package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseInvoiceTitleSuccessCallbackResult extends StObject {
  
  /** 银行账号 */
  var bankAccount: String = js.native
  
  /** 银行名称 */
  var bankName: String = js.native
  
  /** 单位地址 */
  var companyAddress: String = js.native
  
  /** 错误信息 */
  var errMsg: String = js.native
  
  /** 抬头税号 */
  var taxNumber: String = js.native
  
  /** 手机号码 */
  var telephone: String = js.native
  
  /** 抬头名称 */
  var title: String = js.native
  
  /** 抬头类型
    *
    * 可选值：
    * - 0: 单位;
    * - 1: 个人; */
  var `type`: `0` | `1` = js.native
}
object ChooseInvoiceTitleSuccessCallbackResult {
  
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: `0` | `1`
  ): ChooseInvoiceTitleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceTitleSuccessCallbackResult]
  }
  
  @scala.inline
  implicit class ChooseInvoiceTitleSuccessCallbackResultMutableBuilder[Self <: ChooseInvoiceTitleSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankAccount(value: String): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyAddress(value: String): Self = StObject.set(x, "companyAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxNumber(value: String): Self = StObject.set(x, "taxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelephone(value: String): Self = StObject.set(x, "telephone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `0` | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
