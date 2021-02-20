package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.stat", "Settings")
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  @JSImport("@nodelib/fs.stat", "stat")
  @js.native
  def stat(path: String, callback: AsyncCallback): Unit = js.native
  @JSImport("@nodelib/fs.stat", "stat")
  @js.native
  def stat(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  @JSImport("@nodelib/fs.stat", "stat")
  @js.native
  def stat(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  
  @JSImport("@nodelib/fs.stat", "statSync")
  @js.native
  def statSync(path: String): Stats = js.native
  @JSImport("@nodelib/fs.stat", "statSync")
  @js.native
  def statSync(path: String, optionsOrSettings: Options): Stats = js.native
  @JSImport("@nodelib/fs.stat", "statSync")
  @js.native
  def statSync(path: String, optionsOrSettings: default): Stats = js.native
  
  type AsyncCallback = typings.nodelibFsStat.asyncMod.AsyncCallback
}
