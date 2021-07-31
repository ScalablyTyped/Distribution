package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.stat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.stat", "Settings")
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  @scala.inline
  def stat(path: String, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def statSync(path: String): Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any]).asInstanceOf[Stats]
  @scala.inline
  def statSync(path: String, optionsOrSettings: Options): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[Stats]
  @scala.inline
  def statSync(path: String, optionsOrSettings: default): Stats = (^.asInstanceOf[js.Dynamic].applyDynamic("statSync")(path.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[Stats]
  
  type AsyncCallback = typings.nodelibFsStat.asyncMod.AsyncCallback
}
