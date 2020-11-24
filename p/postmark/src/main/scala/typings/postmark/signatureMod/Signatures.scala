package typings.postmark.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signatures extends js.Object {
  
  var SenderSignatures: js.Array[Signature] = js.native
  
  var TotalCount: Double = js.native
}
object Signatures {
  
  @scala.inline
  def apply(SenderSignatures: js.Array[Signature], TotalCount: Double): Signatures = {
    val __obj = js.Dynamic.literal(SenderSignatures = SenderSignatures.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signatures]
  }
  
  @scala.inline
  implicit class SignaturesOps[Self <: Signatures] (val x: Self) extends AnyVal {
    
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
    def setSenderSignaturesVarargs(value: Signature*): Self = this.set("SenderSignatures", js.Array(value :_*))
    
    @scala.inline
    def setSenderSignatures(value: js.Array[Signature]): Self = this.set("SenderSignatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
}
