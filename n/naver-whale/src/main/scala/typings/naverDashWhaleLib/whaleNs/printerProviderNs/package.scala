package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object printerProviderNs {
  type CapabilityRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* printerId */ java.lang.String, 
      /* resultCallback */ js.Function1[
        /* capabilities */ chromeLib.chromeNs.printerProviderNs.PrinterCapabilities, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrintRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* printJob */ chromeLib.chromeNs.printerProviderNs.PrintJob, 
      /* resultCallback */ js.Function1[/* result */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type PrinterInfoRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* device */ js.Any, 
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.UndefOr[chromeLib.chromeNs.printerProviderNs.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type PrinterRequestedEvent = chromeLib.chromeNs.eventsNs.Event[
    js.Function1[
      /* resultCallback */ js.Function1[
        /* printerInfo */ js.Array[chromeLib.chromeNs.printerProviderNs.PrinterInfo], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
}
