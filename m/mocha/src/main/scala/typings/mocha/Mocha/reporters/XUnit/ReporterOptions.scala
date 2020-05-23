package typings.mocha.Mocha.reporters.XUnit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReporterOptions extends js.Object {
  var output: js.UndefOr[String] = js.undefined
  var suiteName: js.UndefOr[String] = js.undefined
}

object ReporterOptions {
  @scala.inline
  def apply(output: String = null, suiteName: String = null): ReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (suiteName != null) __obj.updateDynamic("suiteName")(suiteName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReporterOptions]
  }
}

