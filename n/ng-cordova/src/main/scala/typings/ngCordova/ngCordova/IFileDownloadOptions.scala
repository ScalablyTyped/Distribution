package typings.ngCordova.ngCordova

import typings.cordovaPluginFileTransfer.FileDownloadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileDownloadOptions extends FileDownloadOptions {
  
  var encodeURI: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object IFileDownloadOptions {
  
  @scala.inline
  def apply(): IFileDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDownloadOptions]
  }
  
  @scala.inline
  implicit class IFileDownloadOptionsMutableBuilder[Self <: IFileDownloadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodeURI(value: Boolean): Self = StObject.set(x, "encodeURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeURIUndefined: Self = StObject.set(x, "encodeURI", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
