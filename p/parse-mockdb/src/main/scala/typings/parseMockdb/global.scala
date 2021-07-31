package typings.parseMockdb

import typings.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typings.parseMockdb.ParseMockDB.HookType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ParseMockDB {
    
    @JSGlobal("ParseMockDB")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cleanUp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUp")().asInstanceOf[Unit]
    
    @scala.inline
    def mockDB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mockDB")().asInstanceOf[Unit]
    
    @scala.inline
    def promiseResultSync[T](
      promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<T> */ js.Any
    ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseResultSync")(promise.asInstanceOf[js.Any]).asInstanceOf[T]
    
    @scala.inline
    def registerHook(
      className: String,
      hookType: HookType,
      hookFn: js.Function1[
          /* request */ BeforeSaveRequest, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ js.Any
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(className.asInstanceOf[js.Any], hookType.asInstanceOf[js.Any], hookFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def unMockDB(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unMockDB")().asInstanceOf[Unit]
  }
}
