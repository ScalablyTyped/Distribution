package typings.novncNovnc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@novnc/novnc/core/util/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@novnc/novnc/core/util/browser", "dragThreshold")
  @js.native
  def dragThreshold: Double = js.native
  inline def dragThreshold_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragThreshold")(x.asInstanceOf[js.Any])
  
  @JSImport("@novnc/novnc/core/util/browser", "hasScrollbarGutter")
  @js.native
  val hasScrollbarGutter: Boolean = js.native
  
  inline def isFirefox(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirefox")().asInstanceOf[Boolean]
  
  inline def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  inline def isMac(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")().asInstanceOf[Boolean]
  
  inline def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
  
  @JSImport("@novnc/novnc/core/util/browser", "isTouchDevice")
  @js.native
  def isTouchDevice: Boolean = js.native
  inline def isTouchDevice_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isTouchDevice")(x.asInstanceOf[js.Any])
  
  inline def isWindows(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWindows")().asInstanceOf[Boolean]
  
  @JSImport("@novnc/novnc/core/util/browser", "supportsCursorURIs")
  @js.native
  val supportsCursorURIs: Boolean = js.native
}
