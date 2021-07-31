package typings.naverWhale.whale.webRequest

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestBodyEvent
  extends StObject
     with Event[
      js.Function1[
        /* details */ typings.chrome.chrome.webRequest.WebRequestBodyDetails, 
        typings.chrome.chrome.webRequest.BlockingResponse | Unit
      ]
    ] {
  
  def addListener(
    callback: js.Function1[
      /* details */ typings.chrome.chrome.webRequest.WebRequestBodyDetails, 
      typings.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: Unit,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function1[
      /* details */ typings.chrome.chrome.webRequest.WebRequestBodyDetails, 
      typings.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typings.chrome.chrome.webRequest.RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[
      /* details */ typings.chrome.chrome.webRequest.WebRequestBodyDetails, 
      typings.chrome.chrome.webRequest.BlockingResponse | Unit
    ],
    filter: typings.chrome.chrome.webRequest.RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
