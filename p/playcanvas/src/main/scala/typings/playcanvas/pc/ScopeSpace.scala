package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scope for variables and subspaces.
  * @property name - The scope name.
  * @param name - The scope name.
  */
trait ScopeSpace extends js.Object {
  /**
    * The scope name.
    */
  var name: String
  /**
    * Get (or create, if it doesn't already exist) a subspace in the scope.
    * @param name - The subspace name.
    * @returns The subspace instance.
    */
  def getSubSpace(name: String): ScopeSpace
  /**
    * Get (or create, if it doesn't already exist) a variable in the scope.
    * @param name - The variable name.
    * @returns The variable instance.
    */
  def resolve(name: String): ScopeId
}

object ScopeSpace {
  @scala.inline
  def apply(getSubSpace: String => ScopeSpace, name: String, resolve: String => ScopeId): ScopeSpace = {
    val __obj = js.Dynamic.literal(getSubSpace = js.Any.fromFunction1(getSubSpace), name = name.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ScopeSpace]
  }
}

