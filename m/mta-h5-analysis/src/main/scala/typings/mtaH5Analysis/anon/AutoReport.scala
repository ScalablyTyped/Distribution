package typings.mtaH5Analysis.anon

import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`0`
import typings.mtaH5Analysis.mtaH5AnalysisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoReport extends js.Object {
   // 如果开启自定义事件，此项目为必填，否则不填
  var autoReport: js.UndefOr[`0` | `1`] = js.native
   // 必填，统计用的appid
  var cid: js.UndefOr[String] = js.native
   // 是否开启性能监控
  var ignoreParams: js.UndefOr[String] = js.native
   // url参数是否进入url统计
  var performanceMonitor: js.UndefOr[`0` | `1`] = js.native
   // 是否开启自动上报(1:init完成则上报一次,0:使用pgv方法才上报)
  var senseHash: js.UndefOr[`0` | `1`] = js.native
   // hash锚点是否进入url统计
  var senseQuery: js.UndefOr[`0` | `1`] = js.native
  var sid: String = js.native
}

object AutoReport {
  @scala.inline
  def apply(sid: String): AutoReport = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoReport]
  }
  @scala.inline
  implicit class AutoReportOps[Self <: AutoReport] (val x: Self) extends AnyVal {
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
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoReport(value: `0` | `1`): Self = this.set("autoReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReport: Self = this.set("autoReport", js.undefined)
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    @scala.inline
    def setIgnoreParams(value: String): Self = this.set("ignoreParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreParams: Self = this.set("ignoreParams", js.undefined)
    @scala.inline
    def setPerformanceMonitor(value: `0` | `1`): Self = this.set("performanceMonitor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceMonitor: Self = this.set("performanceMonitor", js.undefined)
    @scala.inline
    def setSenseHash(value: `0` | `1`): Self = this.set("senseHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenseHash: Self = this.set("senseHash", js.undefined)
    @scala.inline
    def setSenseQuery(value: `0` | `1`): Self = this.set("senseQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenseQuery: Self = this.set("senseQuery", js.undefined)
  }
  
}

