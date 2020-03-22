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
trait UserInfo extends js.Object {
  /** 用户头像图片的 URL。URL 最后一个数值代表正方形头像大小（有 0、46、64、96、132 数值可选，0 代表 640x640 的正方形头像，46 表示 46x46 的正方形头像，剩余数值以此类推。默认132），用户没有头像时该项为空。若用户更换头像，原有头像 URL 将失效。 */
  var avatarUrl: String
  /** 用户所在城市 */
  var city: String
  /** 用户所在国家 */
  var country: String
  /** 用户性别
    *
    * 可选值：
    * - 0: 未知;
    * - 1: 男性;
    * - 2: 女性; */
  var gender: `0` | `1` | `2`
  /** 显示 country，province，city 所用的语言
    *
    * 可选值：
    * - 'en': 英文;
    * - 'zh_CN': 简体中文;
    * - 'zh_TW': 繁体中文; */
  var language: en | zh_CN | zh_TW
  /** 用户昵称 */
  var nickName: String
  /** 用户所在省份 */
  var province: String
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
}

