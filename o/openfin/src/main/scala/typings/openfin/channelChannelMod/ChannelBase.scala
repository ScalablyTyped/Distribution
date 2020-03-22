package typings.openfin.channelChannelMod

import typings.openfin.FnCall
import typings.openfin.identityMod.Identity
import typings.std.Map
import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/interappbus/channel/channel", "ChannelBase")
@js.native
class ChannelBase protected () extends js.Object {
  def this(
    providerIdentity: ProviderIdentity,
    send: FnCall,
    channelProtectedMap: WeakMap[ChannelBase, ProtectedItems]
  ) = this()
  var channelMap: Map[String, ChannelBase] = js.native
  var defaultSet: js.Any = js.native
  var errorMiddleware: js.Any = js.native
  var postAction: js.Any = js.native
  var preAction: js.Any = js.native
  var subscriptions: js.Any = js.native
  def afterAction(func: Action): Unit = js.native
  def beforeAction(func: Action): Unit = js.native
  def defaultAction(): js.Any = js.native
  def defaultAction(action: String): js.Any = js.native
  def defaultAction(action: String, payload: js.Any): js.Any = js.native
  def defaultAction(action: String, payload: js.Any, senderIdentity: ProviderIdentity): js.Any = js.native
  def onError(func: js.Function3[/* action */ String, /* error */ js.Any, /* id */ Identity, _]): Unit = js.native
  def processAction(action: String, payload: js.Any, senderIdentity: ProviderIdentity): js.Promise[_] = js.native
  def register(topic: String, listener: Action): Boolean = js.native
  def remove(action: String): Unit = js.native
  /* protected */ def removeChannel(mapKey: String): Unit = js.native
  def setDefaultAction(
    func: js.Function3[
      /* action */ js.UndefOr[String], 
      /* payload */ js.UndefOr[js.Any], 
      /* senderIdentity */ js.UndefOr[ProviderIdentity], 
      _
    ]
  ): Unit = js.native
}

