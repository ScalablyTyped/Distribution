package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReporterOptions extends js.Object {
  var reporterOptions: js.UndefOr[js.Any] = js.undefined
}

object Anon_ReporterOptions {
  @scala.inline
  def apply(reporterOptions: js.Any = null): Anon_ReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (reporterOptions != null) __obj.updateDynamic("reporterOptions")(reporterOptions)
    __obj.asInstanceOf[Anon_ReporterOptions]
  }
}

