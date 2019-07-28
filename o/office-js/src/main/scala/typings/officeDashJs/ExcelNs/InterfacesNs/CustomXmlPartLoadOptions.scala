package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom XML part object in a workbook.
  *
  * [Api set: ExcelApi 1.5]
  */
trait CustomXmlPartLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The custom XML part's ID. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The custom XML part's namespace URI. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var namespaceUri: js.UndefOr[Boolean] = js.undefined
}

object CustomXmlPartLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    namespaceUri: js.UndefOr[Boolean] = js.undefined
  ): CustomXmlPartLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(namespaceUri)) __obj.updateDynamic("namespaceUri")(namespaceUri)
    __obj.asInstanceOf[CustomXmlPartLoadOptions]
  }
}

