package typings.nodeForge.mod.asn1

import typings.nodeForge.mod.Bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asn1 extends js.Object {
  
  var composed: Boolean = js.native
  
  var constructed: Boolean = js.native
  
  var tagClass: Class = js.native
  
  var `type`: Type = js.native
  
  var value: Bytes | js.Array[Asn1] = js.native
}
object Asn1 {
  
  @scala.inline
  def apply(
    composed: Boolean,
    constructed: Boolean,
    tagClass: Class,
    `type`: Type,
    value: Bytes | js.Array[Asn1]
  ): Asn1 = {
    val __obj = js.Dynamic.literal(composed = composed.asInstanceOf[js.Any], constructed = constructed.asInstanceOf[js.Any], tagClass = tagClass.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1]
  }
  
  @scala.inline
  implicit class Asn1Ops[Self <: Asn1] (val x: Self) extends AnyVal {
    
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
    def setComposed(value: Boolean): Self = this.set("composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructed(value: Boolean): Self = this.set("constructed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagClass(value: Class): Self = this.set("tagClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: Asn1*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Bytes | js.Array[Asn1]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
