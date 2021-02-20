package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerScheduledJobManagementOperations extends StObject {
  
  def AddScheduledJob(ScheduledJob: IScheduledJob): Double = js.native
  
  def CancelScheduledJob(ID: Double): Unit = js.native
  
  def GetScheduledJob(ID: Double): IScheduledJob = js.native
  
  def GetScheduledJobRunInfo(ID: Double): IScheduledJobRunInfo = js.native
  
  def GetScheduledJobs(): IScheduledJobs = js.native
  
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  
  def RemoveScheduledJob(ID: Double): Unit = js.native
  
  def StartScheduledJob(ID: Double): Unit = js.native
}
object IServerScheduledJobManagementOperations {
  
  @scala.inline
  def apply(
    AddScheduledJob: IScheduledJob => Double,
    CancelScheduledJob: Double => Unit,
    GetScheduledJob: Double => IScheduledJob,
    GetScheduledJobRunInfo: Double => IScheduledJobRunInfo,
    GetScheduledJobs: () => IScheduledJobs,
    ModifyScheduledJob: IScheduledJob => Unit,
    RemoveScheduledJob: Double => Unit,
    StartScheduledJob: Double => Unit
  ): IServerScheduledJobManagementOperations = {
    val __obj = js.Dynamic.literal(AddScheduledJob = js.Any.fromFunction1(AddScheduledJob), CancelScheduledJob = js.Any.fromFunction1(CancelScheduledJob), GetScheduledJob = js.Any.fromFunction1(GetScheduledJob), GetScheduledJobRunInfo = js.Any.fromFunction1(GetScheduledJobRunInfo), GetScheduledJobs = js.Any.fromFunction0(GetScheduledJobs), ModifyScheduledJob = js.Any.fromFunction1(ModifyScheduledJob), RemoveScheduledJob = js.Any.fromFunction1(RemoveScheduledJob), StartScheduledJob = js.Any.fromFunction1(StartScheduledJob))
    __obj.asInstanceOf[IServerScheduledJobManagementOperations]
  }
  
  @scala.inline
  implicit class IServerScheduledJobManagementOperationsMutableBuilder[Self <: IServerScheduledJobManagementOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddScheduledJob(value: IScheduledJob => Double): Self = StObject.set(x, "AddScheduledJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCancelScheduledJob(value: Double => Unit): Self = StObject.set(x, "CancelScheduledJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScheduledJob(value: Double => IScheduledJob): Self = StObject.set(x, "GetScheduledJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScheduledJobRunInfo(value: Double => IScheduledJobRunInfo): Self = StObject.set(x, "GetScheduledJobRunInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetScheduledJobs(value: () => IScheduledJobs): Self = StObject.set(x, "GetScheduledJobs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModifyScheduledJob(value: IScheduledJob => Unit): Self = StObject.set(x, "ModifyScheduledJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveScheduledJob(value: Double => Unit): Self = StObject.set(x, "RemoveScheduledJob", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartScheduledJob(value: Double => Unit): Self = StObject.set(x, "StartScheduledJob", js.Any.fromFunction1(value))
  }
}
