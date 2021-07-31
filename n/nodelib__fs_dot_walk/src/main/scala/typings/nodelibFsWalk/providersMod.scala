package typings.nodelibFsWalk

import typings.nodelibFsWalk.asyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersMod {
  
  @JSImport("@nodelib/fs.walk/out/providers", "AsyncProvider")
  @js.native
  class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @JSImport("@nodelib/fs.walk/out/providers", "StreamProvider")
  @js.native
  class StreamProvider protected ()
    extends typings.nodelibFsWalk.streamMod.default {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @JSImport("@nodelib/fs.walk/out/providers", "SyncProvider")
  @js.native
  class SyncProvider protected ()
    extends typings.nodelibFsWalk.syncMod.default {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
}
