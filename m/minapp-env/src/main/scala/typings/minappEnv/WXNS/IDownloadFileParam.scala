package typings.minappEnv.WXNS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadFileParam extends IAPIParam[IDownloadFileSuccessResult] {
  
  var header: js.UndefOr[AnyObject] = js.native
  
  var url: String = js.native
}
object IDownloadFileParam {
  
  @scala.inline
  def apply(url: String): IDownloadFileParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadFileParam]
  }
  
  @scala.inline
  implicit class IDownloadFileParamMutableBuilder[Self <: IDownloadFileParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: AnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
