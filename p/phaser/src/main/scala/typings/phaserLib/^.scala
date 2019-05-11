package typings
package phaserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Extends the given `myClass` object's prototype with the properties of `definition`.
    * @param ctor The constructor object to mix into.
    * @param definition A dictionary of functions for the class.
    * @param isClassDescriptor Is the definition a class descriptor?
    * @param extend The parent constructor object.
    */
  def extend(ctor: js.Object, definition: js.Object, isClassDescriptor: scala.Boolean): scala.Unit = js.native
  def extend(ctor: js.Object, definition: js.Object, isClassDescriptor: scala.Boolean, extend: js.Object): scala.Unit = js.native
  def mixin(myClass: js.Object, mixins: js.Array[js.Object]): scala.Unit = js.native
  /**
    * Applies the given `mixins` to the prototype of `myClass`.
    * @param myClass The constructor object to mix into.
    * @param mixins The mixins to apply to the constructor.
    */
  def mixin(myClass: js.Object, mixins: js.Object): scala.Unit = js.native
}

