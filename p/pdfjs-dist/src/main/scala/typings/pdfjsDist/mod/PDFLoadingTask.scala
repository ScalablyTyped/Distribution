package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFLoadingTask[T] extends StObject {
  
  var promise: PDFPromise[T] = js.native
}
object PDFLoadingTask {
  
  @scala.inline
  def apply[T](promise: PDFPromise[T]): PDFLoadingTask[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFLoadingTask[T]]
  }
  
  @scala.inline
  implicit class PDFLoadingTaskMutableBuilder[Self <: PDFLoadingTask[_], T] (val x: Self with PDFLoadingTask[T]) extends AnyVal {
    
    @scala.inline
    def setPromise(value: PDFPromise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
