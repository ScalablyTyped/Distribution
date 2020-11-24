package typings.phoenixLiveView.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewHookInterface extends js.Object {
  
  var beforeDestroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  var beforeUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  
  var destroyed: js.UndefOr[js.Function0[Unit]] = js.native
  
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var el: HTMLElement = js.native
  
  def handleEvent(event: String, callback: js.Function1[/* payload */ js.Object, Unit]): Unit = js.native
  
  // callbacks
  var mounted: js.UndefOr[js.Function0[Unit]] = js.native
  
  def pushEvent(event: String, payload: js.Object): Unit = js.native
  def pushEvent(event: String, payload: js.Object, onReply: js.Function2[/* reply */ js.Any, /* ref */ Double, _]): Unit = js.native
  
  def pushEventTo(selectorOrTarget: js.Any, event: String, payload: js.Object): Unit = js.native
  def pushEventTo(
    selectorOrTarget: js.Any,
    event: String,
    payload: js.Object,
    onReply: js.Function2[/* reply */ js.Any, /* ref */ Double, _]
  ): Unit = js.native
  
  var reconnected: js.UndefOr[js.Function0[Unit]] = js.native
  
  var updated: js.UndefOr[js.Function0[Unit]] = js.native
  
  var viewName: String = js.native
}
