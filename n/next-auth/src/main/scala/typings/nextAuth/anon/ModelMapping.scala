package typings.nextAuth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelMapping extends js.Object {
  
  var modelMapping: js.UndefOr[VerificationRequest] = js.native
  
  var prisma: js.Any = js.native
}
object ModelMapping {
  
  @scala.inline
  def apply(prisma: js.Any): ModelMapping = {
    val __obj = js.Dynamic.literal(prisma = prisma.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelMapping]
  }
  
  @scala.inline
  implicit class ModelMappingOps[Self <: ModelMapping] (val x: Self) extends AnyVal {
    
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
    def setPrisma(value: js.Any): Self = this.set("prisma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMapping(value: VerificationRequest): Self = this.set("modelMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelMapping: Self = this.set("modelMapping", js.undefined)
  }
}
