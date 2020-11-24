package typings.meteor.global

import typings.meteor.PackageAPI
import typings.meteor.anon.DebugOnly
import typings.meteor.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Package")
@js.native
object Package extends js.Object {
  
  def describe(options: DebugOnly): Unit = js.native
  
  def onTest(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = js.native
  
  def onUse(func: js.Function1[/* api */ PackageAPI, Unit]): Unit = js.native
  
  def registerBuildPlugin(): Unit = js.native
  def registerBuildPlugin(options: Name): Unit = js.native
}
