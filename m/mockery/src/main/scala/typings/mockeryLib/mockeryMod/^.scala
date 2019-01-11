package typings
package mockeryLib.mockeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mockery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deregisterAll(): scala.Unit = js.native
  def deregisterAllowable(name: java.lang.String): scala.Unit = js.native
  def deregisterAllowables(names: js.Array[java.lang.String]): scala.Unit = js.native
  def deregisterMock(name: java.lang.String): scala.Unit = js.native
  def deregisterSubstitute(name: java.lang.String): scala.Unit = js.native
  def disable(): scala.Unit = js.native
  def enable(): scala.Unit = js.native
  def enable(args: mockeryLib.mockeryMod.MockeryEnableArgs): scala.Unit = js.native
  def registerAllowable(name: java.lang.String): scala.Unit = js.native
  def registerAllowable(name: java.lang.String, unhook: scala.Boolean): scala.Unit = js.native
  def registerAllowables(names: js.Array[java.lang.String]): scala.Unit = js.native
  def registerMock(name: java.lang.String, mock: js.Any): scala.Unit = js.native
  def registerSubstitute(name: java.lang.String, substitute: java.lang.String): scala.Unit = js.native
  def resetCache(): scala.Unit = js.native
  def warnOnReplace(value: scala.Boolean): scala.Unit = js.native
  def warnOnUnregistered(value: scala.Boolean): scala.Unit = js.native
}

