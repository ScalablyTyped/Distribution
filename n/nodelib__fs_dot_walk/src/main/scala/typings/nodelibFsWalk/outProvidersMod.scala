package typings.nodelibFsWalk

import typings.nodelibFsWalk.outProvidersAsyncMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersMod {
  
  @JSImport("@nodelib/fs.walk/out/providers", "AsyncProvider")
  @js.native
  open class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typings.nodelibFsWalk.outSettingsMod.default) = this()
  }
  
  @JSImport("@nodelib/fs.walk/out/providers", "StreamProvider")
  @js.native
  open class StreamProvider protected ()
    extends typings.nodelibFsWalk.outProvidersStreamMod.default {
    def this(_root: String, _settings: typings.nodelibFsWalk.outSettingsMod.default) = this()
  }
  
  @JSImport("@nodelib/fs.walk/out/providers", "SyncProvider")
  @js.native
  open class SyncProvider protected ()
    extends typings.nodelibFsWalk.outProvidersSyncMod.default {
    def this(_root: String, _settings: typings.nodelibFsWalk.outSettingsMod.default) = this()
  }
}
