package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetFileInfoSuccessResult extends StObject {
  
  var digest: String
  
  var size: Double
}
object IGetFileInfoSuccessResult {
  
  @scala.inline
  def apply(digest: String, size: Double): IGetFileInfoSuccessResult = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoSuccessResult]
  }
  
  @scala.inline
  implicit class IGetFileInfoSuccessResultMutableBuilder[Self <: IGetFileInfoSuccessResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
