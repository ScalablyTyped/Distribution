package typings.miniprogram

import typings.miniprogram.anon.ApFilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadFileArgs
  extends StObject
     with AsyncCallback[ApFilePath] {
  
  var header: js.UndefOr[js.Any] = js.undefined
  
  var url: String
}
object DownloadFileArgs {
  
  inline def apply(url: String): DownloadFileArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileArgs]
  }
  
  extension [Self <: DownloadFileArgs](x: Self) {
    
    inline def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
