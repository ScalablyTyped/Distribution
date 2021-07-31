package typings.parse.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Cloud.AfterDeleteRequest
import typings.parse.mod.global.Parse.Cloud.AfterFindRequest
import typings.parse.mod.global.Parse.Cloud.AfterSaveRequest
import typings.parse.mod.global.Parse.Cloud.BeforeDeleteRequest
import typings.parse.mod.global.Parse.Cloud.BeforeFindRequest
import typings.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typings.parse.mod.global.Parse.Cloud.FileTriggerRequest
import typings.parse.mod.global.Parse.Cloud.FunctionRequest
import typings.parse.mod.global.Parse.Cloud.HTTPOptions
import typings.parse.mod.global.Parse.Cloud.HttpResponse
import typings.parse.mod.global.Parse.Cloud.JobRequest
import typings.parse.mod.global.Parse.Cloud.Params
import typings.parse.mod.global.Parse.Cloud.RunOptions
import typings.parse.mod.global.Parse.Cloud.TriggerRequest
import typings.parse.parseStrings.define
import typings.parse.parseStrings.run
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains functions for calling and declaring
  * <a href="/docs/cloud_code_guide#functions">cloud functions</a>.
  * <p><strong><em>
  *   Some functions are only available from Cloud Code.
  * </em></strong></p>
  */
object Cloud {
  
  @JSImport("parse", "Cloud")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
    *
    *     import Buffer = require("buffer").Buffer;
    */
  @JSImport("parse", "Cloud.HTTPOptions")
  @js.native
  def HTTPOptions: Instantiable0[typings.parse.mod.global.Parse.Cloud.HTTPOptions] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse", "Cloud.HTTPOptions")
  @js.native
  class HTTPOptionsCls ()
    extends StObject
       with HTTPOptions {
    
    /**
      * The url to send the request to.
      */
    /* CompleteClass */
    var url: String = js.native
  }
  
  @scala.inline
  def HTTPOptions_=(x: Instantiable0[HTTPOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPOptions")(x.asInstanceOf[js.Any])
  
  // Read preference describes how MongoDB driver route read operations to the members of a replica set.
  @JSImport("parse", "Cloud.ReadPreferenceOption")
  @js.native
  object ReadPreferenceOption extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption & String] = js.native
    
    /* "NEAREST" */ val Nearest: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Nearest & String = js.native
    
    /* "PRIMARY" */ val Primary: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Primary & String = js.native
    
    /* "PRIMARY_PREFERRED" */ val PrimaryPreferred: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.PrimaryPreferred & String = js.native
    
    /* "SECONDARY" */ val Secondary: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.Secondary & String = js.native
    
    /* "SECONDARY_PREFERRED" */ val SecondaryPreferred: typings.parse.mod.global.Parse.Cloud.ReadPreferenceOption.SecondaryPreferred & String = js.native
  }
  
  @scala.inline
  def afterDelete(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def afterDelete(arg1: js.Any, func: js.Function1[/* request */ AfterDeleteRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def afterDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")().asInstanceOf[Unit]
  @scala.inline
  def afterDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def afterFind(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def afterFind(arg1: js.Any, func: js.Function1[/* request */ AfterFindRequest, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def afterLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")().asInstanceOf[Unit]
  @scala.inline
  def afterLogin(func: js.Function1[/* request */ TriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def afterLogout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")().asInstanceOf[Unit]
  @scala.inline
  def afterLogout(func: js.Function1[/* request */ TriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def afterSave(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def afterSave(arg1: js.Any, func: js.Function1[/* request */ AfterSaveRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def afterSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")().asInstanceOf[Unit]
  @scala.inline
  def afterSaveFile(func: js.Function1[/* request */ FileTriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def beforeDelete(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def beforeDelete(arg1: js.Any, func: js.Function1[/* request */ BeforeDeleteRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def beforeDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")().asInstanceOf[Unit]
  @scala.inline
  def beforeDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def beforeFind(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def beforeFind(
    arg1: js.Any,
    func: js.Function1[
      /* request */ BeforeFindRequest, 
      (js.Promise[
        typings.parse.mod.global.Parse.Query[typings.parse.mod.global.Parse.Object[Attributes]] | Unit
      ]) | typings.parse.mod.global.Parse.Query[typings.parse.mod.global.Parse.Object[Attributes]] | Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def beforeLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")().asInstanceOf[Unit]
  @scala.inline
  def beforeLogin(func: js.Function1[/* request */ TriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def beforeSave(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def beforeSave(arg1: js.Any, func: js.Function1[/* request */ BeforeSaveRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def beforeSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")().asInstanceOf[Unit]
  @scala.inline
  def beforeSaveFile(
    func: js.Function1[
      /* request */ FileTriggerRequest, 
      js.Thenable[typings.parse.mod.global.Parse.File] | Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def define(name: String, func: js.Function1[/* request */ FunctionRequest[Params], js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def define_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ define & TopLevel[Parameters[T]], 
    js.Any
  ] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
      ], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def define_T_Function0Any[T /* <: js.Function0[js.Any] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[js.Object], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets job status by Id
    * @param jobStatusId The Id of Job Status.
    * @returns Status of Job.
    */
  @scala.inline
  def getJobStatus(jobStatusId: String): js.Promise[typings.parse.mod.global.Parse.Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobStatus")(jobStatusId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Object[Attributes]]]
  
  /**
    * Gets data for the current set of cloud jobs.
    * @returns A promise that will be resolved with the result of the function.
    */
  @scala.inline
  def getJobsData(): js.Promise[typings.parse.mod.global.Parse.Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobsData")().asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Object[Attributes]]]
  
  @scala.inline
  def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpResponse]]
  
  @scala.inline
  def job(name: String): HttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any]).asInstanceOf[HttpResponse]
  @scala.inline
  def job(name: String, func: js.Function1[/* request */ JobRequest, js.Promise[Unit] | Unit]): HttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[HttpResponse]
  
  @scala.inline
  def run(name: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def run(name: String, data: Unit, options: RunOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def run(name: String, data: Params): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def run(name: String, data: Params, options: RunOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def run[T /* <: js.Function0[js.Any] */](name: String, data: Null, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  
  @scala.inline
  def run_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ run & TopLevel[Parameters[T]], 
    js.Any
  ] */](
    name: String,
    data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
  ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  @scala.inline
  def run_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
    */ /* param */ run & TopLevel[Parameters[T]], 
    js.Any
  ] */](
    name: String,
    data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any,
    options: RunOptions
  ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  
  @scala.inline
  def run_T_Function0Any[T /* <: js.Function0[js.Any] */](name: String): js.Promise[ReturnType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType[T]]]
  @scala.inline
  def run_T_Function0Any[T /* <: js.Function0[js.Any] */](name: String, data: Unit, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  
  /**
    * Starts a given cloud job, which will process asynchronously.
    * @param jobName The function name.
    * @param data The parameters to send to the cloud function.
    * @returns A promise that will be resolved with the jobStatusId of the job.
    */
  @scala.inline
  def startJob(jobName: String, data: js.Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("startJob")(jobName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def useMasterKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMasterKey")().asInstanceOf[Unit]
}
