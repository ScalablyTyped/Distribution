package typings.openseadragon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenApi {
  
  @JSImport("openseadragon", "fullScreenApi")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("openseadragon", "fullScreenApi.cancelFullScreen")
  @js.native
  def cancelFullScreen(): Unit = js.native
  
  @JSImport("openseadragon", "fullScreenApi.exitFullScreen")
  @js.native
  def exitFullScreen(): Unit = js.native
  
  @JSImport("openseadragon", "fullScreenApi.fullScreenErrorEventName")
  @js.native
  def fullScreenErrorEventName: String = js.native
  @scala.inline
  def fullScreenErrorEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenErrorEventName")(x.asInstanceOf[js.Any])
  
  @JSImport("openseadragon", "fullScreenApi.fullScreenEventName")
  @js.native
  def fullScreenEventName: String = js.native
  @scala.inline
  def fullScreenEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenEventName")(x.asInstanceOf[js.Any])
  
  @JSImport("openseadragon", "fullScreenApi.getFullScreenElement")
  @js.native
  def getFullScreenElement(): HTMLElement = js.native
  
  @JSImport("openseadragon", "fullScreenApi.isFullScreen")
  @js.native
  def isFullScreen(): Boolean = js.native
  
  @JSImport("openseadragon", "fullScreenApi.requestFullScreen")
  @js.native
  def requestFullScreen(): Unit = js.native
  
  @JSImport("openseadragon", "fullScreenApi.supportsFullScreen")
  @js.native
  def supportsFullScreen: Boolean = js.native
  @scala.inline
  def supportsFullScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsFullScreen")(x.asInstanceOf[js.Any])
}
