package typings.meteor.global

import typings.meteor.anon.Author
import typings.meteor.anon.LaunchExternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object App {
  
  @JSGlobal("App")
  @js.native
  val ^ : js.Any = js.native
  
  inline def accessRule(pattern: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def accessRule(pattern: String, options: LaunchExternal): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessRule")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def configurePlugin(id: String, config: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configurePlugin")(id.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def icons(icons: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("icons")(icons.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def info(options: Author): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def launchScreens(launchScreens: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("launchScreens")(launchScreens.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPreference(name: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setPreference(name: String, value: String, platform: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPreference")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
