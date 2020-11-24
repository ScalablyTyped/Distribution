package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 卡券添加结果列表 */
@js.native
trait AddCardResponseInfo extends js.Object {
  
  /** 卡券的扩展参数，结构请参考前文 */
  var cardExt: String = js.native
  
  /** 用户领取到卡券的 ID */
  var cardId: String = js.native
  
  /** 加密 code，为用户领取到卡券的code加密后的字符串，解密请参照：[code 解码接口](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1499332673_Unm7V) */
  var code: String = js.native
  
  /** 是否成功 */
  var isSuccess: Boolean = js.native
}
object AddCardResponseInfo {
  
  @scala.inline
  def apply(cardExt: String, cardId: String, code: String, isSuccess: Boolean): AddCardResponseInfo = {
    val __obj = js.Dynamic.literal(cardExt = cardExt.asInstanceOf[js.Any], cardId = cardId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], isSuccess = isSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCardResponseInfo]
  }
  
  @scala.inline
  implicit class AddCardResponseInfoOps[Self <: AddCardResponseInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCardExt(value: String): Self = this.set("cardExt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardId(value: String): Self = this.set("cardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuccess(value: Boolean): Self = this.set("isSuccess", value.asInstanceOf[js.Any])
  }
}
