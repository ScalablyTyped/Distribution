package typings
package popmotionLib.libReactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/reactions", "BaseMulticast")
@js.native
abstract class BaseMulticast[T] ()
  extends popmotionLib.libChainableMod.default[T]
     with popmotionLib.libObserverTypesMod.IObserver {
  var parent: js.Any = js.native
  var subscribers: js.Array[popmotionLib.libObserverTypesMod.IObserver] = js.native
  def registerParent(subscription: popmotionLib.libActionTypesMod.ColdSubscription): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def subscribe(observerCandidate: popmotionLib.libObserverTypesMod.ObserverCandidate): popmotionLib.libReactionsTypesMod.HotSubscription = js.native
  @JSName("update")
  def update_MBaseMulticast(v: js.Any): scala.Unit = js.native
}

