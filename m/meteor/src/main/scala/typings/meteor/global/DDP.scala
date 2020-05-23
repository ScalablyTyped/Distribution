package typings.meteor.global

import typings.meteor.DDP.DDPStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DDP")
@js.native
object DDP extends js.Object {
  @JSName("_allSubscriptionsReady")
  def allSubscriptionsReady(): Boolean = js.native
  def connect(url: String): DDPStatic = js.native
}

