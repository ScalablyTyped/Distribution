package typings
package muiboxLib.muiboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  def alert(options: java.lang.String): js.Promise[scala.Unit] = js.native
  def alert(options: AlertOptions): js.Promise[scala.Unit] = js.native
  def confirm(options: java.lang.String): js.Promise[scala.Unit] = js.native
  def confirm(options: ConfirmOptions): js.Promise[scala.Unit] = js.native
  def prompt(options: java.lang.String): js.Promise[java.lang.String] = js.native
  def prompt(options: PromptOptions): js.Promise[java.lang.String] = js.native
}

