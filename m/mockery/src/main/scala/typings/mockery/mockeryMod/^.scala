package typings.mockery.mockeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mockery", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deregisterAll(): Unit = js.native
  def deregisterAllowable(name: String): Unit = js.native
  def deregisterAllowables(names: js.Array[String]): Unit = js.native
  def deregisterMock(name: String): Unit = js.native
  def deregisterSubstitute(name: String): Unit = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def enable(args: MockeryEnableArgs): Unit = js.native
  def registerAllowable(name: String): Unit = js.native
  def registerAllowable(name: String, unhook: Boolean): Unit = js.native
  def registerAllowables(names: js.Array[String]): Unit = js.native
  def registerMock(name: String, mock: js.Any): Unit = js.native
  def registerSubstitute(name: String, substitute: String): Unit = js.native
  def resetCache(): Unit = js.native
  def warnOnReplace(value: Boolean): Unit = js.native
  def warnOnUnregistered(value: Boolean): Unit = js.native
}

