package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.mode
  */
trait Mode extends StObject {
  
  /**
    * Height in pixels allocated to the control. If it's -1, then there is no limit on height
    */
  var allocatedHeight: Double
  
  /**
    * Width in pixels allocated to the control.
    */
  var allocatedWidth: Double
  
  /**
    * Is the control in 'Read-only' mode.
    */
  var isControlDisabled: Boolean
  
  /**
    * Is the control in 'Visible' mode.
    */
  var isVisible: Boolean
  
  /**
    * The defined control label
    */
  var label: String
  
  /**
    * set control state so that it will be stored in one session
    */
  def setControlState(state: Dictionary): Boolean
  
  /**
    * Make the control full screen.
    * @param value True if control needs to autosize to full screen. False if control needs to autosize to allocated width.
    */
  def setFullScreen(value: Boolean): Unit
  
  /**
    * API to determine container sizing if control needs to react. Control will get allocatedWidth/allocatedHeight if input is 'true'
    * @param value True if controls needs to track container size, control will get allocatedWidth/allocatedHeight
    */
  def trackContainerResize(value: Boolean): Unit
}
object Mode {
  
  inline def apply(
    allocatedHeight: Double,
    allocatedWidth: Double,
    isControlDisabled: Boolean,
    isVisible: Boolean,
    label: String,
    setControlState: Dictionary => Boolean,
    setFullScreen: Boolean => Unit,
    trackContainerResize: Boolean => Unit
  ): Mode = {
    val __obj = js.Dynamic.literal(allocatedHeight = allocatedHeight.asInstanceOf[js.Any], allocatedWidth = allocatedWidth.asInstanceOf[js.Any], isControlDisabled = isControlDisabled.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], setControlState = js.Any.fromFunction1(setControlState), setFullScreen = js.Any.fromFunction1(setFullScreen), trackContainerResize = js.Any.fromFunction1(trackContainerResize))
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    inline def setAllocatedHeight(value: Double): Self = StObject.set(x, "allocatedHeight", value.asInstanceOf[js.Any])
    
    inline def setAllocatedWidth(value: Double): Self = StObject.set(x, "allocatedWidth", value.asInstanceOf[js.Any])
    
    inline def setIsControlDisabled(value: Boolean): Self = StObject.set(x, "isControlDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setSetControlState(value: Dictionary => Boolean): Self = StObject.set(x, "setControlState", js.Any.fromFunction1(value))
    
    inline def setSetFullScreen(value: Boolean => Unit): Self = StObject.set(x, "setFullScreen", js.Any.fromFunction1(value))
    
    inline def setTrackContainerResize(value: Boolean => Unit): Self = StObject.set(x, "trackContainerResize", js.Any.fromFunction1(value))
  }
}
