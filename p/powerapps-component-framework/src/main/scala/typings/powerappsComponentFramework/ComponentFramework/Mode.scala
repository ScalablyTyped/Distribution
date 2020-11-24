package typings.powerappsComponentFramework.ComponentFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for the context.mode
  */
@js.native
trait Mode extends js.Object {
  
  /**
    * Height in pixels allocated to the control. If it's -1, then there is no limit on height
    */
  var allocatedHeight: Double = js.native
  
  /**
    * Width in pixels allocated to the control.
    */
  var allocatedWidth: Double = js.native
  
  /**
    * Is the control in 'Read-only' mode.
    */
  var isControlDisabled: Boolean = js.native
  
  /**
    * Is the control in 'Visible' mode.
    */
  var isVisible: Boolean = js.native
  
  /**
    * The defined control label
    */
  var label: String = js.native
  
  /**
    * set control state so that it will be stored in one session
    */
  def setControlState(state: Dictionary): Boolean = js.native
  
  /**
    * Make the control full screen.
    * @param value True if control needs to autosize to full screen. False if control needs to autosize to allocated width.
    */
  def setFullScreen(value: Boolean): Unit = js.native
  
  /**
    * API to determine container sizing if control needs to react. Control will get allocatedWidth/allocatedHeight if input is 'true'
    * @param value True if controls needs to track container size, control will get allocatedWidth/allocatedHeight
    */
  def trackContainerResize(value: Boolean): Unit = js.native
}
object Mode {
  
  @scala.inline
  def apply(
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
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocatedHeight(value: Double): Self = this.set("allocatedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedWidth(value: Double): Self = this.set("allocatedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsControlDisabled(value: Boolean): Self = this.set("isControlDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetControlState(value: Dictionary => Boolean): Self = this.set("setControlState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFullScreen(value: Boolean => Unit): Self = this.set("setFullScreen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTrackContainerResize(value: Boolean => Unit): Self = this.set("trackContainerResize", js.Any.fromFunction1(value))
  }
}
