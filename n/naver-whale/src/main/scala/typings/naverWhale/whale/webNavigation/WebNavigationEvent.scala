package typings.naverWhale.whale.webNavigation

import typings.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebNavigationEvent[T /* <: typings.chrome.chrome.webNavigation.WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filters: typings.chrome.chrome.webNavigation.WebNavigationEventFilter
  ): Unit = js.native
}
