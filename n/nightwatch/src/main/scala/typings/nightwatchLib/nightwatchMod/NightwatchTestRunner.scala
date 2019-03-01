package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTestRunner extends js.Object {
  var options: js.UndefOr[nightwatchLib.Anon_Ui] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object NightwatchTestRunner {
  @scala.inline
  def apply(options: nightwatchLib.Anon_Ui = null, `type`: java.lang.String = null): NightwatchTestRunner = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NightwatchTestRunner]
  }
}

