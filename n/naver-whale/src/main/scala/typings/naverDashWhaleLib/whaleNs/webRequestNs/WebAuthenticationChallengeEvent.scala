package typings
package naverDashWhaleLib.whaleNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthenticationChallengeEvent
  extends chromeLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* details */ chromeLib.chromeNs.webRequestNs.WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[
          js.Function1[/* response */ chromeLib.chromeNs.webRequestNs.BlockingResponse, scala.Unit]
        ], 
        scala.Unit
      ]
    ] {
  def addListener(
    callback: js.Function2[
      /* details */ chromeLib.chromeNs.webRequestNs.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ chromeLib.chromeNs.webRequestNs.BlockingResponse, scala.Unit]
      ], 
      scala.Unit
    ],
    filter: chromeLib.chromeNs.webRequestNs.RequestFilter
  ): scala.Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ chromeLib.chromeNs.webRequestNs.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ chromeLib.chromeNs.webRequestNs.BlockingResponse, scala.Unit]
      ], 
      scala.Unit
    ],
    filter: chromeLib.chromeNs.webRequestNs.RequestFilter,
    opt_extraInfoSpec: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

