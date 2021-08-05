package typings.openfin

import typings.openfin.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monitorMod {
  
  trait DipRect
    extends StObject
       with Rect {
    
    var dipRect: Rect
    
    var scaledRect: Rect
  }
  object DipRect {
    
    inline def apply(bottom: Double, dipRect: Rect, left: Double, right: Double, scaledRect: Rect, top: Double): DipRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dipRect = dipRect.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[DipRect]
    }
    
    extension [Self <: DipRect](x: Self) {
      
      inline def setDipRect(value: Rect): Self = StObject.set(x, "dipRect", value.asInstanceOf[js.Any])
      
      inline def setScaledRect(value: Rect): Self = StObject.set(x, "scaledRect", value.asInstanceOf[js.Any])
    }
  }
  
  trait DipScaleRects extends StObject {
    
    var dipRect: Rect
    
    var scaledRect: Rect
  }
  object DipScaleRects {
    
    inline def apply(dipRect: Rect, scaledRect: Rect): DipScaleRects = {
      val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[DipScaleRects]
    }
    
    extension [Self <: DipScaleRects](x: Self) {
      
      inline def setDipRect(value: Rect): Self = StObject.set(x, "dipRect", value.asInstanceOf[js.Any])
      
      inline def setScaledRect(value: Rect): Self = StObject.set(x, "scaledRect", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonitorDetails extends StObject {
    
    var available: DipScaleRects
    
    var availableRect: Rect
    
    var deviceId: String
    
    var deviceScaleFactor: Double
    
    var displayDeviceActive: Boolean
    
    var dpi: Point
    
    var monitor: DipScaleRects
    
    var monitorRect: Rect
    
    var name: String
  }
  object MonitorDetails {
    
    inline def apply(
      available: DipScaleRects,
      availableRect: Rect,
      deviceId: String,
      deviceScaleFactor: Double,
      displayDeviceActive: Boolean,
      dpi: Point,
      monitor: DipScaleRects,
      monitorRect: Rect,
      name: String
    ): MonitorDetails = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], availableRect = availableRect.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], displayDeviceActive = displayDeviceActive.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], monitorRect = monitorRect.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonitorDetails]
    }
    
    extension [Self <: MonitorDetails](x: Self) {
      
      inline def setAvailable(value: DipScaleRects): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setAvailableRect(value: Rect): Self = StObject.set(x, "availableRect", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setDisplayDeviceActive(value: Boolean): Self = StObject.set(x, "displayDeviceActive", value.asInstanceOf[js.Any])
      
      inline def setDpi(value: Point): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      inline def setMonitor(value: DipScaleRects): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setMonitorRect(value: Rect): Self = StObject.set(x, "monitorRect", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonitorInfo extends StObject {
    
    var deviceScaleFactor: Double
    
    var dpi: Point
    
    var nonPrimaryMonitors: js.Array[MonitorDetails]
    
    var primaryMonitor: MonitorDetails
    
    var reason: String
    
    var taskBar: TaskBar
    
    var virtualScreen: DipRect
  }
  object MonitorInfo {
    
    inline def apply(
      deviceScaleFactor: Double,
      dpi: Point,
      nonPrimaryMonitors: js.Array[MonitorDetails],
      primaryMonitor: MonitorDetails,
      reason: String,
      taskBar: TaskBar,
      virtualScreen: DipRect
    ): MonitorInfo = {
      val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], dpi = dpi.asInstanceOf[js.Any], nonPrimaryMonitors = nonPrimaryMonitors.asInstanceOf[js.Any], primaryMonitor = primaryMonitor.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], taskBar = taskBar.asInstanceOf[js.Any], virtualScreen = virtualScreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonitorInfo]
    }
    
    extension [Self <: MonitorInfo](x: Self) {
      
      inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setDpi(value: Point): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      inline def setNonPrimaryMonitors(value: js.Array[MonitorDetails]): Self = StObject.set(x, "nonPrimaryMonitors", value.asInstanceOf[js.Any])
      
      inline def setNonPrimaryMonitorsVarargs(value: MonitorDetails*): Self = StObject.set(x, "nonPrimaryMonitors", js.Array(value :_*))
      
      inline def setPrimaryMonitor(value: MonitorDetails): Self = StObject.set(x, "primaryMonitor", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setTaskBar(value: TaskBar): Self = StObject.set(x, "taskBar", value.asInstanceOf[js.Any])
      
      inline def setVirtualScreen(value: DipRect): Self = StObject.set(x, "virtualScreen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Rect {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskBar
    extends StObject
       with DipScaleRects {
    
    var edge: String
    
    var rect: Rect
  }
  object TaskBar {
    
    inline def apply(dipRect: Rect, edge: String, rect: Rect, scaledRect: Rect): TaskBar = {
      val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskBar]
    }
    
    extension [Self <: TaskBar](x: Self) {
      
      inline def setEdge(value: String): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
}
