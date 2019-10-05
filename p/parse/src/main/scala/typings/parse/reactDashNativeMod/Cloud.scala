package typings.parse.reactDashNativeMod

import org.scalablytyped.runtime.Instantiable0
import typings.parse.Parse.Cloud.AfterDeleteRequest
import typings.parse.Parse.Cloud.AfterFindRequest
import typings.parse.Parse.Cloud.AfterSaveRequest
import typings.parse.Parse.Cloud.BeforeDeleteRequest
import typings.parse.Parse.Cloud.BeforeFindRequest
import typings.parse.Parse.Cloud.BeforeSaveRequest
import typings.parse.Parse.Cloud.FunctionRequest
import typings.parse.Parse.Cloud.HTTPOptions
import typings.parse.Parse.Cloud.HttpResponse
import typings.parse.Parse.Cloud.JobRequest
import typings.parse.Parse.Cloud.RunOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @namespace Contains functions for calling and declaring
  * <a href="/docs/cloud_code_guide#functions">cloud functions</a>.
  * <p><strong><em>
  *   Some functions are only available from Cloud Code.
  * </em></strong></p>
  */
@JSImport("parse/react-native", "Cloud")
@js.native
object Cloud extends js.Object {
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  var HTTPOptions: Instantiable0[typings.parse.Parse.Cloud.HTTPOptions] = js.native
  def afterDelete(arg1: js.Any): Unit = js.native
  def afterDelete(arg1: js.Any, func: js.Function1[/* request */ AfterDeleteRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def afterFind(arg1: js.Any): Unit = js.native
  def afterFind(arg1: js.Any, func: js.Function1[/* request */ AfterFindRequest, js.Promise[_] | _]): Unit = js.native
  def afterSave(arg1: js.Any): Unit = js.native
  def afterSave(arg1: js.Any, func: js.Function1[/* request */ AfterSaveRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def beforeDelete(arg1: js.Any): Unit = js.native
  def beforeDelete(arg1: js.Any, func: js.Function1[/* request */ BeforeDeleteRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def beforeFind(arg1: js.Any): Unit = js.native
  def beforeFind(
    arg1: js.Any,
    func: js.Function1[
      /* request */ BeforeFindRequest, 
      (js.Promise[typings.parse.Parse.Query[typings.parse.Parse.Object] | Unit]) | typings.parse.Parse.Query[typings.parse.Parse.Object] | Unit
    ]
  ): Unit = js.native
  def beforeSave(arg1: js.Any): Unit = js.native
  def beforeSave(arg1: js.Any, func: js.Function1[/* request */ BeforeSaveRequest, js.Promise[Unit] | Unit]): Unit = js.native
  def define(name: String): Unit = js.native
  def define(name: String, func: js.Function1[/* request */ FunctionRequest, js.Promise[_] | _]): Unit = js.native
  /**
    * Gets job status by Id
    * @param jobStatusId The Id of Job Status.
    * @returns Status of Job.
    */
  def getJobStatus(jobStatusId: String): js.Promise[typings.parse.Parse.Object] = js.native
  /**
    * Gets data for the current set of cloud jobs.
    * @returns A promise that will be resolved with the result of the function.
    */
  def getJobsData(): js.Promise[typings.parse.Parse.Object] = js.native
  def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = js.native
  def job(name: String): HttpResponse = js.native
  def job(name: String, func: js.Function1[/* request */ JobRequest, js.Promise[Unit] | Unit]): HttpResponse = js.native
  def run(name: String): js.Promise[_] = js.native
  def run(name: String, data: js.Any): js.Promise[_] = js.native
  def run(name: String, data: js.Any, options: RunOptions): js.Promise[_] = js.native
  /**
    * Starts a given cloud job, which will process asynchronously.
    * @param jobName The function name.
    * @param data The parameters to send to the cloud function.
    * @returns A promise that will be resolved with the jobStatusId of the job.
    */
  def startJob(jobName: String, data: js.Any): js.Promise[String] = js.native
  def useMasterKey(): Unit = js.native
  // Read preference describes how MongoDB driver route read operations to the members of a replica set.
  @js.native
  object ReadPreferenceOption extends js.Object {
    /* "NEAREST" */ val Nearest: typings.parse.Parse.Cloud.ReadPreferenceOption.Nearest with String = js.native
    /* "PRIMARY" */ val Primary: typings.parse.Parse.Cloud.ReadPreferenceOption.Primary with String = js.native
    /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typings.parse.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred with String = js.native
    /* "SECONDARY" */ val Secondary: typings.parse.Parse.Cloud.ReadPreferenceOption.Secondary with String = js.native
    /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typings.parse.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.parse.Parse.Cloud.ReadPreferenceOption with String] = js.native
  }
  
}

