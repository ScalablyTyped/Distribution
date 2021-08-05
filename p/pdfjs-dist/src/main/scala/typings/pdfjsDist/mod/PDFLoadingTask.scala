package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFLoadingTask[T] extends StObject {
  
  var promise: PDFPromise[T]
}
object PDFLoadingTask {
  
  inline def apply[T](promise: PDFPromise[T]): PDFLoadingTask[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFLoadingTask[T]]
  }
  
  extension [Self <: PDFLoadingTask[?], T](x: Self & PDFLoadingTask[T]) {
    
    inline def setPromise(value: PDFPromise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
