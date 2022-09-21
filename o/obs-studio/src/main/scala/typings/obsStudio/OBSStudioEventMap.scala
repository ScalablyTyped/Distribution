package typings.obsStudio

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OBSStudioEventMap extends StObject {
  
  var obsExit: CustomEvent[Null]
  
  var obsRecordingPaused: CustomEvent[Null]
  
  var obsRecordingStarted: CustomEvent[Null]
  
  var obsRecordingStarting: CustomEvent[Null]
  
  var obsRecordingStopped: CustomEvent[Null]
  
  var obsRecordingStopping: CustomEvent[Null]
  
  var obsRecordingUnpaused: CustomEvent[Null]
  
  var obsReplaybufferSaved: CustomEvent[Null]
  
  var obsReplaybufferStarted: CustomEvent[Null]
  
  var obsReplaybufferStarting: CustomEvent[Null]
  
  var obsReplaybufferStopped: CustomEvent[Null]
  
  var obsReplaybufferStopping: CustomEvent[Null]
  
  var obsSceneChanged: CustomEvent[OBSSceneInfo]
  
  var obsSourceActiveChanged: CustomEvent[ActiveInfo]
  
  var obsSourceVisibleChanged: CustomEvent[VisibleInfo]
  
  var obsStreamingStarted: CustomEvent[Null]
  
  var obsStreamingStarting: CustomEvent[Null]
  
  var obsStreamingStopped: CustomEvent[Null]
  
  var obsStreamingStopping: CustomEvent[Null]
  
  var obsVirtualcamStarted: CustomEvent[Null]
  
  var obsVirtualcamStopped: CustomEvent[Null]
}
object OBSStudioEventMap {
  
