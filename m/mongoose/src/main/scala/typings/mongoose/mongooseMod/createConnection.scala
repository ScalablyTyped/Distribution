package typings.mongoose.mongooseMod

import typings.mongoose.Anon_Catch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(): Connection = js.native
  def apply(uri: String): Connection with Anon_Catch = js.native
  def apply(uri: String, options: ConnectionOptions): Connection with Anon_Catch = js.native
}

