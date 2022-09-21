package typings.orientjs.mod

import typings.orientjs.orientjsStrings.document
import typings.orientjs.orientjsStrings.graph
import typings.orientjs.orientjsStrings.memory
import typings.orientjs.orientjsStrings.plocal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "OSessionManager")
@js.native
open class OSessionManager () extends StObject {
  
  def acquireSession(op: Any, data: Any): js.Promise[ODatabaseSession] = js.native
  
  def acquireSubscribeSession(op: Any, data: Any): js.Promise[ODatabaseSession] = js.native
  
  var client: Any = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  var config: Any = js.native
  
  def current(): ODatabaseSession | Null = js.native
  
  var currentSession: js.UndefOr[ODatabaseSession | Null] = js.native
  
  var name: String = js.native
  
  def open(): js.Promise[ODatabaseSession] = js.native
  
  var password: String = js.native
  
  var pushNotification: js.UndefOr[Boolean] = js.native
  
  def sendOnSubscribe(db: Any, op: Any, data: Any, onAcquire: Any): js.Promise[ODatabaseSession] = js.native
  
  var sessions: ODatabaseSessionPool = js.native
  
  var storage: plocal | memory = js.native
  
  var `type`: document | graph = js.native
  
  var username: String = js.native
}
