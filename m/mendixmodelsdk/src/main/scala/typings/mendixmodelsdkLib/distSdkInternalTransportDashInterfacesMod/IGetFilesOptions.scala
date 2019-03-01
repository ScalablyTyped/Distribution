package typings
package mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetFilesOptions extends js.Object {
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[
    mendixmodelsdkLib.mendixmodelsdkLibStrings.json | mendixmodelsdkLib.mendixmodelsdkLibStrings.zip
  ] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object IGetFilesOptions {
  @scala.inline
  def apply(
    filter: java.lang.String = null,
    format: mendixmodelsdkLib.mendixmodelsdkLibStrings.json | mendixmodelsdkLib.mendixmodelsdkLibStrings.zip = null,
    path: java.lang.String = null
  ): IGetFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[IGetFilesOptions]
  }
}

