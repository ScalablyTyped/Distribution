package typings.nodePgMigrate.pgLiteralMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PgLiteral extends js.Object {
  
  val literal: /* true */ Boolean = js.native
  
  val value: String = js.native
}
object PgLiteral {
  
  @scala.inline
  def apply(literal: /* true */ Boolean, value: String): PgLiteral = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PgLiteral]
  }
  
  @scala.inline
  implicit class PgLiteralOps[Self <: PgLiteral] (val x: Self) extends AnyVal {
    
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
    def setLiteral(value: /* true */ Boolean): Self = this.set("literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
