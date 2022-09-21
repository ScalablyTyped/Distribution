package typings.parseMockdb

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typings.parse.mod.global.Parse.Object
import typings.parseMockdb.ParseMockDB.HookType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-mockdb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUp")().asInstanceOf[Unit]
  
  inline def mockDB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockDB")().asInstanceOf[Unit]
  
  inline def promiseResultSync[T](
    promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<T> */ Any
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseResultSync")(promise.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def registerHook(
    className: String,
    hookType: HookType,
    hookFn: js.Function1[
      /* request */ BeforeSaveRequest[Object[Attributes]], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(className.asInstanceOf[js.Any], hookType.asInstanceOf[js.Any], hookFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unMockDB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unMockDB")().asInstanceOf[Unit]
}
