package typings.mdv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anchor extends js.Object {
  
  var defined: Double = js.native
  
  var emptyText: Double = js.native
  
  var localRefNoHash: Boolean = js.native
  
  var name: String = js.native
  
  var seen: Double = js.native
}
object Anchor {
  
  @scala.inline
  def apply(defined: Double, emptyText: Double, localRefNoHash: Boolean, name: String, seen: Double): Anchor = {
    val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any], emptyText = emptyText.asInstanceOf[js.Any], localRefNoHash = localRefNoHash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], seen = seen.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
    
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
    def setDefined(value: Double): Self = this.set("defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyText(value: Double): Self = this.set("emptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalRefNoHash(value: Boolean): Self = this.set("localRefNoHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen(value: Double): Self = this.set("seen", value.asInstanceOf[js.Any])
  }
}
