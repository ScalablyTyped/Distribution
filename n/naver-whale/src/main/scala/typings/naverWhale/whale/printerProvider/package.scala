package typings.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object printerProvider {
  type CapabilityRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* printerId */ java.lang.String, 
      /* resultCallback */ js.Function1[
        /* capabilities */ typings.chrome.chrome.printerProvider.PrinterCapabilities, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrintRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* printJob */ typings.chrome.chrome.printerProvider.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type PrinterInfoRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[typings.chrome.chrome.printerProvider.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrinterRequestedEvent = typings.chrome.chrome.events.Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[typings.chrome.chrome.printerProvider.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
}
