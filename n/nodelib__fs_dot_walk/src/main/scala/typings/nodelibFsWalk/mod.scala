package typings.nodelibFsWalk

import typings.node.streamMod.Readable
import typings.nodelibFsWalk.asyncMod.AsyncCallback
import typings.nodelibFsWalk.settingsMod.Options
import typings.nodelibFsWalk.settingsMod.default
import typings.nodelibFsWalk.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@nodelib/fs.walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nodelib/fs.walk", "Settings")
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  inline def walk(directory: String, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(directory.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walk(directory: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(directory.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def walk(directory: String, optionsOrSettings: default, callback: AsyncCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("walk")(directory.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def walkStream(directory: String): Readable = ^.asInstanceOf[js.Dynamic].applyDynamic("walkStream")(directory.asInstanceOf[js.Any]).asInstanceOf[Readable]
  inline def walkStream(directory: String, optionsOrSettings: Options): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("walkStream")(directory.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[Readable]
  inline def walkStream(directory: String, optionsOrSettings: default): Readable = (^.asInstanceOf[js.Dynamic].applyDynamic("walkStream")(directory.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[Readable]
  
  inline def walkSync(directory: String): js.Array[Entry] = ^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(directory.asInstanceOf[js.Any]).asInstanceOf[js.Array[Entry]]
  inline def walkSync(directory: String, optionsOrSettings: Options): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(directory.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
  inline def walkSync(directory: String, optionsOrSettings: default): js.Array[Entry] = (^.asInstanceOf[js.Dynamic].applyDynamic("walkSync")(directory.asInstanceOf[js.Any], optionsOrSettings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Entry]]
}
