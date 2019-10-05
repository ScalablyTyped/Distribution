package typings.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object printerProvider {
  import typings.chrome.chrome.events.Event

  type CapabilityRequestedEvent = Event[
    js.Function2[
      /* printerId */ String, 
      /* resultCallback */ js.Function1[/* capabilities */ typings.chrome.chrome.printerProvider.PrinterCapabilities, Unit], 
      Unit
    ]
  ]
  type PrintRequestedEvent = Event[
    js.Function2[
      /* printJob */ typings.chrome.chrome.printerProvider.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ String, Unit], 
      Unit
    ]
  ]
  type PrinterInfoRequestedEvent = Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[typings.chrome.chrome.printerProvider.PrinterInfo], 
        Unit
      ], 
      Unit
    ]
  ]
  type PrinterRequestedEvent = Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[typings.chrome.chrome.printerProvider.PrinterInfo], 
        Unit
      ], 
      Unit
    ]
  ]
}
