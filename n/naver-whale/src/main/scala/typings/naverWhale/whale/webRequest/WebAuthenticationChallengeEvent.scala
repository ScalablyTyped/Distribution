package typings.naverWhale.whale.webRequest

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAuthenticationChallengeEvent
  extends StObject
     with Event[
      js.Function2[
        /* details */ typings.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
        /* callback */ js.UndefOr[
          js.Function1[/* response */ typings.chrome.chrome.webRequest.BlockingResponse, Unit]
        ], 
        Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function2[
      /* details */ typings.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typings.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: Unit,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ typings.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typings.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typings.chrome.chrome.webRequest.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function2[
      /* details */ typings.chrome.chrome.webRequest.WebAuthenticationChallengeDetails, 
      /* callback */ js.UndefOr[
        js.Function1[/* response */ typings.chrome.chrome.webRequest.BlockingResponse, Unit]
      ], 
      Unit
    ],
    filter: typings.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
