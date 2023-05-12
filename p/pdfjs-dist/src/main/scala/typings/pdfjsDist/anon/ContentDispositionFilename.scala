package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentDispositionFilename extends StObject {
  
  var contentDispositionFilename: js.UndefOr[Null] = js.undefined
  
  var disableRange: js.UndefOr[Boolean] = js.undefined
  
  var disableStream: js.UndefOr[Boolean] = js.undefined
  
  var initialData: Any
  
  var length: Any
  
  var progressiveDone: js.UndefOr[Boolean] = js.undefined
}
object ContentDispositionFilename {
  
  inline def apply(initialData: Any, length: Any): ContentDispositionFilename = {
    val __obj = js.Dynamic.literal(initialData = initialData.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentDispositionFilename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentDispositionFilename] (val x: Self) extends AnyVal {
    
    inline def setDisableRange(value: Boolean): Self = StObject.set(x, "disableRange", value.asInstanceOf[js.Any])
    
    inline def setDisableRangeUndefined: Self = StObject.set(x, "disableRange", js.undefined)
    
    inline def setDisableStream(value: Boolean): Self = StObject.set(x, "disableStream", value.asInstanceOf[js.Any])
    
    inline def setDisableStreamUndefined: Self = StObject.set(x, "disableStream", js.undefined)
    
    inline def setInitialData(value: Any): Self = StObject.set(x, "initialData", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setProgressiveDone(value: Boolean): Self = StObject.set(x, "progressiveDone", value.asInstanceOf[js.Any])
    
    inline def setProgressiveDoneUndefined: Self = StObject.set(x, "progressiveDone", js.undefined)
  }
}
