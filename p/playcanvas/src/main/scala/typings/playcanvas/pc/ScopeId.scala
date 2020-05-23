package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scope for a variable.
  * @property name - The variable name.
  * @param name - The variable name.
  */
trait ScopeId extends js.Object {
  /**
    * The variable name.
    */
  var name: String
  /**
    * Get variable value.
    * @returns The value.
    */
  def getValue(): js.Any
  /**
    * Set variable value.
    * @param value - The value.
    */
  def setValue(value: js.Any): Unit
}

object ScopeId {
  @scala.inline
  def apply(getValue: () => js.Any, name: String, setValue: js.Any => Unit): ScopeId = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), name = name.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[ScopeId]
  }
}

