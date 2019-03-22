package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for the context.mode
	 */
trait Mode extends js.Object {
  /**
  		 * Height in pixels allocated to the control. If it's -1, then there is no limit on height
  		 */
  var allocatedHeight: scala.Double
  /**
  		 * Width in pixels allocated to the control.
  		 */
  var allocatedWidth: scala.Double
  /**
  		 * Is the control in 'Read-only' mode.
  		 */
  var isControlDisabled: scala.Boolean
  /**
  		 * Is the control in 'Visible' mode.
  		 */
  var isVisible: scala.Boolean
  /**
  		 * The defined control label
  		 */
  var label: java.lang.String
  /**
  		 * set control state so that it will be stored in one session
  		 */
  def setControlState(state: Dictionary): scala.Boolean
  /**
  		 * Make the control full screen.
  		 * @param value True if control needs to autosize to full screen. False if control needs to autosize to allocated width.
  		 */
  def setFullScreen(value: scala.Boolean): scala.Unit
  /**
  		 * API to determine container sizing if control needs to react. Control will get allocatedWidth/allocatedHeight if input is 'true'
  		 * @param value True if controls needs to track container size, control will get allocatedWidth/allocatedHeight
  		 */
  def trackContainerResize(value: scala.Boolean): scala.Unit
}

object Mode {
  @scala.inline
  def apply(
    allocatedHeight: scala.Double,
    allocatedWidth: scala.Double,
    isControlDisabled: scala.Boolean,
    isVisible: scala.Boolean,
    label: java.lang.String,
    setControlState: Dictionary => scala.Boolean,
    setFullScreen: scala.Boolean => scala.Unit,
    trackContainerResize: scala.Boolean => scala.Unit
  ): Mode = {
    val __obj = js.Dynamic.literal(allocatedHeight = allocatedHeight, allocatedWidth = allocatedWidth, isControlDisabled = isControlDisabled, isVisible = isVisible, label = label, setControlState = js.Any.fromFunction1(setControlState), setFullScreen = js.Any.fromFunction1(setFullScreen), trackContainerResize = js.Any.fromFunction1(trackContainerResize))
  
    __obj.asInstanceOf[Mode]
  }
}

