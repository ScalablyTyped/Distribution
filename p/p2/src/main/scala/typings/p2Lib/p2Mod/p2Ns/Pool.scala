package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pool extends js.Object {
  var objects: js.Array[_]
  def get(): js.Any
  def release(`object`: js.Any): Pool
  def resize(size: scala.Double): Pool
}

