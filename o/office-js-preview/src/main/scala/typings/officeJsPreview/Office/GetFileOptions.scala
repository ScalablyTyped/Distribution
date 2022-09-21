package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for setting the size of slices that the document will be divided into.
  */
trait GetFileOptions extends StObject {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[Any] = js.undefined
  
  /**
    * The size of the slices in bytes. The maximum (and the default) is 4194304 (4MB).
    */
  var sliceSize: js.UndefOr[Double] = js.undefined
}
object GetFileOptions {
  
  inline def apply(): GetFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileOptions]
  }
  
  extension [Self <: GetFileOptions](x: Self) {
    
    inline def setAsyncContext(value: Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setSliceSize(value: Double): Self = StObject.set(x, "sliceSize", value.asInstanceOf[js.Any])
    
    inline def setSliceSizeUndefined: Self = StObject.set(x, "sliceSize", js.undefined)
  }
}
