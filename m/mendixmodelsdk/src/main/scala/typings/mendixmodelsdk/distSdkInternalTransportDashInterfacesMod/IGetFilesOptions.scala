package typings.mendixmodelsdk.distSdkInternalTransportDashInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.json
import typings.mendixmodelsdk.mendixmodelsdkStrings.zip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetFilesOptions extends js.Object {
  var filter: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[json | zip] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object IGetFilesOptions {
  @scala.inline
  def apply(filter: String = null, format: json | zip = null, path: String = null): IGetFilesOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[IGetFilesOptions]
  }
}

