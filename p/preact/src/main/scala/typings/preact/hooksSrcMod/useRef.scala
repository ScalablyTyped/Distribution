package typings.preact.hooksSrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/hooks/src", "useRef")
@js.native
object useRef extends js.Object {
  def apply[T](): PropRef[T] = js.native
  def apply[T](initialValue: T): Ref[T] = js.native
}

