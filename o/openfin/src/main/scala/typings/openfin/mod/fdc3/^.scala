package typings.openfin.mod.fdc3

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.openfin.contextChannelsMod.AppChannelTransport
import typings.openfin.contextChannelsMod.SystemChannelTransport
import typings.openfin.identityMod.Identity
import typings.openfin.mainMod.DefaultChannel_
import typings.openfin.openfinStrings.`channel-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin", "fdc3")
@js.native
object ^ extends js.Object {
  
  var AppChannel: Instantiable1[/* transport */ AppChannelTransport, typings.openfin.mainMod.AppChannel] = js.native
  
  var ChannelBase: Instantiable2[/* id */ String, /* type */ String, typings.openfin.mainMod.ChannelBase] = js.native
  
  var DefaultChannel: Instantiable0[DefaultChannel_] = js.native
  
  var FDC3Error: Instantiable2[/* code */ String, /* message */ String, typings.openfin.mainMod.FDC3Error] = js.native
  
  var SystemChannel: Instantiable1[/* transport */ SystemChannelTransport, typings.openfin.mainMod.SystemChannel] = js.native
  
  def addContextListener(handler: js.Function1[/* context */ typings.openfin.contextMod.Context, Unit]): typings.openfin.mainMod.ContextListener = js.native
  
  @JSName("addEventListener")
  def addEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typings.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
  
  def addIntentListener(intent: String, handler: js.Function1[/* context */ typings.openfin.contextMod.Context, _]): typings.openfin.mainMod.IntentListener = js.native
  
  def broadcast(context: typings.openfin.contextMod.Context): js.Promise[Unit] = js.native
  
  val defaultChannel: typings.openfin.contextChannelsMod.DefaultChannel_ = js.native
  
  def findIntent(intent: String): js.Promise[typings.openfin.mainMod.AppIntent] = js.native
  def findIntent(intent: String, context: typings.openfin.contextMod.Context): js.Promise[typings.openfin.mainMod.AppIntent] = js.native
  
  def findIntentsByContext(context: typings.openfin.contextMod.Context): js.Promise[js.Array[typings.openfin.mainMod.AppIntent]] = js.native
  
  def getChannelById(channelId: typings.openfin.contextChannelsMod.ChannelId): js.Promise[typings.openfin.contextChannelsMod.Channel] = js.native
  
  def getCurrentChannel(): js.Promise[typings.openfin.contextChannelsMod.Channel] = js.native
  def getCurrentChannel(identity: Identity): js.Promise[typings.openfin.contextChannelsMod.Channel] = js.native
  
  def getOrCreateAppChannel(name: String): js.Promise[typings.openfin.contextChannelsMod.AppChannel] = js.native
  
  def getSystemChannels(): js.Promise[js.Array[typings.openfin.contextChannelsMod.SystemChannel]] = js.native
  
  def open(name: typings.openfin.directoryMod.AppName): js.Promise[Unit] = js.native
  def open(name: typings.openfin.directoryMod.AppName, context: typings.openfin.contextMod.Context): js.Promise[Unit] = js.native
  
  def raiseIntent(intent: String, context: typings.openfin.contextMod.Context): js.Promise[typings.openfin.mainMod.IntentResolution] = js.native
  def raiseIntent(
    intent: String,
    context: typings.openfin.contextMod.Context,
    target: typings.openfin.directoryMod.AppName
  ): js.Promise[typings.openfin.mainMod.IntentResolution] = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_channelchanged(
    eventType: `channel-changed`,
    handler: js.Function1[/* event */ typings.openfin.contextChannelsMod.ChannelChangedEvent, Unit]
  ): Unit = js.native
}
