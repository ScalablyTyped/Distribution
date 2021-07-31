package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMapping extends StObject {
  
  var modelMapping: js.UndefOr[VerificationRequest] = js.undefined
  
  var prisma: js.Any
}
object ModelMapping {
  
  @scala.inline
  def apply(prisma: js.Any): ModelMapping = {
    val __obj = js.Dynamic.literal(prisma = prisma.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelMapping]
  }
  
  @scala.inline
  implicit class ModelMappingMutableBuilder[Self <: ModelMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModelMapping(value: VerificationRequest): Self = StObject.set(x, "modelMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMappingUndefined: Self = StObject.set(x, "modelMapping", js.undefined)
    
    @scala.inline
    def setPrisma(value: js.Any): Self = StObject.set(x, "prisma", value.asInstanceOf[js.Any])
  }
}
