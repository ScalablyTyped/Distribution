package typings.atNodelibFsDotWalk

import typings.atNodelibFsDotWalk.outProvidersAsyncMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/providers", JSImport.Namespace)
@js.native
object outProvidersMod extends js.Object {
  @js.native
  class AsyncProvider protected () extends default {
    def this(_root: String, _settings: typings.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
  @js.native
  class StreamProvider protected ()
    extends typings.atNodelibFsDotWalk.outProvidersStreamMod.default {
    def this(_root: String, _settings: typings.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
  @js.native
  class SyncProvider protected ()
    extends typings.atNodelibFsDotWalk.outProvidersSyncMod.default {
    def this(_root: String, _settings: typings.atNodelibFsDotWalk.outSettingsMod.default) = this()
  }
  
}

