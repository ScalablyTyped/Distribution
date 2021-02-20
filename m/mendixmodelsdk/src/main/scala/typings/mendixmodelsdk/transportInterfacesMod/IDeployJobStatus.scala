package typings.mendixmodelsdk.transportInterfacesMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.fast
import typings.mendixmodelsdk.mendixmodelsdkStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeployJobStatus extends StObject {
  
  var appUrl: js.UndefOr[String] = js.native
  
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
  
  var buildstatus: String | Null = js.native
  
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
  
  var jobid: String = js.native
  
  var startTime: Double = js.native
  
  var status: IUpdateAppJobStatus = js.native
  
  /**
    * Used to keep track of which steps this app update went trough,
    * mainly for debugging
    *
    * @memberOf IGetUpdateAppStatusResponse
    */
  var trace: js.Array[String] = js.native
  
  var `type`: full | fast = js.native
}
object IDeployJobStatus {
  
  @scala.inline
  def apply(
    jobid: String,
    startTime: Double,
    status: IUpdateAppJobStatus,
    trace: js.Array[String],
    `type`: full | fast
  ): IDeployJobStatus = {
    val __obj = js.Dynamic.literal(jobid = jobid.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeployJobStatus]
  }
  
  @scala.inline
  implicit class IDeployJobStatusMutableBuilder[Self <: IDeployJobStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppUrl(value: String): Self = StObject.set(x, "appUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppUrlUndefined: Self = StObject.set(x, "appUrl", js.undefined)
    
    @scala.inline
    def setBuildErrors(value: js.Array[IBuildError]): Self = StObject.set(x, "buildErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildErrorsUndefined: Self = StObject.set(x, "buildErrors", js.undefined)
    
    @scala.inline
    def setBuildErrorsVarargs(value: IBuildError*): Self = StObject.set(x, "buildErrors", js.Array(value :_*))
    
    @scala.inline
    def setBuildstatus(value: String): Self = StObject.set(x, "buildstatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildstatusNull: Self = StObject.set(x, "buildstatus", null)
    
    @scala.inline
    def setConsistencyErrors(value: js.Array[IProblem]): Self = StObject.set(x, "consistencyErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsistencyErrorsUndefined: Self = StObject.set(x, "consistencyErrors", js.undefined)
    
    @scala.inline
    def setConsistencyErrorsVarargs(value: IProblem*): Self = StObject.set(x, "consistencyErrors", js.Array(value :_*))
    
    @scala.inline
    def setJobid(value: String): Self = StObject.set(x, "jobid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: IUpdateAppJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrace(value: js.Array[String]): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraceVarargs(value: String*): Self = StObject.set(x, "trace", js.Array(value :_*))
    
    @scala.inline
    def setType(value: full | fast): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
