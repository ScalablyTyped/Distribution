package typings.playable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceDetectionMod {
  
  @JSImport("playable/dist/src/utils/device-detection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isAndroid(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAndroid")().asInstanceOf[Boolean]
  
  @scala.inline
  def isDesktopSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDesktopSafari")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIOS(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIOS")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPad(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPad")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPhone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPhone")().asInstanceOf[Boolean]
  
  @scala.inline
  def isIPod(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPod")().asInstanceOf[Boolean]
  
  @scala.inline
  def isSafari(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafari")().asInstanceOf[Boolean]
}
