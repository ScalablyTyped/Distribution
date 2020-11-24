package typings.openseadragon.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "fullScreenApi")
@js.native
object fullScreenApi extends js.Object {
  
  def cancelFullScreen(): Unit = js.native
  
  def exitFullScreen(): Unit = js.native
  
  var fullScreenErrorEventName: String = js.native
  
  var fullScreenEventName: String = js.native
  
  def getFullScreenElement(): HTMLElement = js.native
  
  def isFullScreen(): Boolean = js.native
  
  def requestFullScreen(): Unit = js.native
  
  var supportsFullScreen: Boolean = js.native
}
