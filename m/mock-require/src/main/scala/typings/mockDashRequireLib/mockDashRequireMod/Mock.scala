package typings
package mockDashRequireLib.mockDashRequireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock extends js.Object {
  def apply(path: java.lang.String, mockExport: java.lang.String): scala.Unit = js.native
  def apply(path: java.lang.String, mockExport: mockDashRequireLib.Stub): scala.Unit = js.native
  def reRequire(path: java.lang.String): js.Any = js.native
  def stop(path: java.lang.String): scala.Unit = js.native
  def stopAll(): scala.Unit = js.native
}

