package typings.mendixmodelsdk.transportInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProblemLocation extends js.Object {
  var document: js.UndefOr[String] = js.undefined
  var element: js.UndefOr[String] = js.undefined
  var elementId: js.UndefOr[String] = js.undefined
  var module: js.UndefOr[String] = js.undefined
  var unitId: js.UndefOr[String] = js.undefined
}

object IProblemLocation {
  @scala.inline
  def apply(
    document: String = null,
    element: String = null,
    elementId: String = null,
    module: String = null,
    unitId: String = null
  ): IProblemLocation = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (elementId != null) __obj.updateDynamic("elementId")(elementId.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (unitId != null) __obj.updateDynamic("unitId")(unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProblemLocation]
  }
}

