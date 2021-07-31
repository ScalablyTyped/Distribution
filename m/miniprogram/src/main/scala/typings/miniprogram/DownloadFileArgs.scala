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
  
  @scala.inline
  def apply(url: String): DownloadFileArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileArgs]
  }
  
  @scala.inline
  implicit class DownloadFileArgsMutableBuilder[Self <: DownloadFileArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
