package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScopeId
  * @classdesc The scope for a variable.
  * @param {String} name The variable name.
  * @property {String} name The variable name.
  */
@JSGlobal("pc.ScopeId")
@js.native
class ScopeId protected () extends js.Object {
  def this(name: String) = this()
  /**
    * The variable name.
    */
  var name: String = js.native
  /**
    * @function
    * @name pc.ScopeId#getValue
    * @description Get variable value.
    * @returns {*} The value.
    */
  def getValue(): js.Any = js.native
  /**
    * @function
    * @name pc.ScopeId#setValue
    * @description Set variable value.
    * @param {*} value The value.
    */
  def setValue(value: js.Any): Unit = js.native
}

