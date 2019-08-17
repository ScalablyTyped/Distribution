package typings.naverDashWhale.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object printerProviderNs {
  import typings.chrome.chromeNs.eventsNs.Event

  type CapabilityRequestedEvent = Event[
    js.Function2[
      /* printerId */ String, 
      /* resultCallback */ js.Function1[
        /* capabilities */ typings.chrome.chromeNs.printerProviderNs.PrinterCapabilities, 
        Unit
      ], 
      Unit
    ]
  ]
  type PrintRequestedEvent = Event[
    js.Function2[
      /* printJob */ typings.chrome.chromeNs.printerProviderNs.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ]
  type PrinterInfoRequestedEvent = Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[typings.chrome.chromeNs.printerProviderNs.PrinterInfo], 
        Unit
      ], 
      Unit
    ]
  ]
  type PrinterRequestedEvent = Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[typings.chrome.chromeNs.printerProviderNs.PrinterInfo], 
        Unit
      ], 
      Unit
    ]
  ]
}
