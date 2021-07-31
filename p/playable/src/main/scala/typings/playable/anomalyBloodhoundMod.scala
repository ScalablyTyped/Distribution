package typings.playable

import typings.playable.anomalyBloodhoundTypesMod.IReportReasons
import typings.playable.anomalyBloodhoundTypesMod.IReportType
import typings.playable.anomalyBloodhoundTypesMod.IReportTypes
import typings.playable.anon.EndTS
import typings.playable.anon.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anomalyBloodhoundMod {
  
  @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with AnomalyBloodhound {
    def this(hasEngineEventEmitter: Engine) = this()
    
    /* CompleteClass */
    var _bindEvents: js.Any = js.native
    
    /* CompleteClass */
    var _callback: js.Any = js.native
    
    /* CompleteClass */
    var _engine: js.Any = js.native
    
    /* CompleteClass */
    var _eventEmitter: js.Any = js.native
    
    /* CompleteClass */
    var _processStateChange: js.Any = js.native
    
    /* CompleteClass */
    var _timeoutMap: js.Any = js.native
    
    /* CompleteClass */
    var _unbindEvents: js.Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def isDelayedReportExist(`type`: IReportType): Boolean = js.native
    
    /* CompleteClass */
    override def reportDebugInfo(hasReasonStartTSEndTS: EndTS): Unit = js.native
    
    /* CompleteClass */
    override def setAnomalyCallback(callback: js.Function1[/* anomalyData */ js.Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def startDelayedReport(`type`: IReportType, reason: String): Unit = js.native
    
    /* CompleteClass */
    override def stopAllDelayedReports(): Unit = js.native
    
    /* CompleteClass */
    override def stopDelayedReport(`type`: IReportType): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "default.dependencies")
    @js.native
    def dependencies: js.Array[String] = js.native
    @scala.inline
    def dependencies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dependencies")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "default.moduleName")
    @js.native
    def moduleName: String = js.native
    @scala.inline
    def moduleName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "DELAYED_REPORT_TYPES")
  @js.native
  val DELAYED_REPORT_TYPES: IReportTypes = js.native
  
  @JSImport("playable/dist/src/modules/anomaly-bloodhound/anomaly-bloodhound", "REPORT_REASONS")
  @js.native
  val REPORT_REASONS: IReportReasons = js.native
  
  trait AnomalyBloodhound extends StObject {
    
    var _bindEvents: js.Any
    
    var _callback: js.Any
    
    var _engine: js.Any
    
    var _eventEmitter: js.Any
    
    var _processStateChange: js.Any
    
    var _timeoutMap: js.Any
    
    var _unbindEvents: js.Any
    
    def destroy(): Unit
    
    def isDelayedReportExist(`type`: IReportType): Boolean
    
    def reportDebugInfo(hasReasonStartTSEndTS: EndTS): Unit
    
    def setAnomalyCallback(callback: js.Function1[/* anomalyData */ js.Any, Unit]): Unit
    
    def startDelayedReport(`type`: IReportType, reason: String): Unit
    
    def stopAllDelayedReports(): Unit
    
    def stopDelayedReport(`type`: IReportType): Unit
  }
  object AnomalyBloodhound {
    
    @scala.inline
    def apply(
      _bindEvents: js.Any,
      _callback: js.Any,
      _engine: js.Any,
      _eventEmitter: js.Any,
      _processStateChange: js.Any,
      _timeoutMap: js.Any,
      _unbindEvents: js.Any,
      destroy: () => Unit,
      isDelayedReportExist: IReportType => Boolean,
      reportDebugInfo: EndTS => Unit,
      setAnomalyCallback: js.Function1[/* anomalyData */ js.Any, Unit] => Unit,
      startDelayedReport: (IReportType, String) => Unit,
      stopAllDelayedReports: () => Unit,
      stopDelayedReport: IReportType => Unit
    ): AnomalyBloodhound = {
      val __obj = js.Dynamic.literal(_bindEvents = _bindEvents.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _eventEmitter = _eventEmitter.asInstanceOf[js.Any], _processStateChange = _processStateChange.asInstanceOf[js.Any], _timeoutMap = _timeoutMap.asInstanceOf[js.Any], _unbindEvents = _unbindEvents.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isDelayedReportExist = js.Any.fromFunction1(isDelayedReportExist), reportDebugInfo = js.Any.fromFunction1(reportDebugInfo), setAnomalyCallback = js.Any.fromFunction1(setAnomalyCallback), startDelayedReport = js.Any.fromFunction2(startDelayedReport), stopAllDelayedReports = js.Any.fromFunction0(stopAllDelayedReports), stopDelayedReport = js.Any.fromFunction1(stopDelayedReport))
      __obj.asInstanceOf[AnomalyBloodhound]
    }
    
    @scala.inline
    implicit class AnomalyBloodhoundMutableBuilder[Self <: AnomalyBloodhound] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsDelayedReportExist(value: IReportType => Boolean): Self = StObject.set(x, "isDelayedReportExist", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportDebugInfo(value: EndTS => Unit): Self = StObject.set(x, "reportDebugInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetAnomalyCallback(value: js.Function1[/* anomalyData */ js.Any, Unit] => Unit): Self = StObject.set(x, "setAnomalyCallback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartDelayedReport(value: (IReportType, String) => Unit): Self = StObject.set(x, "startDelayedReport", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStopAllDelayedReports(value: () => Unit): Self = StObject.set(x, "stopAllDelayedReports", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopDelayedReport(value: IReportType => Unit): Self = StObject.set(x, "stopDelayedReport", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_bindEvents(value: js.Any): Self = StObject.set(x, "_bindEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_callback(value: js.Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_engine(value: js.Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_eventEmitter(value: js.Any): Self = StObject.set(x, "_eventEmitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_processStateChange(value: js.Any): Self = StObject.set(x, "_processStateChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_timeoutMap(value: js.Any): Self = StObject.set(x, "_timeoutMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_unbindEvents(value: js.Any): Self = StObject.set(x, "_unbindEvents", value.asInstanceOf[js.Any])
    }
  }
}
