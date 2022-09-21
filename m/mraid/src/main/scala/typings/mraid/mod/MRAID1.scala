package typings.mraid.mod

import typings.mraid.anon.PartialMRAIDExpandPropert
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MRAID1
  extends StObject
     with MRAID {
  
  def addEventListener(name: String, eventHandler: MRAIDEventHandlers): Unit = js.native
  
  def close(): Unit = js.native
  
  // For full compatibility, expand should call from inside a touch/mouse/click event handler
  // url deprecated in MRAID 3.0, should still be honoured by SDKS for backwards compatibility
  def expand(): Unit = js.native
  def expand(url: String): Unit = js.native
  
  def getExpandProperties(): MRAIDExpandProperties = js.native
  
  def getPlacementType(): MRAIDPlacementType = js.native
  
  def getState(): MRAIDState = js.native
  
  def getVersion(): MRAIDVersion = js.native
  
  // Deprecated in MRAID 3.0; should still be provided by SDKs for backwards compatibility
  def isViewable(): Boolean = js.native
  
  // For full compatibility, open should be called from inside a DOM interaction event handler
  def open(url: String): Unit = js.native
  
  def playVideo(url: String): Unit = js.native
  
  def removeEventListener(name: String): Unit = js.native
  def removeEventListener(name: String, eventHandler: MRAIDEventHandlers): Unit = js.native
  
  // For full compatibility with all SDKs, clients should shallow copy getExpandProperties result into an empty object, apply changes and then pass into setExpandProperties
  def setExpandProperties(newValues: PartialMRAIDExpandPropert): Unit = js.native
  
  // Deprecated in MRAID 3.0; should still be provided by SDKs for backwards compatibility, but will not be honoured
  def useCustomClose(newValue: Boolean): Unit = js.native
}
