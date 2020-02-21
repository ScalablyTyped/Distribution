package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  def debug(message: String): Unit = js.native
  def debug(message: String, additionalInfo: js.Object): Unit = js.native
  def error(message: String): Unit = js.native
  def error(message: String, additionalInfo: js.Object): Unit = js.native
  def info(message: String): Unit = js.native
  def info(message: String, additionalInfo: js.Object): Unit = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, additionalInfo: js.Object): Unit = js.native
}

