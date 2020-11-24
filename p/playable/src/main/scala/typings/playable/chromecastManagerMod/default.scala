package typings.playable.chromecastManagerMod

import typings.playable.anon.Engine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", JSImport.Default)
@js.native
class default protected () extends ChromecastManager {
  def this(hasEngineEventEmitter: Engine) = this()
}
/* static members */
@JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", JSImport.Default)
@js.native
object default extends js.Object {
  
  var _chromecastInited: Boolean = js.native
  
  /* private */ def _isCastApiInited: js.Any = js.native
  
  var dependencies: js.Array[String] = js.native
  
  var moduleName: String = js.native
}
