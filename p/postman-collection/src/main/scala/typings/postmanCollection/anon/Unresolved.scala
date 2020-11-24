package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unresolved extends js.Object {
  
  var unresolved: Boolean = js.native
}
object Unresolved {
  
  @scala.inline
  def apply(unresolved: Boolean): Unresolved = {
    val __obj = js.Dynamic.literal(unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unresolved]
  }
  
  @scala.inline
  implicit class UnresolvedOps[Self <: Unresolved] (val x: Self) extends AnyVal {
    
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
    def setUnresolved(value: Boolean): Self = this.set("unresolved", value.asInstanceOf[js.Any])
  }
}
