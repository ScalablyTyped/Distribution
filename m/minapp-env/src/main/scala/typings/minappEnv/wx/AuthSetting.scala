package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用户授权设置信息，详情参考[权限](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/authorize/wx.authorize.html) */
@js.native
trait AuthSetting extends js.Object {
  /** 是否授权通讯地址，对应接口 [wx.chooseAddress](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/address/wx.chooseAddress.html) */
  @JSName("scope.address")
  var scopeDotaddress: Boolean = js.native
  /** 是否授权摄像头，对应[`<camera />`]((camera)) 组件 */
  @JSName("scope.camera")
  var scopeDotcamera: Boolean = js.native
  /** 是否授权获取发票，对应接口 [wx.chooseInvoice](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/invoice/wx.chooseInvoice.html) */
  @JSName("scope.invoice")
  var scopeDotinvoice: Boolean = js.native
  /** 是否授权发票抬头，对应接口 [wx.chooseInvoiceTitle](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/invoice/wx.chooseInvoiceTitle.html) */
  @JSName("scope.invoiceTitle")
  var scopeDotinvoiceTitle: Boolean = js.native
  /** 是否授权录音功能，对应接口 [wx.startRecord](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.startRecord.html) */
  @JSName("scope.record")
  var scopeDotrecord: Boolean = js.native
  /** 是否授权用户信息，对应接口 [wx.getUserInfo](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/user-info/wx.getUserInfo.html) */
  @JSName("scope.userInfo")
  var scopeDotuserInfo: Boolean = js.native
  /** 是否授权地理位置，对应接口 [wx.getLocation](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.getLocation.html), [wx.chooseLocation](https://developers.weixin.qq.com/miniprogram/dev/api/location/wx.chooseLocation.html) */
  @JSName("scope.userLocation")
  var scopeDotuserLocation: Boolean = js.native
  /** 是否授权微信运动步数，对应接口 [wx.getWeRunData](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/werun/wx.getWeRunData.html) */
  @JSName("scope.werun")
  var scopeDotwerun: Boolean = js.native
  /** 是否授权保存到相册 [wx.saveImageToPhotosAlbum](https://developers.weixin.qq.com/miniprogram/dev/api/media/image/wx.saveImageToPhotosAlbum.html), [wx.saveVideoToPhotosAlbum](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/wx.saveVideoToPhotosAlbum.html) */
  @JSName("scope.writePhotosAlbum")
  var scopeDotwritePhotosAlbum: Boolean = js.native
}

object AuthSetting {
  @scala.inline
  def apply(
    scopeDotaddress: Boolean,
    scopeDotcamera: Boolean,
    scopeDotinvoice: Boolean,
    scopeDotinvoiceTitle: Boolean,
    scopeDotrecord: Boolean,
    scopeDotuserInfo: Boolean,
    scopeDotuserLocation: Boolean,
    scopeDotwerun: Boolean,
    scopeDotwritePhotosAlbum: Boolean
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope.address")(scopeDotaddress.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.camera")(scopeDotcamera.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoice")(scopeDotinvoice.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.invoiceTitle")(scopeDotinvoiceTitle.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.record")(scopeDotrecord.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userInfo")(scopeDotuserInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.userLocation")(scopeDotuserLocation.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.werun")(scopeDotwerun.asInstanceOf[js.Any])
    __obj.updateDynamic("scope.writePhotosAlbum")(scopeDotwritePhotosAlbum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSetting]
  }
  @scala.inline
  implicit class AuthSettingOps[Self <: AuthSetting] (val x: Self) extends AnyVal {
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
    def setScopeDotaddress(value: Boolean): Self = this.set("scope.address", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotcamera(value: Boolean): Self = this.set("scope.camera", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotinvoice(value: Boolean): Self = this.set("scope.invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotinvoiceTitle(value: Boolean): Self = this.set("scope.invoiceTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotrecord(value: Boolean): Self = this.set("scope.record", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotuserInfo(value: Boolean): Self = this.set("scope.userInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotuserLocation(value: Boolean): Self = this.set("scope.userLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotwerun(value: Boolean): Self = this.set("scope.werun", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopeDotwritePhotosAlbum(value: Boolean): Self = this.set("scope.writePhotosAlbum", value.asInstanceOf[js.Any])
  }
  
}

