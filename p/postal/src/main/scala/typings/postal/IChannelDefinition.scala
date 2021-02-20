package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChannelDefinition[T] extends StObject {
  
  var channel: String = js.native
  
  def publish(topic: String): Unit = js.native
  def publish(topic: String, data: T): Unit = js.native
  
  def subscribe(topic: String, callback: ICallback[T]): ISubscriptionDefinition[T] = js.native
}
