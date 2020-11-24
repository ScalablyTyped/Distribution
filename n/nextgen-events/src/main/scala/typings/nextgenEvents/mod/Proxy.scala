package typings.nextgenEvents.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nextgenEvents.anon.Ack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nextgen-events", "Proxy")
@js.native
class Proxy () extends js.Object {
  
  def addLocalService(name: String, heartBeatEmitter: js.Any, options: Ack): Unit = js.native
  
  def addRemoteService(name: String): Unit = js.native
  
  def destroy(): js.Any = js.native
  
  def push(data: js.Any): Unit = js.native
  
  def receive(raw: js.Any): Unit = js.native
  
  var remoteServices: StringDictionary[NextGenEvents] = js.native
  
  def send(message: js.Any): Unit = js.native
}
