package typings.meteor.global

import typings.meteor.anon.Author
import typings.meteor.anon.LaunchExternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("App")
@js.native
object App extends js.Object {
  
  def accessRule(pattern: String): Unit = js.native
  def accessRule(pattern: String, options: LaunchExternal): Unit = js.native
  
  def configurePlugin(id: String, config: js.Object): Unit = js.native
  
  def icons(icons: js.Object): Unit = js.native
  
  def info(options: Author): Unit = js.native
  
  def launchScreens(launchScreens: js.Object): Unit = js.native
  
  def setPreference(name: String, value: String): Unit = js.native
  def setPreference(name: String, value: String, platform: String): Unit = js.native
}
