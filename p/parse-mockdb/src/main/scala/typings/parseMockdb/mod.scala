package typings.parseMockdb

import typings.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typings.parseMockdb.ParseMockDB.HookType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-mockdb", "cleanUp")
  @js.native
  def cleanUp(): Unit = js.native
  
  @JSImport("parse-mockdb", "mockDB")
  @js.native
  def mockDB(): Unit = js.native
  
  @JSImport("parse-mockdb", "promiseResultSync")
  @js.native
  def promiseResultSync[T](
    promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<T> */ js.Any
  ): T = js.native
  
  @JSImport("parse-mockdb", "registerHook")
  @js.native
  def registerHook(
    className: String,
    hookType: HookType,
    hookFn: js.Function1[
      /* request */ BeforeSaveRequest, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ _
    ]
  ): Unit = js.native
  
  @JSImport("parse-mockdb", "unMockDB")
  @js.native
  def unMockDB(): Unit = js.native
}
