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
    
    @scala.inline
    def apply(bottom: Double, dipRect: Rect, left: Double, right: Double, scaledRect: Rect, top: Double): DipRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], dipRect = dipRect.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[DipRect]
    }
    
    @scala.inline
    implicit class DipRectMutableBuilder[Self <: DipRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDipRect(value: Rect): Self = StObject.set(x, "dipRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaledRect(value: Rect): Self = StObject.set(x, "scaledRect", value.asInstanceOf[js.Any])
    }
  }
  
  trait DipScaleRects extends StObject {
    
    var dipRect: Rect
    
    var scaledRect: Rect
  }
  object DipScaleRects {
    
    @scala.inline
    def apply(dipRect: Rect, scaledRect: Rect): DipScaleRects = {
      val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[DipScaleRects]
    }
    
    @scala.inline
    implicit class DipScaleRectsMutableBuilder[Self <: DipScaleRects] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDipRect(value: Rect): Self = StObject.set(x, "dipRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaledRect(value: Rect): Self = StObject.set(x, "scaledRect", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MonitorDetailsMutableBuilder[Self <: MonitorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable(value: DipScaleRects): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailableRect(value: Rect): Self = StObject.set(x, "availableRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayDeviceActive(value: Boolean): Self = StObject.set(x, "displayDeviceActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpi(value: Point): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitor(value: DipScaleRects): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonitorRect(value: Rect): Self = StObject.set(x, "monitorRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class MonitorInfoMutableBuilder[Self <: MonitorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpi(value: Point): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPrimaryMonitors(value: js.Array[MonitorDetails]): Self = StObject.set(x, "nonPrimaryMonitors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonPrimaryMonitorsVarargs(value: MonitorDetails*): Self = StObject.set(x, "nonPrimaryMonitors", js.Array(value :_*))
      
      @scala.inline
      def setPrimaryMonitor(value: MonitorDetails): Self = StObject.set(x, "primaryMonitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskBar(value: TaskBar): Self = StObject.set(x, "taskBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualScreen(value: DipRect): Self = StObject.set(x, "virtualScreen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Rect {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Rect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskBar
    extends StObject
       with DipScaleRects {
    
    var edge: String
    
    var rect: Rect
  }
  object TaskBar {
    
    @scala.inline
    def apply(dipRect: Rect, edge: String, rect: Rect, scaledRect: Rect): TaskBar = {
      val __obj = js.Dynamic.literal(dipRect = dipRect.asInstanceOf[js.Any], edge = edge.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], scaledRect = scaledRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskBar]
    }
    
    @scala.inline
    implicit class TaskBarMutableBuilder[Self <: TaskBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdge(value: String): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    }
  }
}
