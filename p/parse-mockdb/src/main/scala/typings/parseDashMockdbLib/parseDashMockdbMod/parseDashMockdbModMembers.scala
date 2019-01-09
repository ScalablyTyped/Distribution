package typings
package parseDashMockdbLib.parseDashMockdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-mockdb", JSImport.Namespace)
@js.native
object parseDashMockdbModMembers extends js.Object {
  def cleanUp(): scala.Unit = js.native
  def mockDB(): scala.Unit = js.native
  def promiseResultSync[T](
    promise: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Parse.IPromise<T> */ js.Any
  ): T = js.native
  def registerHook(
    className: java.lang.String,
    hookType: parseDashMockdbLib.ParseMockDBNs.HookType,
    hookFn: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.BeforeSaveRequest, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Parse.IPromise<any> */ _
    ]
  ): scala.Unit = js.native
  def unMockDB(): scala.Unit = js.native
}

