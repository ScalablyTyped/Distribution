package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "findIntentsByContext")
@js.native
object findIntentsByContext extends js.Object {
  def apply(context: Context): js.Promise[js.Array[AppIntent]] = js.native
}

