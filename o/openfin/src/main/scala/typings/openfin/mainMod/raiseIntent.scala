package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import typings.openfin.directoryMod.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "raiseIntent")
@js.native
object raiseIntent extends js.Object {
  def apply(intent: String, context: Context): js.Promise[IntentResolution] = js.native
  def apply(intent: String, context: Context, target: AppName): js.Promise[IntentResolution] = js.native
}

