package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreOwnVariables extends js.Object {
  
  var ignoreOwnVariables: Boolean = js.native
}
object IgnoreOwnVariables {
  
  @scala.inline
  def apply(ignoreOwnVariables: Boolean): IgnoreOwnVariables = {
    val __obj = js.Dynamic.literal(ignoreOwnVariables = ignoreOwnVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreOwnVariables]
  }
  
  @scala.inline
  implicit class IgnoreOwnVariablesOps[Self <: IgnoreOwnVariables] (val x: Self) extends AnyVal {
    
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
    def setIgnoreOwnVariables(value: Boolean): Self = this.set("ignoreOwnVariables", value.asInstanceOf[js.Any])
  }
}
