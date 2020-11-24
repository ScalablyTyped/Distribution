package typings.nodelibFsWalk.anon

import typings.nodelibFsScandir.mod.AsyncCallback
import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.settingsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofscandir extends js.Object {
  
  def apply(path: String, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
}
