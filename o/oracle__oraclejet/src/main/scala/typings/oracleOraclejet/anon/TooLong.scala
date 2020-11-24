package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooLong extends js.Object {
  
  var tooLong: js.UndefOr[String] = js.native
  
  var tooShort: js.UndefOr[String] = js.native
}
object TooLong {
  
  @scala.inline
  def apply(): TooLong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooLong]
  }
  
  @scala.inline
  implicit class TooLongOps[Self <: TooLong] (val x: Self) extends AnyVal {
    
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
    def setTooLong(value: String): Self = this.set("tooLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooLong: Self = this.set("tooLong", js.undefined)
    
    @scala.inline
    def setTooShort(value: String): Self = this.set("tooShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooShort: Self = this.set("tooShort", js.undefined)
  }
}
