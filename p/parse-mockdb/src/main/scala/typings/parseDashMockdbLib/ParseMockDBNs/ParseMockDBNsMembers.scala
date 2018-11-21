package typings
package parseDashMockdbLib.ParseMockDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ParseMockDB")
@js.native
object ParseMockDBNsMembers extends js.Object {
  def cleanUp(): scala.Unit = js.native
  def mockDB(): scala.Unit = js.native
  def promiseResultSync[T](promise: js.Any): T = js.native
  def registerHook(
    className: java.lang.String,
    hookType: HookType,
    hookFn: js.Function1[/* request */ parseLib.ParseNs.CloudNs.BeforeSaveRequest, _]
  ): scala.Unit = js.native
  def unMockDB(): scala.Unit = js.native
}

