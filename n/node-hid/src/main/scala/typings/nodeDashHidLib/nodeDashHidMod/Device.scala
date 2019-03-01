package typings
package nodeDashHidLib.nodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var interface: scala.Double
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var product: js.UndefOr[java.lang.String] = js.undefined
  var productId: scala.Double
  var release: scala.Double
  var serialNumber: js.UndefOr[java.lang.String] = js.undefined
  var usage: js.UndefOr[scala.Double] = js.undefined
  var usagePage: js.UndefOr[scala.Double] = js.undefined
  var vendorId: scala.Double
}

object Device {
  @scala.inline
  def apply(
    interface: scala.Double,
    productId: scala.Double,
    release: scala.Double,
    vendorId: scala.Double,
    manufacturer: java.lang.String = null,
    path: java.lang.String = null,
    product: java.lang.String = null,
    serialNumber: java.lang.String = null,
    usage: scala.Int | scala.Double = null,
    usagePage: scala.Int | scala.Double = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interface")(interface)
    __obj.updateDynamic("productId")(productId)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("vendorId")(vendorId)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (path != null) __obj.updateDynamic("path")(path)
    if (product != null) __obj.updateDynamic("product")(product)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (usagePage != null) __obj.updateDynamic("usagePage")(usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

