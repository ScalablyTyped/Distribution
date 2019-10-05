package typings.mdns.mdnsMod

import org.scalablytyped.runtime.TopLevel
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Advertisement extends EventEmitter {
  def start(): Unit = js.native
  def stop(): Unit = js.native
}

// --- Statics & Classes ---
@JSImport("mdns", "Advertisement")
@js.native
object Advertisement extends TopLevel[AdvertisementCreatable]

