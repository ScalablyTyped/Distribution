package typings.nightwatch.nightwatchMod

import typings.nightwatch.Anon_Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestRunner extends js.Object {
  var options: js.UndefOr[Anon_Ui] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object NightwatchTestRunner {
  @scala.inline
  def apply(options: Anon_Ui = null, `type`: String = null): NightwatchTestRunner = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchTestRunner]
  }
}

