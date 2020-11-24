package typings.nunjucks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autoescape extends js.Object {
  
  var autoescape: Boolean = js.native
}
object Autoescape {
  
  @scala.inline
  def apply(autoescape: Boolean): Autoescape = {
    val __obj = js.Dynamic.literal(autoescape = autoescape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoescape]
  }
  
  @scala.inline
  implicit class AutoescapeOps[Self <: Autoescape] (val x: Self) extends AnyVal {
    
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
    def setAutoescape(value: Boolean): Self = this.set("autoescape", value.asInstanceOf[js.Any])
  }
}
