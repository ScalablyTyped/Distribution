package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGetFileInfoParam
  extends StObject
     with IAPIParam[IGetFileInfoSuccessResult] {
  
  var digestAlgorithm: js.UndefOr[String] = js.undefined
  
  var filePath: String
}
object IGetFileInfoParam {
  
  @scala.inline
  def apply(filePath: String): IGetFileInfoParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoParam]
  }
  
  @scala.inline
  implicit class IGetFileInfoParamMutableBuilder[Self <: IGetFileInfoParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
