package typings.node.inspectorMod.Debugger

import typings.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scope description.
  */
@js.native
trait Scope extends js.Object {
  /**
    * Location in the source code where scope ends
    */
  var endLocation: js.UndefOr[Location] = js.native
  var name: js.UndefOr[String] = js.native
  /**
    * Object representing the scope. For <code>global</code> and <code>with</code> scopes it represents the actual object; for the rest of the scopes, it is artificial transient object enumerating scope variables as its properties.
    */
  var `object`: RemoteObject = js.native
  /**
    * Location in the source code where scope starts
    */
  var startLocation: js.UndefOr[Location] = js.native
  /**
    * Scope type.
    */
  var `type`: String = js.native
}

object Scope {
  @scala.inline
  def apply(`object`: RemoteObject, `type`: String): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scope]
  }
  @scala.inline
  implicit class ScopeOps[Self <: Scope] (val x: Self) extends AnyVal {
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
    def setObject(value: RemoteObject): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndLocation(value: Location): Self = this.set("endLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndLocation: Self = this.set("endLocation", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStartLocation(value: Location): Self = this.set("startLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartLocation: Self = this.set("startLocation", js.undefined)
  }
  
}