  inline def apply(
    obsExit: CustomEvent[Null],
    obsRecordingPaused: CustomEvent[Null],
    obsRecordingStarted: CustomEvent[Null],
    obsRecordingStarting: CustomEvent[Null],
    obsRecordingStopped: CustomEvent[Null],
    obsRecordingStopping: CustomEvent[Null],
    obsRecordingUnpaused: CustomEvent[Null],
    obsReplaybufferSaved: CustomEvent[Null],
    obsReplaybufferStarted: CustomEvent[Null],
    obsReplaybufferStarting: CustomEvent[Null],
    obsReplaybufferStopped: CustomEvent[Null],
    obsReplaybufferStopping: CustomEvent[Null],
    obsSceneChanged: CustomEvent[OBSSceneInfo],
    obsSourceActiveChanged: CustomEvent[ActiveInfo],
    obsSourceVisibleChanged: CustomEvent[VisibleInfo],
    obsStreamingStarted: CustomEvent[Null],
    obsStreamingStarting: CustomEvent[Null],
    obsStreamingStopped: CustomEvent[Null],
    obsStreamingStopping: CustomEvent[Null],
    obsVirtualcamStarted: CustomEvent[Null],
    obsVirtualcamStopped: CustomEvent[Null]
  ): OBSStudioEventMap = {
    val __obj = js.Dynamic.literal(obsExit = obsExit.asInstanceOf[js.Any], obsRecordingPaused = obsRecordingPaused.asInstanceOf[js.Any], obsRecordingStarted = obsRecordingStarted.asInstanceOf[js.Any], obsRecordingStarting = obsRecordingStarting.asInstanceOf[js.Any], obsRecordingStopped = obsRecordingStopped.asInstanceOf[js.Any], obsRecordingStopping = obsRecordingStopping.asInstanceOf[js.Any], obsRecordingUnpaused = obsRecordingUnpaused.asInstanceOf[js.Any], obsReplaybufferSaved = obsReplaybufferSaved.asInstanceOf[js.Any], obsReplaybufferStarted = obsReplaybufferStarted.asInstanceOf[js.Any], obsReplaybufferStarting = obsReplaybufferStarting.asInstanceOf[js.Any], obsReplaybufferStopped = obsReplaybufferStopped.asInstanceOf[js.Any], obsReplaybufferStopping = obsReplaybufferStopping.asInstanceOf[js.Any], obsSceneChanged = obsSceneChanged.asInstanceOf[js.Any], obsSourceActiveChanged = obsSourceActiveChanged.asInstanceOf[js.Any], obsSourceVisibleChanged = obsSourceVisibleChanged.asInstanceOf[js.Any], obsStreamingStarted = obsStreamingStarted.asInstanceOf[js.Any], obsStreamingStarting = obsStreamingStarting.asInstanceOf[js.Any], obsStreamingStopped = obsStreamingStopped.asInstanceOf[js.Any], obsStreamingStopping = obsStreamingStopping.asInstanceOf[js.Any], obsVirtualcamStarted = obsVirtualcamStarted.asInstanceOf[js.Any], obsVirtualcamStopped = obsVirtualcamStopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[OBSStudioEventMap]
  }
  
  extension [Self <: OBSStudioEventMap](x: Self) {
    
    inline def setObsExit(value: CustomEvent[Null]): Self = StObject.set(x, "obsExit", value.asInstanceOf[js.Any])
    
    inline def setObsRecordingPaused(value: CustomEvent[Null]): Self = StObject.set(x, "obsRecordingPaused", value.asInstanceOf[js.Any])
    
    inline def setObsRecordingStarted(value: CustomEvent[Null]): Self = StObject.set(x, "obsRecordingStarted", value.asInstanceOf[js.Any])
    
    inline def setObsRecordingStarting(value: CustomEvent[Null]): Self = StObject.set(x, "obsRecordingStarting", value.asInstanceOf[js.Any])
    
    inline def setObsRecordingStopped(value: CustomEvent[Null]): Self = StObject.set(x, "obsRecordingStopped", value.asInstanceOf[js.Any])
    
    inline def setObsRecordingStopping(value: CustomEvent[Null]): Self = StObject.set(x, "obsRecordingStopping", value.asInstanceOf[js.Any])
    
    inline def setObsRecordingUnpaused(value: CustomEvent[Null]): Self = StObject.set(x, "obsRecordingUnpaused", value.asInstanceOf[js.Any])
    
    inline def setObsReplaybufferSaved(value: CustomEvent[Null]): Self = StObject.set(x, "obsReplaybufferSaved", value.asInstanceOf[js.Any])
    
    inline def setObsReplaybufferStarted(value: CustomEvent[Null]): Self = StObject.set(x, "obsReplaybufferStarted", value.asInstanceOf[js.Any])
    
    inline def setObsReplaybufferStarting(value: CustomEvent[Null]): Self = StObject.set(x, "obsReplaybufferStarting", value.asInstanceOf[js.Any])
    
    inline def setObsReplaybufferStopped(value: CustomEvent[Null]): Self = StObject.set(x, "obsReplaybufferStopped", value.asInstanceOf[js.Any])
    
    inline def setObsReplaybufferStopping(value: CustomEvent[Null]): Self = StObject.set(x, "obsReplaybufferStopping", value.asInstanceOf[js.Any])
    
    inline def setObsSceneChanged(value: CustomEvent[OBSSceneInfo]): Self = StObject.set(x, "obsSceneChanged", value.asInstanceOf[js.Any])
    
    inline def setObsSourceActiveChanged(value: CustomEvent[ActiveInfo]): Self = StObject.set(x, "obsSourceActiveChanged", value.asInstanceOf[js.Any])
    
    inline def setObsSourceVisibleChanged(value: CustomEvent[VisibleInfo]): Self = StObject.set(x, "obsSourceVisibleChanged", value.asInstanceOf[js.Any])
    
    inline def setObsStreamingStarted(value: CustomEvent[Null]): Self = StObject.set(x, "obsStreamingStarted", value.asInstanceOf[js.Any])
    
    inline def setObsStreamingStarting(value: CustomEvent[Null]): Self = StObject.set(x, "obsStreamingStarting", value.asInstanceOf[js.Any])
    
    inline def setObsStreamingStopped(value: CustomEvent[Null]): Self = StObject.set(x, "obsStreamingStopped", value.asInstanceOf[js.Any])
    
    inline def setObsStreamingStopping(value: CustomEvent[Null]): Self = StObject.set(x, "obsStreamingStopping", value.asInstanceOf[js.Any])
    
    inline def setObsVirtualcamStarted(value: CustomEvent[Null]): Self = StObject.set(x, "obsVirtualcamStarted", value.asInstanceOf[js.Any])
    
    inline def setObsVirtualcamStopped(value: CustomEvent[Null]): Self = StObject.set(x, "obsVirtualcamStopped", value.asInstanceOf[js.Any])
  }
}
