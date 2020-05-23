package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scope for a variable.
  * @property name - The variable name.
  * @param name - The variable name.
  */
@JSGlobal("pc.ScopeId")
@js.native
class ScopeId protected ()
  extends typings.playcanvas.pc.ScopeId {
  def this(name: String) = this()
  /**
    * The variable name.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Get variable value.
    * @returns The value.
    */
  /* CompleteClass */
  override def getValue(): js.Any = js.native
  /**
    * Set variable value.
    * @param value - The value.
    */
  /* CompleteClass */
  override def setValue(value: js.Any): Unit = js.native
}

