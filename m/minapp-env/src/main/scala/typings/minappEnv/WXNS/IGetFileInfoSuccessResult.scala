package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetFileInfoSuccessResult extends StObject {
  
  var digest: String
  
  var size: Double
}
object IGetFileInfoSuccessResult {
  
  inline def apply(digest: String, size: Double): IGetFileInfoSuccessResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoSuccessResult]
  }
  
  extension [Self <: IGetFileInfoSuccessResult](x: Self) {
    
    inline def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
