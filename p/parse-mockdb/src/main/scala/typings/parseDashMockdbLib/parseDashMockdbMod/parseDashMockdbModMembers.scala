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
  def promiseResultSync[T](promise: parseLib.ParseNs.IPromise[T]): T = js.native
  def registerHook(
    className: java.lang.String,
    hookType: parseDashMockdbLib.ParseMockDBNs.HookType,
    hookFn: js.Function1[
      /* request */ parseLib.ParseNs.CloudNs.BeforeSaveRequest, 
      parseLib.ParseNs.IPromise[_]
    ]
  ): scala.Unit = js.native
  def unMockDB(): scala.Unit = js.native
}

