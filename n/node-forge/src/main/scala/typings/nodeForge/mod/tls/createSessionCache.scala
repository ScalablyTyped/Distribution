package typings.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "tls.createSessionCache")
@js.native
object createSessionCache extends js.Object {
  def apply(): SessionCache = js.native
  def apply(cache: StringDictionary[Session]): SessionCache = js.native
  def apply(cache: StringDictionary[Session], capacity: Double): SessionCache = js.native
  def apply(cache: SessionCache): SessionCache = js.native
  def apply(cache: SessionCache, capacity: Double): SessionCache = js.native
}

