package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultScheduledJobManagementOperationsAsync extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  def AddScheduledJob(ScheduledJob: IScheduledJob, successCallback: js.Function1[/* result */ Double, Unit]): Unit = js.native
  def AddScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def AddScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def CancelScheduledJob(ID: Double): Unit = js.native
  def CancelScheduledJob(ID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def CancelScheduledJob(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def CancelScheduledJob(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetScheduledJob(ID: Double): Unit = js.native
  def GetScheduledJob(ID: Double, successCallback: js.Function1[/* result */ IScheduledJob, Unit]): Unit = js.native
  def GetScheduledJob(
    ID: Double,
    successCallback: js.Function1[/* result */ IScheduledJob, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetScheduledJob(
    ID: Double,
    successCallback: js.Function1[/* result */ IScheduledJob, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetScheduledJobRunInfo(ID: Double): Unit = js.native
  def GetScheduledJobRunInfo(ID: Double, successCallback: js.Function1[/* result */ IScheduledJobRunInfo, Unit]): Unit = js.native
  def GetScheduledJobRunInfo(
    ID: Double,
    successCallback: js.Function1[/* result */ IScheduledJobRunInfo, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetScheduledJobRunInfo(
    ID: Double,
    successCallback: js.Function1[/* result */ IScheduledJobRunInfo, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetScheduledJobs(): Unit = js.native
  def GetScheduledJobs(successCallback: js.Function1[/* result */ IScheduledJobs, Unit]): Unit = js.native
  def GetScheduledJobs(
    successCallback: js.Function1[/* result */ IScheduledJobs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def GetScheduledJobs(
    successCallback: js.Function1[/* result */ IScheduledJobs, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): Unit = js.native
  def ModifyScheduledJob(ScheduledJob: IScheduledJob, successCallback: js.Function0[Unit]): Unit = js.native
  def ModifyScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def ModifyScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def RemoveScheduledJob(ID: Double): Unit = js.native
  def RemoveScheduledJob(ID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def RemoveScheduledJob(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def RemoveScheduledJob(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def StartScheduledJob(ID: Double): Unit = js.native
  def StartScheduledJob(ID: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def StartScheduledJob(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit]
  ): Unit = js.native
  def StartScheduledJob(
    ID: Double,
    successCallback: js.Function0[Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ js.Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}

