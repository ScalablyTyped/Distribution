package typings.parseMockdb

import typings.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typings.parseMockdb.ParseMockDB.HookType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ParseMockDB {
    
    @JSGlobal("ParseMockDB.cleanUp")
    @js.native
    def cleanUp(): Unit = js.native
    
    @JSGlobal("ParseMockDB.mockDB")
    @js.native
    def mockDB(): Unit = js.native
    
    @JSGlobal("ParseMockDB.promiseResultSync")
    @js.native
    def promiseResultSync[T](
      promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<T> */ js.Any
    ): T = js.native
    
    @JSGlobal("ParseMockDB.registerHook")
    @js.native
    def registerHook(
      className: String,
      hookType: HookType,
      hookFn: js.Function1[
          /* request */ BeforeSaveRequest, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ _
        ]
    ): Unit = js.native
    
    @JSGlobal("ParseMockDB.unMockDB")
    @js.native
    def unMockDB(): Unit = js.native
  }
}
