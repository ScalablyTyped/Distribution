package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismaConfig extends StObject {
  
  /** Required. Relevant client, product, and estimate codes from the Mediaocean Prisma tool. */
  var prismaCpeCode: js.UndefOr[PrismaCpeCode] = js.undefined
  
  /** Required. The Prisma type. */
  var prismaType: js.UndefOr[String] = js.undefined
  
  /** Required. The entity allocated this budget (DSP, site, etc.). */
  var supplier: js.UndefOr[String] = js.undefined
}
object PrismaConfig {
  
  inline def apply(): PrismaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismaConfig]
  }
  
  extension [Self <: PrismaConfig](x: Self) {
    
    inline def setPrismaCpeCode(value: PrismaCpeCode): Self = StObject.set(x, "prismaCpeCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaCpeCodeUndefined: Self = StObject.set(x, "prismaCpeCode", js.undefined)
    
    inline def setPrismaType(value: String): Self = StObject.set(x, "prismaType", value.asInstanceOf[js.Any])
    
    inline def setPrismaTypeUndefined: Self = StObject.set(x, "prismaType", js.undefined)
    
    inline def setSupplier(value: String): Self = StObject.set(x, "supplier", value.asInstanceOf[js.Any])
    
    inline def setSupplierUndefined: Self = StObject.set(x, "supplier", js.undefined)
  }
}
