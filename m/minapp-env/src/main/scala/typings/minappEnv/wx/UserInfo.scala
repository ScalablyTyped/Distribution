package typings.minappEnv.wx

import typings.minappEnv.minappEnvNumbers.`0`
import typings.minappEnv.minappEnvNumbers.`1`
import typings.minappEnv.minappEnvNumbers.`2`
import typings.minappEnv.minappEnvStrings.en
import typings.minappEnv.minappEnvStrings.zh_CN
import typings.minappEnv.minappEnvStrings.zh_TW
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 用户信息 */
@js.native
trait UserInfo extends js.Object {
  /** 用户头像图片的 URL。URL 最后一个数值代表正方形头像大小（有 0、46、64、96、132 数值可选，0 代表 640x640 的正方形头像，46 表示 46x46 的正方形头像，剩余数值以此类推。默认132），用户没有头像时该项为空。若用户更换头像，原有头像 URL 将失效。 */
  var avatarUrl: String = js.native
  /** 用户所在城市 */
  var city: String = js.native
  /** 用户所在国家 */
  var country: String = js.native
  /** 用户性别
    *
    * 可选值：
    * - 0: 未知;
    * - 1: 男性;
    * - 2: 女性; */
  var gender: `0` | `1` | `2` = js.native
  /** 显示 country，province，city 所用的语言
    *
    * 可选值：
    * - 'en': 英文;
    * - 'zh_CN': 简体中文;
    * - 'zh_TW': 繁体中文; */
  var language: en | zh_CN | zh_TW = js.native
  /** 用户昵称 */
  var nickName: String = js.native
  /** 用户所在省份 */
  var province: String = js.native
}

object UserInfo {
  @scala.inline
  def apply(
    avatarUrl: String,
    city: String,
    country: String,
    gender: `0` | `1` | `2`,
    language: en | zh_CN | zh_TW,
    nickName: String,
    province: String
  ): UserInfo = {
    val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
  @scala.inline
  implicit class UserInfoOps[Self <: UserInfo] (val x: Self) extends AnyVal {
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
    def setAvatarUrl(value: String): Self = this.set("avatarUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setGender(value: `0` | `1` | `2`): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: en | zh_CN | zh_TW): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
  }
  
}

