package typings.microsoftteams.microsoftTeams.remoteCamera

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  *
  * Data structure to indicate the current state of the device.
  */
trait DeviceState extends StObject {
  
  /**
    * All operation are available to apply.
    */
  var available: Boolean
  
  /**
    * Either camera doesnt support to get state or It unable to apply command.
    */
  var error: Boolean
  
  /**
    * PanLeft reached max left.
    */
  var panLeft: Boolean
  
  /**
    * PanRight reached max right.
    */
  var panRight: Boolean
  
  /**
    * Reset max out or already applied. Client Disable Reset.
    */
  var reset: Boolean
  
  /**
    * TiltDown reached bottom.
    */
  var tiltDown: Boolean
  
  /**
    * TiltUp reached top.
    */
  var tiltUp: Boolean
  
  /**
    * ZoomIn maxed out.
    */
  var zoomIn: Boolean
  
  /**
    * ZoomOut maxed out.
    */
  var zoomOut: Boolean
}
object DeviceState {
  
  inline def apply(
    available: Boolean,
    error: Boolean,
    panLeft: Boolean,
    panRight: Boolean,
    reset: Boolean,
    tiltDown: Boolean,
    tiltUp: Boolean,
    zoomIn: Boolean,
    zoomOut: Boolean
  ): DeviceState = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], panLeft = panLeft.asInstanceOf[js.Any], panRight = panRight.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], tiltDown = tiltDown.asInstanceOf[js.Any], tiltUp = tiltUp.asInstanceOf[js.Any], zoomIn = zoomIn.asInstanceOf[js.Any], zoomOut = zoomOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceState]
  }
  
  extension [Self <: DeviceState](x: Self) {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPanLeft(value: Boolean): Self = StObject.set(x, "panLeft", value.asInstanceOf[js.Any])
    
    inline def setPanRight(value: Boolean): Self = StObject.set(x, "panRight", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setTiltDown(value: Boolean): Self = StObject.set(x, "tiltDown", value.asInstanceOf[js.Any])
    
    inline def setTiltUp(value: Boolean): Self = StObject.set(x, "tiltUp", value.asInstanceOf[js.Any])
    
    inline def setZoomIn(value: Boolean): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
    
    inline def setZoomOut(value: Boolean): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
  }
}
