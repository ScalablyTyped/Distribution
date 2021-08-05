package typings.mtaH5Analysis

import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoReport extends StObject {
    
    // 如果开启自定义事件，此项目为必填，否则不填
    var autoReport: js.UndefOr[`0` | `1`] = js.undefined
    
    // 必填，统计用的appid
    var cid: js.UndefOr[String] = js.undefined
    
    // 是否开启性能监控
    var ignoreParams: js.UndefOr[String] = js.undefined
    
    // url参数是否进入url统计
    var performanceMonitor: js.UndefOr[`0` | `1`] = js.undefined
    
    // 是否开启自动上报(1:init完成则上报一次,0:使用pgv方法才上报)
    var senseHash: js.UndefOr[`0` | `1`] = js.undefined
    
    // hash锚点是否进入url统计
    var senseQuery: js.UndefOr[`0` | `1`] = js.undefined
    
    var sid: String
  }
  object AutoReport {
    
    inline def apply(sid: String): AutoReport = {
      val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoReport]
    }
    
    extension [Self <: AutoReport](x: Self) {
      
      inline def setAutoReport(value: `0` | `1`): Self = StObject.set(x, "autoReport", value.asInstanceOf[js.Any])
      
      inline def setAutoReportUndefined: Self = StObject.set(x, "autoReport", js.undefined)
      
      inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setIgnoreParams(value: String): Self = StObject.set(x, "ignoreParams", value.asInstanceOf[js.Any])
      
      inline def setIgnoreParamsUndefined: Self = StObject.set(x, "ignoreParams", js.undefined)
      
      inline def setPerformanceMonitor(value: `0` | `1`): Self = StObject.set(x, "performanceMonitor", value.asInstanceOf[js.Any])
      
      inline def setPerformanceMonitorUndefined: Self = StObject.set(x, "performanceMonitor", js.undefined)
      
      inline def setSenseHash(value: `0` | `1`): Self = StObject.set(x, "senseHash", value.asInstanceOf[js.Any])
      
      inline def setSenseHashUndefined: Self = StObject.set(x, "senseHash", js.undefined)
      
      inline def setSenseQuery(value: `0` | `1`): Self = StObject.set(x, "senseQuery", value.asInstanceOf[js.Any])
      
      inline def setSenseQueryUndefined: Self = StObject.set(x, "senseQuery", js.undefined)
      
      inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    }
  }
}
