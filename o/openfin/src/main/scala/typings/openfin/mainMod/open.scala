package typings.openfin.mainMod

import typings.openfin.contextMod.Context
import typings.openfin.directoryMod.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/fdc3/main", "open")
@js.native
object open extends js.Object {
  def apply(name: AppName): js.Promise[Unit] = js.native
  def apply(name: AppName, context: Context): js.Promise[Unit] = js.native
}

