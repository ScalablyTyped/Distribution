package typings.nodemon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Re extends js.Object {
  
  var re: String = js.native
}
object Re {
  
  @scala.inline
  def apply(re: String): Re = {
    val __obj = js.Dynamic.literal(re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Re]
  }
  
  @scala.inline
  implicit class ReOps[Self <: Re] (val x: Self) extends AnyVal {
    
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
    def setRe(value: String): Self = this.set("re", value.asInstanceOf[js.Any])
  }
}
