package typings.parse.mod

import org.scalablytyped.runtime.Instantiable0
import typings.parse.anon.Instantiable
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
import typings.parse.mod.global.Parse.Cloud.Validator
import typings.std.PromiseLike
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
  open class HTTPOptionsCls ()
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
  
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: Unit,
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")().asInstanceOf[Unit]
  inline def afterDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterDeleteFile(
    func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDeleteFile(
    func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDeleteFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterDeleteFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterFindRequest[T], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ AfterFindRequest[T], Any],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterFindRequest[T], Any], validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: js.Function1[/* request */ AfterFindRequest[T], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterFindRequest[T], Any],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterFindRequest[T], Any],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: Unit,
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")().asInstanceOf[Unit]
  inline def afterLogin(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.User[Attributes]], 
      PromiseLike[Unit] | Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterLogin(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.User[Attributes]], 
      PromiseLike[Unit] | Unit
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterLogin(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.User[Attributes]], 
      PromiseLike[Unit] | Unit
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterLogin(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterLogin(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogin")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterLogout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")().asInstanceOf[Unit]
  inline def afterLogout(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.Session[Attributes]], 
      PromiseLike[Unit] | Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterLogout(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.Session[Attributes]], 
      PromiseLike[Unit] | Unit
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterLogout(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.Session[Attributes]], 
      PromiseLike[Unit] | Unit
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterLogout(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterLogout(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterLogout")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ AfterSaveRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: Unit,
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def afterSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")().asInstanceOf[Unit]
  inline def afterSaveFile(func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def afterSaveFile(
    func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSaveFile(
    func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSaveFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def afterSaveFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("afterSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ BeforeDeleteRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: Unit,
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDelete[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDelete")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeDeleteFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")().asInstanceOf[Unit]
  inline def beforeDeleteFile(func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeDeleteFile(
    func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDeleteFile(
    func: js.Function1[/* request */ FileTriggerRequest, PromiseLike[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDeleteFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeDeleteFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeDeleteFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[
      /* request */ BeforeFindRequest[T], 
      (js.Promise[typings.parse.mod.global.Parse.Query[T] | Unit]) | typings.parse.mod.global.Parse.Query[T] | Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[
      /* request */ BeforeFindRequest[T], 
      (js.Promise[typings.parse.mod.global.Parse.Query[T] | Unit]) | typings.parse.mod.global.Parse.Query[T] | Unit
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[
      /* request */ BeforeFindRequest[T], 
      (js.Promise[typings.parse.mod.global.Parse.Query[T] | Unit]) | typings.parse.mod.global.Parse.Query[T] | Unit
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[
      /* request */ BeforeFindRequest[T], 
      (js.Promise[typings.parse.mod.global.Parse.Query[T] | Unit]) | typings.parse.mod.global.Parse.Query[T] | Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[
      /* request */ BeforeFindRequest[T], 
      (js.Promise[typings.parse.mod.global.Parse.Query[T] | Unit]) | typings.parse.mod.global.Parse.Query[T] | Unit
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[
      /* request */ BeforeFindRequest[T], 
      (js.Promise[typings.parse.mod.global.Parse.Query[T] | Unit]) | typings.parse.mod.global.Parse.Query[T] | Unit
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: Unit,
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeFind[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeFind")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeLogin(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")().asInstanceOf[Unit]
  inline def beforeLogin(
    func: js.Function1[
      /* request */ TriggerRequest[typings.parse.mod.global.Parse.User[Attributes]], 
      PromiseLike[Unit] | Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeLogin")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: String,
    func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: String, func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: js.Function1[/* request */ BeforeSaveRequest[T], js.Promise[Unit] | Unit],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](
    arg1: Instantiable[T],
    func: Unit,
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSave[T /* <: typings.parse.mod.global.Parse.Object[Attributes] */](arg1: Instantiable[T], func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSave")(arg1.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def beforeSaveFile(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")().asInstanceOf[Unit]
  inline def beforeSaveFile(
    func: js.Function1[
      /* request */ FileTriggerRequest, 
      PromiseLike[typings.parse.mod.global.Parse.File] | Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def beforeSaveFile(
    func: js.Function1[
      /* request */ FileTriggerRequest, 
      PromiseLike[typings.parse.mod.global.Parse.File] | Unit
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSaveFile(
    func: js.Function1[
      /* request */ FileTriggerRequest, 
      PromiseLike[typings.parse.mod.global.Parse.File] | Unit
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSaveFile(func: Unit, validator: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def beforeSaveFile(func: Unit, validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("beforeSaveFile")(func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def define(name: String, func: js.Function1[/* request */ FunctionRequest[Params], Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define(
    name: String,
    func: js.Function1[/* request */ FunctionRequest[Params], Any],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define(name: String, func: js.Function1[/* request */ FunctionRequest[Params], Any], validator: Validator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def define_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
    Any
  ] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
      ], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
    Any
  ] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
      ], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
    Any
  ] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
      ], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def define_T[T /* <: js.Function0[Any] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[js.Object], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define_T[T /* <: js.Function0[Any] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[js.Object], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ],
    validator: js.Function1[/* request */ FunctionRequest[Params], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def define_T[T /* <: js.Function0[Any] */](
    name: String,
    func: js.Function1[
      /* request */ FunctionRequest[js.Object], 
      js.Promise[ReturnType[T]] | ReturnType[T]
    ],
    validator: Validator
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("define")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets job status by Id
    * @param jobStatusId The Id of Job Status.
    * @returns Status of Job.
    */
  inline def getJobStatus(jobStatusId: String): js.Promise[typings.parse.mod.global.Parse.Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobStatus")(jobStatusId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Object[Attributes]]]
  
  /**
    * Gets data for the current set of cloud jobs.
    * @returns A promise that will be resolved with the result of the function.
    */
  inline def getJobsData(): js.Promise[typings.parse.mod.global.Parse.Object[Attributes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobsData")().asInstanceOf[js.Promise[typings.parse.mod.global.Parse.Object[Attributes]]]
  
  inline def httpRequest(options: HTTPOptions): js.Promise[HttpResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HttpResponse]]
  
  inline def job(name: String): HttpResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any]).asInstanceOf[HttpResponse]
  inline def job(name: String, func: js.Function1[/* request */ JobRequest[Params], js.Promise[Unit] | Unit]): HttpResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("job")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[HttpResponse]
  
  inline def run(name: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def run(name: String, data: Unit, options: RunOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def run(name: String, data: Params): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def run(name: String, data: Params, options: RunOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def run[T /* <: js.Function0[Any] */](name: String, data: Null, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  
  inline def run_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
    Any
  ] */](
    name: String,
    data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any
  ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  inline def run_0[T /* <: js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof std.Parameters<T>[0] ]: std.Parameters<T>[0][P]} */ /* param */ js.Any, 
    Any
  ] */](
    name: String,
    data: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>[0] */ js.Any,
    options: RunOptions
  ): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  
  inline def run_T[T /* <: js.Function0[Any] */](name: String): js.Promise[ReturnType[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType[T]]]
  inline def run_T[T /* <: js.Function0[Any] */](name: String, data: Unit, options: RunOptions): js.Promise[ReturnType[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType[T]]]
  
  /**
    * Starts a given cloud job, which will process asynchronously.
    * @param jobName The function name.
    * @param data The parameters to send to the cloud function.
    * @returns A promise that will be resolved with the jobStatusId of the job.
    */
  inline def startJob(jobName: String, data: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("startJob")(jobName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def useMasterKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useMasterKey")().asInstanceOf[Unit]
}
