package typings.parseMockdb

import typings.parse.mod.global.Parse.Cloud.BeforeSaveRequest
import typings.parseMockdb.ParseMockDB.HookType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-mockdb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def cleanUp(): Unit = js.native
  
  def mockDB(): Unit = js.native
  
  def promiseResultSync[T](
    promise: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<T> */ js.Any
  ): T = js.native
  
  def registerHook(
    className: String,
    hookType: HookType,
    hookFn: js.Function1[
      /* request */ BeforeSaveRequest, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ _
    ]
  ): Unit = js.native
  
  def unMockDB(): Unit = js.native
}
