package typings
package mochaLib.MochaNs.reportersNs.XUnitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  var output: js.UndefOr[java.lang.String] = js.undefined
  var suiteName: js.UndefOr[java.lang.String] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(output: java.lang.String = null, suiteName: java.lang.String = null): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output)
    if (suiteName != null) __obj.updateDynamic("suiteName")(suiteName)
    __obj.asInstanceOf[ReporterOptions]
  }
}

