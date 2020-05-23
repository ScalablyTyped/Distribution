package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "findIntent")
@js.native
object findIntent extends js.Object {
  def apply(intent: String): js.Promise[AppIntent] = js.native
  def apply(intent: String, context: Context): js.Promise[AppIntent] = js.native
}

