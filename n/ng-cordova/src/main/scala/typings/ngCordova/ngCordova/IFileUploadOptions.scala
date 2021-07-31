package typings.ngCordova.ngCordova

import typings.cordovaPluginFileTransfer.FileUploadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileUploadOptions
  extends StObject
     with FileUploadOptions {
  
  var encodeURI: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object IFileUploadOptions {
  
  @scala.inline
  def apply(): IFileUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileUploadOptions]
  }
  
  @scala.inline
  implicit class IFileUploadOptionsMutableBuilder[Self <: IFileUploadOptions] (val x: Self) extends AnyVal {
    
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
