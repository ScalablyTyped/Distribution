package typings
package metismenuLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def metisMenu(): JQuery = js.native
  def metisMenu(options: MetisMenuOptions): JQuery = js.native
  @JSName("metisMenu")
  def metisMenu_dispose(options: metismenuLib.metismenuLibStrings.dispose): JQuery = js.native
  def on(events: MetisMenuEvents, handler: js.Function1[/* eventObject */ jqueryLib.JQueryEventObject, _]): JQuery = js.native
}

