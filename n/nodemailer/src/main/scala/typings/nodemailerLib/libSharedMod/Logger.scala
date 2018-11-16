package typings
package nodemailerLib.libSharedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Logger extends js.Object {
  def debug(params: js.Any*): scala.Unit
  def error(params: js.Any*): scala.Unit
  def fatal(params: js.Any*): scala.Unit
  def info(params: js.Any*): scala.Unit
  def level(level: LoggerLevel): scala.Unit
  def trace(params: js.Any*): scala.Unit
  def warn(params: js.Any*): scala.Unit
}

