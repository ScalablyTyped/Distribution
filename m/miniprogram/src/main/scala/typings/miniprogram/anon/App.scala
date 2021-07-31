package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App extends StObject {
  
  /**
    * Current running client. The app value can refer to the following table.
    */
  var app: String
  
  /**
    * Cellphone brand.
    */
  var brand: String
  
  /**
    * Current battery percentage.
    */
  var currentBattery: String
  
  var fontSizeSetting: Double
  
  var language: String
  
  /**
    * Cellphone model.
    */
  var model: String
  
  /**
    * Device pixel ratio.
    */
  var pixelRatio: Double
  
  /**
    * System name: Android, iOS.
    */
  var platform: String
  
  var screenHeight: Double
  
  var screenWidth: Double
  
  var statusBarHeight: Double
  
  /**
    * Device disk capacity.
    */
  var storage: String
  
  /**
    * System version.
    */
  var system: String
  
  var titleBarHeight: Double
  
  /**
    * App version number.
    */
  var version: String
  
  var windowHeight: Double
  
  var windowWidth: Double
}
object App {
  
  @scala.inline
  def apply(
    app: String,
    brand: String,
    currentBattery: String,
    fontSizeSetting: Double,
    language: String,
    model: String,
    pixelRatio: Double,
    platform: String,
    screenHeight: Double,
    screenWidth: Double,
    statusBarHeight: Double,
    storage: String,
    system: String,
    titleBarHeight: Double,
    version: String,
    windowHeight: Double,
    windowWidth: Double
  ): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], currentBattery = currentBattery.asInstanceOf[js.Any], fontSizeSetting = fontSizeSetting.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], titleBarHeight = titleBarHeight.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentBattery(value: String): Self = StObject.set(x, "currentBattery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeSetting(value: Double): Self = StObject.set(x, "fontSizeSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusBarHeight(value: Double): Self = StObject.set(x, "statusBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleBarHeight(value: Double): Self = StObject.set(x, "titleBarHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
  }
}
