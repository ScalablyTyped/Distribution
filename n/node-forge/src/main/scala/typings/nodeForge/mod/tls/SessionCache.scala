package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.Bytes
import typings.nodeForge.mod.Hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionCache extends js.Object {
  var cache: StringDictionary[Session] = js.native
  var capacity: Double = js.native
  var order: js.Array[Hex] = js.native
  def getSession(sessionId: Bytes): Session = js.native
  def setSession(sessionId: Bytes, session: Session): Unit = js.native
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
  @scala.inline
  implicit class SessionCacheOps[Self <: SessionCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCache(value: StringDictionary[Session]): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSession(value: Bytes => Session): Self = this.set("getSession", js.Any.fromFunction1(value))
    @scala.inline
    def setOrderVarargs(value: Hex*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: js.Array[Hex]): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetSession(value: (Bytes, Session) => Unit): Self = this.set("setSession", js.Any.fromFunction2(value))
  }
  
}

