package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProblemLocation extends js.Object {
  var document: js.UndefOr[java.lang.String] = js.undefined
  var element: js.UndefOr[java.lang.String] = js.undefined
  var elementId: js.UndefOr[java.lang.String] = js.undefined
  var module: js.UndefOr[java.lang.String] = js.undefined
  var unitId: js.UndefOr[java.lang.String] = js.undefined
}

object IProblemLocation {
  @scala.inline
  def apply(
    document: java.lang.String = null,
    element: java.lang.String = null,
    elementId: java.lang.String = null,
    module: java.lang.String = null,
    unitId: java.lang.String = null
  ): IProblemLocation = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document)
    if (element != null) __obj.updateDynamic("element")(element)
    if (elementId != null) __obj.updateDynamic("elementId")(elementId)
    if (module != null) __obj.updateDynamic("module")(module)
    if (unitId != null) __obj.updateDynamic("unitId")(unitId)
    __obj.asInstanceOf[IProblemLocation]
  }
}

