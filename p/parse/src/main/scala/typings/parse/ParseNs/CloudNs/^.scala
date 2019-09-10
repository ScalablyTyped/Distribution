package typings.parse.ParseNs.CloudNs

import org.scalablytyped.runtime.Instantiable0
import typings.parse.ParseNs.Object
import typings.parse.ParseNs.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Cloud")
@js.native
object ^ extends js.Object {
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  var HTTPOptions: Instantiable0[typings.parse.ParseNs.CloudNs.HTTPOptions] = js.native
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
      (js.Promise[Query[Object] | Unit]) | Query[Object] | Unit
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
  def getJobStatus(jobStatusId: String): js.Promise[Object] = js.native
  /**
    * Gets data for the current set of cloud jobs.
    * @returns A promise that will be resolved with the result of the function.
    */
  def getJobsData(): js.Promise[Object] = js.native
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
}

