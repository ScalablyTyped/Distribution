package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scope for variables and subspaces.
  * @property name - The scope name.
  * @param name - The scope name.
  */
@js.native
trait ScopeSpace extends js.Object {
  /**
    * The scope name.
    */
  var name: String = js.native
  /**
    * Get (or create, if it doesn't already exist) a subspace in the scope.
    * @param name - The subspace name.
    * @returns The subspace instance.
    */
  def getSubSpace(name: String): ScopeSpace = js.native
  /**
    * Get (or create, if it doesn't already exist) a variable in the scope.
    * @param name - The variable name.
    * @returns The variable instance.
    */
  def resolve(name: String): ScopeId = js.native
}

object ScopeSpace {
  @scala.inline
  def apply(getSubSpace: String => ScopeSpace, name: String, resolve: String => ScopeId): ScopeSpace = {
    val __obj = js.Dynamic.literal(getSubSpace = js.Any.fromFunction1(getSubSpace), name = name.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ScopeSpace]
  }
  @scala.inline
  implicit class ScopeSpaceOps[Self <: ScopeSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetSubSpace(value: String => ScopeSpace): Self = this.set("getSubSpace", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolve(value: String => ScopeId): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

