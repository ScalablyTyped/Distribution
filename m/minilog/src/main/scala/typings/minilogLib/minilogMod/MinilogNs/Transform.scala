package typings
package minilogLib.minilogMod.MinilogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  def mixin(dest: js.Any): scala.Unit
  def pipe(dest: js.Any): js.Any
  def unpipe(from: js.Any): Transform
  def write(name: js.Any, level: js.Any, args: js.Any): scala.Unit
}

