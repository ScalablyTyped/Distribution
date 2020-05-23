package typings.mtaH5Analysis.anon

import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoReport extends js.Object {
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
  @scala.inline
  def apply(
    sid: String,
    autoReport: `0` | `1` = null,
    cid: String = null,
    ignoreParams: String = null,
    performanceMonitor: `0` | `1` = null,
    senseHash: `0` | `1` = null,
    senseQuery: `0` | `1` = null
  ): AutoReport = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
    if (autoReport != null) __obj.updateDynamic("autoReport")(autoReport.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (ignoreParams != null) __obj.updateDynamic("ignoreParams")(ignoreParams.asInstanceOf[js.Any])
    if (performanceMonitor != null) __obj.updateDynamic("performanceMonitor")(performanceMonitor.asInstanceOf[js.Any])
    if (senseHash != null) __obj.updateDynamic("senseHash")(senseHash.asInstanceOf[js.Any])
    if (senseQuery != null) __obj.updateDynamic("senseQuery")(senseQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoReport]
  }
}

