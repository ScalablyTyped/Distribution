package typings.playable.rootContainerTypesMod

import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRootContainerViewCallbacks extends js.Object {
  
  def onMouseEnter(evt: Event): Unit = js.native
  @JSName("onMouseEnter")
  var onMouseEnter_Original: EventListener = js.native
  
  def onMouseLeave(evt: Event): Unit = js.native
  @JSName("onMouseLeave")
  var onMouseLeave_Original: EventListener = js.native
  
  def onMouseMove(evt: Event): Unit = js.native
  @JSName("onMouseMove")
  var onMouseMove_Original: EventListener = js.native
}
