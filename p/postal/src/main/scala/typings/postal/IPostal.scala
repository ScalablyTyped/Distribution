package typings.postal

import typings.postal.anon.Callback
import typings.postal.anon.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPostal extends StObject {
  
  def addWireTap(callback: ICallback[Any]): js.Function0[Unit] = js.native
  
  def channel[T](): IChannelDefinition[T] = js.native
  def channel[T](name: String): IChannelDefinition[T] = js.native
  
  var configuration: IConfiguration = js.native
  
  def getSubscribersFor(): js.Array[ISubscriptionDefinition[Any]] = js.native
  def getSubscribersFor(options: Channel): js.Array[ISubscriptionDefinition[Any]] = js.native
  def getSubscribersFor(predicateFn: js.Function1[/* sub */ ISubscriptionDefinition[Any], Boolean]): js.Array[ISubscriptionDefinition[Any]] = js.native
  
  def publish(envelope: IEnvelope[Any]): Unit = js.native
  
  def reset(): Unit = js.native
  
  def subscribe(options: Callback): ISubscriptionDefinition[Any] = js.native
  
  def unsubscribe(sub: ISubscriptionDefinition[Any]): Unit = js.native
  
  def unsubscribeFor(): Unit = js.native
  def unsubscribeFor(options: Channel): Unit = js.native
  
  var wireTaps: js.Array[ICallback[Any]] = js.native
}
