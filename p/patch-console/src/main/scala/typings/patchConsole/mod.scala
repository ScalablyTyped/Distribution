package typings.patchConsole

import typings.patchConsole.patchConsoleStrings.stderr
import typings.patchConsole.patchConsoleStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("patch-console", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(callback: Callback): Restore = js.native
  type Callback = js.Function2[/* stream */ stdout | stderr, /* data */ String, Unit]
  type Restore = js.Function0[Unit]
}

