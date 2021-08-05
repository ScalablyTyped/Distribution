package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMapping extends StObject {
  
  var modelMapping: js.UndefOr[VerificationRequest] = js.undefined
  
  var prisma: js.Any
}
object ModelMapping {
  
  inline def apply(prisma: js.Any): ModelMapping = {
    val __obj = js.Dynamic.literal(prisma = prisma.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelMapping]
  }
  
  extension [Self <: ModelMapping](x: Self) {
    
    inline def setModelMapping(value: VerificationRequest): Self = StObject.set(x, "modelMapping", value.asInstanceOf[js.Any])
    
    inline def setModelMappingUndefined: Self = StObject.set(x, "modelMapping", js.undefined)
    
    inline def setPrisma(value: js.Any): Self = StObject.set(x, "prisma", value.asInstanceOf[js.Any])
  }
}
