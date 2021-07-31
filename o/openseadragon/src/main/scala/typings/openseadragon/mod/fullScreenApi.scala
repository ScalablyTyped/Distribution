package typings.openseadragon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenApi {
  
  @JSImport("openseadragon", "fullScreenApi")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cancelFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFullScreen")().asInstanceOf[Unit]
  
  @scala.inline
  def exitFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitFullScreen")().asInstanceOf[Unit]
  
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
  
  @scala.inline
  def getFullScreenElement(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullScreenElement")().asInstanceOf[HTMLElement]
  
  @scala.inline
  def isFullScreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullScreen")().asInstanceOf[Boolean]
  
  @scala.inline
  def requestFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFullScreen")().asInstanceOf[Unit]
  
  @JSImport("openseadragon", "fullScreenApi.supportsFullScreen")
  @js.native
  def supportsFullScreen: Boolean = js.native
  @scala.inline
  def supportsFullScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsFullScreen")(x.asInstanceOf[js.Any])
}
