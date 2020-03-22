package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseInvoiceTitleSuccessCallbackResult extends js.Object {
  /** 银行账号 */
  var bankAccount: String
  /** 银行名称 */
  var bankName: String
  /** 单位地址 */
  var companyAddress: String
  /** 错误信息 */
  var errMsg: String
  /** 抬头税号 */
  var taxNumber: String
  /** 手机号码 */
  var telephone: String
  /** 抬头名称 */
  var title: String
  /** 抬头类型
    *
    * 可选值：
    * - 0: 单位;
    * - 1: 个人; */
  var `type`: `0` | `1`
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
}

