package typings.orientjs.orientjsMod

import typings.orientjs.orientjsStrings.document
import typings.orientjs.orientjsStrings.graph
import typings.orientjs.orientjsStrings.memory
import typings.orientjs.orientjsStrings.plocal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "OSessionManager")
@js.native
class OSessionManager () extends js.Object {
  var client: js.Any = js.native
  var config: js.Any = js.native
  var currentSession: js.UndefOr[ODatabaseSession | Null] = js.native
  var name: String = js.native
  var password: String = js.native
  var pushNotification: js.UndefOr[Boolean] = js.native
  var sessions: ODatabaseSessionPool = js.native
  var storage: plocal | memory = js.native
  var `type`: document | graph = js.native
  var username: String = js.native
  def acquireSession(op: js.Any, data: js.Any): js.Promise[ODatabaseSession] = js.native
  def acquireSubscribeSession(op: js.Any, data: js.Any): js.Promise[ODatabaseSession] = js.native
  def close(): js.Promise[Unit] = js.native
  def current(): ODatabaseSession | Null = js.native
  def open(): js.Promise[ODatabaseSession] = js.native
  def sendOnSubscribe(db: js.Any, op: js.Any, data: js.Any, onAcquire: js.Any): js.Promise[ODatabaseSession] = js.native
}

