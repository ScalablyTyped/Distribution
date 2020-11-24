package typings.mondaySdkJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  token :string}> */
@js.native
trait Partialtokenstring extends js.Object {
  
  var token: js.UndefOr[String] = js.native
}
object Partialtokenstring {
  
  @scala.inline
  def apply(): Partialtokenstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtokenstring]
  }
  
  @scala.inline
  implicit class PartialtokenstringOps[Self <: Partialtokenstring] (val x: Self) extends AnyVal {
    
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
