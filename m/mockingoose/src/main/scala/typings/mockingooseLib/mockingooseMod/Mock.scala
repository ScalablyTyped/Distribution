package typings
package mockingooseLib.mockingooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock extends js.Object {
  def reset(op: mockingooseLib.Op): this.type = js.native
  def toJSON(): js.Any = js.native
  def toReturn(expected: js.Any): this.type = js.native
  def toReturn(expected: js.Any, op: mockingooseLib.Op): this.type = js.native
}

