package typings.phaser.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("extend")
@js.native
object extend extends js.Object {
  /**
    * Extends the given `myClass` object's prototype with the properties of `definition`.
    * @param ctor The constructor object to mix into.
    * @param definition A dictionary of functions for the class.
    * @param isClassDescriptor Is the definition a class descriptor?
    * @param extend The parent constructor object.
    */
  def apply(ctor: js.Object, definition: js.Object, isClassDescriptor: Boolean): Unit = js.native
  def apply(ctor: js.Object, definition: js.Object, isClassDescriptor: Boolean, extend: js.Object): Unit = js.native
}

