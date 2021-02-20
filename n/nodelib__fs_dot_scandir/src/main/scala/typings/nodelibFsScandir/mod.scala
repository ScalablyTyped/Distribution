package typings.nodelibFsScandir

import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.scandir", "Settings")
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  @JSImport("@nodelib/fs.scandir", "scandir")
  @js.native
  def scandir(path: String, callback: AsyncCallback): Unit = js.native
  @JSImport("@nodelib/fs.scandir", "scandir")
  @js.native
  def scandir(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  @JSImport("@nodelib/fs.scandir", "scandir")
  @js.native
  def scandir(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  
  @JSImport("@nodelib/fs.scandir", "scandirSync")
  @js.native
  def scandirSync(path: String): js.Array[Entry] = js.native
  @JSImport("@nodelib/fs.scandir", "scandirSync")
  @js.native
  def scandirSync(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  @JSImport("@nodelib/fs.scandir", "scandirSync")
  @js.native
  def scandirSync(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
  
  type AsyncCallback = typings.nodelibFsScandir.asyncMod.AsyncCallback
}
