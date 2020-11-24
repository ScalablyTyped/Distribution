package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bare extends js.Object {
  
  var bare: js.UndefOr[Boolean] = js.native
}
object Bare {
  
  @scala.inline
  def apply(): Bare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bare]
  }
  
  @scala.inline
  implicit class BareOps[Self <: Bare] (val x: Self) extends AnyVal {
    
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
    def setBare(value: Boolean): Self = this.set("bare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBare: Self = this.set("bare", js.undefined)
  }
}
