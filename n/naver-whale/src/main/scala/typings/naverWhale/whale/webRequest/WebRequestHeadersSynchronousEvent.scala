package typings.naverWhale.whale.webRequest

import typings.chrome.chrome.events.EventWithRequiredFilterInAddListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestHeadersSynchronousEvent
  extends StObject
     with EventWithRequiredFilterInAddListener[
      js.Function1[
        /* details */ typings.chrome.chrome.webRequest.WebRequestHeadersDetails, 
        typings.chrome.chrome.webRequest.BlockingResponse | Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function1[
      /* details */ typings.chrome.chrome.webRequest.WebRequestHeadersDetails, 
      typings.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typings.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
