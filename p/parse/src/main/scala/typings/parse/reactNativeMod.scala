package typings.parse

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.parse.anon.Base64
import typings.parse.anon.Latitude
import typings.parse.anon.Size
import typings.parse.anon.Uri
import typings.parse.mod.ErrorCode
import typings.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED
import typings.parse.mod.ErrorCode.AGGREGATE_ERROR
import typings.parse.mod.ErrorCode.CACHE_MISS
import typings.parse.mod.ErrorCode.COMMAND_UNAVAILABLE
import typings.parse.mod.ErrorCode.CONNECTION_FAILED
import typings.parse.mod.ErrorCode.DUPLICATE_VALUE
import typings.parse.mod.ErrorCode.EMAIL_MISSING
import typings.parse.mod.ErrorCode.EMAIL_NOT_FOUND
import typings.parse.mod.ErrorCode.EMAIL_TAKEN
import typings.parse.mod.ErrorCode.EXCEEDED_QUOTA
import typings.parse.mod.ErrorCode.FILE_DELETE_ERROR
import typings.parse.mod.ErrorCode.FILE_READ_ERROR
import typings.parse.mod.ErrorCode.FILE_SAVE_ERROR
import typings.parse.mod.ErrorCode.FILE_TOO_LARGE
import typings.parse.mod.ErrorCode.INCORRECT_TYPE
import typings.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR
import typings.parse.mod.ErrorCode.INVALID_ACL
import typings.parse.mod.ErrorCode.INVALID_CHANNEL_NAME
import typings.parse.mod.ErrorCode.INVALID_CLASS_NAME
import typings.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH
import typings.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS
import typings.parse.mod.ErrorCode.INVALID_EVENT_NAME
import typings.parse.mod.ErrorCode.INVALID_FILE_NAME
import typings.parse.mod.ErrorCode.INVALID_IMAGE_DATA
import typings.parse.mod.ErrorCode.INVALID_JSON
import typings.parse.mod.ErrorCode.INVALID_KEY_NAME
import typings.parse.mod.ErrorCode.INVALID_LINKED_SESSION
import typings.parse.mod.ErrorCode.INVALID_NESTED_KEY
import typings.parse.mod.ErrorCode.INVALID_POINTER
import typings.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR
import typings.parse.mod.ErrorCode.INVALID_QUERY
import typings.parse.mod.ErrorCode.INVALID_ROLE_NAME
import typings.parse.mod.ErrorCode.INVALID_SESSION_TOKEN
import typings.parse.mod.ErrorCode.LINKED_ID_MISSING
import typings.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH
import typings.parse.mod.ErrorCode.MISSING_CONTENT_TYPE
import typings.parse.mod.ErrorCode.MISSING_OBJECT_ID
import typings.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP
import typings.parse.mod.ErrorCode.NOT_INITIALIZED
import typings.parse.mod.ErrorCode.OBJECT_NOT_FOUND
import typings.parse.mod.ErrorCode.OBJECT_TOO_LARGE
import typings.parse.mod.ErrorCode.OPERATION_FORBIDDEN
import typings.parse.mod.ErrorCode.OTHER_CAUSE
import typings.parse.mod.ErrorCode.PASSWORD_MISSING
import typings.parse.mod.ErrorCode.PUSH_MISCONFIGURED
import typings.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED
import typings.parse.mod.ErrorCode.SCRIPT_FAILED
import typings.parse.mod.ErrorCode.SESSION_MISSING
import typings.parse.mod.ErrorCode.TIMEOUT
import typings.parse.mod.ErrorCode.UNSAVED_FILE_ERROR
import typings.parse.mod.ErrorCode.UNSUPPORTED_SERVICE
import typings.parse.mod.ErrorCode.USERNAME_MISSING
import typings.parse.mod.ErrorCode.USERNAME_TAKEN
import typings.parse.mod.ErrorCode.VALIDATION_ERROR
import typings.parse.mod.ErrorCode.X_DOMAIN_REQUEST
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
import typings.parse.mod.global.Parse.FullOptions
import typings.parse.mod.global.Parse.InstallationConstructor
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.ObjectConstructor
import typings.parse.mod.global.Parse.Push.PushData
import typings.parse.mod.global.Parse.Push.SendOptions
import typings.parse.mod.global.Parse.RoleConstructor
import typings.parse.mod.global.Parse.SessionConstructor
import typings.parse.mod.global.Parse.SuccessFailureOptions
import typings.parse.mod.global.Parse.UseMasterKeyOption
import typings.parse.mod.global.Parse.UserConstructor
import typings.parse.parseStrings.define
import typings.parse.parseStrings.run
import typings.std.Parameters
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeMod {
  
  @JSImport("parse/react-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ACL.
    * If no argument is given, the ACL has no permissions for anyone.
    * If the argument is a Parse.User, the ACL will have read and write
    *   permission for only that user.
    * If the argument is any other JSON object, that object will be interpretted
    *   as a serialized ACL created with toJSON().
    * @see Parse.Object#setACL
    *
    * <p>An ACL, or Access Control List can be added to any
    * <code>Parse.Object</code> to restrict access to only a subset of users
    * of your application.</p>
    */
  @JSImport("parse/react-native", "ACL")
  @js.native
  class ACL ()
    extends typings.parse.mod.ACL {
    def this(arg1: js.Any) = this()
  }
  
  object Analytics {
    
    @JSImport("parse/react-native", "Analytics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def track(name: String, dimensions: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any], dimensions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  }
  
  /**
    * Contains functions for calling and declaring
    * <a href="/docs/cloud_code_guide#functions">cloud functions</a>.
    * <p><strong><em>
    *   Some functions are only available from Cloud Code.
    * </em></strong></p>
    */
  object Cloud {
    
    @JSImport("parse/react-native", "Cloud")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * To use this Cloud Module in Cloud Code, you must require 'buffer' in your JavaScript file.
      *
      *     import Buffer = require("buffer").Buffer;
      */
    @JSImport("parse/react-native", "Cloud.HTTPOptions")
    @js.native
    def HTTPOptions: Instantiable0[typings.parse.mod.global.Parse.Cloud.HTTPOptions] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("parse/react-native", "Cloud.HTTPOptions")
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
    
    inline def HTTPOptions_=(x: Instantiable0[HTTPOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPOptions")(x.asInstanceOf[js.Any])
    
    // Read preference describes how MongoDB driver route read operations to the members of a replica set.
    @JSImport("parse/react-native", "Cloud.ReadPreferenceOption")
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
    
    inline def afterDelete(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterDelete(arg1: js.Any, func: js.Function1[/* request */ AfterDeleteRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")().asInstanceOf[Unit]
    inline def afterDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def afterFind(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterFind(arg1: js.Any, func: js.Function1[/* request */ AfterFindRequest, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")().asInstanceOf[Unit]
    inline def afterLogin(func: js.Function1[/* request */ TriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def afterLogout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")().asInstanceOf[Unit]
    inline def afterLogout(func: js.Function1[/* request */ TriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def afterSave(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def afterSave(arg1: js.Any, func: js.Function1[/* request */ AfterSaveRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def afterSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")().asInstanceOf[Unit]
    inline def afterSaveFile(func: js.Function1[/* request */ FileTriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeDelete(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeDelete(arg1: js.Any, func: js.Function1[/* request */ BeforeDeleteRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")().asInstanceOf[Unit]
    inline def beforeDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeFind(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeFind(
      arg1: js.Any,
      func: js.Function1[
          /* request */ BeforeFindRequest, 
          (js.Promise[typings.parse.mod.global.Parse.Query[Object[Attributes]] | Unit]) | typings.parse.mod.global.Parse.Query[Object[Attributes]] | Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")().asInstanceOf[Unit]
    inline def beforeLogin(func: js.Function1[/* request */ TriggerRequest, js.Thenable[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def beforeSave(arg1: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def beforeSave(arg1: js.Any, func: js.Function1[/* request */ BeforeSaveRequest, js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def beforeSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")().asInstanceOf[Unit]
    inline def beforeSaveFile(
      func: js.Function1[
          /* request */ FileTriggerRequest, 
          js.Thenable[typings.parse.mod.global.Parse.File] | Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def define(name: String, func: js.Function1[/* request */ FunctionRequest[Params], js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def define_0[T /* <: js.Function1[
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
    
    inline def define_T_Function0Any[T /* <: js.Function0[js.Any] */](
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
    inline def getJobStatus(jobStatusId: String): js.Promise[Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobStatus")(jobStatusId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Object[Attributes]]]
    
    /**
      * Gets data for the current set of cloud jobs.
      * @returns A promise that will be resolved with the result of the function.
      */
    inline def getJobsData(): js.Promise[Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobsData")().asInstanceOf[js.Promise[Object[Attributes]]]
    
    inline def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpResponse]]
    
    inline def job(name: String): HttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any]).asInstanceOf[HttpResponse]
    inline def job(name: String, func: js.Function1[/* request */ JobRequest, js.Promise[Unit] | Unit]): HttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[HttpResponse]
    
    inline def run(name: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    inline def run(name: String, data: Unit, options: RunOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def run(name: String, data: Params): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def run(name: String, data: Params, options: RunOptions): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    inline def run[T /* <: js.Function0[js.Any] */](name: String, data: Null, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    
    inline def run_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
      */ /* param */ run & TopLevel[Parameters[T]], 
        js.Any
      ] */](
      name: String,
      data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
    ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    inline def run_0[T /* <: js.Function1[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]}
      */ /* param */ run & TopLevel[Parameters[T]], 
        js.Any
      ] */](
      name: String,
      data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any,
      options: RunOptions
    ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    
    inline def run_T_Function0Any[T /* <: js.Function0[js.Any] */](name: String): js.Promise[ReturnType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType[T]]]
    inline def run_T_Function0Any[T /* <: js.Function0[js.Any] */](name: String, data: Unit, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
    
    /**
      * Starts a given cloud job, which will process asynchronously.
      * @param jobName The function name.
      * @param data The parameters to send to the cloud function.
      * @returns A promise that will be resolved with the jobStatusId of the job.
      */
    inline def startJob(jobName: String, data: js.Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("startJob")(jobName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def useMasterKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMasterKey")().asInstanceOf[Unit]
  }
  
  @JSImport("parse/react-native", "Config")
  @js.native
  class Config ()
    extends typings.parse.mod.Config
  object Config {
    
    @JSImport("parse/react-native", "Config")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def current(): typings.parse.mod.global.Parse.Config = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[typings.parse.mod.global.Parse.Config]
    
    /* static member */
    inline def get(): js.Promise[typings.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
    inline def get(options: UseMasterKeyOption): js.Promise[typings.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
    
    /* static member */
    inline def save(attr: js.Any): js.Promise[typings.parse.mod.global.Parse.Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
    inline def save(attr: js.Any, options: StringDictionary[Boolean]): js.Promise[typings.parse.mod.global.Parse.Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(attr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Config]]
  }
  
  /**
    * Use this to set custom headers
    * The headers will be sent with every parse request
    */
  object CoreManager {
    
    @JSImport("parse/react-native", "CoreManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def set(key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("parse/react-native", "Error")
  @js.native
  class Error protected ()
    extends typings.parse.mod.Error {
    def this(code: ErrorCode, message: String) = this()
  }
  object Error {
    
    @JSImport("parse/react-native", "Error")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("parse/react-native", "Error.ACCOUNT_ALREADY_LINKED")
    @js.native
    def ACCOUNT_ALREADY_LINKED: typings.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
    inline def ACCOUNT_ALREADY_LINKED_=(x: ACCOUNT_ALREADY_LINKED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCOUNT_ALREADY_LINKED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.AGGREGATE_ERROR")
    @js.native
    def AGGREGATE_ERROR: typings.parse.mod.ErrorCode.AGGREGATE_ERROR = js.native
    inline def AGGREGATE_ERROR_=(x: AGGREGATE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGGREGATE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.CACHE_MISS")
    @js.native
    def CACHE_MISS: typings.parse.mod.ErrorCode.CACHE_MISS = js.native
    inline def CACHE_MISS_=(x: CACHE_MISS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CACHE_MISS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.COMMAND_UNAVAILABLE")
    @js.native
    def COMMAND_UNAVAILABLE: typings.parse.mod.ErrorCode.COMMAND_UNAVAILABLE = js.native
    inline def COMMAND_UNAVAILABLE_=(x: COMMAND_UNAVAILABLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMAND_UNAVAILABLE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.CONNECTION_FAILED")
    @js.native
    def CONNECTION_FAILED: typings.parse.mod.ErrorCode.CONNECTION_FAILED = js.native
    inline def CONNECTION_FAILED_=(x: CONNECTION_FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_FAILED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.DUPLICATE_VALUE")
    @js.native
    def DUPLICATE_VALUE: typings.parse.mod.ErrorCode.DUPLICATE_VALUE = js.native
    inline def DUPLICATE_VALUE_=(x: DUPLICATE_VALUE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUPLICATE_VALUE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EMAIL_MISSING")
    @js.native
    def EMAIL_MISSING: typings.parse.mod.ErrorCode.EMAIL_MISSING = js.native
    inline def EMAIL_MISSING_=(x: EMAIL_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EMAIL_NOT_FOUND")
    @js.native
    def EMAIL_NOT_FOUND: typings.parse.mod.ErrorCode.EMAIL_NOT_FOUND = js.native
    inline def EMAIL_NOT_FOUND_=(x: EMAIL_NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EMAIL_TAKEN")
    @js.native
    def EMAIL_TAKEN: typings.parse.mod.ErrorCode.EMAIL_TAKEN = js.native
    inline def EMAIL_TAKEN_=(x: EMAIL_TAKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_TAKEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.EXCEEDED_QUOTA")
    @js.native
    def EXCEEDED_QUOTA: typings.parse.mod.ErrorCode.EXCEEDED_QUOTA = js.native
    inline def EXCEEDED_QUOTA_=(x: EXCEEDED_QUOTA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXCEEDED_QUOTA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_DELETE_ERROR")
    @js.native
    def FILE_DELETE_ERROR: typings.parse.mod.ErrorCode.FILE_DELETE_ERROR = js.native
    inline def FILE_DELETE_ERROR_=(x: FILE_DELETE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_DELETE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_READ_ERROR")
    @js.native
    def FILE_READ_ERROR: typings.parse.mod.ErrorCode.FILE_READ_ERROR = js.native
    inline def FILE_READ_ERROR_=(x: FILE_READ_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_READ_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_SAVE_ERROR")
    @js.native
    def FILE_SAVE_ERROR: typings.parse.mod.ErrorCode.FILE_SAVE_ERROR = js.native
    inline def FILE_SAVE_ERROR_=(x: FILE_SAVE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_SAVE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.FILE_TOO_LARGE")
    @js.native
    def FILE_TOO_LARGE: typings.parse.mod.ErrorCode.FILE_TOO_LARGE = js.native
    inline def FILE_TOO_LARGE_=(x: FILE_TOO_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_TOO_LARGE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INCORRECT_TYPE")
    @js.native
    def INCORRECT_TYPE: typings.parse.mod.ErrorCode.INCORRECT_TYPE = js.native
    inline def INCORRECT_TYPE_=(x: INCORRECT_TYPE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCORRECT_TYPE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INTERNAL_SERVER_ERROR")
    @js.native
    def INTERNAL_SERVER_ERROR: typings.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
    inline def INTERNAL_SERVER_ERROR_=(x: INTERNAL_SERVER_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_SERVER_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_ACL")
    @js.native
    def INVALID_ACL: typings.parse.mod.ErrorCode.INVALID_ACL = js.native
    inline def INVALID_ACL_=(x: INVALID_ACL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ACL")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_CHANNEL_NAME")
    @js.native
    def INVALID_CHANNEL_NAME: typings.parse.mod.ErrorCode.INVALID_CHANNEL_NAME = js.native
    inline def INVALID_CHANNEL_NAME_=(x: INVALID_CHANNEL_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CHANNEL_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_CLASS_NAME")
    @js.native
    def INVALID_CLASS_NAME: typings.parse.mod.ErrorCode.INVALID_CLASS_NAME = js.native
    inline def INVALID_CLASS_NAME_=(x: INVALID_CLASS_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CLASS_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_CONTENT_LENGTH")
    @js.native
    def INVALID_CONTENT_LENGTH: typings.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
    inline def INVALID_CONTENT_LENGTH_=(x: INVALID_CONTENT_LENGTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_EMAIL_ADDRESS")
    @js.native
    def INVALID_EMAIL_ADDRESS: typings.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
    inline def INVALID_EMAIL_ADDRESS_=(x: INVALID_EMAIL_ADDRESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EMAIL_ADDRESS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_EVENT_NAME")
    @js.native
    def INVALID_EVENT_NAME: typings.parse.mod.ErrorCode.INVALID_EVENT_NAME = js.native
    inline def INVALID_EVENT_NAME_=(x: INVALID_EVENT_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EVENT_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_FILE_NAME")
    @js.native
    def INVALID_FILE_NAME: typings.parse.mod.ErrorCode.INVALID_FILE_NAME = js.native
    inline def INVALID_FILE_NAME_=(x: INVALID_FILE_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_FILE_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_IMAGE_DATA")
    @js.native
    def INVALID_IMAGE_DATA: typings.parse.mod.ErrorCode.INVALID_IMAGE_DATA = js.native
    inline def INVALID_IMAGE_DATA_=(x: INVALID_IMAGE_DATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_IMAGE_DATA")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_JSON")
    @js.native
    def INVALID_JSON: typings.parse.mod.ErrorCode.INVALID_JSON = js.native
    inline def INVALID_JSON_=(x: INVALID_JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_JSON")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_KEY_NAME")
    @js.native
    def INVALID_KEY_NAME: typings.parse.mod.ErrorCode.INVALID_KEY_NAME = js.native
    inline def INVALID_KEY_NAME_=(x: INVALID_KEY_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_KEY_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_LINKED_SESSION")
    @js.native
    def INVALID_LINKED_SESSION: typings.parse.mod.ErrorCode.INVALID_LINKED_SESSION = js.native
    inline def INVALID_LINKED_SESSION_=(x: INVALID_LINKED_SESSION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_LINKED_SESSION")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_NESTED_KEY")
    @js.native
    def INVALID_NESTED_KEY: typings.parse.mod.ErrorCode.INVALID_NESTED_KEY = js.native
    inline def INVALID_NESTED_KEY_=(x: INVALID_NESTED_KEY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_NESTED_KEY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_POINTER")
    @js.native
    def INVALID_POINTER: typings.parse.mod.ErrorCode.INVALID_POINTER = js.native
    inline def INVALID_POINTER_=(x: INVALID_POINTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_PUSH_TIME_ERROR")
    @js.native
    def INVALID_PUSH_TIME_ERROR: typings.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
    inline def INVALID_PUSH_TIME_ERROR_=(x: INVALID_PUSH_TIME_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PUSH_TIME_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_QUERY")
    @js.native
    def INVALID_QUERY: typings.parse.mod.ErrorCode.INVALID_QUERY = js.native
    inline def INVALID_QUERY_=(x: INVALID_QUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_QUERY")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_ROLE_NAME")
    @js.native
    def INVALID_ROLE_NAME: typings.parse.mod.ErrorCode.INVALID_ROLE_NAME = js.native
    inline def INVALID_ROLE_NAME_=(x: INVALID_ROLE_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ROLE_NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.INVALID_SESSION_TOKEN")
    @js.native
    def INVALID_SESSION_TOKEN: typings.parse.mod.ErrorCode.INVALID_SESSION_TOKEN = js.native
    inline def INVALID_SESSION_TOKEN_=(x: INVALID_SESSION_TOKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SESSION_TOKEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.LINKED_ID_MISSING")
    @js.native
    def LINKED_ID_MISSING: typings.parse.mod.ErrorCode.LINKED_ID_MISSING = js.native
    inline def LINKED_ID_MISSING_=(x: LINKED_ID_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_ID_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MISSING_CONTENT_LENGTH")
    @js.native
    def MISSING_CONTENT_LENGTH: typings.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
    inline def MISSING_CONTENT_LENGTH_=(x: MISSING_CONTENT_LENGTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MISSING_CONTENT_TYPE")
    @js.native
    def MISSING_CONTENT_TYPE: typings.parse.mod.ErrorCode.MISSING_CONTENT_TYPE = js.native
    inline def MISSING_CONTENT_TYPE_=(x: MISSING_CONTENT_TYPE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_CONTENT_TYPE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MISSING_OBJECT_ID")
    @js.native
    def MISSING_OBJECT_ID: typings.parse.mod.ErrorCode.MISSING_OBJECT_ID = js.native
    inline def MISSING_OBJECT_ID_=(x: MISSING_OBJECT_ID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_OBJECT_ID")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.MUST_CREATE_USER_THROUGH_SIGNUP")
    @js.native
    def MUST_CREATE_USER_THROUGH_SIGNUP: typings.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
    inline def MUST_CREATE_USER_THROUGH_SIGNUP_=(x: MUST_CREATE_USER_THROUGH_SIGNUP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUST_CREATE_USER_THROUGH_SIGNUP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.NOT_INITIALIZED")
    @js.native
    def NOT_INITIALIZED: typings.parse.mod.ErrorCode.NOT_INITIALIZED = js.native
    inline def NOT_INITIALIZED_=(x: NOT_INITIALIZED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_INITIALIZED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OBJECT_NOT_FOUND")
    @js.native
    def OBJECT_NOT_FOUND: typings.parse.mod.ErrorCode.OBJECT_NOT_FOUND = js.native
    inline def OBJECT_NOT_FOUND_=(x: OBJECT_NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OBJECT_TOO_LARGE")
    @js.native
    def OBJECT_TOO_LARGE: typings.parse.mod.ErrorCode.OBJECT_TOO_LARGE = js.native
    inline def OBJECT_TOO_LARGE_=(x: OBJECT_TOO_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_TOO_LARGE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OPERATION_FORBIDDEN")
    @js.native
    def OPERATION_FORBIDDEN: typings.parse.mod.ErrorCode.OPERATION_FORBIDDEN = js.native
    inline def OPERATION_FORBIDDEN_=(x: OPERATION_FORBIDDEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION_FORBIDDEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.OTHER_CAUSE")
    @js.native
    def OTHER_CAUSE: typings.parse.mod.ErrorCode.OTHER_CAUSE = js.native
    inline def OTHER_CAUSE_=(x: OTHER_CAUSE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER_CAUSE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.PASSWORD_MISSING")
    @js.native
    def PASSWORD_MISSING: typings.parse.mod.ErrorCode.PASSWORD_MISSING = js.native
    inline def PASSWORD_MISSING_=(x: PASSWORD_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.PUSH_MISCONFIGURED")
    @js.native
    def PUSH_MISCONFIGURED: typings.parse.mod.ErrorCode.PUSH_MISCONFIGURED = js.native
    inline def PUSH_MISCONFIGURED_=(x: PUSH_MISCONFIGURED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUSH_MISCONFIGURED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.REQUEST_LIMIT_EXCEEDED")
    @js.native
    def REQUEST_LIMIT_EXCEEDED: typings.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
    inline def REQUEST_LIMIT_EXCEEDED_=(x: REQUEST_LIMIT_EXCEEDED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_LIMIT_EXCEEDED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.SCRIPT_FAILED")
    @js.native
    def SCRIPT_FAILED: typings.parse.mod.ErrorCode.SCRIPT_FAILED = js.native
    inline def SCRIPT_FAILED_=(x: SCRIPT_FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_FAILED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.SESSION_MISSING")
    @js.native
    def SESSION_MISSING: typings.parse.mod.ErrorCode.SESSION_MISSING = js.native
    inline def SESSION_MISSING_=(x: SESSION_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.TIMEOUT")
    @js.native
    def TIMEOUT: typings.parse.mod.ErrorCode.TIMEOUT = js.native
    inline def TIMEOUT_=(x: TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.UNSAVED_FILE_ERROR")
    @js.native
    def UNSAVED_FILE_ERROR: typings.parse.mod.ErrorCode.UNSAVED_FILE_ERROR = js.native
    inline def UNSAVED_FILE_ERROR_=(x: UNSAVED_FILE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSAVED_FILE_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.UNSUPPORTED_SERVICE")
    @js.native
    def UNSUPPORTED_SERVICE: typings.parse.mod.ErrorCode.UNSUPPORTED_SERVICE = js.native
    inline def UNSUPPORTED_SERVICE_=(x: UNSUPPORTED_SERVICE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_SERVICE")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.USERNAME_MISSING")
    @js.native
    def USERNAME_MISSING: typings.parse.mod.ErrorCode.USERNAME_MISSING = js.native
    inline def USERNAME_MISSING_=(x: USERNAME_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USERNAME_MISSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.USERNAME_TAKEN")
    @js.native
    def USERNAME_TAKEN: typings.parse.mod.ErrorCode.USERNAME_TAKEN = js.native
    inline def USERNAME_TAKEN_=(x: USERNAME_TAKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USERNAME_TAKEN")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.VALIDATION_ERROR")
    @js.native
    def VALIDATION_ERROR: typings.parse.mod.ErrorCode.VALIDATION_ERROR = js.native
    inline def VALIDATION_ERROR_=(x: VALIDATION_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALIDATION_ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("parse/react-native", "Error.X_DOMAIN_REQUEST")
    @js.native
    def X_DOMAIN_REQUEST: typings.parse.mod.ErrorCode.X_DOMAIN_REQUEST = js.native
    inline def X_DOMAIN_REQUEST_=(x: X_DOMAIN_REQUEST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X_DOMAIN_REQUEST")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("parse/react-native", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.parse.mod.ErrorCode & Double] = js.native
    
    /* 208 */ val ACCOUNT_ALREADY_LINKED: typings.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED & Double = js.native
    
    /* 600 */ val AGGREGATE_ERROR: typings.parse.mod.ErrorCode.AGGREGATE_ERROR & Double = js.native
    
    /* 120 */ val CACHE_MISS: typings.parse.mod.ErrorCode.CACHE_MISS & Double = js.native
    
    /* 108 */ val COMMAND_UNAVAILABLE: typings.parse.mod.ErrorCode.COMMAND_UNAVAILABLE & Double = js.native
    
    /* 100 */ val CONNECTION_FAILED: typings.parse.mod.ErrorCode.CONNECTION_FAILED & Double = js.native
    
    /* 137 */ val DUPLICATE_VALUE: typings.parse.mod.ErrorCode.DUPLICATE_VALUE & Double = js.native
    
    /* 204 */ val EMAIL_MISSING: typings.parse.mod.ErrorCode.EMAIL_MISSING & Double = js.native
    
    /* 205 */ val EMAIL_NOT_FOUND: typings.parse.mod.ErrorCode.EMAIL_NOT_FOUND & Double = js.native
    
    /* 203 */ val EMAIL_TAKEN: typings.parse.mod.ErrorCode.EMAIL_TAKEN & Double = js.native
    
    /* 140 */ val EXCEEDED_QUOTA: typings.parse.mod.ErrorCode.EXCEEDED_QUOTA & Double = js.native
    
    /* 153 */ val FILE_DELETE_ERROR: typings.parse.mod.ErrorCode.FILE_DELETE_ERROR & Double = js.native
    
    /* 601 */ val FILE_READ_ERROR: typings.parse.mod.ErrorCode.FILE_READ_ERROR & Double = js.native
    
    /* 130 */ val FILE_SAVE_ERROR: typings.parse.mod.ErrorCode.FILE_SAVE_ERROR & Double = js.native
    
    /* 129 */ val FILE_TOO_LARGE: typings.parse.mod.ErrorCode.FILE_TOO_LARGE & Double = js.native
    
    /* 111 */ val INCORRECT_TYPE: typings.parse.mod.ErrorCode.INCORRECT_TYPE & Double = js.native
    
    /* 1 */ val INTERNAL_SERVER_ERROR: typings.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR & Double = js.native
    
    /* 123 */ val INVALID_ACL: typings.parse.mod.ErrorCode.INVALID_ACL & Double = js.native
    
    /* 112 */ val INVALID_CHANNEL_NAME: typings.parse.mod.ErrorCode.INVALID_CHANNEL_NAME & Double = js.native
    
    /* 103 */ val INVALID_CLASS_NAME: typings.parse.mod.ErrorCode.INVALID_CLASS_NAME & Double = js.native
    
    /* 128 */ val INVALID_CONTENT_LENGTH: typings.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH & Double = js.native
    
    /* 125 */ val INVALID_EMAIL_ADDRESS: typings.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS & Double = js.native
    
    /* 160 */ val INVALID_EVENT_NAME: typings.parse.mod.ErrorCode.INVALID_EVENT_NAME & Double = js.native
    
    /* 122 */ val INVALID_FILE_NAME: typings.parse.mod.ErrorCode.INVALID_FILE_NAME & Double = js.native
    
    /* 150 */ val INVALID_IMAGE_DATA: typings.parse.mod.ErrorCode.INVALID_IMAGE_DATA & Double = js.native
    
    /* 107 */ val INVALID_JSON: typings.parse.mod.ErrorCode.INVALID_JSON & Double = js.native
    
    /* 105 */ val INVALID_KEY_NAME: typings.parse.mod.ErrorCode.INVALID_KEY_NAME & Double = js.native
    
    /* 251 */ val INVALID_LINKED_SESSION: typings.parse.mod.ErrorCode.INVALID_LINKED_SESSION & Double = js.native
    
    /* 121 */ val INVALID_NESTED_KEY: typings.parse.mod.ErrorCode.INVALID_NESTED_KEY & Double = js.native
    
    /* 106 */ val INVALID_POINTER: typings.parse.mod.ErrorCode.INVALID_POINTER & Double = js.native
    
    /* 152 */ val INVALID_PUSH_TIME_ERROR: typings.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR & Double = js.native
    
    /* 102 */ val INVALID_QUERY: typings.parse.mod.ErrorCode.INVALID_QUERY & Double = js.native
    
    /* 139 */ val INVALID_ROLE_NAME: typings.parse.mod.ErrorCode.INVALID_ROLE_NAME & Double = js.native
    
    /* 209 */ val INVALID_SESSION_TOKEN: typings.parse.mod.ErrorCode.INVALID_SESSION_TOKEN & Double = js.native
    
    /* 250 */ val LINKED_ID_MISSING: typings.parse.mod.ErrorCode.LINKED_ID_MISSING & Double = js.native
    
    /* 127 */ val MISSING_CONTENT_LENGTH: typings.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH & Double = js.native
    
    /* 126 */ val MISSING_CONTENT_TYPE: typings.parse.mod.ErrorCode.MISSING_CONTENT_TYPE & Double = js.native
    
    /* 104 */ val MISSING_OBJECT_ID: typings.parse.mod.ErrorCode.MISSING_OBJECT_ID & Double = js.native
    
    /* 207 */ val MUST_CREATE_USER_THROUGH_SIGNUP: typings.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP & Double = js.native
    
    /* 109 */ val NOT_INITIALIZED: typings.parse.mod.ErrorCode.NOT_INITIALIZED & Double = js.native
    
    /* 101 */ val OBJECT_NOT_FOUND: typings.parse.mod.ErrorCode.OBJECT_NOT_FOUND & Double = js.native
    
    /* 116 */ val OBJECT_TOO_LARGE: typings.parse.mod.ErrorCode.OBJECT_TOO_LARGE & Double = js.native
    
    /* 119 */ val OPERATION_FORBIDDEN: typings.parse.mod.ErrorCode.OPERATION_FORBIDDEN & Double = js.native
    
    /* -1 */ val OTHER_CAUSE: typings.parse.mod.ErrorCode.OTHER_CAUSE & Double = js.native
    
    /* 201 */ val PASSWORD_MISSING: typings.parse.mod.ErrorCode.PASSWORD_MISSING & Double = js.native
    
    /* 115 */ val PUSH_MISCONFIGURED: typings.parse.mod.ErrorCode.PUSH_MISCONFIGURED & Double = js.native
    
    /* 155 */ val REQUEST_LIMIT_EXCEEDED: typings.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED & Double = js.native
    
    /* 141 */ val SCRIPT_FAILED: typings.parse.mod.ErrorCode.SCRIPT_FAILED & Double = js.native
    
    /* 206 */ val SESSION_MISSING: typings.parse.mod.ErrorCode.SESSION_MISSING & Double = js.native
    
    /* 124 */ val TIMEOUT: typings.parse.mod.ErrorCode.TIMEOUT & Double = js.native
    
    /* 151 */ val UNSAVED_FILE_ERROR: typings.parse.mod.ErrorCode.UNSAVED_FILE_ERROR & Double = js.native
    
    /* 252 */ val UNSUPPORTED_SERVICE: typings.parse.mod.ErrorCode.UNSUPPORTED_SERVICE & Double = js.native
    
    /* 200 */ val USERNAME_MISSING: typings.parse.mod.ErrorCode.USERNAME_MISSING & Double = js.native
    
    /* 202 */ val USERNAME_TAKEN: typings.parse.mod.ErrorCode.USERNAME_TAKEN & Double = js.native
    
    /* 142 */ val VALIDATION_ERROR: typings.parse.mod.ErrorCode.VALIDATION_ERROR & Double = js.native
    
    /* 602 */ val X_DOMAIN_REQUEST: typings.parse.mod.ErrorCode.X_DOMAIN_REQUEST & Double = js.native
  }
  
  /**
    * Provides a set of utilities for using Parse with Facebook.
    * Provides a set of utilities for using Parse with Facebook.
    */
  object FacebookUtils {
    
    @JSImport("parse/react-native", "FacebookUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(options: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isLinked(user: typings.parse.mod.global.Parse.User[Attributes]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinked")(user.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def link(user: typings.parse.mod.global.Parse.User[Attributes], permissions: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def link(
      user: typings.parse.mod.global.Parse.User[Attributes],
      permissions: js.Any,
      options: SuccessFailureOptions
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(user.asInstanceOf[js.Any], permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logIn(permissions: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def logIn(permissions: js.Any, options: FullOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logIn")(permissions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def unlink(user: typings.parse.mod.global.Parse.User[Attributes]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def unlink(user: typings.parse.mod.global.Parse.User[Attributes], options: SuccessFailureOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(user.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * A Parse.File is a local representation of a file that is saved to the Parse
    * cloud.
    * @param name The file's name. This will be prefixed by a unique
    *     value once the file has finished saving. The file name must begin with
    *     an alphanumeric character, and consist of alphanumeric characters,
    *     periods, spaces, underscores, or dashes.
    * @param data The data for the file, as either:
    *     1. an Array of byte value Numbers, or
    *     2. an Object like { base64: "..." } with a base64-encoded String.
    *     3. a File object selected with a file upload control. (3) only works
    *        in Firefox 3.6+, Safari 6.0.2+, Chrome 7+, and IE 10+.
    *        For example:<pre>
    * var fileUploadControl = $("#profilePhotoFileUpload")[0];
    * if (fileUploadControl.files.length > 0) {
    *   var file = fileUploadControl.files[0];
    *   var name = "photo.jpg";
    *   var parseFile = new Parse.File(name, file);
    *   parseFile.save().then(function() {
    *     // The file has been saved to Parse.
    *   }, function(error) {
    *     // The file either could not be read, or could not be saved to Parse.
    *   });
    * }</pre>
    * @param type Optional Content-Type header to use for the file. If
    *     this is omitted, the content type will be inferred from the name's
    *     extension.
    */
  @JSImport("parse/react-native", "File")
  @js.native
  class File protected ()
    extends typings.parse.mod.File {
    def this(name: String, data: js.Array[Double]) = this()
    def this(name: String, data: Base64) = this()
    def this(name: String, data: Size) = this()
    def this(name: String, data: Uri) = this()
    def this(name: String, data: js.Array[Double], `type`: String) = this()
    def this(name: String, data: Base64, `type`: String) = this()
    def this(name: String, data: Size, `type`: String) = this()
    def this(name: String, data: Uri, `type`: String) = this()
  }
  
  /**
    * Creates a new GeoPoint with any of the following forms:<br>
    *   <pre>
    *   new GeoPoint(otherGeoPoint)
    *   new GeoPoint(30, 30)
    *   new GeoPoint([30, 30])
    *   new GeoPoint({latitude: 30, longitude: 30})
    *   new GeoPoint()  // defaults to (0, 0)
    *   </pre>
    *
    * <p>Represents a latitude / longitude point that may be associated
    * with a key in a ParseObject or used as a reference point for geo queries.
    * This allows proximity-based queries on the key.</p>
    *
    * <p>Only one key in a class may contain a GeoPoint.</p>
    *
    * <p>Example:<pre>
    *   var point = new Parse.GeoPoint(30.0, -20.0);
    *   var object = new Parse.Object("PlaceObject");
    *   object.set("location", point);
    *   object.save();</pre></p>
    */
  @JSImport("parse/react-native", "GeoPoint")
  @js.native
  class GeoPoint ()
    extends typings.parse.mod.GeoPoint {
    def this(coords: js.Tuple2[Double, Double]) = this()
    def this(coords: Latitude) = this()
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @JSImport("parse/react-native", "Installation")
  @js.native
  val Installation: InstallationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "Installation")
  @js.native
  class InstallationCls[T /* <: Attributes */] protected ()
    extends StObject
       with typings.parse.mod.global.Parse.Installation[T] {
    def this(attributes: T) = this()
  }
  
  /**
    * Represents a LiveQuery Subscription.
    *
    * @see https://docs.parseplatform.org/js/guide/#live-queries
    * @see NodeJS.EventEmitter
    *
    * Events list
    * ---
    * `open` - when you call `query.subscribe()`, we send a subscribe request to
    * the LiveQuery server, when we get the confirmation from the LiveQuery server,
    * this event will be emitted. When the client loses WebSocket connection to the
    * LiveQuery server, we will try to auto reconnect the LiveQuery server. If we
    * reconnect the LiveQuery server and successfully resubscribe the ParseQuery,
    * you'll also get this event.
    *
    * ```
    * subscription.on('open', () => {});
    * ```
    * ---
    * `create` - when a new ParseObject is created and it fulfills the ParseQuery you subscribe,
    * you'll get this event. The object is the ParseObject which is created.
    *
    * ```
    * subscription.on('create', (object: Parse.Object) => {});
    * ```
    * ---
    * `update` event - when an existing ParseObject which fulfills the ParseQuery you subscribe
    * is updated (The ParseObject fulfills the ParseQuery before and after changes),
    * you'll get this event. The object is the ParseObject which is updated.
    * Its content is the latest value of the ParseObject.
    *
    * ```
    * subscription.on('update', (object: Parse.Object) => {});
    * ```
    * ---
    * `enter` event - when an existing ParseObject's old value doesn't fulfill the ParseQuery
    * but its new value fulfills the ParseQuery, you'll get this event. The object is the
    * ParseObject which enters the ParseQuery. Its content is the latest value of the ParseObject.
    *
    * ```
    * subscription.on('enter', (object: Parse.Object) => {});
    * ```
    * ---
    * `update` event - when an existing ParseObject's old value fulfills the ParseQuery but its new value
    * doesn't fulfill the ParseQuery, you'll get this event. The object is the ParseObject
    * which leaves the ParseQuery. Its content is the latest value of the ParseObject.
    *
    * ```
    * subscription.on('leave', (object: Parse.Object) => {});
    * ```
    * ---
    * `delete` event - when an existing ParseObject which fulfills the ParseQuery is deleted, you'll
    * get this event. The object is the ParseObject which is deleted.
    *
    * ```
    * subscription.on('delete', (object: Parse.Object) => {});
    * ```
    * ---
    * `close` event - when the client loses the WebSocket connection to the LiveQuery
    * server and we stop receiving events, you'll get this event.
    *
    * ```
    * subscription.on('close', () => {});
    * ```
    */
  @JSImport("parse/react-native", "LiveQuerySubscription")
  @js.native
  class LiveQuerySubscription protected ()
    extends typings.parse.mod.LiveQuerySubscription {
    /**
      * Creates an instance of LiveQuerySubscription.
      *
      * @param id
      * @param query
      * @param [sessionToken]
      */
    def this(id: String, query: String) = this()
    def this(id: String, query: String, sessionToken: String) = this()
  }
  
  object Object extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("parse/react-native", "Object")
    @js.native
    class ^[T /* <: Attributes */] protected ()
      extends StObject
         with typings.parse.mod.global.Parse.Object[T] {
      def this(className: String, attributes: T) = this()
      def this(className: String, attributes: T, options: js.Any) = this()
    }
    
    @JSImport("parse/react-native", "Object")
    @js.native
    val ^ : js.Object & ObjectConstructor = js.native
    
    type _To = js.Object & ObjectConstructor
    
    /* This means you don't have to write `^`, but can instead just say `Object.foo` */
    override def _to: js.Object & ObjectConstructor = ^
  }
  
  @JSImport("parse/react-native", "Polygon")
  @js.native
  class Polygon protected ()
    extends typings.parse.mod.Polygon {
    def this(arg1: js.Array[js.Array[Double] | typings.parse.mod.global.Parse.GeoPoint]) = this()
  }
  
  /**
    * Contains functions to deal with Push in Parse
    */
  object Push {
    
    @JSImport("parse/react-native", "Push")
    @js.native
    val ^ : js.Any = js.native
    
    inline def send[T](data: PushData): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
    inline def send[T](data: PushData, options: SendOptions): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  }
  
  /**
    * Creates a new parse Parse.Query for the given Parse.Object subclass.
    * @param objectClass -
    *   An instance of a subclass of Parse.Object, or a Parse className string.
    *
    * <p>Parse.Query defines a query that is used to fetch Parse.Objects. The
    * most common use case is finding all objects that match a query through the
    * <code>find</code> method. For example, this sample code fetches all objects
    * of class <code>MyClass</code>. It calls a different function depending on
    * whether the fetch succeeded or not.
    *
    * <pre>
    * var query = new Parse.Query(MyClass);
    * query.find({
    *   success: function(results) {
    *     // results is an array of Parse.Object.
    *   },
    *
    *   error: function(error) {
    *     // error is an instance of Parse.Error.
    *   }
    * });</pre></p>
    *
    * <p>A Parse.Query can also be used to retrieve a single object whose id is
    * known, through the get method. For example, this sample code fetches an
    * object of class <code>MyClass</code> and id <code>myId</code>. It calls a
    * different function depending on whether the fetch succeeded or not.
    *
    * <pre>
    * var query = new Parse.Query(MyClass);
    * query.get(myId, {
    *   success: function(object) {
    *     // object is an instance of Parse.Object.
    *   },
    *
    *   error: function(object, error) {
    *     // error is an instance of Parse.Error.
    *   }
    * });</pre></p>
    *
    * <p>A Parse.Query can also be used to count the number of objects that match
    * the query without retrieving all of those objects. For example, this
    * sample code counts the number of objects of the class <code>MyClass</code>
    * <pre>
    * var query = new Parse.Query(MyClass);
    * query.count({
    *   success: function(number) {
    *     // There are number instances of MyClass.
    *   },
    *
    *   error: function(error) {
    *     // error is an instance of Parse.Error.
    *   }
    * });</pre></p>
    */
  @JSImport("parse/react-native", "Query")
  @js.native
  class Query[T /* <: Object[Attributes] */] protected ()
    extends typings.parse.mod.Query[T] {
    def this(objectClass: String) = this()
    def this(objectClass: Instantiable1[/* args (repeated) */ js.Any, T | Object[Attributes]]) = this()
  }
  object Query {
    
    @JSImport("parse/react-native", "Query")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def and[U /* <: Object[Attributes] */](args: typings.parse.mod.global.Parse.Query[U]*): typings.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(args.asInstanceOf[js.Any]).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
    
    /* static member */
    inline def fromJSON[U /* <: Object[Attributes] */](className: String, json: js.Any): typings.parse.mod.global.Parse.Query[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(className.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
    
    /* static member */
    inline def nor[U /* <: Object[Attributes] */](args: typings.parse.mod.global.Parse.Query[U]*): typings.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("nor")(args.asInstanceOf[js.Any]).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
    
    /* static member */
    inline def or[U /* <: Object[Attributes] */](var_args: typings.parse.mod.global.Parse.Query[U]*): typings.parse.mod.global.Parse.Query[U] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(var_args.asInstanceOf[js.Any]).asInstanceOf[typings.parse.mod.global.Parse.Query[U]]
  }
  
  /**
    * A class that is used to access all of the children of a many-to-many relationship.
    * Each instance of Parse.Relation is associated with a particular parent object and key.
    */
  @JSImport("parse/react-native", "Relation")
  @js.native
  class Relation[S /* <: Object[Attributes] */, T /* <: Object[Attributes] */] ()
    extends typings.parse.mod.Relation[S, T] {
    def this(parent: S) = this()
    def this(parent: S, key: String) = this()
    def this(parent: Unit, key: String) = this()
  }
  
  @JSImport("parse/react-native", "Role")
  @js.native
  val Role: RoleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "Role")
  @js.native
  class RoleCls[T /* <: Attributes */] protected ()
    extends StObject
       with typings.parse.mod.global.Parse.Role[Partial[T]] {
    def this(name: String, acl: typings.parse.mod.global.Parse.ACL) = this()
  }
  
  /**
    * A Parse.Schema object is for handling schema data from Parse.
    * All the schemas methods require MasterKey.
    *
    * @param className Parse Class string
    *
    * https://parseplatform.org/Parse-SDK-JS/api/master/Parse.Schema.html
    *
    * ```
    * const schema = new Parse.Schema('MyClass');
    * schema.addString('field');
    * schema.addIndex('index_name', { field: 1 });
    * schema.save();
    * ```
    */
  @JSImport("parse/react-native", "Schema")
  @js.native
  class Schema[T /* <: Object[Attributes] */] protected ()
    extends typings.parse.mod.Schema[T] {
    def this(className: String) = this()
  }
  object Schema {
    
    @JSImport("parse/react-native", "Schema")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Static method to get all schemas
      *
      * @return A promise that is resolved with the result when
      * the query completes.
      */
    /* static member */
    inline def all(): js.Promise[js.Array[typings.parse.mod.global.Parse.Schema[js.Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[js.Promise[js.Array[typings.parse.mod.global.Parse.Schema[js.Any]]]]
  }
  
  @JSImport("parse/react-native", "Session")
  @js.native
  val Session: SessionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "Session")
  @js.native
  class SessionCls[T /* <: Attributes */] protected ()
    extends StObject
       with typings.parse.mod.global.Parse.Session[T] {
    def this(attributes: T) = this()
  }
  
  @JSImport("parse/react-native", "User")
  @js.native
  val User: UserConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("parse/react-native", "User")
  @js.native
  class UserCls[T /* <: Attributes */] protected ()
    extends StObject
       with typings.parse.mod.global.Parse.User[T] {
    def this(attributes: T) = this()
  }
  
  @JSImport("parse/react-native", "applicationId")
  @js.native
  def applicationId: String = js.native
  inline def applicationId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(x.asInstanceOf[js.Any])
  
  /**
    * Gets all contents from Local Datastore.
    */
  inline def dumpLocalDatastore(): js.Promise[StringDictionary[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dumpLocalDatastore")().asInstanceOf[js.Promise[StringDictionary[js.Any]]]
  
  /**
    * Enable the current user encryption.
    * This must be called before login any user.
    */
  inline def enableEncryptedUser(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableEncryptedUser")().asInstanceOf[Unit]
  
  /**
    * Enable pinning in your application.
    * This must be called before your application can use pinning.
    */
  inline def enableLocalDatastore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLocalDatastore")().asInstanceOf[Unit]
  
  @JSImport("parse/react-native", "encryptedUser")
  @js.native
  def encryptedUser: Boolean = js.native
  inline def encryptedUser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encryptedUser")(x.asInstanceOf[js.Any])
  
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param applicationId Your Parse Application ID.
    * @param javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  inline def initialize(applicationId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def initialize(applicationId: String, javaScriptKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(applicationId: String, javaScriptKey: String, masterKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(applicationId: String, javaScriptKey: Unit, masterKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Flag that indicates whether Encrypted User is enabled.
    */
  inline def isEncryptedUserEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncryptedUserEnabled")().asInstanceOf[Boolean]
  
  /**
    * Flag that indicates whether Local Datastore is enabled.
    */
  inline def isLocalDatastoreEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalDatastoreEnabled")().asInstanceOf[Boolean]
  
  @JSImport("parse/react-native", "javaScriptKey")
  @js.native
  def javaScriptKey: js.UndefOr[String] = js.native
  inline def javaScriptKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("javaScriptKey")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "liveQueryServerURL")
  @js.native
  def liveQueryServerURL: String = js.native
  inline def liveQueryServerURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("liveQueryServerURL")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "masterKey")
  @js.native
  def masterKey: js.UndefOr[String] = js.native
  inline def masterKey_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "secret")
  @js.native
  def secret: String = js.native
  inline def secret_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secret")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "serverAuthToken")
  @js.native
  def serverAuthToken: js.UndefOr[String] = js.native
  inline def serverAuthToken_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthToken")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "serverAuthType")
  @js.native
  def serverAuthType: js.UndefOr[String] = js.native
  inline def serverAuthType_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthType")(x.asInstanceOf[js.Any])
  
  @JSImport("parse/react-native", "serverURL")
  @js.native
  def serverURL: String = js.native
  inline def serverURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(x.asInstanceOf[js.Any])
  
  /**
    * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
    * @param AsyncStorage AsyncStorage from 'react-native' package
    */
  inline def setAsyncStorage(AsyncStorage: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncStorage")(AsyncStorage.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLocalDatastoreController(controller: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocalDatastoreController")(controller.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * A Parse.Op is an atomic operation that can be applied to a field in a
    * Parse.Object. For example, calling <code>object.set("foo", "bar")</code>
    * is an example of a Parse.Op.Set. Calling <code>object.unset("foo")</code>
    * is a Parse.Op.Unset. These operations are stored in a Parse.Object and
    * sent to the server as part of <code>object.save()</code> operations.
    * Instances of Parse.Op should be immutable.
    *
    * You should not create subclasses of Parse.Op or instantiate Parse.Op
    * directly.
    */
  object Op
}
