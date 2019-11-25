package typings.naverDashWhale

import typings.chrome.chrome.printerProvider.CapabilityRequestedEvent
import typings.chrome.chrome.printerProvider.PrintRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterInfoRequestedEvent
import typings.chrome.chrome.printerProvider.PrinterRequestedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofprinterProvider extends js.Object {
  var onGetCapabilityRequested: CapabilityRequestedEvent
  var onGetPrintersRequested: PrinterRequestedEvent
  var onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent
  var onPrintRequested: PrintRequestedEvent
}

object TypeofprinterProvider {
  @scala.inline
  def apply(
    onGetCapabilityRequested: CapabilityRequestedEvent,
    onGetPrintersRequested: PrinterRequestedEvent,
    onGetUsbPrinterInfoRequested: PrinterInfoRequestedEvent,
    onPrintRequested: PrintRequestedEvent
  ): TypeofprinterProvider = {
    val __obj = js.Dynamic.literal(onGetCapabilityRequested = onGetCapabilityRequested.asInstanceOf[js.Any], onGetPrintersRequested = onGetPrintersRequested.asInstanceOf[js.Any], onGetUsbPrinterInfoRequested = onGetUsbPrinterInfoRequested.asInstanceOf[js.Any], onPrintRequested = onPrintRequested.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofprinterProvider]
  }
}

