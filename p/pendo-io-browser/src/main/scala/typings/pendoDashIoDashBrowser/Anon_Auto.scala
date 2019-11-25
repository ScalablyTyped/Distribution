package typings.pendoDashIoDashBrowser

import typings.pendoDashIoDashBrowser.pendo.Guide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auto extends js.Object {
  var auto: js.Array[Guide]
  var `override`: js.Array[Guide]
}

object Anon_Auto {
  @scala.inline
  def apply(auto: js.Array[Guide], `override`: js.Array[Guide]): Anon_Auto = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any])
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auto]
  }
}

