package typings.mraid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MRAIDEventHandlers extends StObject {
  
  def adAction(action: /* keyof mraid.mraid.MRAID */ String): Unit = js.native
  
  def audioVolumeChange(newPercentage: Double): Unit = js.native
  
  // MRAID 1.0
  def error(message: String, action: /* keyof mraid.mraid.MRAID */ String): Unit = js.native
  
  // MRAID 3.0
  def exposureChange(exposedPercentage: Double, visibleRectangle: MRAIDRect): Unit = js.native
  def exposureChange(exposedPercentage: Double, visibleRectangle: MRAIDRect, occlusionRectangles: js.Array[MRAIDRect]): Unit = js.native
  
  def ready(): Unit = js.native
  
  // MRAID 2.0
  def sizeChange(width: Double, height: Double): Unit = js.native
  
  def stateChange(state: MRAIDState): Unit = js.native
  
  // Deprecated in MRAID 3.0; may no longer be dispatched by 3.0 SDKs when exposure changes
  def viewableChange(isViewable: Boolean): Unit = js.native
}
