package typings.nestedProperty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Own extends js.Object {
  
  var own: Boolean = js.native
}
object Own {
  
  @scala.inline
  def apply(own: Boolean): Own = {
    val __obj = js.Dynamic.literal(own = own.asInstanceOf[js.Any])
    __obj.asInstanceOf[Own]
  }
  
  @scala.inline
  implicit class OwnOps[Self <: Own] (val x: Self) extends AnyVal {
    
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
    def setOwn(value: Boolean): Self = this.set("own", value.asInstanceOf[js.Any])
  }
}
