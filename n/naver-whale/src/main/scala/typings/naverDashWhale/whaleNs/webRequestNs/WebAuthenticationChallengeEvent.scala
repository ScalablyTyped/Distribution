package typings.naverDashWhale.whaleNs.webRequestNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebAuthenticationChallengeEvent
  extends Event[
      js.Function2[
        /* details */ typings.chrome.chromeNs.webRequestNs.WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[
          js.Function1[/* response */ typings.chrome.chromeNs.webRequestNs.BlockingResponse, Unit]
        ], 
        Unit
      ]
    ] {
  def addListener(
    callback: js.Function2[
      /* details */ typings.chrome.chromeNs.webRequestNs.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typings.chrome.chromeNs.webRequestNs.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typings.chrome.chromeNs.webRequestNs.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ typings.chrome.chromeNs.webRequestNs.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typings.chrome.chromeNs.webRequestNs.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typings.chrome.chromeNs.webRequestNs.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

