package typings.playable.anomalyBloodhoundMod

import typings.playable.anomalyBloodhoundTypesMod.IReportType
import typings.playable.anon.EndTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnomalyBloodhound extends js.Object {
  
  var _bindEvents: js.Any = js.native
  
  var _callback: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _eventEmitter: js.Any = js.native
  
  var _processStateChange: js.Any = js.native
  
  var _timeoutMap: js.Any = js.native
  
  var _unbindEvents: js.Any = js.native
  
  def destroy(): Unit = js.native
  
  def isDelayedReportExist(`type`: IReportType): Boolean = js.native
  
  def reportDebugInfo(hasReasonStartTSEndTS: EndTS): Unit = js.native
  
  def setAnomalyCallback(callback: js.Function1[/* anomalyData */ js.Any, Unit]): Unit = js.native
  
  def startDelayedReport(`type`: IReportType, reason: String): Unit = js.native
  
  def stopAllDelayedReports(): Unit = js.native
  
  def stopDelayedReport(`type`: IReportType): Unit = js.native
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
  implicit class AnomalyBloodhoundOps[Self <: AnomalyBloodhound] (val x: Self) extends AnyVal {
    
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
    def set_bindEvents(value: js.Any): Self = this.set("_bindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_callback(value: js.Any): Self = this.set("_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_engine(value: js.Any): Self = this.set("_engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_eventEmitter(value: js.Any): Self = this.set("_eventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_processStateChange(value: js.Any): Self = this.set("_processStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_timeoutMap(value: js.Any): Self = this.set("_timeoutMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_unbindEvents(value: js.Any): Self = this.set("_unbindEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsDelayedReportExist(value: IReportType => Boolean): Self = this.set("isDelayedReportExist", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportDebugInfo(value: EndTS => Unit): Self = this.set("reportDebugInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAnomalyCallback(value: js.Function1[/* anomalyData */ js.Any, Unit] => Unit): Self = this.set("setAnomalyCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartDelayedReport(value: (IReportType, String) => Unit): Self = this.set("startDelayedReport", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopAllDelayedReports(value: () => Unit): Self = this.set("stopAllDelayedReports", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopDelayedReport(value: IReportType => Unit): Self = this.set("stopDelayedReport", js.Any.fromFunction1(value))
  }
}
