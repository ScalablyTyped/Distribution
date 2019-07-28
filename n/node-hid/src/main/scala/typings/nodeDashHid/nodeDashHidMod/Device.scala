package typings.nodeDashHid.nodeDashHidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var interface: Double
  var manufacturer: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var product: js.UndefOr[String] = js.undefined
  var productId: Double
  var release: Double
  var serialNumber: js.UndefOr[String] = js.undefined
  var usage: js.UndefOr[Double] = js.undefined
  var usagePage: js.UndefOr[Double] = js.undefined
  var vendorId: Double
}

object Device {
  @scala.inline
  def apply(
    interface: Double,
    productId: Double,
    release: Double,
    vendorId: Double,
    manufacturer: String = null,
    path: String = null,
    product: String = null,
    serialNumber: String = null,
    usage: Int | Double = null,
    usagePage: Int | Double = null
  ): Device = {
    val __obj = js.Dynamic.literal(interface = interface, productId = productId, release = release, vendorId = vendorId)
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (path != null) __obj.updateDynamic("path")(path)
    if (product != null) __obj.updateDynamic("product")(product)
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber)
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    if (usagePage != null) __obj.updateDynamic("usagePage")(usagePage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

