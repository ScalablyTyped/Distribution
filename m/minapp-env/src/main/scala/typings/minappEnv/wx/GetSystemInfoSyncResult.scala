package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSystemInfoSyncResult extends js.Object {
  
  /** 客户端基础库版本
    *
    * 最低基础库： `1.1.0` */
  var SDKVersion: String = js.native
  
  /** (仅Android小游戏) 性能等级，-2 或 0：该设备无法运行小游戏，-1：性能未知，>=1 设备性能值，该值越高，设备性能越好 (目前设备最高不到50)
    *
    * 最低基础库： `1.8.0` */
  var benchmarkLevel: Double = js.native
  
  /** 手机品牌
    *
    * 最低基础库： `1.5.0` */
  var brand: String = js.native
  
  /** 用户字体大小设置。以“我-设置-通用-字体大小”中的设置为准，单位 px。
    *
    * 最低基础库： `1.5.0` */
  var fontSizeSetting: Double = js.native
  
  /** 微信设置的语言 */
  var language: String = js.native
  
  /** 手机型号 */
  var model: String = js.native
  
  /** 设备像素比 */
  var pixelRatio: Double = js.native
  
  /** 客户端平台 */
  var platform: String = js.native
  
  /** 屏幕高度
    *
    * 最低基础库： `1.1.0` */
  var screenHeight: Double = js.native
  
  /** 屏幕宽度
    *
    * 最低基础库： `1.1.0` */
  var screenWidth: Double = js.native
  
  /** 状态栏的高度
    *
    * 最低基础库： `1.9.0` */
  var statusBarHeight: Double = js.native
  
  /** 操作系统版本 */
  var system: String = js.native
  
  /** 微信版本号 */
  var version: String = js.native
  
  /** 可使用窗口高度 */
  var windowHeight: Double = js.native
  
  /** 可使用窗口宽度 */
  var windowWidth: Double = js.native
}
object GetSystemInfoSyncResult {
  
  @scala.inline
  def apply(
    SDKVersion: String,
    benchmarkLevel: Double,
    brand: String,
    fontSizeSetting: Double,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    system: String,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): GetSystemInfoSyncResult = {
    val __obj = js.Dynamic.literal(SDKVersion = SDKVersion.asInstanceOf[js.Any], benchmarkLevel = benchmarkLevel.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSystemInfoSyncResult]
  }
  
  @scala.inline
  implicit class GetSystemInfoSyncResultOps[Self <: GetSystemInfoSyncResult] (val x: Self) extends AnyVal {
    
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
    def setSDKVersion(value: String): Self = this.set("SDKVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkLevel(value: Double): Self = this.set("benchmarkLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeSetting(value: Double): Self = this.set("fontSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeight(value: Double): Self = this.set("screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidth(value: Double): Self = this.set("screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = this.set("statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: String): Self = this.set("system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = this.set("windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = this.set("windowWidth", value.asInstanceOf[js.Any])
  }
}
