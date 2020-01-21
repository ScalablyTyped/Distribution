package typings.nodelibFsWalk

import typings.nodelibFsWalk.asyncMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/providers", JSImport.Namespace)
@js.native
object providersMod extends js.Object {
  @js.native
  class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  class StreamProvider protected ()
    extends typings.nodelibFsWalk.streamMod.default {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  class SyncProvider protected ()
    extends typings.nodelibFsWalk.syncMod.default {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
}

