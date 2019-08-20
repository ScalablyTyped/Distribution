package typings.omelette.omeletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance extends js.Object {
  def cleanupShellInitFile(): Unit = js.native
  def init(): Unit = js.native
  def next(fn: js.Function0[Unit]): Unit = js.native
  def on(action: String, callback: Callback): Unit = js.native
  def onAsync(actions: String, callback: CallbackAsync): Unit = js.native
  def setupShellInitFile(): Unit = js.native
  def setupShellInitFile(initFile: String): Unit = js.native
  def tree(value: TreeValue): this.type = js.native
}

