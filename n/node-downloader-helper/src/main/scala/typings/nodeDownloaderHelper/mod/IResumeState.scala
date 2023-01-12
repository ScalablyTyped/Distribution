package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IResumeState extends StObject {
  
  var downloaded: js.UndefOr[Double] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object IResumeState {
  
  inline def apply(): IResumeState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResumeState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IResumeState] (val x: Self) extends AnyVal {
    
    inline def setDownloaded(value: Double): Self = StObject.set(x, "downloaded", value.asInstanceOf[js.Any])
    
    inline def setDownloadedUndefined: Self = StObject.set(x, "downloaded", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
