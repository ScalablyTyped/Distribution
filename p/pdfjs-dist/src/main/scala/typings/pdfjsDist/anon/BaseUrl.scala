package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseUrl extends StObject {
  
  var baseUrl: js.UndefOr[Null] = js.undefined
  
  var isCompressed: js.UndefOr[Boolean] = js.undefined
}
object BaseUrl {
  
  inline def apply(): BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseUrl]
  }
  
  extension [Self <: BaseUrl](x: Self) {
    
    inline def setIsCompressed(value: Boolean): Self = StObject.set(x, "isCompressed", value.asInstanceOf[js.Any])
    
    inline def setIsCompressedUndefined: Self = StObject.set(x, "isCompressed", js.undefined)
  }
}
