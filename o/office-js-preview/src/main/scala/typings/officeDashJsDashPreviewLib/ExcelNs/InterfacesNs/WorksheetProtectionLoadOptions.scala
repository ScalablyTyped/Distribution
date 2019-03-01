package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the protection of a sheet object.
  *
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Sheet protection options. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var options: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Indicates if the worksheet is protected. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var `protected`: js.UndefOr[scala.Boolean] = js.undefined
}

object WorksheetProtectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    options: js.UndefOr[scala.Boolean] = js.undefined,
    `protected`: js.UndefOr[scala.Boolean] = js.undefined
  ): WorksheetProtectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(options)) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[WorksheetProtectionLoadOptions]
  }
}

