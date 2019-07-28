package typings.mockingoose.mockingooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock extends js.Object {
  def reset(op: Op): this.type = js.native
  def toJSON(): js.Any = js.native
  def toReturn(expected: js.Any): this.type = js.native
  def toReturn(expected: js.Any, op: Op): this.type = js.native
}

