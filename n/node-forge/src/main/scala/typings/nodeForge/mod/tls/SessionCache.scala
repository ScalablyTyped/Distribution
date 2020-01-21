package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCache extends js.Object {
  var cache: StringDictionary[Session]
  var capacity: Double
  var order: js.Array[Hex]
  def getSession(sessionId: Bytes): Session
  def setSession(sessionId: Bytes, session: Session): Unit
}

object SessionCache {
  @scala.inline
  def apply(
    cache: StringDictionary[Session],
    capacity: Double,
    getSession: Bytes => Session,
    order: js.Array[Hex],
    setSession: (Bytes, Session) => Unit
  ): SessionCache = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], getSession = js.Any.fromFunction1(getSession), order = order.asInstanceOf[js.Any], setSession = js.Any.fromFunction2(setSession))
  
    __obj.asInstanceOf[SessionCache]
  }
}

