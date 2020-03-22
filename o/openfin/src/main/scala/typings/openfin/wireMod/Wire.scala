package typings.openfin.wireMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wire extends EventEmitter {
  def connect(address: String): js.Promise[_] = js.native
  def connectSync(): js.Any = js.native
  def send(data: js.Any): js.Promise[_] = js.native
  def shutdown(): js.Promise[Unit] = js.native
}

