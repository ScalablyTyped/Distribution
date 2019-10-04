package typings.pdfjsDashDist.pdfjsDashDistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFWorkerParameters extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[js.Any] = js.undefined
  var verbosity: js.UndefOr[VerbosityLevel] = js.undefined
}

object PDFWorkerParameters {
  @scala.inline
  def apply(name: String = null, port: js.Any = null, verbosity: VerbosityLevel = null): PDFWorkerParameters = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port)
    if (verbosity != null) __obj.updateDynamic("verbosity")(verbosity)
    __obj.asInstanceOf[PDFWorkerParameters]
  }
}

