package typings.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Pool")
@js.native
class Pool () extends js.Object {
  def this(options: PoolOptions) = this()
  var objects: js.Array[_] = js.native
  def get(): js.Any = js.native
  def release(`object`: js.Any): Pool = js.native
  def resize(size: Double): Pool = js.native
}

