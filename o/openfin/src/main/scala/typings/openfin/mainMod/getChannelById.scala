package typings.openfin.mainMod

import typings.openfin.contextChannelsMod.Channel
import typings.openfin.contextChannelsMod.ChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/fdc3/main", "getChannelById")
@js.native
object getChannelById extends js.Object {
  
  def apply(channelId: ChannelId): js.Promise[Channel] = js.native
}
