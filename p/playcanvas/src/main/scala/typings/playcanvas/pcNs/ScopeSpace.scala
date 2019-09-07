package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScopeSpace
  * @classdesc The scope for variables and subspaces.
  * @param {String} name The scope name.
  * @property {String} name The scope name.
  */
@JSGlobal("pc.ScopeSpace")
@js.native
class ScopeSpace protected () extends js.Object {
  def this(name: String) = this()
  /**
    * The scope name.
    */
  var name: String = js.native
  /**
    * @function
    * @name pc.ScopeSpace#getSubSpace
    * @description Get (or create, if it doesn't already exist) a subspace in the scope.
    * @param {String} name The subspace name.
    * @returns {pc.ScopeSpace} The subspace instance.
    */
  def getSubSpace(name: String): ScopeSpace = js.native
  /**
    * @function
    * @name pc.ScopeSpace#resolve
    * @description Get (or create, if it doesn't already exist) a variable in the scope.
    * @param {String} name The variable name.
    * @returns {pc.ScopeId} The variable instance.
    */
  def resolve(name: String): ScopeId = js.native
}

