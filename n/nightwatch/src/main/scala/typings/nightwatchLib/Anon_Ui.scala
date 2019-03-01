package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ui extends js.Object {
  var ui: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Ui {
  @scala.inline
  def apply(ui: java.lang.String = null): Anon_Ui = {
    val __obj = js.Dynamic.literal()
    if (ui != null) __obj.updateDynamic("ui")(ui)
    __obj.asInstanceOf[Anon_Ui]
  }
}

