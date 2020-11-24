package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonSdkApiUsageViolationReport extends js.Object {
  
  /** Examples of the detected API usages. */
  var exampleApis: js.UndefOr[js.Array[NonSdkApi]] = js.native
  
  /** Minimum API level required for the application to run. */
  var minSdkVersion: js.UndefOr[Double] = js.native
  
  /** Specifies the API Level on which the application is designed to run. */
  var targetSdkVersion: js.UndefOr[Double] = js.native
  
  /** Total number of unique Non-SDK API's accessed. */
  var uniqueApis: js.UndefOr[Double] = js.native
}
object NonSdkApiUsageViolationReport {
  
  @scala.inline
  def apply(): NonSdkApiUsageViolationReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonSdkApiUsageViolationReport]
  }
  
  @scala.inline
  implicit class NonSdkApiUsageViolationReportOps[Self <: NonSdkApiUsageViolationReport] (val x: Self) extends AnyVal {
    
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
    def setExampleApisVarargs(value: NonSdkApi*): Self = this.set("exampleApis", js.Array(value :_*))
    
    @scala.inline
    def setExampleApis(value: js.Array[NonSdkApi]): Self = this.set("exampleApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExampleApis: Self = this.set("exampleApis", js.undefined)
    
    @scala.inline
    def setMinSdkVersion(value: Double): Self = this.set("minSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSdkVersion: Self = this.set("minSdkVersion", js.undefined)
    
    @scala.inline
    def setTargetSdkVersion(value: Double): Self = this.set("targetSdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSdkVersion: Self = this.set("targetSdkVersion", js.undefined)
    
    @scala.inline
    def setUniqueApis(value: Double): Self = this.set("uniqueApis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueApis: Self = this.set("uniqueApis", js.undefined)
  }
}
