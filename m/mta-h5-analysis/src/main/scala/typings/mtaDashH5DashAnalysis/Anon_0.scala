package typings.mtaDashH5DashAnalysis

import typings.mtaDashH5DashAnalysis.mtaDashH5DashAnalysisNumbers.`0`
import typings.mtaDashH5DashAnalysis.mtaDashH5DashAnalysisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
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

object Anon_0 {
  @scala.inline
  def apply(
    sid: String,
    autoReport: `0` | `1` = null,
    cid: String = null,
    ignoreParams: String = null,
    performanceMonitor: `0` | `1` = null,
    senseHash: `0` | `1` = null,
    senseQuery: `0` | `1` = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(sid = sid)
    if (autoReport != null) __obj.updateDynamic("autoReport")(autoReport.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid)
    if (ignoreParams != null) __obj.updateDynamic("ignoreParams")(ignoreParams)
    if (performanceMonitor != null) __obj.updateDynamic("performanceMonitor")(performanceMonitor.asInstanceOf[js.Any])
    if (senseHash != null) __obj.updateDynamic("senseHash")(senseHash.asInstanceOf[js.Any])
    if (senseQuery != null) __obj.updateDynamic("senseQuery")(senseQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

