package typings
package minilogLib.minilogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Minilog extends js.Object {
  def debug(msg: js.Any*): Minilog
  def error(msg: js.Any*): Minilog
  def info(msg: js.Any*): Minilog
  def log(msg: js.Any*): Minilog
  def warn(msg: js.Any*): Minilog
}

