package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrismaCpeCode extends StObject {
  
  /** The Prisma client code. */
  var prismaClientCode: js.UndefOr[String] = js.undefined
  
  /** The Prisma estimate code. */
  var prismaEstimateCode: js.UndefOr[String] = js.undefined
  
  /** The Prisma product code. */
  var prismaProductCode: js.UndefOr[String] = js.undefined
}
object PrismaCpeCode {
  
  inline def apply(): PrismaCpeCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrismaCpeCode]
  }
  
  extension [Self <: PrismaCpeCode](x: Self) {
    
    inline def setPrismaClientCode(value: String): Self = StObject.set(x, "prismaClientCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaClientCodeUndefined: Self = StObject.set(x, "prismaClientCode", js.undefined)
    
    inline def setPrismaEstimateCode(value: String): Self = StObject.set(x, "prismaEstimateCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaEstimateCodeUndefined: Self = StObject.set(x, "prismaEstimateCode", js.undefined)
    
    inline def setPrismaProductCode(value: String): Self = StObject.set(x, "prismaProductCode", value.asInstanceOf[js.Any])
    
    inline def setPrismaProductCodeUndefined: Self = StObject.set(x, "prismaProductCode", js.undefined)
  }
}
