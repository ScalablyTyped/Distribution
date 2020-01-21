package typings.mongoose.mod

import typings.mongoose.AnonCatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(): Connection_ = js.native
  def apply(uri: String): Connection_ with AnonCatch = js.native
  def apply(uri: String, options: ConnectionOptions): Connection_ with AnonCatch = js.native
}

