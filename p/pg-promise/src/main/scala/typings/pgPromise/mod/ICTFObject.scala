package typings.pgPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Custom-Type Formatting object
// API: https://github.com/vitaly-t/pg-promise#custom-type-formatting
@js.native
trait ICTFObject extends js.Object {
  
  def toPostgres(a: js.Any): js.Any = js.native
}
object ICTFObject {
  
  @scala.inline
  def apply(toPostgres: js.Any => js.Any): ICTFObject = {
    val __obj = js.Dynamic.literal(toPostgres = js.Any.fromFunction1(toPostgres))
    __obj.asInstanceOf[ICTFObject]
  }
  
  @scala.inline
  implicit class ICTFObjectOps[Self <: ICTFObject] (val x: Self) extends AnyVal {
    
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
    def setToPostgres(value: js.Any => js.Any): Self = this.set("toPostgres", js.Any.fromFunction1(value))
  }
}
