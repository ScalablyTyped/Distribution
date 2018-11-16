package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultScheduledJobManagementOperationsAsync extends js.Object {
  def AddScheduledJob(ScheduledJob: IScheduledJob): scala.Unit = js.native
  def AddScheduledJob(ScheduledJob: IScheduledJob, successCallback: js.Function1[/* result */ scala.Double, scala.Unit]): scala.Unit = js.native
  def AddScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def AddScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def CancelScheduledJob(ID: scala.Double): scala.Unit = js.native
  def CancelScheduledJob(ID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def CancelScheduledJob(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def CancelScheduledJob(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetScheduledJob(ID: scala.Double): scala.Unit = js.native
  def GetScheduledJob(ID: scala.Double, successCallback: js.Function1[/* result */ IScheduledJob, scala.Unit]): scala.Unit = js.native
  def GetScheduledJob(
    ID: scala.Double,
    successCallback: js.Function1[/* result */ IScheduledJob, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetScheduledJob(
    ID: scala.Double,
    successCallback: js.Function1[/* result */ IScheduledJob, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetScheduledJobRunInfo(ID: scala.Double): scala.Unit = js.native
  def GetScheduledJobRunInfo(ID: scala.Double, successCallback: js.Function1[/* result */ IScheduledJobRunInfo, scala.Unit]): scala.Unit = js.native
  def GetScheduledJobRunInfo(
    ID: scala.Double,
    successCallback: js.Function1[/* result */ IScheduledJobRunInfo, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetScheduledJobRunInfo(
    ID: scala.Double,
    successCallback: js.Function1[/* result */ IScheduledJobRunInfo, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetScheduledJobs(): scala.Unit = js.native
  def GetScheduledJobs(successCallback: js.Function1[/* result */ IScheduledJobs, scala.Unit]): scala.Unit = js.native
  def GetScheduledJobs(
    successCallback: js.Function1[/* result */ IScheduledJobs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetScheduledJobs(
    successCallback: js.Function1[/* result */ IScheduledJobs, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ModifyScheduledJob(ScheduledJob: IScheduledJob): scala.Unit = js.native
  def ModifyScheduledJob(ScheduledJob: IScheduledJob, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ModifyScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ModifyScheduledJob(
    ScheduledJob: IScheduledJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RemoveScheduledJob(ID: scala.Double): scala.Unit = js.native
  def RemoveScheduledJob(ID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RemoveScheduledJob(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RemoveScheduledJob(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def StartScheduledJob(ID: scala.Double): scala.Unit = js.native
  def StartScheduledJob(ID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def StartScheduledJob(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def StartScheduledJob(
    ID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

