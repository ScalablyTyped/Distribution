package typings.openseadragon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenApi {
  
  @JSImport("openseadragon", "fullScreenApi")
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancelFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelFullScreen")().asInstanceOf[Unit]
  
  inline def exitFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitFullScreen")().asInstanceOf[Unit]
  
  @JSImport("openseadragon", "fullScreenApi.fullScreenErrorEventName")
  @js.native
  def fullScreenErrorEventName: String = js.native
  inline def fullScreenErrorEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenErrorEventName")(x.asInstanceOf[js.Any])
  
  @JSImport("openseadragon", "fullScreenApi.fullScreenEventName")
  @js.native
  def fullScreenEventName: String = js.native
  inline def fullScreenEventName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenEventName")(x.asInstanceOf[js.Any])
  
  inline def getFullScreenElement(): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullScreenElement")().asInstanceOf[HTMLElement]
  
  inline def isFullScreen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullScreen")().asInstanceOf[Boolean]
  
  inline def requestFullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFullScreen")().asInstanceOf[Unit]
  
  @JSImport("openseadragon", "fullScreenApi.supportsFullScreen")
  @js.native
  def supportsFullScreen: Boolean = js.native
  inline def supportsFullScreen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsFullScreen")(x.asInstanceOf[js.Any])
}
