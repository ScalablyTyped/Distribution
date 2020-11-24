package typings.pgFormat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ident extends js.Object {
  
  var ident: js.UndefOr[String] = js.native
  
  var literal: js.UndefOr[String] = js.native
  
  var string: js.UndefOr[String] = js.native
}
object Ident {
  
  @scala.inline
  def apply(): Ident = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ident]
  }
  
  @scala.inline
  implicit class IdentOps[Self <: Ident] (val x: Self) extends AnyVal {
    
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
    def setIdent(value: String): Self = this.set("ident", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdent: Self = this.set("ident", js.undefined)
    
    @scala.inline
    def setLiteral(value: String): Self = this.set("literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiteral: Self = this.set("literal", js.undefined)
    
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
